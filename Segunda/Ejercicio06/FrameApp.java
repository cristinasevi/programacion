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
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class FrameApp extends Frame{ // extends Frame -> crea una ventana
    MenuBar porDefecto, alternativo;
    String tituloInicial;
    // tipos de cursor
    int cursores[] = {Cursor.CROSSHAIR_CURSOR, Cursor.DEFAULT_CURSOR, Cursor.E_RESIZE_CURSOR, Cursor.HAND_CURSOR, Cursor.MOVE_CURSOR, Cursor.NE_RESIZE_CURSOR, Cursor.NW_RESIZE_CURSOR, Cursor.N_RESIZE_CURSOR, Cursor.TEXT_CURSOR, Cursor.WAIT_CURSOR};
    int posCursor = 0;
    Color colores[] = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.YELLOW};
    int posColor = 0;
    String fuentes[] = {"Helvetica", "TimesRoman", "Courier", "Dialog", "DialogInput", "Arial"};
    int posLetra = 0;
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
    
    public void paint(Graphics g) {
        g.drawString("Cambia el color al pulsar Foreground", 100, 150); // drawString("texto_que_quieres_meter", posX, posY)
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
                else if(ev.arg.equals("MenuBar")) {
                    if(this.getMenuBar() == porDefecto)
                        this.setMenuBar(alternativo);
                    else
                        this.setMenuBar(porDefecto);
                    return true;
                }
                else if(ev.arg.equals("Resizable")) {
                    this.setResizable(!this.isResizable()); // isResizable es la forma de preguntar
                    return true;
                }
                else if(ev.arg.equals("Cursor")) {
                    this.setCursor(cursores[(posCursor++) % cursores.length]); // Cambia el tipo de cursor
                    return true;
                }
                else if(ev.arg.equals("Background")) {
                    this.setBackground(colores[(posColor++) % colores.length]); // Cambia el color de fondo
                    return true;
                }
                else if(ev.arg.equals("Foreground")) {
                    this.setForeground(colores[(posColor++) % colores.length]); // Cambia el color de letra
                    return true;
                }
                else if(ev.arg.equals("Font")) {
                    this.setFont(new Font(fuentes[(posLetra++) % fuentes.length], Font.BOLD, 15)); // Cambia el tipo de fuente y tamaño de letra
                    repaint();
                    return true;
                }
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