/*
 Ir desglosando el número según su posición si es unidad, decena, centena...
 Hacerlo con recursividad
 */
package Primera;

public class Ejercicio095 {
    /*
     Atributos de la clase: (están debajo de public class, no están metidos en el public static)
     Son variables globales que todas las clases pueden acceder a ellas
    */
    public static String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
    
    public static void main(String arg[]){
        
        int numero = 256809;
        
        calculo(medidas, numero, 0);
        
        System.out.println("----------------------");
        
        mostrar(256809, 0);
    }
    
    public static void calculo(String medidas[], int numero, int posicion) {
        if(numero == 0)
            return;
        else {
            calculo(medidas, numero/10, posicion+1);
            int resto = numero%10;
            System.out.printf("%d %s\n", resto, medidas[posicion]);
        }
    }
    
    public static void mostrar(int numero, int i) {
        if(numero > 0) {
            // System.out.println((numero%10) + " " + medidas[i]); // si pones aquí el print, imprime en orden directo
            mostrar(numero/10, i+1);
            System.out.println((numero%10) + " " + medidas[i]); // si pones aquí el print, imprime en orden contrario
        }
    }
}