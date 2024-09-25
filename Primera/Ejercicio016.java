/*
 Obtener el valor mayor y el menor de un vector de enteros
 */
package Primera;

public class Ejercicio016 {
    public static void main (String arg[]){
        int datos[] = {-17, -33, -4, -95, -170};
        int mayor = datos[0]; 
        int menor = datos[0];
        
        // Sacar el número mayor y menor
        for(int i=1; i<datos.length; i++){
            if(datos[i] > mayor)
                mayor  = datos[i]; 
            if(datos[i] < menor)
                menor  = datos[i]; 
        }
        System.out.printf("El número mayor es %d y el menor es %d\n", mayor, menor);
        
        // Sacar la posición donde se encuentra el número mayor y el menor
        int posMayor = 0;
        int posMenor = 0;
        
        for(int i=1; i<datos.length; i++){
            if(datos[i] > datos[posMayor])
                posMayor = i;
            if(datos[i] < datos[posMenor])
                posMenor = i;            
        }
        System.out.printf("La posición donde se encuentra el número mayor es %d y la del menor es %d\n", posMayor, posMenor); 
    }
}