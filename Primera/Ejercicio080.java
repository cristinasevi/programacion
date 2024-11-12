/*
 Función replace
 Función indexOf
 */
package Primera;

public class Ejercicio080 {
    public static void main(String arg[]){
        String frase = "En un lugar lugar de La Mancha, de cuyo nombre no quiero acordarme";
      
        // Reemplazar 'a' por 'X'
        frase = frase.replace('a', 'X');
        System.out.println(frase);
        
        // // Reemplazar 'lugXr' por 'sitio'
        frase = frase.replace("lugXr", "sitio");
        System.out.println(frase);
        
        // Encontrar y mostrar las posiciones de "sitio"
        int cont = 0;
        int posicion = frase.indexOf("sitio");
        while(posicion != -1) {
            cont++;
            System.out.println("Encontrado en la posición: " + posicion);
            posicion = frase.indexOf("sitio", posicion+1); 
        }
        System.out.printf("Ha aparecido la palabra %d veces\n", cont);
    }
}

/*
 replace() --> remplaza caracteres o String, el que le pongas primero lo 
 cambia por el que pongas después.

 indexOf() --> devuelve la posicón en la que se encuentra lo que buscas. 
 Si no la encuentra, devuelve un -1.
*/