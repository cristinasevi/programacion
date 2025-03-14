/*
 
 */
package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class BlackJack extends Applet {
    public static final int NUMCARTAS = 52;
    public static final int CPF = 13;
    
    Image imagenes[];
    
    Image imagen;
    Graphics noseve;
    Rectangle tablero[][];
    
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        String palos[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
        
        imagenes = new Image[NUMCARTAS];
        
        for(int i=0; i<NUMCARTAS; i++)
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio03/Cartas/" + ((i%CPF)+1) + palos[i/CPF]);
        
        this.setSize(700, 500);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK); 
        noseve.fillRect(0, 0, 700, 500);
        noseve.drawImage(imagenes[0], 0, 0, 130, 200, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        
        return true;
    }
}