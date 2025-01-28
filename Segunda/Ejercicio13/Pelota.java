/*
 
 */
package Segunda.Ejercicio13;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class Pelota extends Rectangle {
    int velX, velY;
    Color color;
    Color colores[] = {Color.red, Color.yellow, Color.magenta, Color.pink, Color.orange};
            
    public Pelota() {
        // (int) -> parsear: convierte a otro tipo de dato
        super((int)(Math.random()*250), (int)(Math.random()*250), 0, 0); 
        int radio = ((int)(Math.random()*30)+20); // valor entre 20 y 50 sin incluir 50
        this.setSize(radio, radio); //this.width = this.height = radio;
        velX = ((int)(Math.random()*11)-5); // valor entre -5 y +5 ambos incluidos
        velY = ((int)(Math.random()*11)-5); // valor entre -5 y +5 ambos incluidos
        color = colores[(int)(Math.random()*colores.length)]; // valor entre 0 y 4 ambos incluidos
    }
    
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(velX, velY, width, height); 
    }
    
    public void actualizar() {
        
    }
}