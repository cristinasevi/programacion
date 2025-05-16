/*

 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Pedal extends Rectangle {
    Image imagen;
    
    public Pedal(Image imagen, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.imagen = imagen;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagen, x, y, width, height, app);
    }
    
    public void acelerar() {
        if(Juego.velocidad > 10) Juego.velocidad -= 10;
    }
    
    public void frenar() {
        Juego.velocidad += 10;
    }
}