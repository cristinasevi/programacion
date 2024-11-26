/*
 Un número es primo si solamente es divisible por si mismo o por el 1.
 Realiza una función que reciba un entero positivo y devuelva si es primo o no.
 */
package Primera;

public class Ejercicio098 {
    public static void main(String arg[]){
        int num = 17;
        
        if(primo(num))
            System.out.printf("El número %d es primo\n", num);
        else
            System.out.printf("El número %d no es primo\n", num);
    }
    
    public static boolean primo(int num) {
        boolean primo = true;
        
        for(int i=num-1; i>1; i--)
            if(num%i == 0)
                return false;
        return true;
    }
}