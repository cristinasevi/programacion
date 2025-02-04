/*
 
 */
package Segunda.Ejercicio14;

import java.applet.Applet;
import java.awt.Image;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Event;

public class Arkanoid extends Applet implements Runnable {
    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    ArrayList<Ladrillo> ladrillos;
    
    public void init() {
        Color colores[] = {Color.CYAN, Color.YELLOW, Color.ORANGE, Color.GREEN, Color.RED};
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        ladrillos = new ArrayList<Ladrillo>();
        for(int i=0; i<FILAS; i++) {
            for(int j=0; j<COLUMNAS; j++) {
                ladrillos.add(new Ladrillo(((Ladrillo.ANCHURA + 2)*j)+1, ((Ladrillo.ALTURA + 2)*i)+10, colores[i]));
            }
        }
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
        for(int i=0; i<ladrillos.size(); i++)
            ladrillos.get(i).paint(noseve);
        g.drawImage(imagen, 0, 0, this);
    }

    public void run() {
        do {
            
            repaint();
            try {
                Thread.sleep(20); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
}