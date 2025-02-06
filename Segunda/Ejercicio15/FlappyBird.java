/*
 
 */
package Segunda.Ejercicio15;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class FlappyBird extends Applet implements Runnable {
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pajaro pajaro;  
    
    public void init() {
        pajaro = new Pajaro();
        this.setSize(300, 300);
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void paint(Graphics g) {
        
    }
    
    public void run() {
        do {
            pajaro.update();
            repaint();
            try {
                Thread.sleep(15); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
}