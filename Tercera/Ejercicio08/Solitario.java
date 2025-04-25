/*
 
 */

package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Solitario extends Applet {
    public static final int NUMCARTAS = 52;
    public static final int CPP = 13; // Cartas Por Palo
    public static final int NUM_PALOS = 4;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Image reverso;
    Baraja baraja;
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        String palos[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
        
        imagenes = new Image[NUMCARTAS];
        for(int i=0; i<NUMCARTAS; i++)
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio08/Cartas/" + ((i%CPP)+1) + palos[i/CPP]);
        
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio08/Cartas/reverso.png");
        
        
        this.setSize(700, 800);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY); 
        noseve.fillRect(0, 0, 700, 800);

        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        
        return true;
    }
}