/*
 Pasar un número decimal a binario
 */
package Primera;

public class Ejercicio096 {
    public static void main(String arg[]){
        int decimal = 29;
        binario(decimal);
    }
    
    public static void binario(int decimal) {
        if(decimal == 0)
            return;
        else {
            binario(decimal/2);
            int resto = decimal%2;
            System.out.printf("%d ", resto);
        }
    }
}