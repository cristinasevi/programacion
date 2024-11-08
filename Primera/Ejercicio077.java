/*
 Clase String. Dos primeras funciones. LENGTH y CHARAT
 Cargar un espacio en blanco entre cada caracter de la frase
 */
package Primera;

public class Ejercicio077 {
    public static void main(String arg[]){
        String frase = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme";
        char cadena[] = new char[150];
        
        for(int i=0; i<frase.length(); i++)
            System.out.printf(" %c", frase.charAt(i));
        
        for(int i=0; i<frase.length(); i++)
            cadena[i] = frase.charAt(i);
        
        System.out.println();
        System.out.println(cadena);
    }
}

/*
 length() --> es una función de la clase String, que cuenta la longitud
 %c --> char

 charAt() --> es una función de la clase String, que devuelve el caracter que tu le pongas en la dirección del índice
*/