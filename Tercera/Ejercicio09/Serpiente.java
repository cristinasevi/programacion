/*

 */
package Tercera.Ejercicio09;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Serpiente {
    ArrayList<Eslabon> eslabones;
    
    public Serpiente(Image img) {
        eslabones = new ArrayList<Eslabon>();
        for(int i=0; i<10; i++) {
            eslabones.add(new Eslabon(img, 200-(Eslabon.TAM*i), 100, Event.RIGHT));
        }
    }
    
    public void paint(Graphics g, Applet app) {
        for (Eslabon eslabon : eslabones) {
            eslabon.paint(g, app);
        }
    }
    
    public void cambiarDireccion(int nuevaDireccion) {
        this.primerEslabon().setDireccion(nuevaDireccion);
    }
    
    public Eslabon primerEslabon() {
        return eslabones.get(0);
    }
    
    public Eslabon ultimoEslabon() {
        return eslabones.get(eslabones.size()-1);
    }
    
    public void insertarEslabon(Image img) {
        int direccion = this.ultimoEslabon().getDireccion();
        Eslabon ultimo = this.ultimoEslabon();
        
        switch(direccion) {
            case Event.UP:
                eslabones.add(new Eslabon(img, ultimo.x, ultimo.y + Eslabon.TAM, direccion));
                break;
            case Event.DOWN:
                eslabones.add(new Eslabon(img, ultimo.x, ultimo.y - Eslabon.TAM, direccion));
                break;
            case Event.RIGHT:
                eslabones.add(new Eslabon(img, ultimo.x - Eslabon.TAM, ultimo.y, direccion));
                break;
            case Event.LEFT:
                eslabones.add(new Eslabon(img, ultimo.x + Eslabon.TAM, ultimo.y, direccion));
                break;
        }
    }
    
    public void update() {
        for(Eslabon eslabon : eslabones) {
            eslabon.update();
        }
        for(int i=eslabones.size()-1; i>0; i--)
            eslabones.get(i).setDireccion(eslabones.get(i-1).getDireccion());
    }
}