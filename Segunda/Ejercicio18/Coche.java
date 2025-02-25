/*
 
 */
package Segunda.Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coche extends Rectangle {
    static final Color colores[] = {Color.BLUE, Color.CYAN, Color.GRAY, Color.MAGENTA, Color.ORANGE};
    Color color;
    int velX;

    public Coche(int posX, int posY, int velX) {
        super(posX, posY, 40, 20);
        color = colores[(int)(Math.random()*colores.length)];
        this.velX = velX;
    }
    
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public boolean update() {
        x += velX;
        if((x < -width) || (x>300))
            return true;
        return false;
    }
}