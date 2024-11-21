/*
 Ir desglosando el número según su posición si es unidad, decena, centena...
 Hacerlo con recursividad
 */
package Primera;

public class Ejercicio095 {
    public static void main(String arg[]){
        String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
        int numero = 256809;
        
        calculo(medidas, numero, 0);
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
}