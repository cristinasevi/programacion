/*
 
 */
package Tercera.Ejercicio04;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Tablero extends Applet {
    public static final int TAM = 5;
    
    Image imagenes[][];
    Lugar lugares[][];
    Point blanco;
    
    Image imagen;
    Graphics noseve;
    
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        
        imagenes = new Image[TAM][TAM];
        lugares = new Lugar[TAM][TAM];
        
        for (int i=0; i<TAM; i++) {
            for (int j=0; j<TAM; j++) {
                imagenes[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio04/botones/" + ((i*TAM)+j+1) + ".gif");
                lugares[i][j] = new Lugar(imagenes[i][j], (i*TAM)+j);
            }
        }
        
        blanco = new Point(TAM-1, TAM-1); // hay que poner la posición en X e Y, inicialmente está en la 4, 4
        
        this.setSize(700, 500);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY); 
        noseve.fillRect(0, 0, 700, 500);
        
        for (int i=0; i<TAM; i++) {
            for (int j=0; j<TAM; j++) {
                lugares[i][j].paint(noseve, this, j, i);
            }
        }
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        Point click;
        return true;
    }
    
    public boolean action(Event e, Object obj) {
        
        return true;
    }
}