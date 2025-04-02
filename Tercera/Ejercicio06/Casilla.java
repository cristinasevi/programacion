/*
 
 */
package Tercera.Ejercicio06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Casilla extends Rectangle {
    public static final int DIM = 60;
    int valor;
    Color color;

    public Casilla(int posX, int posY, int valor, Color color) {
        super(posX, posY, DIM, DIM);
        this.valor = valor;
        this.color = color;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
        g.setColor(color);
        g.drawString(""+valor, x+20, y+20);
    }
}