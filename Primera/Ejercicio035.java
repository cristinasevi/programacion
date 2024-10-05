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
                vAlumnosNota[i] += (double) notas[i][j] / asignaturas.length;
                vAsigNota[j] += (double) notas[i][j] / alumnos.length;
            }
        }
       
        double mejorNotAlum = vAlumnosNota[0];
        double peorNotAlum = vAlumnosNota[0];
        String mejorAlum = alumnos[0];
        String peorAlum = alumnos[0];
       
        for (int i = 1; i < alumnos.length; i++) {
            if (vAlumnosNota[i] > mejorNotAlum) {
                mejorNotAlum = vAlumnosNota[i];
                mejorAlum = alumnos[i];
            }
            if (vAlumnosNota[i] < peorNotAlum) {
                peorNotAlum = vAlumnosNota[i];
                peorAlum = alumnos[i];
            }
        }
        
        double mejorNotAsig = vAsigNota[0];
        double peorNotAsig = vAsigNota[0];
        String mejorAsig = asignaturas[0];
        String peorAsig = asignaturas[0];
        
        for (int j = 1; j < asignaturas.length; j++) {
            if (vAsigNota[j] > mejorNotAsig) {
                mejorNotAsig = vAsigNota[j];
                mejorAsig = asignaturas[j];
            }
            if (vAsigNota[j] < peorNotAsig) {
                peorNotAsig = vAsigNota[j];
                peorAsig = asignaturas[j];
            }
        }
        
        System.out.printf("El alumno con mejor media es %s con una media de %.2f\n", mejorAlum, mejorNotAlum);
        System.out.printf("El alumno con peor media es %s con una media de %.2f\n", peorAlum, peorNotAlum);
        System.out.printf("La asignatura con mejor media es %s con una media de %.2f\n", mejorAsig, mejorNotAsig);
        System.out.printf("La asignatura con peor media es %s con una media de %.2f\n", peorAsig, peorNotAsig);
    }
}