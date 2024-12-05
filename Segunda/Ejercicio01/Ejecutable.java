/*
 Crea dos variable y las instanciamos con los datos del método constructor
 */
package Segunda.Ejercicio01;

public class Ejecutable {
    public static void main(String[] args) {
        Casa casa1, casa2;
        
        // polimorfismo
        casa1 = new Casa("C/. María Auxiliadora nº59", 1200, "Ladrillo", 200);
        casa2 = new Casa("Plaza del Pilar Nº1", 2000, "Piedra");
        
        System.out.println(casa1.getDireccion());
        System.out.println(casa2.getDireccion());
        System.out.println(casa1.getCasa());
    }
}