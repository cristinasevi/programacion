/*
 1. Implementar un método que reciba el array de salarios y nos devuelva un 
    vector unidimensional de 6 enteros con los salarios acumulados por mes
 2. Implementar otro método que reciba el array de salarios y el vPorMes
 3. Implementar otro método que saque la cantidad total que cobra cada empleado
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
        for(int i=0; i<porMes.length; i++)
            System.out.printf("En %s se ha pagado: %d\n", meses[i], porMes[i]);
        
        System.out.println("-----------------------------");
        
        int vPorMes[] = {0, 0, 0, 0, 0, 0}; // new int[6]
        salariosSemestrales(salarios, vPorMes);
        for(int i=0; i<porMes.length; i++)
            System.out.printf("En %s se ha pagado: %d\n", meses[i], vPorMes[i]);
        
        System.out.println("-----------------------------");
        
        int porEmpleado[] = salariosEmpleado(salarios);
        for(int i=0; i<porEmpleado.length; i++)
                System.out.printf("El salario de %s es %d\n", empleados[i], porEmpleado[i]);
         
        System.out.println("-----------------------------");
        
        int vPorEmpleado[] = {0, 0, 0, 0}; // new int[4]
        salariosEmpleado(salarios, vPorEmpleado);
        for(int i=0; i<vPorEmpleado.length; i++)
                System.out.printf("El salario de %s es %d\n", empleados[i], vPorEmpleado[i]);
        
    }  
    
    public static int[] salariosSemestrales (int sals[][]){ 
        int vAcum[] = {0, 0, 0, 0, 0, 0}; // new int[6]
        for(int j=0; j<vAcum.length; j++)
            for(int i=0; i<sals.length; i++)
                vAcum[j] += sals[i][j];
        return vAcum;
    }
    
    public static void salariosSemestrales (int sals[][], int vPM[]){
        for(int j=0; j<vPM.length; j++)
            for(int i=0; i<sals.length; i++)
                vPM[j] += sals[i][j];
    }
    
    public static int[] salariosEmpleado (int sals[][]){
        int vPorEmpleado[] = {0, 0, 0, 0}; // new int[4]
        for(int i=0; i<sals.length; i++)
            for(int j=0; j<sals[i].length; j++)
                vPorEmpleado[i] += sals[i][j];
        return vPorEmpleado;
    }
    
    public static void salariosEmpleado (int sals[][], int vPorEmpleado[]){
        for(int i=0; i<sals.length; i++)
            for(int j=0; j<sals[i].length; j++)
                vPorEmpleado[i] += sals[i][j];
    }
}

/*
Al crear una función y declarar: int[] --> hace que devuelva un vector de enteros
Se puede llamar a los métodos de la misma forma,  porque pasas parámetros diferentes
*/