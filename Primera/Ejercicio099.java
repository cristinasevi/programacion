/*
 Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
 Realizar la media de las notas menores a 5. 
 Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
 */
package Primera;

public class Ejercicio099 {
    public static void main(String[] args) {
        int notas[][] = {
                        {3, 4, 8, 9},
                        {4, 5, 7, 10},
                        {2, 7, 10, 8},
                        {5, 3, 6, 7},
                        {4, 2, 5, 8},
                        };
        String asignaturas[] = {"Programación", "Marcas", "Entornos", "Base Datos"};
        String alumnos[] = {"Alumno1", "Alumno2", "Alumno3", "Alumno4", "Alumno5"};

        // Mostrar por pantalla, cuántos alumnos suspendieron por cada asignatura.
        int cont;
        for(int j=0; j<asignaturas.length; j++) {
            cont = 0;
            for(int i=0; i<notas.length; i++)
                if(notas[i][j] < 5)
                    cont++;
            System.out.printf("En la asignatura %s han suspendido %d alumnos\n", asignaturas[j], cont);
        }

        // Realizar la media de las notas menores a 5.
        double suma = 0;
        int acum = 0;
        for(int i=0; i<notas.length; i++) 
            for(int j=0; j<notas[i].length; j++)
                if(notas[i][j] < 5) {
                    suma += notas[i][j];
                    acum++;
                }
        double media = suma/acum;
        System.out.printf("La media de notas menores a 5 es %.2f\n", media);

        // Mostrar por pantalla, los nombres de los alumnos que obtuvieron una media superior a 5.
        double suma1 = 0;
        double media1 = 0;
        for(int i=0; i<notas.length; i++) {
            suma1 = 0;
            for(int j=0; j<notas[i].length; j++) {
                suma1 += notas[i][j];
            }
            media1 = (suma1 / asignaturas.length);
            if(media1 > 5)
                System.out.printf("El alumno %s ha sacado una media superior a 5, con un %.2f\n", alumnos[i], media1);
        }
    }
}