/*
 
 */
package Tercera.Ejercicio01;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Caminar extends Applet implements Runnable {
    public static final int TIEMPO = 35;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    
    Image fotogramas[][];
    String lugares[] = {"Guerrillero/g", "Hampon/h", "Vaquero/v"};
    
    public void init() {
        imagen = this.createImage(300, 300);
        noseve = imagen.getGraphics();
        
        fotogramas = new Image[3][4];
        for(int i=0; i<fotogramas.length; i++)
            for(int j=0; j<fotogramas[i].length; j++)
                fotogramas[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio01/Sprites/" + lugares[i] + (j+1) + ".gif"); // ruta y nombre con extensión del archivo
            
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
        
        noseve.drawImage(fotogramas[1][2], 0, 0, 200, 250, this);
        
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run() {
        do {
                       
            
            repaint();
            try {
                Thread.sleep(TIEMPO); 
            } catch (InterruptedException e) {}
        }
        while (true);
    }
}