/*
 Primer bucle (nº fijo de iteraciones)
 */
package Primera;

public class Ejercicio008 {
    public static void main (String arg[]){
        int cont;
        // for(iniciamos_contador; condicion_mientras_dure; lo_que_tiene_que_hacer)
        for(cont=0; cont<10; cont++)
            System.out.println("Iteración: " + (cont +1));
            // cont = cont + 1  --> cont++  postincrementativo
            // cont = cont - 1  --> cont--  postdecrementativo
    }
}