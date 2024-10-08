/*
 Sacar el listado de DIECES
 */
package Primera;

public class Ejercicio036 {
    public static void main(String arg[]) {
        int notas[][] = { {7, 9, 3, 8}, 
                          {10, 9, 9, 8},
                          {9, 10, 7, 1},
                          {3, 10, 5, 6},
                          {8, 5, 4, 5}  };
        String alumnos[] = {"Viviana", "Palazón", "Javi", "Vicente", "Álvaro"};
        String asignaturas[] = {"Programación", "Leng.Marcas", "Bases.Datos", "Entornos.Desarrollo"};
        
        System.out.println("Listado de DIECES: ");
        for(int i=0; i<alumnos.length; i++)
            for(int j=0; j<asignaturas.length; j++)
                if(notas[i][j] == 10) 
                    System.out.printf("%s en %s\n", alumnos[i], asignaturas[j]);
    }
}