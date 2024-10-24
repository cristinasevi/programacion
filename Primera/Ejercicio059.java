/*
 1. Implementa un método que cargue en fraseMod el contenido de frase
    sustituyendo los espacios en blanco por una 'X'.
 */
package Primera;

public class Ejercicio059 {
    public static void main (String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char fraseMod[] = new char[50];
        
        modificarFrase(frase, fraseMod);
        System.out.println(fraseMod);
        
        char resultado[] = modificarFrase1(frase);
        System.out.println(resultado);
    }
    
    public static void modificarFrase (char frase[], char fraseMod[]) {
        for(int i=0; i<frase.length; i++){
            fraseMod[i] = frase[i];
            if(fraseMod[i] == ' ')
                fraseMod[i] = 'X';     
        }
    }
    
    public static char[] modificarFrase1 (char frase[]) {
        char fraseMod1[] = new char[50];
        for(int i=0; i<frase.length; i++){
            fraseMod1[i] = frase[i];
            if(fraseMod1[i] == ' ')
                fraseMod1[i] = 'X';     
        }
        return fraseMod1;
    }
}