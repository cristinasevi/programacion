/*
Cálculo de variaciones matemáticas
variaciones: V^4 7 = 7! / 4! = 7x6x5 --> 7x6x5x4x3x2x1 / 4x3x2x1
 */
package Primera;

public class Ejercicio012 {
    public static void main (String arg[]){
        int num = 7;
        int tomadas = 4;
        int acum = 1;
        
        for(int valor=num; valor>tomadas; valor--)
            acum *= valor;
        // format: %d --> decimal, %s --> string, \n --> retorno de carro (salto de línea)
        // arg: hay que poner las variables que va a coger cada campo
        System.out.printf("Variaciones de %d elementos tomados de %d en %d son %d\n", num, tomadas, tomadas, acum); 
        
        /*
        int acum1 = 1;
        int acum2 = 1;
        
        for(int cont=1; cont<=num; cont++)
            acum1 = acum1*cont;
            
        for(int cont=1; cont<=tomadas; cont++)
            acum2 = acum2*cont;
            
        System.out.println("El resultado de la variación es: " + (acum1/acum2));
        */
    }
}