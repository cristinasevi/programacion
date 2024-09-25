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
        
        // Sacar el número mayor
        for(int i=1; i<datos.length; i++) // empieza desde posición 1, porque la 0 está guardada en 'mayor'
            if(datos[i] > mayor)
                mayor = datos[i];
        System.out.println("El número mayor del vector es: " + mayor);  
        
        // Sacar la posición donde se encuentra el número mayor
        int posMayor = 0;
        
        for(int i=1; i<datos.length; i++) 
            if(datos[i] > datos[posMayor])
                posMayor = i;
        System.out.println("La posición donde se encuentra el número mayor del vector es: " + posMayor);  
    }
}