/*
 
 */
package Tercera.Ejercicio09;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Casilla extends Rectangle {
    public static final int DIM = 60;
    private int valor;
    Color color;
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Casilla(int posX, int posY, int valor, Color color) {
        super(posX, posY, DIM, DIM);
        this.valor = valor;
        this.color = color;
    }
    
    public void paint(Graphics g) {
        g.setColor(color); // Color de fondo de la casilla
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK); // Color del borde de la casilla
        g.drawRect(x, y, width, height);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
        g.setColor(Color.WHITE); // Color de la letra
        g.drawString(""+valor, x+20, y+40);
    }
}