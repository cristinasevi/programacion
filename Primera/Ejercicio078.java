/*
 Ordenar el vector en orden alfabético
 */
package Primera;

public class Ejercicio078 {
    public static void main(String arg[]){
        String nombres[] = {"Pepe", "Juan", "María", "Antonio", "Luisa"};
        
        String inter;
        
        for(int i=0; i<nombres.length-1; i++){
            for(int j=nombres.length-1; j>i; j--){  
                if(nombres[j].compareTo(nombres[j - 1]) < 0){
                    inter = nombres[j];
                    nombres[j] = nombres[j - 1];
                    nombres[j - 1] = inter;
                }
            }
        }
        
        for(int i=0; i<nombres.length; i++) 
            System.out.print(nombres[i] + " ");
    }
}

/*
 compareTo() = es una función de la clase String, que se utiliza para comparar
*/