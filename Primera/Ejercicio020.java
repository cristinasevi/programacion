/*
 Desplazar todos los elementos de un vector una posición
 hacia la izquierda. El primer elemento pasará a la última posición
 */
package Primera;

public class Ejercicio020 {
    public static void main(String arg[]) {
        int datos[] = {10, 20, 30, 40, 50};
        int guarda = datos[0];  
        
        for(int i=0; i<datos.length-1; i++) {
            datos[i] = datos[i+1];
        }
        datos[datos.length-1] = guarda;
        
        // Mostrar el resultado
        for(int i=0; i<datos.length; i++) {
            System.out.println(datos[i]);
        }
    }
}