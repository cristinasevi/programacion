/*
 Cadena de caracteres
 Implementar una función que devuelva el número de espacios en 
 blanco que contiene una cadena.
 */
package Primera;

public class Ejercicio058 {
    public static void main (String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        
        int espaciosBlanco = espacios(frase);
        System.out.printf("El número de espacios en blanco es: %d\n", espaciosBlanco);
        System.out.printf("El número de palabras es: %d\n", espaciosBlanco+1);
    }
    
    public static int espacios (char frase[]) {
        int num = 0;
        for(int i=0; i<frase.length; i++)
            if(frase[i] == ' ')
                num++;
        return num;
    }
}

/*
String --> se representa con " "
char --> se representa con ' '
*/