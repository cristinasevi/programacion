/*
 Desplazar todos los elementos de un vector una posición
 hacia la derecha. El último elemento pasará a la primera posición
 */
package Primera;

public class Ejercicio021 {
    public static void main(String arg[]) {
        int datos[] = {10, 20, 30, 40, 50};
        int guarda = datos[datos.length-1]; 
        
        for(int i=datos.length-1; i>0; i--) {
            datos[i] = datos[i-1];
        }
        datos[0] = guarda; 
        
        // Mostrar el resultado
        for(int i=0; i<datos.length; i++) {
            System.out.println(datos[i]);
        }
    }
}