/*
 Va a ser un interface
 */
package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public abstract class Mazo extends Rectangle {
    ArrayList<Carta> cartas;
    
    public Mazo(int posX, int posY, int anchura, int altura) {
        super(posX, posY, anchura, altura);
        cartas = new ArrayList<Carta>();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void paint(Graphics g, Applet app) {
        g.setColor(Color.WHITE);
        g.drawRect(x, y, width, height);
        for(Carta carta : cartas)
            carta.paint(g, app);
    }
    
    public abstract boolean anadir(Carta carta);
    
    public abstract void recolocar();
    
    public Carta extraer() {
        return cartas.get(cartas.size() - 1);
    }
    
    public void eliminar() {
        cartas.remove(cartas.size() - 1);
    }
}