/*
 
 */
package Tercera.Ejercicio02;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Puzzle extends Applet {
    public static final int PIEZAS = 25;
    public static final int FILAS = 5;
    
    Image imagenes[];
    Pieza piezas[];
            
    Image imagen;
    Graphics noseve;
    
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        
        imagenes = new Image[PIEZAS];
        piezas = new Pieza[PIEZAS];
        
        for(int i=0; i<PIEZAS; i++) {
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio02/directorioImagenes/" + (i+1) + ".png");
            piezas[i] = new Pieza(imagenes[i], i);
        }
        
        this.setSize(700, 500);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK); 
        noseve.fillRect(0, 0, 700, 500);
        
        for(int i=0; i<PIEZAS; i++)
            piezas[i].paint(noseve, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    /*public boolean mouseDrag(Event ev, int x, int y) {
        pieza.finX = x;
        pieza.finY = y;
        repaint();
        return true;
    }*/
}