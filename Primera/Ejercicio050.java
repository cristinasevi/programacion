/*
 Ordenar todos los vectores de la tabla utilizando la función ordenar
 */
package Primera;

public class Ejercicio050 {
    public static void main (String arg[]){
        int salarios[][] = { {700, 900, 1300, 800, 790, 850},
                             {1000, 950, 1080, 1070, 1200, 1100},
                             {1300, 930, 1200, 1170, 1000, 1000},
                             {1500, 1950, 1880, 1978, 2200, 2100} };
        
        for(int i=0; i<salarios.length; i++)
            ordenar(salarios[i]);
        
        for(int i=0; i<salarios.length; i++) 
            for(int j=0; j<salarios.length; j++) 
                System.out.print(salarios[i][j] + " ");
    }
    
    public static void ordenar (int vect[]){
        int inter;
        for(int i=0; i<vect.length-1; i++){
            for(int j=vect.length-1; j>i; j--){       
                if(vect[j] < vect[j-1]){
                    inter = vect[j];
                    vect[j] = vect[j-1];
                    vect[j-1] = inter;
                }
            }
        }
    }
}