/*
 
 */

package Tercera.Ejercicio05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class BuscaMina extends Applet {
    public static final int DIM = 10;
   
    Image imagen;
    Graphics noseve;
    Image mina;
    Image reverso;
    Casilla casillas[][];
    
    public void init() {
        imagen = this.createImage(400, 500);
        noseve = imagen.getGraphics();
        
        mina = getImage(getCodeBase(), "Tercera/Ejercicio05/ImgBuscaMinas/mina.png");
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio05/ImgBuscaMinas/casilla.png");
        
        casillas = new Casilla[DIM][DIM];
        for(int i=0; i<DIM; i++)
            for(int j=0; j<DIM; j++)
                casillas[i][j] = new Casilla(100+(j*Casilla.TAM), 100+(i*Casilla.TAM), reverso);
        
        this.setSize(400, 500);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.GRAY); 
        noseve.fillRect(0, 0, 400, 500);
        
        for(int i=0; i<DIM; i++)
            for(int j=0; j<DIM; j++)
                casillas[i][j].paint(noseve, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        for(int i=0; i<DIM; i++)
            for(int j=0; j<DIM; j++)
                if(casillas[i][j].contains(x,y)) {
                    casillas[i][j].setTapada(false);
                    repaint();
                }
        return true;
    }
    
    public boolean action(Event e, Object obj) {
        
        return true;
    }
}