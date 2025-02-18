/*
 
 */
package Segunda.Ejercicio16;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Rectangle {
    public static final int VELY = -5;
            
    public Bullet(int posX) {
        super(posX, 260, 5, 10); // 260 -> 300 - altura de pistola
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, width, height);
    }
    
    public boolean update() {
        y += VELY;
        return(y<20);
    }
}