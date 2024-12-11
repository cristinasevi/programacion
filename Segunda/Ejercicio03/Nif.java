/*

 */
package Segunda.Ejercicio03;

public class Nif {
    public int dni;
    public char letra;
    // final -> define que es una constante
    public final char tabla[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Nif(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public Nif(int dni) {
        this.dni = dni;
        this.letra = tabla[dni%23];
    }

    public void mostrar() {
        System.out.printf("El NIF es %d%c\n", dni, letra);
    }
}