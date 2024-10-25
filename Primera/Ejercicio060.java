/*
 Implementar un método que convierta los caracteres de una cadena a mayúsculas
 */
package Primera;

public class Ejercicio060 {
    public static void main (String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        
        mayusculas(frase);
        System.out.println(frase);
    }
    
    public static void mayusculas(char frase[]) {
        for(int i=0; i<frase.length; i++)
            frase[i] = Character.toUpperCase(frase[i]);
    }
}

/*
Character.toUpperCase(char) --> devuelve el texto a mayúsculas
*/