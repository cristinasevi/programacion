/*
 
 */

package Tercera.Ejercicio07;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Memory extends Applet implements Runnable {
    public static final int TAM = 4;
    public static final int TIEMPO = 35;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Image reverso;
    Casilla casillas[][];
    Casilla cuno = null;
    Casilla cdos = null;
    
    public void init() {
        imagen = this.createImage(700, 800);
        noseve = imagen.getGraphics();
        
        imagenes = new Image[8];
        for(int i=0; i<8; i++)
            imagenes[i] = getImage(getCodeBase(), "Tercera/Ejercicio07/donutsMatch/img" + (i+1) + ".png");
        
        reverso = getImage(getCodeBase(), "Tercera/Ejercicio07/donutsMatch/reverso.png");
        
        casillas = new Casilla[TAM][TAM];
        for(int i=0; i<TAM; i++)
            for(int j=0; j<TAM; j++)
                casillas[i][j] = new Casilla(98+(Casilla.DIM*j), 98+(Casilla.DIM*i), imagenes[((i*TAM)+j)%(TAM*2)], reverso);
            
        desordenar();
        
        this.setSize(700, 800);
    }

    public void desordenar() {
        for(int i=0; i<25; i++) {
            int aleatorio1 = (int)(Math.random()*(TAM*TAM));
            int aleatorio2 = (int)(Math.random()*(TAM*TAM));
            Image auxiliar = casillas[aleatorio1/TAM][aleatorio1%TAM].getImagen();
            casillas[aleatorio1/TAM][aleatorio1%TAM].setImagen(casillas[aleatorio2/TAM][aleatorio2%TAM].getImagen());
            casillas[aleatorio2/TAM][aleatorio2%TAM].setImagen(auxiliar);
        }
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.DARK_GRAY); 
        noseve.fillRect(0, 0, 700, 800);
        
        for (int i=0; i<4; i++)
            for(int j=0; j<4; j++)
                casillas[i][j].paint(noseve, this);

        g.drawImage(imagen, 0, 0, this);
    }

    public int cuantas() {
        int num = 0;
        if(cuno != null) num++;
        if(cdos != null) num++;
        return num;
    }
    
    public boolean mouseDown(Event e, int x, int y) {
        for(int i=0; i<TAM; i++) {
            for(int j=0; j<TAM; j++) {
                if(casillas[i][j].contains(x, y)) {
                    casillas[i][j].setDescubierta(true);
                    switch(cuantas()) {
                        case 0:
                            cuno = casillas[i][j];
                            break;
                        case 1:
                            cdos = casillas[i][j];
                            if(cuno.getImagen() == cdos.getImagen()) {
                                cuno = cdos = null;
                            } else {
                                
                            }
                            break;
                    }
                    repaint();  
                }
                    return true;  
            }
        }
        return false; 
    }
    
    public void run() {
        do {
            
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch(InterruptedException e) {}
        } while(true);
    }
}