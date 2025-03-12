/*
 
 */
package Tercera.Ejercicio02;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Pieza extends Rectangle {
    public static final int DIMENSION = 60;
    Image img;
    int posicion;
    private boolean colocado = false;

    public Pieza(Image img, int posicion) {
        super((int)(Math.random()*300)+300, (int)(Math.random()*450), DIMENSION, DIMENSION);
        this.img = img;
        this.posicion = posicion;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(img, x, y, app);
    }

    public boolean isColocado() {
        return colocado;
    }

    public void setColocado(boolean colocado) {
        this.colocado = colocado;
    }
    
    public void mover(int posx, int posy) {
        x = posx - (DIMENSION / 2);
        y = posy - (DIMENSION / 2);
    }
}