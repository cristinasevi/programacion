/*
 Dentro de Java hay un paquete llamado awt y dentro está Frame
 */
package Segunda.Ejercicio05;

import java.awt.Frame;
import java.awt.Event;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Graphics;

public class OvalApp extends Frame{
    Ovalo ovalo;
    public static void main(String arg[]){
        OvalApp app = new OvalApp();
    }

    public OvalApp() {
        super("Dibujando óvalos");
        
        ovalo = new Ovalo();
        
        Button boton1 = new Button("Siguiente");
        Button boton2 = new Button("Salir");
        
        Panel panel = new Panel();
        panel.add(boton1);
        panel.add(boton2);
        
        this.add("South", panel); // Hay que ponerle un String de dónde y el qué vamos a meter
        this.pack(); // Empaqueta todo lo que vayas metiendo al Frame
        this.resize(300,300); // Da dimensiones al Frame (ya no se usa resize, se usa setSize)
        this.show(); // Pone visible el Frame (ya no se usa show, se usa setVisible)
    } 
    
    public void paint(Graphics g) {
        ovalo.dibujar(g);
    }
    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) { // Si el evento producido es el de Cerrar Ventana
            System.exit(0);
            return true;
        } else if(ev.id == Event.ACTION_EVENT) { // Si el evento producido es de Acción
            if(ev.target instanceof Button) // Si el evento se ha producido sobre un objeto de la clase Button
                if(ev.arg.equals("Salir")) { // Devuelve el String asociado al evento
                    System.exit(0);
                    return true;
                }
                else if(ev.arg.equals("Siguiente")) { 
                    ovalo.inicializar();
                    repaint(); // borra el objeto Graphics y vuelve a llamar al método paint
                    return true;
                }
        }
        return false;
    }
}
