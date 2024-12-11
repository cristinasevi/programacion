/*
 Crear variables e instanciarlas con los datos del método constructor
 */
package Segunda.Ejercicio01;

public class Ejecutable {
    public static void main(String[] args) {
        Casa casa1, casa2;
        Chalet chalet1;
        
        // instanciamos con todos los atributos del método constructor
        casa1 = new Casa("C/. María Auxiliadora nº59", 1200, "Ladrillo", 200);
        casa2 = new Casa("Plaza del Pilar Nº1", 2000, "Piedra");
        
        chalet1 = new Chalet("Avd. de la Ilustración Nº3", 2000, "Ladrillo", 5, 80, false);
        
        // tienes que llamar a los métodos a través del objeto
        System.out.println(casa1.getDireccion());
        System.out.println(casa2.getDireccion());
        
        casa1.mostrar();
        casa2.mostrar();
        
        chalet1.mostrar();
    }
}