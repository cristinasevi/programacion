/*
 
 */
package Segunda.Ejercicio15;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class FlappyBird extends Applet implements Runnable {
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pajaro pajaro; 
    Columna rect1;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        pajaro = new Pajaro();
        rect1 = new Columna();
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
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
        pajaro.paint(noseve);
        g.drawImage(imagen, 0, 0, this);
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