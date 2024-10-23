/*
 Hacer lo mismo que en el ejercicio anterior 054, pero guardando el 
 resultado en otra tabla. Hacerlo de dos maneras.
 */
package Primera;

public class Ejercicio055 {
    public static void main (String arg[]){
        int kilos[][] = { {5, 6, 9, 23, 7, 14, 0},
                          {16, 8, 4, 33, 15, 21, 2} };
        int precios[] = {6, 7};
        
        int dinero[][] = new int[2][7]; // new int[columna][fila]
        dinero1(kilos, precios, dinero);
        for(int i=0; i<kilos.length; i++)
            for(int j=0; j<kilos[i].length; j++)
                System.out.print(dinero[i][j] + " ");
        
        System.out.println("");
        
        int din[][] = dinero2(kilos, precios);
        for(int i=0; i<din.length; i++)
            for(int j=0; j<din[i].length; j++)
                System.out.print(din[i][j] + " ");
    }
    
    public static void dinero1 (int kilos[][], int precios[], int dinero[][]){
        for(int i=0; i<kilos.length; i++)
            for(int j=0; j<kilos[i].length; j++)
                dinero[i][j] = kilos[i][j] * precios[i];
    }
    
    public static int[][] dinero2 (int kilos[][], int precios[]){
        int dinero[][] = new int[2][7]; // new int[columna][fila]
        for(int i=0; i<kilos.length; i++)
            for(int j=0; j<kilos[i].length; j++)
                dinero[i][j] = kilos[i][j] * precios[i];
        return dinero;
    }
}