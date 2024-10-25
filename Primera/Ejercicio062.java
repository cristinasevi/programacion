/*
 Implementar una función que reciba la frase y sustituya el caracter 
 a sustituir por el vector de caracteres sustituto
 */
package Primera;

public class Ejercicio062 {
    public static void main (String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char sustituir = 'a';
        char sustituto[] = {'X', 'X', 'V'};
        char frase2[] = new char[100];
        
        cambiarFrase(frase, sustituir, sustituto, frase2);
        System.out.println(frase2);
    }  
    
    public static void cambiarFrase(char frase[], char sustituir, char sustituto[], char frase2[]) {
        int k=0;
        for(int i=0; i<frase.length; i++) {
            if(frase[i] == sustituir) {
                for(int j=0; j<sustituto.length; j++) {
                    frase2[k++] = sustituto[j];
                }
            }
            else {
                frase2[k++] = frase[i];
            }
        }
    }
}