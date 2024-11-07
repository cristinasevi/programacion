/*
 Modificar los caracteres de una cadena, de manera que las vocales 
 se conviertan de minúsculas a mayúsculas y viceversa.
 El resto de los caracteres se sustituyen por '-'
 */
package Primera;

public class Ejercicio076 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'U', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        
        for(int i=0; i<frase.length; i++)
            switch(frase[i]) {
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    frase[i] = Character.toLowerCase(frase[i]);
                    break;
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    frase[i] = Character.toUpperCase(frase[i]);
                    break;
                default:
                    frase[i] = '-';
            }
        
        System.out.println(frase);
    }
}

/*
 Character.toUpperCase = convierte a mayúsculas
 Character.toLowerCase = convierte a minúsculas
    
 switch: inicia la estructura
 case: define las opciones
 break: rompe los bucles y los case
 default: para el resto de los casos que ejecute la siguiente instrucción
*/