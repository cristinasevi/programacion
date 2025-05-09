/*
 
 */
package Tercera.Ejercicio06;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Ficha extends Rectangle {
    public static final int DIM = 50;
    public Image imagen;
    private int precio;
    private java.util.ArrayList<Integer> numApostados;

    public Ficha(int posX, int posY, int precio, Image imagen) {
        super(posX, posY, DIM, DIM);
        this.imagen = imagen;
        this.precio = precio;
        numApostados = new java.util.ArrayList<Integer>();
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public ArrayList<Integer> getNumApostados() {
        return numApostados;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagen, x, y, width, height, app);
    }
    
    public void update(int posX, int posY) {
        x = posX - (DIM/2);
        y = posY - (DIM/2);
    }
    
    public void cargarApostados(Casilla casillas[][]) {
        numApostados.clear();
        for(int i=0; i<casillas.length; i++) {
            for(int j=0; j< casillas[i].length; j++) {
                if(casillas[i][j].intersects(this)) {
                    numApostados.add(new Integer(casillas[i][j].getValor()));
                }
            }
        }
    }
}