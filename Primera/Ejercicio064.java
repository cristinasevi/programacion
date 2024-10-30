/*
 Muestra por pantalla el número de ocasiones en el que la subcadena 
 se encuentra dentro de frase.
 */
package Primera;

public class Ejercicio064 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', 'n', 'n', 'n', ' ', 'n', 'n', 'n', 'n', 'r', ' ', 'n', 'n', 'n', 'n', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char subcadena[] = {'n','n','n'};
        int cont = 0;
        
        // Corregimos el límite de la condición en el bucle 'for' 
        for (int i=0; i<=(frase.length - subcadena.length); i++) {
            if (subcadena[0] == frase[i]) {
                int x = i;
                int j = 1;
                
                while ((j<subcadena.length) && (frase[i+j] == subcadena[j])) {
                    x++;
                    j++;
                }
                
                if (j==subcadena.length) {
                    cont++;
                }
            }
        }
        
        System.out.println("Numero de coincidencias: " + cont);
    }
}