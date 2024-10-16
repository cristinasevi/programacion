/*
 Implementar una función que devuelva el valor máximo de un vector
 */
package Primera;

public class Ejercicio046 {
    public static void main (String arg[]){
        int vector[] = {24, 45, 65, 12, 7, 123, 16, 50};
        maximo(vector);
        int max = maximo(vector);
        System.out.printf("El valor máximo del vector es: %d ", max);
    }
    
    public static int maximo(int v1[]){
        int max = v1[0];
        
        for(int i=0; i<v1.length; i++)
            if(v1[i]>max)
                max = v1[i];
        return max;
    }
}