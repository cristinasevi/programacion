/*
 
 */
package Segunda.Ejercicio12;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo {
    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    int posX, posY, anchura, altura;
    Color color;
    int direccion;
    int posInicialX, posInicialY;

    public Rectangulo(int posX, int posY, int anchura, int altura, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.anchura = anchura;
        this.altura = altura;
        this.color = color;
        direccion = DERECHA;
        posInicialX = posX;
        posInicialY = posY;
    }
    
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(posX, posY, anchura, altura);
    }
    
    public void update() {
        switch (direccion) {
            case ARRIBA:
                posY--;
                if(posY <= posInicialY)
                    direccion = DERECHA;
                break;
            case ABAJO:
                posY++;
                if(posY >= (posInicialY + 20))
                    direccion = IZQUIERDA;
                break;
            case DERECHA:
                posX++;
                if(posX >= (posInicialX + 20))
                    direccion = ABAJO;
                break;
            case IZQUIERDA:
                posX--;
                if(posX <= posInicialX)
                    direccion = ARRIBA;
                break;
        }
    }
}