/*
 
 */
package Segunda.Ejercicio11;

import java.awt.Frame;
import java.awt.Event;
import java.awt.Graphics;

public class Animacion1 extends Frame implements Runnable{ // implementa los métodos de interfaz Runnable
    Thread animacion;
    String frames[] = {"*", "**", "***", "****", "*****", "******", "*****", "****", "***", "**", "*"};
    int actual = 0;
    
    public static void main(String arg[]) {
        Animacion1 app = new Animacion1();
    }
    
    public Animacion1() {
        super("Animación sencilla");
        
        this.pack();
        this.setSize(400, 400);
        this.setVisible(true);
        
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void paint(Graphics g){
        g.drawString(frames[actual], 80, 100);
    }
    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        
        return false;
    } 

    @Override
    public void run() {
        do {
            actual = (actual + 1) % frames.length;
            repaint();
            try {
                Thread.sleep(300); // milisegundos que el proceso va a dormir
            } catch (InterruptedException e) {}
        }
        while(true);     
    }
}