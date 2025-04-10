/*
 
 */

package Tercera.Ejercicio07;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Memory extends Applet {
    public static final int TAM = 4;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Image reverso;
    Casilla casillas[][];
    
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        
        imagenes = new Image[8];
        for(int i=0; i<8; i++)
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio07/donutsMatch/img" + (i+1) + ".png");
        
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio07/donutsMatch/reverso.png");
        
        casillas = new Casilla[TAM][TAM];
        for(int i=0; i<TAM; i++)
            for(int j=0; j<TAM; j++)
                casillas[i][j] = new Casilla(98+(Casilla.DIM*j), 98+(Casilla.DIM*i), imagenes[i], reverso);
            
        this.setSize(700, 500);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY); 
        noseve.fillRect(0, 0, 700, 500);
        
        for (int i=0; i<4; i++)
            for(int j=0; j<4; j++)
                casillas[i][j].paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);
    }

    
    public boolean mouseDown(Event e, int x, int y) {
        
        return true;
    }
    
    public boolean mouseDrag(Event e, int x, int y) {
        
        return true;
    }
    
    public boolean mouseUp(Event e, int x, int y) {
        
        return true;
    }
    
    public boolean action(Event e, Object obj) {
        
        return true;
    }
}