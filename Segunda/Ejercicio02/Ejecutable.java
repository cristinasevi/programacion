/*

 */
package Segunda.Ejercicio02;

public class Ejecutable {
    public static void main(String[] args) {
        Perro animal1;
        Pato animal2;
        
        animal1 = new Perro("Salchicha", true, 4, 120, "12/11/2024", true, "Tintín");
        animal2 = new Pato(20.5, 210, "06/12/2024", true, "Donald");
        
        animal1.habla();
        animal2.habla();
    }
}