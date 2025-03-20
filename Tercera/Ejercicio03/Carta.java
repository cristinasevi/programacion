/*
 
 */
package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Carta {
    public static final int ANCHURA = 100;
    public static final int ALTURA = 200;
    private int posX, posY;
    Image imagen;
    int valor;
    
    public Carta(Image imagen, int valor) {
        this.imagen = imagen;
        /* this.valor = valor;
        if(valor > 10) this.valor = 10; */
        // SiInmediato: _____ = (condicion) ? resultado1 : resultado2
        this.valor = (valor>10) ? 10 : valor;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagen, posX, posY, ANCHURA, ALTURA, app);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}