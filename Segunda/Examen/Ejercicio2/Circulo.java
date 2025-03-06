/*
 
 */
package Examen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;

public class Circulo extends Rectangle {
    static final int RADIO = 90;
    
    int velX;
    int velY;
    int numInterior = 1;
    Color colores[] = {Color.BLUE, Color.RED, Color.YELLOW, Color.GREEN, Color.GRAY, Color.MAGENTA};

    public Circulo(int x, int y){
        super(x, y, 0, 0);
        this.setSize(RADIO, RADIO);
        velX = ((int)(Math.random()*6)) - 3;
        velY = ((int)(Math.random()*6)) - 3;
        velX = (velX == 0) ? 1 : velX;
        velY = (velY == 0) ? 1 : velY;
    }
    
    public void paint(Graphics g){
        g.setColor(colores[numInterior]);
        g.fillOval(x, y, width, height);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.BOLD, 48));
        g.drawString("" + numInterior, (x + RADIO/2) - 12, (y + RADIO/2) + 6);
    }
    
    public void update(){
        movimiento();
    }
    
    public void movimiento(){
        x += velX;
        y += velY;
    }
    
    public void aumentar(List<Circulo> c){
        this.numInterior += 1;
        if(numInterior > 5){
            c.remove(this);
            App.PUNTUACION++;
        }
    }
}