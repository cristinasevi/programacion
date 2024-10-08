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
        String alumnos[] = {"Viviana", "Palazón", "Javi", "Vicente", "Álvaro"};
        String asignaturas[] = {"Programación", "Leng.Marcas", "Bases.Datos", "Entornos.Desarrollo"};
        double vAlumnosNota[] = {0, 0, 0, 0, 0};
        double vAsigNota[] = {0, 0, 0, 0};
        
        for(int i=0; i<alumnos.length; i++){
            for(int j=0; j<asignaturas.length; j++){
                vAlumnosNota[i] += notas[i][j];
                vAsigNota[j] += notas[i][j];
            }
        }
       
        int posMejorAlumno = 0;
        int posPeorAlumno = 0;
       
        for (int i=1; i<vAlumnosNota.length; i++) {
            if (vAlumnosNota[i] > vAlumnosNota[posMejorAlumno])
                posMejorAlumno = i;
            if (vAlumnosNota[i] < vAlumnosNota[posPeorAlumno])
                posPeorAlumno = i;
        }
        
        System.out.printf("Las mejores notas son de %s, con una media de %.2f\n", alumnos[posMejorAlumno], vAlumnosNota[posMejorAlumno] / asignaturas.length);
        System.out.printf("Las peores notas son de %s, con una media de %.2f\n", alumnos[posPeorAlumno], vAlumnosNota[posPeorAlumno] / asignaturas.length);
        
        int posMejorAsig = 0;
        int posPeorAsig = 0;
        
        for (int i=0; i<vAsigNota.length; i++) {
            if (vAsigNota[i] > vAsigNota[posMejorAsig])
                posMejorAsig = i;
            if (vAsigNota[i] < vAsigNota[posPeorAsig])
                posPeorAsig = i;
        }
        
        System.out.printf("Las mejores notas son de %s, con una media de %.2f\n", asignaturas[posMejorAsig], vAsigNota[posMejorAsig] / alumnos.length);
        System.out.printf("Las peores notas son de %s, con una media de %.2f\n", asignaturas[posPeorAsig], vAsigNota[posPeorAsig] / alumnos.length);
    }
}