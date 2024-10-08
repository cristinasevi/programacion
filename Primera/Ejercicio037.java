/*
 Mostrar por pantalla el nombre del empleado que más cobra y su media mensual.
 Y el que menos cobra y su media mensual.
 Mostrar por pantalla el nombre del mes en que más se cobra y su media por empleado.
 Y el mes en que menos se cobra y su media por empleado.
*/
package Primera;

public class Ejercicio037 {
    public static void main (String arg[]){
        int salarios[][] = { {700, 900, 1300, 800, 790, 850},
                             {1000, 950, 1080, 1070, 1200, 1100},
                             {1300, 930, 1200, 1170, 1000, 1000},
                             {1500, 1950, 1880, 1978, 2200, 2100} };
        String empleados[] = {"Viviana", "Palazón", "Javi", "Vicente"};
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
        double empleadosAcum[] = {0, 0, 0, 0};
        double mesesAcum[] = {0, 0, 0, 0, 0, 0};
        
        for(int i=0; i<empleados.length; i++)
            for(int j=0; j<meses.length; j++) {
                empleadosAcum[i] += salarios[i][j];
                mesesAcum[j] += salarios[i][j];
            } 
        
        int posMejorEmpleado = 0;
        int posPeorEmpleado = 0;
        
        for(int i=1; i<empleadosAcum.length; i++) {
            if(empleadosAcum[i] > empleadosAcum[posMejorEmpleado])
                posMejorEmpleado = i;
            if(empleadosAcum[i] < empleadosAcum[posPeorEmpleado])
                posPeorEmpleado = i;  
        }
        
        System.out.printf("El empleado que más cobra es %s, con una media de %.2f\n", empleados[posMejorEmpleado], empleadosAcum[posMejorEmpleado] / meses.length);
        System.out.printf("El empleado que menos cobra es %s, con una media de %.2f\n", empleados[posPeorEmpleado], empleadosAcum[posPeorEmpleado] / meses.length);
        
        int posMejorMes = 0;
        int posPeorMes = 0;
        
        for (int i=0; i<mesesAcum.length; i++) {
            if (mesesAcum[i] > mesesAcum[posMejorMes])
                posMejorMes = i;
            if (mesesAcum[i] < mesesAcum[posPeorMes])
                posPeorMes = i;
        }
        
        System.out.printf("El mes que más se cobra es %s, con una media de %.2f\n", meses[posMejorMes], mesesAcum[posMejorMes] / empleados.length);
        System.out.printf("El mes que menos se cobra es %s, con una media de %.2f\n", meses[posPeorMes], mesesAcum[posPeorMes] / empleados.length);
    }
}