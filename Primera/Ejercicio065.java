/*
 Invertir el orden de cada palabra
 */
package Primera;

public class Ejercicio065 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        
        int inicio,fin;
        inicio = fin = 0;
        char intercambio;
        
        while(fin < frase.length) {
            while(frase[fin] != ' ')
                fin++;
            for(int i=0; i<=((fin - inicio)/2); i++) {
                intercambio = frase[inicio];
                frase[inicio] = frase[fin-i-1];
                frase[fin-i-1] = intercambio;
                inicio++;
            }
            inicio = fin = fin+1;
        }
        
        System.out.println(frase);
    }
}

/*
 for --> si sabes el número de iteraciones del bucle
 while --> si no sabes el número de iteraciones del bucle
*/