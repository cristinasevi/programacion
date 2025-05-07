/*

 */
package Tercera.Ejercicio08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoJuego extends Rectangle {
    public static final int POSICIONY = 170;
    private ArrayList<Carta> cartas;
    
    public MazoJuego(int posX) {
        super(posX, POSICIONY, Carta.ANCHURA, Carta.ALTURA);
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
    
    public Carta extraer() {
        return cartas.get(cartas.size()-1);
    }
    
    public void eliminar() {
        cartas.remove(cartas.size()-1);
    }
    
    public boolean anadir(Carta carta) {
        if(cartas.isEmpty() || (carta.getColor() != extraer().getColor()) && (carta.getValor()+1 == extraer().getValor())) {
            recolocar(carta);
            cartas.add(carta);
            return true;
        }
        return false;
    }
    
    public void recolocar(Carta carta) {
        if(cartas.isEmpty()) {
            carta.setPosicion(x, y);
        } else {
            carta.setPosicion(x, this.extraer().y+30);
        }
    }
}