/*
 
 */

package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Snake extends Applet implements Runnable{
    public static final int TIEMPO = 300;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Image imgCasilla;
    Image imgManzana;
    Serpiente serpiente;
    ArrayList<Eslabon> manzanas;
    int cuentaSegundos;
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        
        imgCasilla = getImage(getCodeBase(), "Tercera/Ejercicio09/casilla.png");
        imgManzana = getImage(getCodeBase(), "Tercera/Ejercicio09/manzana.png");
        serpiente = new Serpiente(imgCasilla);
        manzanas = new ArrayList<Eslabon>();

        this.setSize(700, 800);
    }


    public void update(Graphics g) {
        paint(g);
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY); 
        noseve.fillRect(0, 0, 700, 800);
        
        serpiente.paint(noseve, this);
        for(Eslabon manzana : manzanas) {
            manzana.paint(noseve, this);
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            cuentaSegundos += TIEMPO;
            if(cuentaSegundos > 5000) {
                manzanas.add(new Eslabon(imgManzana, (int)(Math.random()*600), (int)(Math.random()*700), 0));
                cuentaSegundos = 0;
            }
            serpiente.update();
            
            for(Eslabon manzana : manzanas) {
                if(serpiente.primerEslabon().intersects(manzana)) {
                    serpiente.insertarEslabon(this.imgCasilla);
                    manzanas.remove(manzana);
                    break;
                }
            }

            repaint();
            try {
                Thread.sleep(TIEMPO); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
    
    public boolean keyDown(Event e, int tecla) {
        serpiente.cambiarDireccion(tecla);
        
        return true;
    }
}