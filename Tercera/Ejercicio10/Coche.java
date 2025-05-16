/*

 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Coche extends Rectangle {
    Image imgCoche, imgLuz;
    private boolean encendida = false;
    
    public Coche(Image imgCoche, Image imgLuz) {
        super(20, 200, 250, 200);
        this.imgCoche = imgCoche;
        this.imgLuz = imgLuz;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    
    public void turn() {
        encendida = !encendida;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imgCoche, x, y, width, height, app); // Coche
        if(encendida)
            g.drawImage(imgLuz, x + width - 30, y + (height/2), 60, 30, app); // Luz
    }
}