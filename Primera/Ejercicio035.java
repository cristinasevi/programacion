/*
 Mostrar por pantalla el nombre del alumno que ha obtenido las mejores notas
 y su media de notas. 
 También el nombre del alumno con peores notas y su media.
 El nombre de la asignatura con mejores notas y su media.
 El nombre de la asignatura con peores notas y su media.
 */
package Primera;

public class Ejercicio035 {
    public static void main (String arg[]){
        int notas[][] = { {7, 9, 3, 8}, 
                          {10, 9, 9, 8},
                          {9, 10, 7, 1},
                          {3, 10, 5, 6},
                          {8, 5, 4, 5}  };
        String alumnos[] = {"Viviana", "Palazón", "Javi", "Vicente", "Oriol"};
        String asignaturas[] = {"Programación", "Leng.Marcas", "Bases.Datos", "Entornos.Desarrollo"};
        double vAlumnosNota[] = {0, 0, 0, 0, 0};
        double vAsigNota[] = {0, 0, 0, 0};
        
       for(int i=0; i<vAlumnosNota.length; i++){
            for(int j=0; j<vAsigNota.length; j++){
                vAlumnosNota[i] += notas[i][j]/5;
                vAsigNota[j] += notas[i][j]/4;
            }
        }
        for (int i=0; i<vAlumnosNota.length; i++)
            System.out.printf("%.2f ", vAlumnosNota[i]);
        
        System.out.println();
        
        for(int j=0; j<vAsigNota.length; j++)
            System.out.printf("%.2f ", vAsigNota[j]);  
    }
}