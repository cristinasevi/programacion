/*

 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Pedal {
    Image imagen;
    int posX, posY;
    
    public Pedal(Image imagen, int posX, int posY) {
        this.imagen = imagen;
        this.posX = posX;
        this.posY = posY;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagen, posX, posY, 50, 70, app);
    }
    
    public void update() {
        
    }
}