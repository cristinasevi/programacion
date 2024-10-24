/*
 Implementar un método que convierta la frase a mayúsculas.
 */
package Primera;

public class Ejercicio060 {
    public static void main (String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        
        char fraseMod[] = new char[50];
        
        mayusculas(frase, fraseMod);
        System.out.println(fraseMod);
    }
    
    public static void mayusculas(char frase[], char fraseMod[]) {
        for(int i=0; i<frase.length; i++){
            fraseMod[i] = frase[i];
            fraseMod[i] = Character.toUpperCase(fraseMod[i]);
        }
    }
}

/*
Character.toUpperCase()
*/