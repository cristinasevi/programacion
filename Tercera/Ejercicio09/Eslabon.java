/*

 */
package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Eslabon extends Rectangle {
    public static final int TAM = 15;
    public static final int IZQUIERDA = 0;
    public static final int DERECHA = 1;
    public static final int ARRIBA = 2;
    public static final int ABAJO = 3;
    private int direccion;
    Image imagen;
    
    public Eslabon(Image img, int x, int y, int direccion) {
        super(x, y, TAM, TAM);
        this.imagen = img;
        this.direccion = direccion;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    public void paint(Graphics g, Applet app) {
        g.drawImage(imagen, x, y, width, height, app);
    }
    
    public void update() {
        switch(direccion) {
            case IZQUIERDA:
                x -= TAM;
                break;
            case DERECHA:
                x += TAM;
                break;
            case ARRIBA:
                y -= TAM;
                break;
            case ABAJO:
                y += TAM;
                break;
        }
    }
}