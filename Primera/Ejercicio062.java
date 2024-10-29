/*
 Implementar un método que reciba una cadena de caracteres y sustituya
 en ella un caracter por otra cadena de caracteres.
 Lo haremos sobre una cadena de caracteres auxiliar.
 */
package Primera;

public class Ejercicio062 {
    public static void main (String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'a';
        char sustituto[] = {'X', 'X', 'V'};
        
        char frase2[] = cambiarFrase(frase, sustituir, sustituto);
        System.out.println(frase2);
    }  
    
    public static char[] cambiarFrase(char frase[], char sustituir, char sustituto[]) {
        char frase2[] = new char[100];
        int k=0;
        for(int i=0; i<frase.length; i++) {
            if(frase[i] == sustituir) {
                for(int j=0; j<sustituto.length; j++) {
                    frase2[k] = sustituto[j]; 
                    k++;
                }
            }
            else {
                frase2[k] = frase[i]; 
                k++;
            }
        }
        return frase2;
    }
}

/* 
 En vez de poner esto:
 frase2[k] = frase[i];  
 k++;

 se puede poner directamente esto:
 frase2[k++] = frase[i];
*/