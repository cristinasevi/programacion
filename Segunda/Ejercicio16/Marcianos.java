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
    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;
    public static final int DERECHA = 0;
    public static final int IZQUIERDA = 1;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    ArrayList<Nave> naves;
    Gun pistola;
    ArrayList<Bullet> balas;
    boolean continua = true;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        naves = new ArrayList<Nave>();
        for(int i=0; i<FILAS; i++) {
            for(int j=0; j<COLUMNAS; j++) {
                naves.add(new Nave(((Nave.ANCHURA + 2)*j)+1, ((Nave.ALTURA + 2)*i)+10, Color.CYAN));
            }
        }
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
            //continua = balas.update(pistola, naves); 
            if(!continua) {
                repaint();
                animacion.stop();
            } 
            repaint();
            try {
                Thread.sleep(15); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
    
    public boolean keyDown(Event e, int tecla) {
        if(tecla == 1006) // tecla 1006 -> flecha izquierda
            pistola.setX(IZQUIERDA);
        if(tecla == 1007) // tecla 1007 -> flecha derecha
            pistola.setX(DERECHA);
        return true;
    }
}