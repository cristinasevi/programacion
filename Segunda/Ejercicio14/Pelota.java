/*
 
 */
package Segunda.Ejercicio14;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Pelota extends Rectangle {
    int velX, velY;
    Color color;
    Color colores[] = {Color.red, Color.yellow, Color.magenta, Color.pink, Color.orange};
            
    public Pelota() {
        super((int)(Math.random()*250), (int)(Math.random()*250), 0, 0); 
        int radio = ((int)(Math.random()*30)+20); 
        this.setSize(radio, radio); 
        velX = ((int)(Math.random()*11)-5); 
        velY = ((int)(Math.random()*11)-5); 
        color = colores[(int)(Math.random()*colores.length)]; 
    }
    
    public void paint(Graphics g) {
        
    }
    
    public void update() {
             
    }
}