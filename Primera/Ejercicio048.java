/*
 1. Implementar un método que reciba el array de salarios y nos devuelva un 
    vector unidimensional de 6 enteros con los salarios acumulados por mes.
 2. Implementar otro método que reciba el array de salarios y el vPorMes
 */
package Primera;

public class Ejercicio048 {
    public static void main (String arg[]){
        int salarios[][] = { {700, 900, 1300, 800, 790, 850},
                             {1000, 950, 1080, 1070, 1200, 1100},
                             {1300, 930, 1200, 1170, 1000, 1000},
                             {1500, 1950, 1880, 1978, 2200, 2100} };
        String empleados[] = {"Viviana", "Palazón", "Javi", "Vicente"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        
        int porMes[] = salariosSemestrales(salarios);
        for(int i=0; i<meses.length; i++)
            System.out.printf("En %s se ha pagado: %d\n", meses[i], porMes[i]);
        
        System.out.println("-----------------------------");
        
        int vPorMes[] = {0, 0, 0, 0, 0, 0}; // new int[6]
        salariosSemestrales2(salarios, vPorMes);
        for(int i=0; i<meses.length; i++)
            System.out.printf("En %s se ha pagado: %d\n", meses[i], vPorMes[i]);
    }  
    
    public static int[] salariosSemestrales (int sals[][]){ 
        int vAcum[] = {0, 0, 0, 0, 0, 0}; // new int[6]
        for(int j=0; j<vAcum.length; j++)
            for(int i=0; i<sals.length; i++)
                vAcum[j] += sals[i][j];
        return vAcum;
    }
    
    public static void salariosSemestrales2 (int sals[][], int vPM[]){
        for(int j=0; j<vPM.length; j++)
            for(int i=0; i<sals.length; i++)
                vPM[j] += sals[i][j];
    }
}

// Al crear una función y declarar: int[] --> hace que devuelva un vector de enteros