/*
 
 */
package Segunda.Ejercicio18;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class RanaApp extends Applet implements Runnable {
    public static final int TIEMPO = 35;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Rana rana;
    ArrayList<Coche> coches;
    
    public static boolean continua = true;
    int contador = 0;
    int tiempoAleatorio;
    
    public void init() {
        imagen = this.createImage(500, 300);
        noseve = imagen.getGraphics();
        rana = new Rana();
        
        coches = new ArrayList<Coche>();
        coches.add(crearCoche());
            
        tiempoAleatorio = (int)(Math.random()*2000)+2000;
        this.setSize(300, 300);
    }

    public Coche crearCoche() {
        int velocidad = (int)(Math.random()*3) + 3;
        if(Math.random() < 0.5) {
            return new Coche(-40, (int)(Math.random()*80) + 150, velocidad);
        }
        else {
            return new Coche(500, (int)(Math.random()*80) + 50, -velocidad);
        }
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.PINK); // Fondo
        noseve.fillRect(0, 0, 500, 300);
        noseve.setColor(Color.BLACK); // Carretera
        noseve.fillRect(0, 50, 500, 200);
        noseve.setColor(Color.WHITE); // Línea Carretera
        noseve.drawLine(0, 149, 500, 149);
        
        rana.paint(noseve);
        for(Coche coche : coches) 
            coche.paint(noseve);
        if(rana.y <= 0) noseve.drawString("WINNER", 120, 140); 
        if(!continua) noseve.drawString("GAME OVER", 120, 140); 
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            contador += TIEMPO;  
            
            if(contador >= tiempoAleatorio) {
                contador = 0;
                tiempoAleatorio = (int)(Math.random()*500)+500;
                coches.add(crearCoche());
            }
            
            rana.colision(coches);
            
            try {
            for(Coche coche : coches)
                if(coche.update())
                    coches.remove(coche);
                    //break;
            } catch(ConcurrentModificationException e) {};
            
            /*
            for(Coche coche : coches)
                if(rana.intersects(coche)) {
                    continua = false;
                    break;
                }
            */
            
            if(rana.y<=0) {
                repaint();
                animacion.stop();
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
    
    public boolean keyDown(Event e, int tecla) {
        rana.actualizar(tecla);
        return true;
    }
}