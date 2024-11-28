/*
 Implementa una función que reciba un vector de 10 enteros y un número entero ‘n’ 
 y devuelva un nuevo vector que contenga sólo los elementos del primer vector que sean mayores que ‘n’.
 */
package Primera.Examen;

public class Examen001 {
    public static void main(String[] args) {
        int vector[] = {23, 300, 48, 6, 3, 90, 35, 89, 123, 12};
        int n = 30;
        
        int resultado[] = mayores(vector, n);
        for(int i=0; i<vector.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
    
    public static int[] mayores(int vector[], int n) {
        int vector2[] = new int[10];
        for(int i=0; i<vector.length; i++) {
            if(vector[i] > n) {
                vector2[i] = vector[i];
            }
        }      
        
        return vector2;
    }
}