/*
 
 */
package Segunda.Ejercicio16;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;

public class Gun extends Rectangle {
    public static final int VELX = 5;
    
    public Gun() {
        super(130, 260, 40, 40); 
    }  
    
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

    public void actualizar(int posX) {
        x = posX - (width/2); // para que se ponga en medio
        if(x >= (300-width)) x = 300-width;
        if(x <= 0) x = 0;
    }
}