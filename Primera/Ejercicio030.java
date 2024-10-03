/*
 Mostrar por pantalla, de cada producto, los kilos que se han vendido en total
 */
package Primera;

public class Ejercicio030 {
    public static void main(String arg[]) {
        int kilos[][] = { {10, 20, 30, 40, 50}, 
                          {50, 60, 70, 80, 80},
                          {90, 100, 110, 120, 30} };
        String productos[] = {"Naranjas", "Manzanas", "Peras"}; // String -> siempre entre comillas
        int acum;
        
        for(int i=0; i<productos.length; i++){
            acum = 0;
            for(int j=0; j<kilos[i].length; j++)
                acum += kilos[i][j];
            System.out.printf("Kilos vendidos de %s: %d\n", productos[i], acum); // %s -> String
        }
    }
}