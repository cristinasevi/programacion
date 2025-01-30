/*
 
 */
package Segunda.Ejercicio13;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.awt.Event;

public class Jugando extends Applet implements Runnable {
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Pelota> pelotas;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        pelotas = new ArrayList<Pelota>();
        for(int i=0; i<10; i++)
            pelotas.add(new Pelota());
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
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 300, 300);
        for(int i=0; i<pelotas.size(); i++)
            pelotas.get(i).paint(noseve);
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            for(int i=0; i<pelotas.size(); i++)
                pelotas.get(i).update();
            repaint();
            try {
                Thread.sleep(20); 
            } catch (InterruptedException e) {}
        }
        while(true); 
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        for(int i=0; i<pelotas.size(); i++) {
            if(pelotas.get(i).contains(x, y))
                pelotas.remove(i);
        }
        return true;
    } 
}