/*
 Implementar un método recursivo que reciba un número entero y devuelva la suma de sus dígitos.
 */
package Primera.CristinaSerrano;

public class Ejercicio005 {
    public static void main(String[] args) {
        int resultado = suma(847);
        System.out.println("El resultado es: " + resultado);
    }
    
    public static int suma(int num) {
        if(num == 0) {
            return num;
        }
        else {
            return suma(num/10)+(num%10);
        }
    }
}