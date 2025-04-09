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
    java.util.ArrayList<Integer> lRojos = new java.util.ArrayList<>();
    int dinero = 1000000;
    int dineroApostado;
    int dineroGanado;
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        
        jugadas = new int[NUMJUGADAS];
        
        setup();
        
        casillas = new Casilla[FILAS][COLUMNAS];
        
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
        
        mostrarCasillas();
        mostrarFichas();
        mostrarVector();
        
        noseve.setColor(Color.WHITE);
        noseve.drawString("En esta jugada estás apostando: " + dineroApostado, 270, 600);
        noseve.drawString("En esta jugada has ganado: " + dineroGanado, 270, 650);
        noseve.drawString("Dinero: " + dinero, 270, 700);
        
        g.drawImage(imagen, 0, 0, this);
    }

    public void mostrarFichas() {
        for(int i=0; i<NUMJUGADAS; i++)
            for(Ficha ficha : fichas[i])
                ficha.paint(noseve,this);
    }

    public void mostrarCasillas() {
        for(int i=0; i<casillas.length; i++)
            for(int j=0; j<casillas[i].length; j++)
                casillas[i][j].paint(noseve);
    }

    public void mostrarVector() {
        Color color = Color.BLACK;
        noseve.setColor(Color.WHITE);
        noseve.drawString("" + numeroSuerte, 300, 80);
        
        for(int i=0; i<NUMJUGADAS; i++) {
            color = (lRojos.contains(new Integer(jugadas[i]))) ? Color.RED : Color.BLACK;
            noseve.setColor(color);    
            noseve.drawString("" + jugadas[i], 500, (30*i)+80);
        }
        
        if(color == Color.RED)
            noseve.drawString("ROJO", 300, 120);
        else
            noseve.drawString("NEGRO", 300, 120);
        if(numeroSuerte%2 == 0)
            noseve.drawString("PAR", 300, 150);
        else
            noseve.drawString("PAR", 300, 150);
        if(numeroSuerte<=18)
            noseve.drawString("FALTA", 300, 180);
        else
            noseve.drawString("PASA", 300, 180);
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        for(int i=0; i<NUMJUGADAS; i++) {
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
        if(activa != null) {
            activa.cargarApostados(casillas);
            dineroApostado = 0;
            for(int i=0; i<NUMJUGADAS; i++)
                for(Ficha ficha : fichas[i])
                    if(!ficha.getNumApostados().isEmpty())
                        dineroApostado += ficha.getPrecio();
            activa = null;
            repaint();
        }
        return true;
    }
    
    public boolean action(Event e, Object obj) {
        if(e.target instanceof Button) {
            this.numeroSuerte = (int)(Math.random()*37);
            for(int i=0; i<NUMJUGADAS-1; i++)
                jugadas[i] = jugadas[i+1];
            jugadas[NUMJUGADAS-1] = numeroSuerte;
            
            dineroGanado = 0;
            for(int i=0; i<NUMJUGADAS; i++) {
                for(Ficha ficha : fichas[i]) {
                    if(!ficha.getNumApostados().isEmpty())
                        dineroGanado -= ficha.getPrecio();
                    if(ficha.getNumApostados().contains(numeroSuerte))
                        dineroGanado += (ficha.getPrecio()*36) / ficha.getNumApostados().size();
                }
                dinero += (dineroGanado - dineroApostado);
            }
            repaint();
        }
        return true;
    }
}