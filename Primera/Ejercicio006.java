/*
 Mostrar por pantalla si un número termina en 5 o no
 */
package Primera;

public class Ejercicio006 {
    public static void main (String arg[]){
        int x;
        x = 25;
        
        if(x%10 == 5)
            System.out.println("El número " + x + " termina en 5.");
        else
            System.out.println("El número " + x + " no termina en 5.");
    }
}