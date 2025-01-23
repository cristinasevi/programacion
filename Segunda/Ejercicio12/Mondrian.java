/*
 
 */
package Segunda.Ejercicio12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Mondrian extends Applet implements Runnable {
    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    int direccion;
    
    Thread animacion;
    int posX, posY;
    Image imagen;
    Graphics noseve;
            
    public void init() {
        posX = 80;
        posY = 100;
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        direccion = DERECHA;
    }
    
    public void start() {
        animacion = new Thread(this); // hay que poner this para que funcione el run
        animacion.start();
    }
    
    public void paint(Graphics g) {
        // g.fillRect(posX, posY, anchura, altura);
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 300, 300);
        
        noseve.setColor(Color.yellow);
        noseve.fillRect(0, 0, 90, 90);
        noseve.fillRect(250, 0, 40, 190);
        noseve.fillRect(80, 160, 100, 120);
      
        noseve.setColor(Color.blue);
        noseve.fillRect(80, 220, 220, 90);
        noseve.fillRect(100, 10, 90, 80);
        
        noseve.setColor(Color.lightGray);
        noseve.fillRect(posX, posY, 110, 90);
        
        noseve.setColor(Color.red);
        noseve.fillRect(200, 0, 45, 45);
        noseve.fillRect(0, 110, 70, 200);
        
        noseve.setColor(Color.magenta);
        noseve.fillRect(200, 55, 60, 135);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void run() {
        do {
            switch (direccion) {
                case ARRIBA:
                    
                    break;
                case ABAJO:
                    
                    break;
                case IZQUIERDA:
                    
                    break;
                case DERECHA:
                    
                    break;
            }
            repaint();
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {}
        }
        while(true); 
    }
}

/*
 Applet: es como Frame, una ventana

 1º init -> instancia valores iniciales
 2º start -> inicia Threads
 3º paint -> recibe objeto Graphics
 4º stop -> detiene el Applet
*/

/*
 Efecto del parpadeo, se produce por el método repaint(), 
 que borra el objeto Graphics y llama al método paint()
 
 Para solucionarlo -> repintar fuera de la vista del usuario.
*/