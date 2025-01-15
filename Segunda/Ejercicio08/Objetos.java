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
import java.awt.List;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Checkbox;

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
        paneles[1][0].add(new MiChoice(opciones, textArea)); // espera recibir un vector de Strings y un TextArea (según la función creada abajo)
        
        String deportes[] = {"Atletismo", "Baloncesto", "Tenis", "Esgrima", "Balonmano", "Patinaje"};
        paneles[1][1].add(new MiLista(deportes, textArea));
        
        paneles[1][2].add(new MiCanvas()); // no espera recibir ningún parámetro (según la función creada abajo)
        
        String alimentos[] = {"Patatas", "Cebollas", "Tomates", "Lechuga"};
        paneles[2][0].add(new MiCheckBoxGroup(alimentos));
        
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                principal.add(paneles[i][j]);
        
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
        textoAreaB.setText(this.getSelectedItem());
        return true;
    }
}

class MiLista extends List {
    private final TextArea textoAreaC;
    public MiLista(String deportes[], TextArea textoAreaC) {
        super(5, true); // 5 porque queremos mostrar 5 elementos de la lista
        this.textoAreaC = textoAreaC;
        for(int i=0; i<deportes.length; i++)
            this.add(deportes[i]);
    }
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.ACTION_EVENT) {
            this.textoAreaC.setText("Doble Click");
            return true;
        }
        else if(ev.id == Event.LIST_SELECT) {
            this.textoAreaC.setText("Selecciono un elemento");
            String elementos[] = this.getSelectedItems();
            String texto = "";
            for(int i=0; i<elementos.length; i++)
                texto += elementos[i] + "\n";
            this.textoAreaC.setText(texto);
            return true;
        }
        else if(ev.id == Event.LIST_DESELECT) {
            this.textoAreaC.setText("Deselecciono un elemento");
            return true;
        }
        return false;
    }
}

class MiCanvas extends Canvas {
    int posx = 20;
    int posy = 20;
    public MiCanvas() {
        super();
        this.setSize(75, 75);
        this.setBackground(Color.YELLOW);
        this.setForeground(Color.RED);
        this.setVisible(true);
    }
    
    public void paint(Graphics g) {
        g.fillRect(posx, posy, 5, 5); // declaramos un rectángulo
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        posx = x;
        posy = y;
        repaint();
        return true;
    }
}

class MiCheckBoxGroup extends Panel {
    Checkbox checkBoxes[];
    TextField resultado;

    public MiCheckBoxGroup(String elementos[]) {
        super();
        this.setLayout(new GridLayout(elementos.length + 1, 1)); // se pondrán los elementos unos debajo de otros
        checkBoxes = new Checkbox[elementos.length];
        for(int i=0; i<elementos.length; i++) {
            checkBoxes[i] = new Checkbox(elementos[i]);
            this.add(checkBoxes[i]);
        }
        
        resultado = new TextField("", 15);
        this.add(resultado);
    }
    
    public boolean action(Event ev, Object obj) {
        String mostrar = "";
        for(int i=0; i<checkBoxes.length; i++)
            if(checkBoxes[i].getState())
                mostrar += checkBoxes[i].getLabel() + " ";
        resultado.setText(mostrar);
        return false;
    }
}