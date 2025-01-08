/*
 Manipulamos un archivo de texto
 */
package Segunda.Ejercicio07;

import java.awt.Frame;
import java.awt.Event;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.TextArea;

public class EditorApp extends Frame{ 
    MenuBar menubar;
    TextArea texto;
    
    public static void main(String[] args) {
        EditorApp app = new EditorApp();
    }

    public EditorApp() {
        super("Editor de textos"); 
   
        setup(); 
        
        this.pack(); 
        this.setSize(texto.minimumSize()); // que se ajuste al tamaño que hemos definido del TextArea
        this.setVisible(true);
    }
    
    public void setup() {
        setupMenu();
        texto = new TextArea(25, 50);
        this.add("Center", texto);
    }
    
    private void setupMenu() {
        menubar = new MenuBar();
        Menu fileMenu = new Menu("Archivo");
        fileMenu.add(new MenuItem("Nuevo"));
        fileMenu.add(new MenuItem("Abrir"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Guardar"));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Salir"));
        menubar.add(fileMenu);
        this.setMenuBar(menubar);
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
                else if(ev.arg.equals("Nuevo")) {
                    texto.setText(" ");               
                    return true;
                }
            }
        }
        return false;
    }  
}