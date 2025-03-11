/*
 
 */
package Tercera.Ejercicio01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Caminar extends Applet implements Runnable {
    public static final int TIEMPO = 100;
    public static final int GUERRILLERO = 0;
    public static final int HAMPON = 1;
    public static final int VAQUERO = 2;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Image fotogramas[][];
    String lugares[] = {"Guerrillero/g", "Hampon/h", "Vaquero/v"};
    DibujoAnimado dibujo;
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        
        fotogramas = new Image[3][4];
        for(int i=0; i<fotogramas.length; i++)
            for(int j=0; j<fotogramas[i].length; j++)
                fotogramas[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio01/Sprites/" + lugares[i] + (j+1) + ".gif"); // ruta y nombre con extensión del archivo
            
        dibujo = new DibujoAnimado(fotogramas[1]);
        
        this.setSize(300, 300);
    }

    public void update(Graphics g) {
        paint(g);
    }
    
    public void start() {
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void paint(Graphics g) {
        noseve.setColor(Color.BLACK); 
        noseve.fillRect(0, 0, 300, 300);
        
        dibujo.paint(noseve, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
            dibujo.update();
            
            repaint();
            try {
                Thread.sleep(TIEMPO); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
    
    public boolean keyDown(Event e, int tecla) {
        switch (tecla) {
        case 71: // tecla 71 o 103 -> 'g'
        case 103:
            dibujo = new DibujoAnimado(fotogramas[GUERRILLERO]);
            break;
        case 104: // tecla 72 o 104 -> 'h'
        case 72: 
            dibujo = new DibujoAnimado(fotogramas[HAMPON]);
            break;
        case 86: // tecla 86 o 118 -> 'v'
        case 118:
            dibujo = new DibujoAnimado(fotogramas[VAQUERO]);
            break;
        }
        repaint();
        return true;
    }
}