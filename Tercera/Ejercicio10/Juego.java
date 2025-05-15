/*
 
 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Juego extends Applet implements Runnable {
    public static final int NUMIMG = 5;
    public static final int NUMRUEDAS = 2;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    int velocidad = 100;
    Image imgFondo;
    Fondo fondo;
    Image imgRuedas[];
    Rueda ruedas[];
    Image imgAcelerador;
    Pedal acelerador;
    Image imgFreno;
    Pedal freno;
    
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
        
        imgAcelerador = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/pedal1.png");
        acelerador = new Pedal(imgAcelerador, 300, 250);
        
        imgFreno = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/pedal2.png");
        freno = new Pedal(imgAcelerador, 370, 250);
        
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
        
        for(int i=0; i<NUMRUEDAS; i++) 
            ruedas[i].paint(noseve, this);
        
        acelerador.paint(noseve, this);
        freno.paint(noseve, this);
        
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
}