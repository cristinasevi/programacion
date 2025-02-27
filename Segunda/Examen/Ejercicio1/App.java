/*
 Este es un juego en el que 4 naves, cada una de un color y de forma cuadrada, se mueven en el eje de las “x”, rebotando.  Todas van a la misma velocidad, pero se sitúan a diferentes alturas. 
 En la parte inferior hay 4 puestos de ametralladora (no se mueven), cada ametralladora es de un color.
 Las ametralladoras lanzan balas de su mismo color y lo hacen cuando el usario hace click en la ametralladora, cada click una bala.
 Las balas salen disparadas en línea recta y con trayectoria ascendente y si impactan contra una nave de su mismo color, la nave aumenta su tamaño.
 */
package Examen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class App extends Applet implements Runnable {
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    ArrayList<Ametralladora> ametralladoras;
    ArrayList<Nave> naves;
    ArrayList<Bala> balas;
    
    Color[] colores = {Color.ORANGE, Color.CYAN, Color.YELLOW, Color.MAGENTA};
    public static final int HUECO = 70;
    boolean continua = true;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        
        naves = new ArrayList<Nave>();
        ametralladoras = new ArrayList<Ametralladora>();
        balas = new ArrayList<Bala>();
        
        for(int i=0; i<4; i++) 
            ametralladoras.add(new Ametralladora(30 + i * HUECO, 280, colores[i]));
        
        for (int i=0; i<4; i++)
            naves.add(new Nave(50, i * HUECO, colores[i]));
        
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
        
        for (Nave nave : naves)
            nave.paint(noseve);
        
        for (Ametralladora ametralladora : ametralladoras)
            ametralladora.paint(noseve);

        for (Bala bala : balas)
            bala.paint(noseve);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {     
        do {
                     
            for (Nave nave : naves) {
                nave.update();                 
            }
            
            for(Bala bala : balas) {
                if(bala.update()) {
                    balas.remove(bala);
                    break;
                }
            }
            
            /*
            for(Bala bala : balas) {
                for(Nave nave : naves)
                    if(bala.intersects(nave) && (bala.color == nave.color)) {
                        nave.aumentar();
                        break;
                    }
            }
            */
            
            try {
                for(Bala bala : balas) {
                    for(Nave nave : naves)
                        if(bala.intersects(nave) && (bala.color == nave.color)) {
                            nave.aumentar();
                            break;
                        }
                }
            } catch(ConcurrentModificationException e) {};
            
            if(!continua) {
                repaint();
                animacion.stop();
            } 
            repaint();
            try {
                Thread.sleep(15); 
            } catch (InterruptedException e) {}
        } while (true);
    }
        
    public boolean mouseDown(Event e, int x, int y) {
        for (Ametralladora ametralladora : ametralladoras) {
            if (ametralladora.contains(x,y)){
                balas.add(new Bala(ametralladora.x + ametralladora.width/2, ametralladora.color));
                return true;
            }
        }
        return true;
    }
}