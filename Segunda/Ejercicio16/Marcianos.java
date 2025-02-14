/*
 
 */
package Segunda.Ejercicio16;

import java.applet.Applet;
import java.awt.Image;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Event;

public class Marcianos extends Applet implements Runnable {
    public static final int TIEMPO = 35;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    ArrayList<Nave> naves;
    Gun pistola;
    ArrayList<Bullet> balas;
    boolean continua = true;
    int contador = 0;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        naves = new ArrayList<Nave>();
        pistola = new Gun();
        balas = new ArrayList<Bullet>();
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
        for(int i=0; i<naves.size(); i++)
            naves.get(i).paint(noseve);
        pistola.paint(noseve);
        for(int i=0; i<balas.size(); i++)
            balas.get(i).paint(noseve);
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
            //repaint();
            try {
                Thread.sleep(15); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
    
    public boolean mouseMove(Event e, int x, int y) {
        pistola.actualizar(x);
        repaint();
        return true;
    }
}