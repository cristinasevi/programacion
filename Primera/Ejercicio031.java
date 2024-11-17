/*
 Mostrar por pantalla, de cada producto, cuántos euros he recaudado.
 Y al final mostrar el total de euros recaudos
 */
package Primera;

public class Ejercicio031 {
    public static void main(String arg[]) {
        int kilos[][] = { {10, 20, 30, 40, 50}, 
                          {50, 60, 70, 80, 80},
                          {90, 100, 110, 120, 30} };
        String productos[] = {"Naranjas", "Manzanas", "Peras"};
        double precios[] = {1.5, 2.1, 0.83}; // double -> decimales
        double acum;
        double total=0;
        
        for(int i=0; i<productos.length; i++){
            acum = 0;
            for(int j=0; j<kilos[i].length; j++)
                acum += kilos[i][j] * precios[i];
            total += acum;
            System.out.printf("Precio de %s: %.2f €\n", productos[i], acum); // %.2f -> double
        }
     
        System.out.printf("Total: %.2f\n", total);
    }
}
