/*
 Manipulamos las características del Frame
 */
package Segunda.Ejercicio06;

import java.awt.Frame;
import java.awt.Event;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Button;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

public class FrameApp extends Frame{ // extends Frame -> crea una ventana
    MenuBar porDefecto, alternativo;
    String tituloInicial;
    public static void main(String[] args) {
        FrameApp app = new FrameApp();
    }

    public FrameApp() {
        super("Trabajando con Frames"); // Título de la ventana
        tituloInicial = this.getTitle(); // Devuelve el String del título
        
        // Llamadas a las funciones que hemos definido
        setup(); 
        setupMenu();
        
        this.pack(); // Empaqueta todo lo que vayas metiendo al Frame
        this.setSize(400, 400); // Da dimensiones al Frame
        this.setVisible(true);
    }

    public void setup() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(4, 1));
        
        principal.add(new Label("Cambian las características de la ventana", Label.CENTER));
        Panel panel1 = new Panel();
        panel1.add(new Button("Título"));
        panel1.add(new Button("MenuBar"));
        panel1.add(new Button("Resizable"));
        principal.add(panel1);
        
        principal.add(new Label("Salidas en la ventana", Label.CENTER));
        Panel panel2 = new Panel();
        panel2.add(new Button("Cursor"));
        panel2.add(new Button("Background"));
        panel2.add(new Button("Foreground"));
        panel2.add(new Button("Font"));
        principal.add(panel2);
        
        this.add("South", principal);
    }
    
    private void setupMenu() {
        porDefecto = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("Exit"));
        porDefecto.add(fileMenu);
        this.setMenuBar(porDefecto);
        alternativo = new MenuBar();
        Menu archivoMenu = new Menu("Archivo");
        archivoMenu.add(new MenuItem("Salir"));
        alternativo.add(archivoMenu);
    }
    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) { // Si el evento producido es el de Cerrar Ventana
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT){
            if(ev.target instanceof Button){
                if(ev.arg.equals("Título")){
                    if(this.getTitle().equals(tituloInicial))
                        this.setTitle("Título Alternativo");
                    else
                        this.setTitle(tituloInicial);
                    return true;
                }
            }
            if(ev.arg.equals("MenuBar")) {
                if(this.getMenuBar() == porDefecto)
                    this.setMenuBar(alternativo);
                else
                    this.setMenuBar(porDefecto);
            }
        }
        return false;
    }  
}

/*
 setLayout -> modifica el Panel
 - GridLayout -> en forma de celda, con filas y columnas

 Label -> etiqueta, le asignas el texto que contiene y también le puedes añadir su alineación

 Menu tiene 3 niveles:
 - MenuBar: barra de navegación
    - Menu: menu dentro del MenuBar
        - MenuItem: menu dentro del menu

 setMenuBar -> para meter el Menu
*/