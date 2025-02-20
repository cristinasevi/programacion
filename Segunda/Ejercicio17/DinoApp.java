/*

 */
package Segunda.Ejercicio17;

import java.awt.Color;
import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class DinoApp extends Applet implements Runnable {
    public static final int TIEMPO = 35;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Dino dino;
    ArrayList<Cactus> cactus;
  
    boolean continua = true;
    int contador = 0;
    int tiempoAleatorio;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        dino = new Dino();
        cactus = new ArrayList<Cactus>((int)(Math.random()*5)+10);
        cactus.add(new Cactus((int)(Math.random()*5)+10));
        tiempoAleatorio = (int)(Math.random()*2000)+2000;
        
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
        
        if(!continua) noseve.drawString("GAME OVER", 120, 140); 
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            contador += TIEMPO;
            if(contador >= tiempoAleatorio) {
                contador = 0;
                tiempoAleatorio = (int)(Math.random()*2000)+2000;
                cactus.add(new Cactus((int)(Math.random()*5)+10));
            }
            
            
            if(dino.actualizar(cactus.get(0))) {
                continua = false;
                repaint();
                animacion.stop();
            }
                
            try {
                for(Cactus cactu : cactus)
                    if(cactu.update())
                        cactus.remove(cactu);
            } catch(ConcurrentModificationException e){}
            
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