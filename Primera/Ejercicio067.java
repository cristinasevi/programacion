/*
 Cargar frase2 con el contenido de frase1, sustituyendo cada caracter por la subcadena
 */
package Primera;

public class Ejercicio067 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char caracter = 'a';
        char subCadena[] = {'A', 'B', 'C', 'D', 'E'};
        char frase2[] = new char[150];
                
        for(int i=0, j=0; i<frase.length; i++, j++) {
            if(frase[i] != caracter) {
                frase2[j] = frase[i];
            } else {
                for(int z=0; z<subCadena.length; z++)
                    frase2[j++] = subCadena[z];
            }
        }

        System.out.println(frase2);
    }
}

/*
preincrementativo --> ++j, primero incrementa y después se usa el contenido de j
posincrementativo --> j++, primero usas el contenido de j y después se incrementa
*/