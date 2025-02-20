/*

 */
package Segunda.Ejercicio17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Cactus extends Rectangle {
    static final Color colores[] = {Color.BLUE, Color.CYAN, Color.GRAY, Color.MAGENTA, Color.ORANGE};
    Color color;
    int velX = 5;

    public Cactus(int altura) {
        super(300, 300-altura, (int)(Math.random()*10)+20, altura);
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