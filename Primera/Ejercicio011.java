/*
 Multiplicación mediante sumas
5*7
5+5+5+5+5+5+5
 */
package Primera;

public class Ejercicio011 {
    public static void main (String arg[]){
        int multiplicando = 7;
        int multiplicador = 5;
        int acum = 0;
        int cont;
        
        for(cont=1; cont<=multiplicador; cont++)
            acum += multiplicando; // acum = acum + multiplicando
        System.out.println("El resultado es: " + acum);          
    }
}