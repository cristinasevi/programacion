/*
 El centro del applet sale un círculo cada 2 segundos, tomando una trayectoria aleatoria.  
 En el interior del círculo se ve un número, inicialmente el 1.  
 Cada vez que el usuario haga click en el círculo, el número aumentará en 1 y cuando llegue al 5 el círculo desaparecerá.  
 Llevaremos y mostraremos un contador con el número de círculos que el usuario se ha cargado y cuando en 
 la lista haya 10 círculos el juego habrá terminado (GAME OVER).
 */
package Examen;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class App extends Applet implements Runnable {
    public static final int ANCHURA = 600;
    public static final int ALTURA = 600;
    public static int PUNTUACION = 0;
    boolean gameOver = false;
    int temporizador = 0;
    
    List<Circulo> circulos;
    Thread animacion;
    Point puntero;
    Image imagen;
    Graphics noseve;
    
    public void init(){
        imagen = this.createImage(ANCHURA, ALTURA);
        noseve = imagen.getGraphics();
        circulos = new ArrayList<Circulo>();
        generar();
        this.setSize(ANCHURA, ALTURA);
    }
    
    public void start(){
        animacion = new Thread(this);
        animacion.start();
    }
    public void paint(Graphics g){
        noseve.setFont(new Font("Times New Roman", Font.BOLD, 48));
        noseve.setColor(Color.BLACK);
        noseve.fillRect(0, 0, ANCHURA, ALTURA);
        for(int i = 0; i < circulos.size(); i++){
            circulos.get(i).paint(noseve);
        }
        noseve.setColor(Color.WHITE);
        noseve.drawString("PINCHADOS: " + PUNTUACION, ANCHURA/2 - 180, 60);
        if(gameOver){
            noseve.drawString("GAME OVER", ANCHURA/2 - 180, ALTURA/2);
        }
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void update(Graphics g){
        paint(g);
    }
    
    public void run() {
        do{
            perder();
            for (int i = 0; i < circulos.size(); i++) {
                circulos.get(i).update();
            }
            if(temporizador > 1920){
                generar();
                temporizador = 0;
            }else{
                temporizador += 16;
            }
            repaint();
            try{
                Thread.sleep(16);
            } catch (InterruptedException ex){}
        }while(gameOver == false);
    }
    public void generar(){
        circulos.add(new Circulo(ANCHURA/2 - Circulo.RADIO, ALTURA/2 - Circulo.RADIO));
    }
    public void perder(){
        if(circulos.size() >= 10){
            gameOver = true;
        }
    }
    
    public boolean mouseDown(Event ev, int x, int y){
        puntero = new Point(x, y);
        for(int i = 0; i < circulos.size(); i++){
            if(circulos.get(i).contains(puntero)){
                circulos.get(i).aumentar(circulos);
            }
        }
        return true;
    }
}