/*
 
 */
package Segunda.Ejercicio15;

import java.awt.Rectangle;
import java.awt.Graphics;

public class Columna {
    public static final int ANCHURA = 30;
    public static final int SEPARACION = 75;
    public static final int TIEMPO = 10;
    
    Rectangle rect1, rect2;
    
    public Columna() {
        int altura = ((int)(Math.random()*105)+20);
        this.rect1 = new Rectangle(270, 0, ANCHURA, altura);
        this.rect2 = new Rectangle(270, SEPARACION, ANCHURA, altura);
    }
    
    public void paint(Graphics g) {
        
    }
}