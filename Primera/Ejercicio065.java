/*
 Tenemos que buscar de cada palabra donde empieza y donde acaba.
 */
package Primera;

public class Ejercicio065 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};

        for(int i=0; i<frase.length; i++)
            if(frase[i] == ' ')
                System.out.println(frase[i]);
    }
}