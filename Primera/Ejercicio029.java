/*
 Acumular por filas y por columnas el contenido de los elementos de una tabla
 */
package Primera;

public class Ejercicio029 {
    public static void main(String arg[]) {
        int tabla[][] = { {10, 20, 30, 40}, 
                          {50, 60, 70, 80},
                          {90, 100, 110, 120} };
        int acumFilas[] = {0, 0, 0};
        int acumColumnas[] = {0, 0, 0, 0};
        
        for(int i=0; i<acumFilas.length; i++){
            for(int j=0; j<acumColumnas.length; j++){
                acumFilas[i] += tabla[i][j];
                acumColumnas[j] += tabla[i][j];
            }
        }
        for (int i=0; i<acumFilas.length; i++)
            System.out.printf("%d ", acumFilas[i]);
        
        System.out.println();
        
        for(int j=0; j<acumColumnas.length; j++)
            System.out.printf("%d ", acumColumnas[j]);
    }
}

/*                    
        0  1  2  3      acumFilas -> i
      0 10|20|30|40     100
      1 50|60|70|80     260 
      2 90|100|110|120  420

acum    60|80|100|240
Columnas -> j
*/