/*

 */
package Segunda.Ejercicio02;

public class Pato extends Animal{
    double tamanyoPico;

    public Pato(double tamanyoPico, int ID, String fnac, boolean vacunado, String nombre) {
        super(ID, fnac, vacunado, nombre);
        this.tamanyoPico = tamanyoPico;
    }
    
    public void habla() {
        System.out.printf("Cuac, cuac, soy un pato con un hermoso pico de %.1f, nací el %s y me llamo %s\n", tamanyoPico, fnac, getNombre());
    }
}