/*
 Ir mostrando el contenido del vector, desplazando sus elementos una 
 posición a la derecha, hasta que los valores queden como al principio
 */
package Primera;

public class Ejercicio023 {
    public static void main(String arg[]) {
        int datos[] = {10, 20, 30, 40, 50};
        
        for(int j=0; j<5; j++) {
            int guarda = datos[datos.length-1];
            for(int i=datos.length-1; i>0; i--)
                datos[i] = datos[i-1];
            datos[0] = guarda; 
            
           // Mostrar el resultado
            for(int i=0; i<5; i++)
                System.out.print(datos[i] + " "); 
                // print --> imprime los elementos en una misma línea 
            System.out.println();
        }
    }
}