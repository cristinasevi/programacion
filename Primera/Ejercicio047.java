/*
 Implementar un método que reciba un array bidimensional de enteros 
 y devuelva la suma de todos sus elementos
 */
package Primera;

public class Ejercicio047 {
    public static void main (String arg[]){
        int salarios[][] = { {700, 900, 1300, 800, 790, 850},
                             {1000, 950, 1080, 1070, 1200, 1100},
                             {1300, 930, 1200, 1170, 1000, 1000},
                             {1500, 1950, 1880, 1978, 2200, 2100} };
        
        System.out.printf("El total de salarios es: %d\n", sumar(salarios));
    }
    
    public static int sumar (int matriz[][]){
        int acumulador = 0;
        
        for(int i=0; i<matriz.length; i++)
            for(int j=0; j<matriz[i].length; j++)
                acumulador += matriz[i][j];
        return acumulador;    
    }
}