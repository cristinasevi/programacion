/*
 
 */
package Tercera.Ejercicio04;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Tablero extends Applet {
    public static final int TAM = 5;
    
    Image imagenes[][];
    Lugar lugares[][];
    Point blanco;
    AudioClip error, acierto, exito;
    Button botonMezclar;
    
    Image imagen;
    Graphics noseve;
    
    public void init() {
        imagen = this.createImage(700, 500);
        noseve = imagen.getGraphics();
        
        try {
            error = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/error.wav"));
            acierto = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/correct.wav"));
            exito = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/exito.wav"));
        } catch(MalformedURLException e) {};
        
        imagenes = new Image[TAM][TAM];
        lugares = new Lugar[TAM][TAM];
        
        for (int i=0; i<TAM; i++) {
            for (int j=0; j<TAM; j++) {
                imagenes[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio04/botones/" + ((i*TAM)+j+1) + ".gif");
                lugares[i][j] = new Lugar(imagenes[i][j], (i*TAM)+j);
            }
        }
        
        blanco = new Point(TAM-1, TAM-1); // hay que poner la posición en X e Y, inicialmente está en la 4, 4
        
        botonMezclar = new Button("Mezclar");
        add(botonMezclar);
        
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
    
    public boolean mover(Point click) {
        Point desplazamiento, hasta;
        desplazamiento = new Point(delta(click.x, blanco.x), delta(click.y, blanco.y));
        if((desplazamiento.x == 0) && (desplazamiento.y == 0))
            return false;
        if((desplazamiento.x != 0) && (desplazamiento.y != 0))
            return false;
        hasta = new Point(click.x + desplazamiento.x, click.y + desplazamiento.y);
        if(!((blanco.x == hasta.x) && (blanco.y == hasta.y)))
            mover(hasta);
        lugares[blanco.x][blanco.y].setImagen(lugares[click.x][click.y].getImagen());
        lugares[blanco.x][blanco.y].valor = lugares[click.x][click.y].valor;
        lugares[click.x][click.y].setImagen(null);
        lugares[click.x][click.y].valor = 24;
        blanco = click;
        return true;
    }
    
    public int delta(int a, int b) {
        if(a == b) return 0;
        else return((b-a)/Math.abs(b-a));
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        Point click;
        click = new Point(y/Lugar.DIM, x/Lugar.DIM);
        if(!mover(click))
            error.play();
        else {
            acierto.play();
            repaint();
        }
        return true;
    }
    
    public void mezclar() {
        Random random = new Random();
        
        for (int i = 0; i < 100; i++) { 
            Point[] posiblesMoves = new Point[4];
            int numMoves = 0;
            
            if (blanco.x > 0) {
                posiblesMoves[numMoves++] = new Point(blanco.x - 1, blanco.y);
            }
            if (blanco.x < TAM - 1) {
                posiblesMoves[numMoves++] = new Point(blanco.x + 1, blanco.y);
            }
            if (blanco.y > 0) {
                posiblesMoves[numMoves++] = new Point(blanco.x, blanco.y - 1);
            }
            if (blanco.y < TAM - 1) {
                posiblesMoves[numMoves++] = new Point(blanco.x, blanco.y + 1);
            }
            if (numMoves > 0) {
                Point move = posiblesMoves[random.nextInt(numMoves)];
                mover(move);
            }
        }
        repaint();
    }
    
    public boolean action(Event e, Object obj) {
        if (e.target == botonMezclar) {
            mezclar();
            return true;
        }
        return true;
    }
}