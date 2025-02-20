/*
 
 */
package Segunda.Ejercicio18;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class RanaApp extends Applet implements Runnable {
    public static final int TIEMPO = 35;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
  
    boolean continua = true;
    int contador = 0;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        
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
        noseve.setColor(Color.WHITE);
        noseve.fillRect(0, 0, 300, 300);
        
        if(!continua) noseve.drawString("GAME OVER", 120, 140); 
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            contador += TIEMPO;               
            
            if(!continua) {
                repaint();
                animacion.stop();
            } 
            repaint();
            try {
                Thread.sleep(TIEMPO); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
}