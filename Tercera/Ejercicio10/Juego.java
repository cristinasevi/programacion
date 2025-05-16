/*
 
 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Juego extends Applet implements Runnable {
    public static final int NUMIMG = 5;
    public static final int NUMRUEDAS = 2;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    public static int velocidad = 100; // No es constante (final) porque va a ir variando
    Image imgFondo;
    Fondo fondo;
    Image imgRuedas[];
    Rueda ruedas[];
    Image imgCoche, imgLuz;
    Coche coche;
    Image imgPed1, imgPed2;
    Pedal pedal1, pedal2;
    
    public void init() {
        imagen = this.createImage(500, 350);
        noseve = imagen.getGraphics();
        
        imgFondo = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/fondo.jpg");
        fondo = new Fondo(imgFondo, this);
        
        imgRuedas = new Image[NUMIMG];
        for(int i=0; i<NUMIMG; i++) {
            imgRuedas[i] = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/rueda" + (i+1) + ".gif");
        }
        
        ruedas = new Rueda[NUMRUEDAS];
        for(int i=0; i<NUMRUEDAS; i++) {
            ruedas[i] = new Rueda(imgRuedas, 65 + (i*123), 302);
        }
        
        imgPed1 = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/pedal1.png");
        pedal1 = new Pedal(imgPed1, 300, 280, 20, 40);
        
        imgPed2 = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/pedal2.png");
        pedal2 = new Pedal(imgPed2, 350, 280, 20, 40);
        
        imgCoche = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/mercedes.png");
        imgLuz = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/lightBeam.png");
        coche = new Coche(imgCoche, imgLuz);
        
        this.setSize(500, 350);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void paint(Graphics g) {
        fondo.paint(noseve);
        
        coche.paint(noseve, this);
        
        for(int i=0; i<NUMRUEDAS; i++) 
            ruedas[i].paint(noseve, this);
        
        pedal1.paint(noseve, this);
        pedal2.paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            fondo.update();
            for(int i=0; i<NUMRUEDAS; i++) 
            ruedas[i].update();
            
            repaint();
            try {
                Thread.sleep(velocidad); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        if(coche.contains(x,y)) {
            coche.turn();
        }
        if(pedal1.contains(x, y))
            pedal1.acelerar();
        if(pedal2.contains(x, y))
            pedal2.acelerar();
        
        return true;
    }
}