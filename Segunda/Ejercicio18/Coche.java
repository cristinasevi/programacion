/*
 
 */
package Segunda.Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coche extends Rectangle {
    static final Color colores[] = {Color.BLUE, Color.CYAN, Color.GRAY, Color.MAGENTA, Color.ORANGE};
    Color color;
    int velX = 5;

    public Coche() {
        super((int)(Math.random()*100)+50, (int)(Math.random()*250), 40, 15);
        color = colores[(int)(Math.random()*colores.length)];
    }
    
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public boolean update() {
        x -= velX;
        return(x<-width);
    }
}