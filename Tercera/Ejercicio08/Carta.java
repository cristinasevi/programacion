/*

 */
package Tercera.Ejercicio08;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Carta extends Rectangle {
    public static final int ANCHURA = 70;
    public static final int ALTURA = 120;
    public static final int ROJO = 1;
    public static final int NEGRO = 2;
    public static final int PICAS = 0;
    public static final int ROMBOS = 1;
    public static final int CORAZONES = 2;
    public static final int TREBOLES = 3;
    Image imagen;
    private int valor;
    private int color;
    private int palo;
    
    public Carta(Image imagen, int valor, int color, int palo) {
        super(-200, -200, ALTURA, ANCHURA);
        this.imagen = imagen;
        this.valor = valor;
        this.color = color;
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public int getColor() {
        return color;
    }

    public int getPalo() {
        return palo;
    }
    
    public void paint(Graphics g) {
        
    }
}