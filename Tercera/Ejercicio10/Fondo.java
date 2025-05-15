/*

 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Fondo {
    Image imagen;
    int posX;
    Applet applet;
    
    public Fondo(Image imagen, Applet applet) {
        this.imagen = imagen;
        this.applet = applet;
    }
    
    public void paint(Graphics g) {
        g.drawImage(imagen, posX, 0, applet.getWidth(), applet.getHeight(), applet); // Imagen 1
        g.drawImage(imagen, posX + applet.getWidth(), 0, applet.getWidth(), applet.getHeight(), applet); // Imagen 2
    }
    
    public void update() {
        posX -= 5;
        if(posX <= -applet.getWidth()) posX = 0; // Con esto tenemos el infinito
    }
}