/*
 Dibujar líneas, rectángulos u óvalos
 */
package Segunda.Ejercicio10;

import java.awt.Frame;
import java.awt.Event;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

public class DibujarApp extends Frame {
    
    public static void main(String arg[]) {
        DibujarApp app = new DibujarApp();
    }
    
    public DibujarApp() {
        super("Dibujar");
        
        setup();
        
        this.pack();
        this.setSize(400, 400);
        this.setVisible(true);
    }
    
    public void setup() {
        setupMenuBar();
    }
    
    public void setupMenuBar(){
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("Fichero");
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        menuBar.add(menu1);
        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("linea"));
        menu2.add(new MenuItem("Óvalo"));
        menu2.add(new MenuItem("Rectangulo"));
        menuBar.add(menu2);
        this.setMenuBar(menuBar);
    }
    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT) {
            if(ev.target instanceof MenuItem) {
                if(ev.arg.equals("Salir")) {
                    System.exit(0);
                    return true;
                }
            }
        }

        return false;
    } 
}