/*
 Calcula el factorial de un número
 */
package Primera;

public class Ejercicio010 {
    public static void main (String arg[]){
        int num = 5;
        int acum = 1;
       
        for(int cont=1; cont<=num; cont++)
            acum = acum*cont; // acum *=cont
        System.out.println("El factorial de " + num + " es: " + acum);
        
        /*
        for(int cont=num; cont>1; cont--)
            acum = acum*cont; // acum *=cont
         // descendente
        System.out.println("El factorial de " + num + " es: " + acum);
        */
    }
}