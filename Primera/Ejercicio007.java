/*
 Mostrar por pantalla si un número es múltiplo de otro o no lo es
 */
package Primera;

public class Ejercicio007 {
    public static void main (String arg[]){
        int x, y, aux;
        x = 3;
        y = 21;
        
        if(x < y){
            aux = y;
            y = x; // En y estará el número menor
            x = aux; // En x estará el número mayor 
        }
               
        if(x%y == 0)
            System.out.println("Son múltiplos");
        else
            System.out.println("No son múltiplos");  
    }
}
