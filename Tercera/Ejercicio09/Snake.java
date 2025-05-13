/*
 
 */

package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Snake extends Applet implements Runnable{
    public static final int TIEMPO = 300;
    
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Image imgCasilla;
    Serpiente serpiente;
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        
        imgCasilla = getImage(getCodeBase(), "Tercera/Ejercicio09/casilla.png");
        serpiente = new Serpiente(imgCasilla);
       
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
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            serpiente.update();
            
            repaint();
            try {
                Thread.sleep(TIEMPO); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
    
    public boolean keyDown(Event e, int tecla) {
        switch (tecla) {
            case Event.LEFT:
                serpiente.cambiarDireccion(Eslabon.IZQUIERDA);
                break;
            case Event.RIGHT:
                serpiente.cambiarDireccion(Eslabon.DERECHA);
                break;
            case Event.UP:
                serpiente.cambiarDireccion(Eslabon.ARRIBA);
                break;
            case Event.DOWN:
                serpiente.cambiarDireccion(Eslabon.ABAJO);
                break;
        }
        repaint();
        return true;
    }
}