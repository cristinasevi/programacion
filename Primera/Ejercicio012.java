/*
Cálculo de variaciones matemáticas
variaciones: V^4 7 = 7! / 4! = 7x6x5 --> 7x6x5x4x3x2x1 / 4x3x2x1
 */
package Primera;

public class Ejercicio012 {
    public static void main (String arg[]){
        int x = 7;
        int y = 4;
        int acum1 = 1;
        int acum2 = 1;
        
        for(int cont=1; cont<=x; cont++)
            acum1 = acum1*cont;
            
        for(int cont=1; cont<=y; cont++)
            acum2 = acum2*cont;
            
        System.out.println("El resultado de la variación es: " + (acum1/acum2));
    }
}