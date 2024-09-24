/*
 Mostrar por pantalla el valor del elemento mayor de un vector
 */
package Primera;

public class Ejercicio015 {
    public static void main (String arg[]){
        int datos[] = {-17, -33, -400, -95, -170};
        int mayor = datos[0]; 
        /* inicializar la variable 'mayor' con el primer elemento del vector, 
        así se tomará en cuenta cualquier valor que pueda ser mayor */
        
        for(int i=0; i<datos.length; i++)
            if(datos[i] > mayor)
                mayor = datos[i];
        System.out.println("El número mayor del vector es: " + mayor);  
    }
}