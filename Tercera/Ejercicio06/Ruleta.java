/*
 
 */

package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Ruleta extends Applet {
    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
   
    Image imagen;
    Graphics noseve;
    Casilla casillas[][];
    public int rojos[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    
    public void init() {
        imagen = this.createImage(400, 500);
        noseve = imagen.getGraphics();
        
        
        this.setSize(400, 500);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY); 
        noseve.fillRect(0, 0, 400, 500);
        
        
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        
        return true;
    }
    
    public boolean action(Event e, Object obj) {
        
        return true;
    }
}