/*
 Dado un String y una palabra específica, implementa un programa que busque 
 todas las apariciones de la palabra en el String y la oculte con asteriscos.  
 También deberá mostrar las posiciones en las que ha aparecido la palabra dentro del String.
 */
package Primera.Examen;

public class Ejercicio002 {
    public static void main(String[] args) {
        String frase = "El sol brilla, porque el sol es brillante";
        String palabra = "sol";
        
        int posicion = frase.indexOf(palabra);
       
        while(posicion != -1) {
            System.out.println("Encontrado en la posición: " + posicion);
            frase = frase.substring(0, posicion).concat("***").concat(frase.substring(posicion+palabra.length()));
            posicion = frase.indexOf(palabra, posicion+1);
            System.out.println("Encontrado en la posición: " + posicion);
            frase = frase.substring(0, posicion).concat("***").concat(frase.substring(posicion+palabra.length()));
            posicion = frase.indexOf(palabra, posicion+1);
        }
        
        System.out.println(frase);
    }
}