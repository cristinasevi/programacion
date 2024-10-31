/*
 Modificar la frase de manera que cada palabra desplace sus letras una
 posición a la derecha y la última letra se coloque en la primera posición.
 También hacer que se desplacen hacia la izquierda.
 */
package Primera;

public class Ejercicio066 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char frase2[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        
        int inicio,fin;
        inicio = fin = 0;
        char intercambio;
        
        while(fin < frase.length) {
            while(frase[fin] != ' ')
                fin++;
            despDerecha(frase, fin, inicio);
            despIzquierda(frase2, fin, inicio);
            inicio = fin = fin+1;
        }
        
        System.out.println(frase);
        System.out.println(frase2);
    }

    public static void despDerecha(char[] frase, int fin, int inicio) {
        char intercambio;
        intercambio = frase[fin-1];
        for(int i=fin-1; i>inicio; i--)
            frase[i] = frase[i-1];
        frase[inicio] = intercambio;
    }
    
    public static void despIzquierda(char[] frase2, int fin, int inicio) {
        char intercambio;
        intercambio = frase2[inicio];
        for(int i=inicio; i<fin-1; i++)
            frase2[i] = frase2[i+1];
        frase2[fin-1] = intercambio;
    }
}

/* 
 refactorizar --> seleccionas un poco de codigo y lo mete en una funcion
 Selecionas código --> clic derecho -->
 Refactor --> Introduce --> Method --> introduces el nombre y le das a public
*/