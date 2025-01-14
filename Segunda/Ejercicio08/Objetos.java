/*
 Objetos de Java
 */
package Segunda.Ejercicio08;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Event; 
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.Choice;

public class Objetos extends Frame{ 
    TextArea textArea;
    
    public static void main(String[] args) {
        Objetos app = new Objetos();
    }

    public Objetos() {
        super("Trabajando con objetos de Java"); 
   
        setup(); 
        
        this.pack(); 
        this.setSize(400,400); 
        this.setVisible(true);
    }
    
    public void setup() {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(3, 3));
        Panel paneles[][] = new Panel[3][3];
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++) {
                paneles[i][j] = new Panel();
                paneles[i][j].setLayout(new FlowLayout(FlowLayout.LEFT));
            }
        paneles[0][0].add(new Label("Campo de texto:"));
        paneles[0][0].add(new MiTextField("", 15)); // espera recibir el texto (puedes dejarlo vacío) y la anchura (según la función creada abajo)
        
        textArea = new TextArea(5, 10);
        textArea.setBackground(Color.YELLOW);
        paneles[0][1].add(textArea);
        
        paneles[0][2].add(new MiBoton("Borrar", textArea)); // espera recibir el texto que va a tener el botón y el textArea (según la función creada abajo)
        
        String opciones[] = {"Sí", "No", "Quizás"};
        
        principal.add(paneles[0][0]);
        principal.add(paneles[0][1]);
        principal.add(paneles[0][2]);
        
        this.add("Center", principal);
    }
    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        return false;
    }  
}

class MiTextField extends TextField {
    public MiTextField(String string, int i) {
        super(string, i);
    }
    public boolean action(Event ev, Object obj) {
        String texto = this.getText();
        this.setText(texto.toUpperCase()); // transforma el texto a mayúsculas
        return true;
    }
}

class MiBoton extends Button {
    private final TextArea textoAreaB;
    public MiBoton(String texto, TextArea textoAreaB) {
        super(texto);
        this.textoAreaB = textoAreaB;
        
    }
    public boolean action(Event ev, Object obj) {
        textoAreaB.setText(" ");
        return true;
    }
}

class MiChoice extends Choice {
    private final TextArea textoAreaB;
    public MiChoice(String opciones[], TextArea texto2) {
        super();
        for(int i=0; i<opciones.length; i++)
            this.add(opciones[i]);
        textoAreaB = texto2;
    }
    public boolean action(Event ev, Object obj) {
        textoAreaB.setText();
        return true;
    }
}