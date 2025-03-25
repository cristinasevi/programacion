/*

 */
package Tercera.Ejercicio03;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class Mano {
    ArrayList<Carta> cartas;
    int posY;
    
    public Mano(int posY) {
        cartas = new ArrayList<Carta>();
        this.posY = posY;
    }
    
    public void paint(Graphics g, Applet app) {
        for(int i=0; i<cartas.size(); i++) {
            cartas.get(i).setPosX(100 + (i*30));
            cartas.get(i).setPosY(posY);
            cartas.get(i).paint(g, app);
        }
    }
    
    public void anadirCarta(Carta carta) {
        cartas.add(carta);
    }
    
    public int puntuacion() {
        int acumulador = 0;
        boolean as = false;
        for(Carta carta : cartas) {
            acumulador += carta.valor;
            if(carta.valor == 1) as = true;
        }
        if((as) && (acumulador <= 11)) acumulador += 10;
        return acumulador;
    }
    
    public boolean seHaPasado() {
        return puntuacion() > 21;
    }
    
    public boolean menor17() {
        return puntuacion() < 17;
    }
}