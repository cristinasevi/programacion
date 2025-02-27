/*
 
 */
package Examen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ametralladora extends Rectangle {
    Color color;
    
    public Ametralladora(int posX, int posY, Color color) {
        super(posX, posY, 20, 20); 
        this.color = color;
    }
    
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}