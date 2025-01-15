/*
 Pedido en un restaurante
 */
package Segunda.Ejercicio09;

import java.awt.Frame;

public class Restaurante extends Frame {
    String comidas[] = {"Desayuno", "Almuerzo", "Comida"};
    String platos[][] = {{"Leche", "Café", "Huevos", "Tostadas", "Mermelada", "Beacon"},
                         {"Paella", "Sopa", "Macarrones", "Ensalada", "Filete", "Pescado", "Albóndigas", "Hamburguesa"},
                         {"Tortilla", "Sopa", "Hamburguesa", "Ensalada", "Pollo", "Bocadillo", "Sandwich"}};
    
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
    
    }
}