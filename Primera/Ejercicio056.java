/*
 Implementar un método que devuelva un vector en el que se hayan acumulado 
 los kilos de cada producto.
 Desde el programa principal muestra, de cada producto, su nombre y el 
 número de kilos que se han vendido.
 */
package Primera;

public class Ejercicio056 {
    public static void main (String arg[]){
        int kilos[][] = { {5, 6, 9, 23, 7, 14, 0},
                          {16, 8, 4, 33, 15, 21, 2} };
        String productos[] = {"Peras", "Manzanas"};
        
        int tot[] = sumarKilos(kilos);
        for(int i=0; i<tot.length; i++)
            System.out.printf("Se han vendido %d kilos de %s\n", tot[i], productos[i]);
    }
    
    public static int[] sumarKilos (int kilos[][]){
        int total[] = new int[2];
        for(int i=0; i<kilos.length; i++)
            for(int j=0; j<kilos[i].length; j++)
                total[i] += kilos[i][j];
        return total;
    }
}