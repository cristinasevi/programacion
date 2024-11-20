/*
 División mediante restas, con recursividad
 */
package Primera;

public class Ejercicio093 {
    public static void main(String arg[]){
        int resultado = dividir(7, 2);
        System.out.println("El resultado es " + resultado);
    }
    
    public static int dividir(int dividendo, int divisor) {
        if(dividendo < divisor)
            return 0;
        else
            return dividir(dividendo-divisor, divisor) + 1;
    }
}