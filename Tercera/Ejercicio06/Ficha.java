/*
 
 */
package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Ficha extends Rectangle {
    public static final int DIM = 50;
    public Image imagen;
    public int precio;
    
    public Ficha(int posX, int posY, int precio, Image imagen) {
        super(posX, posY, DIM, DIM);
        this.imagen = imagen;
        this.precio = precio;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagen, x, y, width, height, app);
    }
    
    public void update(int posX, int posY) {
        x = posX - (DIM/2);
        y = posY - (DIM/2);
    }
}