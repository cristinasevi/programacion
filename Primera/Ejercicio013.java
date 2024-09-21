/*
División mediante restas
9 / 2
9 - 2 -> 1
7 - 2 -> 2
5 - 2 -> 3
3 - 2 -> 4
1 - 2 -> 5
 */
package Primera;

public class Ejercicio013 {
    public static void main (String arg[]){
        int divisor = 2;
        int dividendo = 9;
        int cont;
        
        for(cont=0; dividendo>=divisor; cont++)
            dividendo = dividendo - divisor;
            
        System.out.println("El resultado de la división es: " + cont);
        System.out.println("El resto es: " + dividendo);
    }
}