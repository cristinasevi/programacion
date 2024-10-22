/*
 Método de ordenación
 */
package Primera;

public class Ejercicio049 {
    public static void main (String arg[]){
        int vector[] = {25, 2, 73, 81, 16, 4, 33};
        
        ordenar(vector);
        for(int i=0; i<vector.length; i++) 
            System.out.print(vector[i] + " ");
    }
    
    public static void ordenar (int vect[]){
        int inter;
        for(int i=0; i<vect.length-1; i++){
            for(int j=vect.length-1; j>i; j--){       
                if(vect[j] < vect[j-1]){
                    inter = vect[j];
                    vect[j] = vect[j-1];
                    vect[j-1] = inter;
                }
            }
        }
    }
}