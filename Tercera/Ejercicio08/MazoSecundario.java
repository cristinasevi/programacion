/*

 */
package Tercera.Ejercicio08;

import java.util.ArrayList;
import java.applet.Applet;
import java.awt.Graphics;

public class MazoSecundario {
    public static final int POSICIONX = 110;
    public static final int POSICIONY = 20;
    private ArrayList<Carta> cartas;
    
    public MazoSecundario() {
        cartas = new ArrayList<Carta>();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    public void anadir(Carta c) {
        cartas.add(c);
    }
    
    public Carta extraer() {
        return cartas.get(cartas.size()-1);
    }
    
    public void eliminar() {
        cartas.remove(cartas.size()-1);
    }
    
    public void paint(Graphics g, Applet app) {
        for(Carta carta : cartas)
            carta.paint(g, app);
    }
    
    public void recolocar() {
        cartas.get(cartas.size()-1).setPosicion(POSICIONX, POSICIONY);
    }
    
    public void sacar() {
        
    }
}