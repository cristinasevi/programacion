/*

 */
package Segunda.Ejercicio17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Cactus extends Rectangle {
    int velX = 5;

    public Cactus() {
        super(250, 270, 20, 20);
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }
    
    public void update() {
        x -= velX;
    }
}