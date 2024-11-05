/*
 Meter frase en cadena2, pero sus caracteres se alojarán en orden inverso
 */
package Primera;

public class Ejercicio69 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char[150];
        
        for(int i=(frase.length-1), j=0; i>=0; i--, j++)
            cadena2[j] = frase[i];
        System.out.println(cadena2);
        
        /*
        int i=1;
        for(i=1; i<frase.length; i++)
            cadena2[i] = frase[i];
        for(int j=0; j<frase.length; j++)
            cadena2[i--] = frase[j];    
        System.out.println(cadena2);
        */
    }
}