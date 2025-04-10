/*
 
 */
package Tercera.Ejercicio07;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Casilla extends Rectangle {
    public static final int DIM = 100;
    
    private Image imagen;
    Image reverso;
    private boolean descubierta;
    
    public Casilla(int posX, int posY, Image img1, Image img2) {
        super(posX, posY, DIM, DIM);
        this.imagen = img1;
        this.reverso = img2;
        descubierta = true;
    }

    public Image getImagen() {
        return imagen;
    }

    public boolean isDescubierta() {
        return descubierta;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }
    
    public void paint(Graphics g, Applet app) {
        if(descubierta) {
            g.drawImage(imagen, x, y, width, height, app);
        } else {
            g.drawImage(reverso, x, y, width, height, app);
        }
    }            
}