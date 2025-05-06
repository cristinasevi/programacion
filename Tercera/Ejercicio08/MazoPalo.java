/*

 */
package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoPalo extends Rectangle {
    public static final int POSICIONY = 20;
    ArrayList<Carta> cartas;
    int palo;
    
    public MazoPalo(int posX) {
        super(posX, POSICIONY, Carta.ANCHURA, Carta.ALTURA);
        cartas = new ArrayList<Carta>();
    }
    
    public void paint(Graphics g, Applet app) {
        g.setColor(Color.WHITE);
        g.drawRect(x, y, width, height);
        for(Carta carta : cartas)
            carta.paint(g, app);
    }
    
    public boolean anadir(Carta carta) {
        if(cartas.isEmpty() && carta.getValor()==1) {
            cartas.add(carta);
            palo = carta.getPalo();
            recolocar();
            return true;
        } else {
            if(palo == carta.getPalo() && (carta.getValor()-1 == cartas.get(cartas.size()-1).getValor())) {
                cartas.add(carta);
                recolocar();
                return true;
            }
        }
        return false;
    }
    
    public void recolocar() {
        cartas.get(cartas.size()-1).setPosicion(x, POSICIONY);
    }
}