/*
 
 */
package Examen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Circulo extends Rectangle {
    int velX, velY;
    Color color;
    private int numero;
    Color[] colores = {Color.ORANGE, Color.CYAN, Color.YELLOW, Color.MAGENTA};
            
    public Circulo() {
        super(140, 140, 30, 30);
        velX = (int)(Math.random()*2)+2;
        velY = (int)(Math.random()*2)+2;
        if (Math.random() < 0.5) velX = -velX;
        if (Math.random() < 0.5) velY = -velY;
        numero = 1;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, width, height);
        
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.setColor(Color.BLACK);
        g.drawString("" + numero, x + width/2 - 4, y + height/2 + 5);
    }
    
    public boolean update() {
        x += velX;
        y += velY;
        
        return (x + width < 0 || x > 300 || y + height < 0 || y > 300);
    }
    
    public boolean aumentar() {
        numero++;
        return numero >= 5;
    }
}