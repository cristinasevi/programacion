/*
 
 */
package Segunda.Ejercicio16;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Bullet extends Rectangle {
    public static final int VELY = -5;
            
    public Bullet(int posX) {
        super(posX, 260, 5, 10); // 260 -> 300 - altura de pistola
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
    }
    
    public boolean update(Gun pistola, ArrayList<Nave> naves) {
        x += velX;
        y += velY;               
        if((x <=0) || (x >= (300-width)))
            velX = -velX;
        if(y <=0)
            velY = -velY;  
        if(y >= (300-height))
            return false;
        
        if(this.intersects(pistola))
            velY = -velY;
        
        for(Nave nave : naves) {
            if(this.intersects(nave)) {
                naves.remove(naves);
                this.velY = -this.velY;
                break; 
            }
        }
        return true;
    }
}