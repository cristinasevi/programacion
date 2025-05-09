/*

 */
package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Serpiente {
    ArrayList<Eslabon> eslabones;
    Image imagen;
    int direccion;
    
    public Serpiente(Image img, int x, int y) {
        eslabones = new ArrayList<Eslabon>();
        this.imagen = img;
        this.direccion = Eslabon.DERECHA;
    }
    
    public void paint(Graphics g, Applet app) {
        for (Eslabon eslabon : eslabones) {
            eslabon.paint(g, app);
        }
    }
    
    public void update() {
        
    }
}