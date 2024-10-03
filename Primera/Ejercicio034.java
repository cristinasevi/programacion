/*
 Mostrar por pantalla el título de la película y el día de la semana
 de mayor taquillaje. Lo mismo con el menor
 */
package Primera;

public class Ejercicio034 {
    public static void main(String arg[]) {
        int salas[][] = {   {10, 20, 30, 40, 50, 200, 180}, 
                                {50, 60, 70, 80, 80, 300, 198},
                                {90, 100, 110, 120, 130, 150, 120},
                                {9, 199, 150, 180, 13, 100, 190}  };
        String peliculas[] = {"Joker", "Soy Nevenka", "Buffalo Kids", "Los destellos"};
        String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", 
                         "Viernes", "Sábado", "Domingo"};
        int posMaxFila = 0;
        int posMaxCol = 0;
        int posMinFila = 0;
        int posMinCol = 0;
        
        for(int i=0; i < dias.length; i++){
            for(int j=0; j < salas.length; j++) {
                if(salas[j][i] > salas[posMaxFila][posMaxCol]){
                    posMaxFila = j;
                    posMaxCol = i;
                }
                if(salas[j][i] < salas[posMinFila][posMinCol]){
                    posMinFila = j;
                    posMinCol = i;
                }
            }
        }
        
         System.out.printf("La película %s el %s consiguió la máxima audiencia con %d espectadores\n", peliculas[posMaxFila], dias[posMaxCol], salas[posMaxFila][posMaxCol]);
        System.out.printf("La película %s el %s consiguió la mínima audiencia con %d espectadores\n", peliculas[posMinFila], dias[posMinCol], salas[posMinFila][posMinCol]);
    }
}