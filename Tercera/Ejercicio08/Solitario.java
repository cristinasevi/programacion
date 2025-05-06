/*
 
 */

package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Solitario extends Applet {
    public static final int NUMCARTAS = 52;
    public static final int CPP = 13; // Cartas Por Palo
    public static final int NUM_PALOS = 4;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Image reverso;
    Baraja baraja;
    MazoSecundario mazoSecundario;
    Rectangle rectangulo;
    Carta activa;
    MazoPalo mazoPalos[];
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        String palos[] = {"_of_clubs.png", "_of_diamonds.png", "_of_hearts.png", "_of_spades.png"};
        
        imagenes = new Image[NUMCARTAS];
        for(int i=0; i<NUMCARTAS; i++)
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio08/Cartas/" + ((i%CPP)+1) + palos[i/CPP]);
        
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio08/Cartas/reverso.png");
        rectangulo = new Rectangle(20, 20, Carta.ANCHURA, Carta.ALTURA); 
        baraja = new Baraja(imagenes);
        mazoSecundario = new MazoSecundario();
        mazoPalos = new MazoPalo[NUM_PALOS];
        for(int i=0; i<NUM_PALOS; i++)
            mazoPalos[i] = new MazoPalo((i*(Carta.ANCHURA+30))+300);
        
        this.setSize(700, 800);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY); 
        noseve.fillRect(0, 0, 700, 800);
        noseve.drawImage(reverso, 20, 20, Carta.ANCHURA, Carta.ALTURA, this);
        for(int i=0; i<NUM_PALOS; i++)
            mazoPalos[i].paint(noseve, this);
        mazoSecundario.paint(noseve, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        if(rectangulo.contains(x,y)) {
            if(!baraja.getCartas().isEmpty()) {
                mazoSecundario.anadir(baraja.sacarCarta());
                mazoSecundario.recolocar();
            } else {
                baraja.setCartas(mazoSecundario.getCartas());
                mazoSecundario.setCartas(new ArrayList<Carta>());
            }
        }
        if(mazoSecundario.extraer().contains(x,y)) {
            activa = mazoSecundario.extraer();
        }
        repaint();
        return true;
    }
    
    public boolean mouseDrag(Event e, int x, int y) {
        if(activa != null) {
            activa.setPosicion(x - (Carta.ANCHURA/2), y - (Carta.ALTURA/2));
            repaint();
        }
        return true;
    }
    
    public boolean mouseUp(Event e, int x, int y) {
        if(activa != null) {
            for(int i=0; i<NUM_PALOS; i++)
                if(activa.intersects(mazoPalos[i]))
                    if(mazoPalos[i].anadir(activa)) {
                        mazoSecundario.eliminar();
                        break;
                    }
            mazoSecundario.recolocar();
            activa = null;
            repaint();
        }
        return true;
    }
}