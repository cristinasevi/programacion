/*
 El centro del applet sale un círculo cada 2 segundos, tomando una trayectoria aleatoria.  
 En el interior del círculo se ve un número, inicialmente el 1.  
 Cada vez que el usuario haga click en el círculo, el número aumentará en 1 y cuando llegue al 5 el círculo desaparecerá.  
 Llevaremos y mostraremos un contador con el número de círculos que el usuario se ha cargado y cuando en 
 la lista haya 10 círculos el juego habrá terminado (GAME OVER).
 */
package Examen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class App extends Applet implements Runnable {
    public static final int TIEMPO = 35;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    ArrayList<Circulo> circulos;
    
    int sum = 0;
    boolean continua = true;
    int contador = 0;
    int tiempoAleatorio;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        
        circulos = new ArrayList<Circulo>();
        
        circulos.add(new Circulo());
       
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
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, 300, 300);
       
        for(Circulo circulo : circulos)
            circulo.paint(noseve);
        
        noseve.setFont(new Font("Arial", Font.BOLD, 16));
        noseve.setColor(Color.WHITE);
        noseve.drawString("PINCHADOS = " + sum, 100, 30); 
        
            
        if(!continua) noseve.drawString("GAME OVER", 120, 140); 
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            contador += TIEMPO;
            
            for(Circulo circulo : circulos)
                circulo.update();
            
            if(contador >= 2000) {
                circulos.add(new Circulo());
                contador = 0;
            }
            
            if(sum >= 10) {
                continua = false;
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
        for(Circulo circulo : circulos)
            if(circulo.contains(x,y))
                circulo.aumentar();
        return true;
    }
}