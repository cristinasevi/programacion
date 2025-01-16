/*
 Pedido en un restaurante
 */
package Segunda.Ejercicio09;

import java.awt.Frame;
import java.awt.Event;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextField;
import java.awt.Label;
import java.awt.TextArea;

public class Restaurante extends Frame {
    String comidas[] = {"Desayuno", "Almuerzo", "Comida"};
    String platos[][] = {{"Leche", "Café", "Huevos", "Tostadas", "Mermelada", "Beacon"},
                         {"Paella", "Sopa", "Macarrones", "Ensalada", "Filete", "Pescado", "Albóndigas", "Hamburguesa"},
                         {"Tortilla", "Sopa", "Hamburguesa", "Ensalada", "Pollo", "Bocadillo", "Sandwich"}};
    Choice chComida;
    List listasPlatos[];
    List presentar;
    TextField texto;
    
    public static void main(String arg[]) {
    Restaurante app = new Restaurante();
    }
    
    public Restaurante() {
        super("Restaurante Salesiano");
        
        setup();
        
        this.pack();
        this.setSize(275, 175);
        this.setVisible(true);
    }
    
    public void setup() {
        this.add("North", new Label("Elige tu comanda", Label.CENTER));
        this.chComida = new Choice();
        for(int i=0; i<comidas.length; i++)
            chComida.add(comidas[i]);
        add("West", chComida);
        
        listasPlatos = new List[comidas.length];
        for(int i=0; i<comidas.length; i++) {
            listasPlatos[i] = new List(5, true);
            for(int j=0; j<platos[i].length; j++) {
                listasPlatos[i].add(platos[i][j]);
            }
        }
        
        presentar = listasPlatos[0];    
        add("East", presentar);
        texto = new TextField("", 40);
        add("South", texto);
    }
    
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return true;
        }
        else if(ev.id == Event.ACTION_EVENT) {
            if(ev.target instanceof Choice) {
                this.remove(presentar);
                presentar = listasPlatos[chComida.getSelectedIndex()];
                this.add(presentar);
                this.setVisible(true);
                texto.setText(chComida.getSelectedItem() + ": ");
            }
        }
        else if((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)) {
            String frase = chComida.getSelectedItem() + ": ";
            presentar.getSelectedItems();
        }
        return false;
    } 
}