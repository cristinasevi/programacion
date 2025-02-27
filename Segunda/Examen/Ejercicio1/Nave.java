/*

 */
package Examen;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Nave extends Rectangle {
    public static final int TAMANO = 5;
    Color color;
    int velX = 5;
    
    public Nave(int posX, int posY, Color color) {
        super(posX, posY, 30, 30);
        this.color =  color;
    }
    
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public void update() {
        x += velX;
        
        if((x <=0) || (x >= (300-width)))
            velX = -velX;
    }
    
    public void aumentar() {
        width += TAMANO;
        height += TAMANO;
    }
}