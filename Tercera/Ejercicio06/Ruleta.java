/*
 
 */

package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Panel;
import java.util.ArrayList;

public class Ruleta extends Applet {
    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
    public static final int NUMJUGADAS = 10;
   
    Image imagen;
    Graphics noseve;
    Casilla casillas[][];
    public int rojos[] = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    public int valores[] = {1, 5, 10, 25, 50, 100, 500, 1000, 5000, 10000};
    ArrayList<Ficha> fichas[];
    Ficha activa;
    Image imagenes[];
    Button boton;
    int numeroSuerte;
    int jugadas[];
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        
        setup();
        
        casillas = new Casilla[FILAS][COLUMNAS];
        java.util.ArrayList<Integer> lRojos = new java.util.ArrayList<Integer>();
        for(int i=0; i<rojos.length; i++)
            lRojos.add(new Integer(rojos[i]));
        
        for(int i=0; i<casillas.length; i++)
            for(int j=0; j<casillas[i].length; j++)
                if(lRojos.contains(new Integer((i*COLUMNAS)+j+1)))
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+30, (i*Casilla.DIM)+50, (i*COLUMNAS)+j+1, Color.RED);
                else
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+30, (i*Casilla.DIM)+50, (i*COLUMNAS)+j+1, Color.BLACK);
        
        imagenes = new Image[NUMJUGADAS];
        for(int i=0; i<NUMJUGADAS; i++)
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio06/Fichas/ficha" + (i+1) + ".png");
                    
        fichas = new ArrayList[NUMJUGADAS];
        
        for(int i=0; i< NUMJUGADAS; i++){
            fichas[i] = new ArrayList<Ficha>();
            fichas[i].add(new Ficha(400, 50+(i*Ficha.DIM),valores[i],imagenes[i]));
        }   
        
        this.setSize(700, 800);
    }
    
    private void setup() throws HeadlessException {
        Panel panel = new Panel();
        boton = new Button("Jugar!");
        panel.add(boton);
        this.setLayout(new BorderLayout());
        this.add("North", panel);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY); 
        noseve.fillRect(0, 0, 700, 800);
        
        for(int i=0; i<casillas.length; i++)
            for(int j=0; j<casillas[i].length; j++)
                casillas[i][j].paint(noseve);
        
        for(int i=0; i<NUMJUGADAS; i++)
            for(Ficha ficha: fichas[i])
                ficha.paint(noseve,this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        for(int i=0; i < NUMJUGADAS; i++) {
            for(Ficha ficha : fichas[i]) {
                if(ficha.contains(x,y)){
                    activa = ficha;
                    fichas[i].add(new Ficha(400, 50+(i*Ficha.DIM), valores[i], imagenes[i]));
                    break;
                }
            }
        }
        return true;
    }
    
    public boolean mouseDrag(Event e, int x, int y) {
        if(activa != null) {
            activa.update(x, y);
            repaint();
        }
        return true;
    }
    
    public boolean mouseUp(Event e, int x, int y) {
        activa.cargarApostados(casillas);
        activa = null;
        return true;
    }
    
    public boolean action(Event e, Object obj) {
        if(e.target instanceof Button) {
            this.numeroSuerte = (int)(Math.random()*37);
        }
        return true;
    }
}