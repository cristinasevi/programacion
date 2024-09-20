/*
 Mostrar por pantalla la tabla de multiplicar de un número
 */
package Primera;

public class Ejercicio009 {
    public static void main (String arg[]){
        int num;
        int cont;
        num = 5;
        
        for(cont=1; cont<=10; cont++)
            System.out.println(num + " x " + cont + " = " + (num*cont));
    }
}