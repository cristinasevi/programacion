/*

 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Rueda {
    public static final int TAM = 40;
    Image imagenes[];
    int posX, posY;
    int imgActual = 0;
    
    public Rueda(Image imagenes[], int posX, int posY) {
        this.imagenes = imagenes;
        this.posX = posX;
        this.posY = posY;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagenes[imgActual], posX, posY, TAM, TAM, app);
    }
    
    public void update() {
        imgActual = (imgActual + 1) % imagenes.length;
    }
}