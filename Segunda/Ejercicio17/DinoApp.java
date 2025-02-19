/*

 */
package Segunda.Ejercicio17;

import java.awt.Color;
import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class DinoApp extends Applet implements Runnable {
    public static final int TIEMPO = 35;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Dino dino;
    ArrayList<Cactus> cactus;
    
    boolean continua = true;
    int contador = 0;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        dino = new Dino();
        cactus = new ArrayList<Cactus>();
        cactus.add(new Cactus());
        
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
        dino.paint(noseve);
        for(Cactus cactu : cactus)
            cactu.paint(noseve);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            contador += TIEMPO;
            
            dino.actualizar();
            
            for(Cactus cactu : cactus) {
                cactu.update();
            }
            
            if(contador >= 1000) {
                cactus.add(new Cactus());
                contador = 0;
            }
            
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
    
    public boolean mouseDown(Event e, int x, int y) {
        dino.setSalto(true);
        return true;
    }
}