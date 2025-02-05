/*
 
 */
package Segunda.Ejercicio14;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;

public class Raqueta extends Rectangle {
    public static final int VELX = 5;
    
    public Raqueta() {
        super(120, 270, 60, 10); // super(x, y, width, height), llamamos al método constructor de la superclase de Rectangle
    }  
    
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

    public void setX(int direccion) {
        if(direccion == Arkanoid.DERECHA)
            x += VELX;
        else
            x -= VELX;
        if(x < 0)
            x = 0;
        if(x > 240) // 300 que mide el Applet - la anchura de la Raqueta que es 60 = 240
            x = 240;
    }
}