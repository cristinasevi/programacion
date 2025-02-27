/*
 
 */
package Examen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bala extends Rectangle {
    public static final int VELY = 10;
    Color color;
    
    public Bala(int posX, Color color) {
        super(posX, 260, 10, 10);
        this.color =  color;
    }
    
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public boolean update() {
        y -= VELY;
        return(y<0);
    }
}