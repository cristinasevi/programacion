/*
 Mostrar por pantalla si el número es par o impar
 */
package Primera;

public class Ejercicio005 {
    public static void main (String arg[]){
        int x;
	x = 4;
        
        if(x%2 == 0)
            System.out.println("El número " + x + " es par.");
        else
            System.out.println("El número " + x + " es impar.");
    }
}