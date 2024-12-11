/*
 Hereda de la clase Casa
 */
package Segunda.Ejercicio01;

public class Chalet extends Casa{
    // extends -> amplia a la clase
    int numJardin;
    boolean piscina;

    // Método constructor
    public Chalet(String direccion, double nM, String material, int nH, int numJardin, boolean piscina) {
        // primero hay que llamar al método constructor de la superclase y después se meten los atributos propios de esta subclase
        super(direccion, nM, material, nH);
        this.numJardin = numJardin;
        this.piscina = piscina;
    }
    public Chalet(String direccion, double nM, String material, int numJardin, boolean piscina) {
        super(direccion, nM, material);
        this.numJardin = numJardin;
        this.piscina = piscina;
    }
    
    public void mostrar() {
        super.mostrar();
        if(piscina)
            System.out.println("Tiene piscina");
        System.out.printf("Y además tiene %d metros de jardín\n", numJardin);
    }
}