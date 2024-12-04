/*
 Implementa un programa en el que, dada una cadena de caracteres, elimine todos 
 los caracteres duplicados consecutivos.  Actuando sobre la cadena original.
 */
package Primera.Examen;

public class Ejercicio004 {
    public static void main(String[] args) {
        char cadena[] = {'E', 'n', 'n', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'u', 'g', 'a', 'r', 'r', 'r', ' ', 'd', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'a', 'a', 'a', 'n', 'c', 'h', 'a', ' '};
        
        int longitud = cadena.length-1;
        int i=0;
        while(i<longitud)
            if(cadena[i] == cadena[i+1]) {
                for(int j=i; j<cadena.length-1; j++)
                    cadena[j] = cadena[j+1];
                longitud--;
            }
            else {
                i++;
            }
        
        System.out.println(cadena);
    }
}