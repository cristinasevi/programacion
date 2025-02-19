/*
 
 */
package Segunda.Ejercicio17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Dino extends Rectangle {
    public static final int TOPE = 170;
    public int velY = -10;
    private boolean salto = false;

    public Dino() {
        super(20, 250, 20, 50);
    }
    
    public boolean isSalto() {
        return salto;
    }
    
    public void setSalto(boolean salto) {
        this.salto = salto;
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
    }
    
    public void actualizar() {
        if(salto) {
            y += velY;
            if(y <= TOPE) 
                velY = -velY;
            if(y >= 250) {
                velY = -velY;
                setSalto(false);
            }
        }
    }
}