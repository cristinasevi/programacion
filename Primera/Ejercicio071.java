/*
 Meter en cadena2 el contenido de frase, sustituyendo la subcad1 por la subcad2
 */
package Primera;

public class Ejercicio071 {
    public static void main(String arg[]){
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char subcad1[] = {'e', 'n', ' '};
        char subcad2[] = {'X', 'X', 'X', 'X', 'X'};
        char cadena2[] = new char[150];
        
        int i;
        int k=0;
        for(i=0; i<frase.length; i++){
            cadena2[i] = frase[i];
            if(cadena2[i++] == subcad1[i++]) {
                for(int j=0; j<subcad2.length; j++) {
                    cadena2[k++] = subcad2[j];
                }    
            }
            else {
                cadena2[k++] = frase[i];
            }
        }
        System.out.println(cadena2);
    }
}