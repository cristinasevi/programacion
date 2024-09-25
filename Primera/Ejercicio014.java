/*
 a) Declaración y manipulación de vectores
 b) Modificar el contenido de cada elemento del vector multiplicándolo por 2,
    y mostrar cómo queda el vector
 */
package Primera;

public class Ejercicio014 {
    public static void main (String arg[]){
        // se declara y se instancia el vector, siempre se escribe en plural y lleva llaves, y los valores entre corchetes
        int datos[] = {17, 33, 4, 95, 170};
        
        for(int i=0; i<datos.length; i++) // length: cuenta el número de datos que hay
            System.out.printf("Datos de [%d] = %d\n", i, datos[i]);
        
        // Multiplicar por 2 los elementos del vector
        for(int i=0; i<datos.length; i++) 
            datos[i] *= 2;
        System.out.println();
        
        for(int i=0; i<datos.length; i++) 
            System.out.printf("Datos de [%d] = %d\n", i, datos[i]);
    }
}