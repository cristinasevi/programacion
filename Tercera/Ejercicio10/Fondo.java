/*

 */
package Tercera.Ejercicio10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Fondo extends Applet {
    Image imagen;
    Graphics noseve;
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        
        imagen = getImage(getCodeBase(), "Tercera/Ejercicio10/imgsCoche/fondo.png");

        this.setSize(700, 800);
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.fillRect(0, 0, 700, 800);
        
        g.drawImage(imagen, 0, 0, this);
    }
}