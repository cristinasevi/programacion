/*
 Modificar frase, de manera que sus palabras (que se separan 
 por un espacio en blanco) queden ordenadas alfabéticamente.
 Calcular la cantidad de elementos con el que hay que inicializar el vector.
 */
package Primera;

public class Ejercicio084 {
    public static void main(String arg[]){
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
        String vector[];
        
        // Contar la cantidad de palabras en la frase e inicializar el vector
        int cont = 0;
        int posicion = frase.indexOf(" ");
        while(posicion != -1) {
            cont++;
            posicion = frase.indexOf(" ", posicion+1);
        }
        vector = new String[cont];
        
        // Dividir la frase en palabras y almacenarlas en el vector
        int inicio = 0;
        int k = 0;
        for(int i=0; i<frase.length(); i++) {
            if(frase.charAt(i) == ' ') {
                vector[k++] = frase.substring(inicio, i);
                inicio = i + 1;
            }
        }
        
        // Ordenar el vector alfabéticamente (método burbuja)
        for(int i=0; i<vector.length-1; i++){
            for(int j=vector.length-1; j>i; j--){       
                if(vector[j] < vector[j-1]){
                    inter = vector[j];
                    vector[j] = vector[j-1];
                    vector[j-1] = inter;
                }
            }
        }
         
         
         
         
    }
}