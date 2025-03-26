/*

 */
package Tercera.Ejercicio04;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Lugar {
    public static final int DIM = 48;
    private Image imagen;
    int valor;
    
    public Lugar(Image imagen, int valor) {
        this.imagen = imagen;
        this.valor = valor;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    public void paint(Graphics g, Applet app, int x, int y) {
        if(imagen != null)
            g.drawImage(imagen, x*DIM, y*DIM, app);
    }
}