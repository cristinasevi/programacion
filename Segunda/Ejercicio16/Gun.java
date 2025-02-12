/*
 
 */
package Segunda.Ejercicio16;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;

public class Gun extends Rectangle {
    public static final int VELX = 5;
    
    public Gun() {
        super(120, 270, 20, 30); 
    }  
    
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

    public void setX(int direccion) {
        if(direccion == Marcianos.DERECHA)
            x += VELX;
        else
            x -= VELX;
        if(x < 0)
            x = 0;
        if(x > 240) 
            x = 240;
    }
}