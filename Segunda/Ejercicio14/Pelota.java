/*
 
 */
package Segunda.Ejercicio14;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Pelota extends Rectangle {
    int velX, velY;
            
    public Pelota() {
        super(150, 200, 9, 9); 
        velX = -3;
        velY = -2;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
    }
    
    public void update(Raqueta raqueta, ArrayList<Ladrillo> ladrillos) {
        x += velX;
        y += velY;               
        if((x <=0) || (x >= (300-width)))
            velX = -velX;
        if((y <= 0) || (y >= (300-height)))
            velY = -velY;  
        
        if(this.intersects(raqueta))
            velY = -velY;
        
        for(int i=0; i<ladrillos.size(); i++) {
            if(this.intersects(ladrillos.get(i))) {
                ladrillos.remove(i);
                this.velY = -this.velY;
                break; // se pone break para que no se eliminen varios de golpe al chocar
            }
        }
        
        // Otra forma para hacer la función anterior -> for(Clase elemento_individual : lista)
        for(Ladrillo ladrillo : ladrillos) {
            if(this.intersects(ladrillo)) {
                ladrillos.remove(ladrillo);
                this.velY = -this.velY;
                break; 
            }
        }
    }
}