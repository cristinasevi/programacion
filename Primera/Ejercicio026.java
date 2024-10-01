/*
 Tratamiento de tablas
 */
package Primera;

public class Ejercicio026 {
    public static void main(String arg[]) {
        // Se declara con 2 llaves porque es un vector de 2 dimensiones
        int tabla[][] = { {10, 20, 30, 40}, 
                          {50, 60, 70, 80},
                          {90, 100, 110, 120} };
        for(int i=0; i<tabla.length; i++){
            for(int j=0; j<tabla[i].length; j++)
                System.out.printf("%d ", tabla[i][j]);
            System.out.println();
        }    
    }
}

/*
  0 1 2 3
0
1     X
2
tabla[1][2]
*/