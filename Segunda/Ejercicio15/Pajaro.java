/*
 
 */
package Segunda.Ejercicio15;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Pajaro extends Rectangle {
    public static final int GRAVEDAD = 2;
    public static final int SALTO = -5;

    public Pajaro() {
        super(10, 0, 15, 15);
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }
    
    public void update() {
        y += GRAVEDAD; 
    }
    
    public void saltar() {
        y += SALTO; 
    }
    
    public boolean chocar(Rectangle rect1, Rectangle rect2) {
        return this.intersects(rect1) || this.intersects(rect2);
    }
}