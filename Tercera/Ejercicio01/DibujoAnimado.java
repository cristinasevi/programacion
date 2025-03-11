/*
 
 */
package Tercera.Ejercicio01;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class DibujoAnimado {
    private Image imagenes[];
    public int indice = 0;

    public DibujoAnimado(Image imagenes[]) {
        this.imagenes = imagenes;
    }

    public Image[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(Image[] imagenes) {
        this.imagenes = imagenes;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagenes[indice], 0, 0, 200, 250, app);
    }
    
    public void update() {
        indice = (indice + 1) % imagenes.length;
    }
}