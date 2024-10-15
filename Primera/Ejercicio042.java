/*
 Método de ordenación de la burbuja
 consiste en ir descendiendo por el vector e ir comparando con el anterior
 */
package Primera;

public class Ejercicio042 {
    public static void main (String arg[]){
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        int inter;
        
        for(int i=0; i<vector.length-1; i++){
            for(int j=vector.length-1; j>i; j--){       
                if(vector[j] < vector[j-1]){
                    inter = vector[j];
                    vector[j] = vector[j-1];
                    vector[j-1] = inter;
                }
            }
        }
        
        for(int i=0; i<vector.length; i++) 
            System.out.print(vector[i] + " ");
    }
}