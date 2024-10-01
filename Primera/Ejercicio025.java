/*
 Mostrar por pantalla las tablas de multiplicar de los 10 primeros números
 */
package Primera;

public class Ejercicio025 {
    public static void main(String arg[]) {
       
        for(int num=1; num<=10; num++){
            System.out.println("Tabla del " + num + ":");
            for(int cont=1; cont<10; cont++)
                System.out.printf("%d * %d = %d\n", num, cont, num*cont);
            System.out.println();
        }
    }
}