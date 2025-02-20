/*
 
 */
package Segunda.Ejercicio18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Rana extends Rectangle {
    int velY = 5;
            
    public Rana() {
        super(150, 0, 15, 15);
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }
    
    public void update() {
        y -= velY;
    }
}