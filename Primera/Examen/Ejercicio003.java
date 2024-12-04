/*
 Implementar un método al que se le pase una matriz de 3*3 de enteros y devuelva 
 otra matriz de 3*3 con los valores de la matriz original rotados 90º.  
 Tal y como veis en el ejemplo.  El contenido de la matriz rotada debe mostrarse por pantalla.
 */
package Primera.Examen;

public class Ejercicio003 {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3}, 
                          {4, 5, 6,}, 
                          {7, 8, 9}};
        
        int resultado[][] = girar(matriz);
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static int[][] girar(int matriz[][]) {
        int matriz2[][] = new int[3][3];
      
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                matriz2[i][matriz.length-j-1] = matriz[j][i];
            }
        }

        return matriz2;
    }
}