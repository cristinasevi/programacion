/*
 Mostrar por pantalla el día en que se vendieron más entradas y cuántas se
 vendieron. Y el día en que se vendieron menos entradas y cuántas se vendieron
 */
package Primera;

public class Ejercicio032 {
    public static void main(String arg[]) {
    int salas[][] = {   {10, 20, 30, 40, 50, 200, 180}, 
                        {50, 60, 70, 80, 80, 300, 198},
                        {90, 100, 110, 120, 130, 150, 120}  };
        String []dias = {"Lunes", "Martes", "Miércoles", "Jueves", 
                         "Viernes", "Sábado", "Domingo"};
        int vacum[] = {0, 0, 0, 0, 0, 0, 0};     
        
        for(int i=0; i<dias.length; i++){
            for (int j=0; j<salas.length; j++)
                vacum[i] += salas[j][i];
        }
        
        int maxEntradas = vacum[0];
        int minEntradas = vacum[0];
        int diaMax = 0;
        int diaMin = 0;

        for (int i=1; i<vacum.length; i++) {
            if (vacum[i] > maxEntradas) {
                maxEntradas = vacum[i];
                diaMax = i;
            }
            if (vacum[i] < minEntradas) {
                minEntradas = vacum[i];
                diaMin = i;
            }
        }
        
        System.out.printf("El %s es el día con más entradas vendidas: %d\n", dias[diaMax], maxEntradas);
        System.out.printf("El %s es el día con menos entradas vendidas: %d\n", dias[diaMin], minEntradas);
    }
}