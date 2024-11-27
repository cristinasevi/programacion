/*
 Realizar una función que reciba una cadena de caracteres y devuelva el número
 de palabras que contienen al menos una vocal
 */
package Primera;

public class Ejercicio101 {
    public static void main(String[] args) {
        char frase[] = {'E', 'n', ' ', 'U', 'n', ' ', 'l', 'U', 'g', 'a', 'r', ' ', 'd', 'E', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a',' '};
        String frase2 = "En un lugar de La Mancha ";
        
        System.out.printf("Un total de %d palabras cuentan con vocal - CHAR \n", contar(frase));
        System.out.printf("Un total de %d palabras cuentan con vocal - STRING \n", contar2(frase2));
    }
    
    public static int contar(char frase[]) {
        int numVocales = 0;
        int cont = 0;
        for(int i=0; i<frase.length; i++) {
            if(frase[i] != ' ') {
                switch(frase[i]) {
                    case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case 'O': case 'o': case 'U': case 'u':
                    numVocales++;
                    break; 
                }
            }
            else {
                if(numVocales >= 1) {
                    cont++;
                }
                numVocales = 0;
            }
        }
        return cont;
    }
    public static int contar2(String frase2) {
        int numVocales = 0;
        int cont = 0;
        for(int i=0; i<frase2.length(); i++) {
            if(frase2.charAt(i) != ' ') {
                switch(frase2.charAt(i)) {
                    case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case 'O': case 'o': case 'U': case 'u':
                    numVocales++;
                    break;    
                }
            }
            else {
                if(numVocales >= 1) {
                    cont++;
                }
                numVocales = 0;
            }
        }
        return cont;
    }
}