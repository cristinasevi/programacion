/*
 Meter en cadena2 el contenido de frase, sustituyendo la subcad1 por la subcad2
 */
package Primera;

public class Ejercicio071 {
    public static void main(String arg[]){
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        char subcad1[] = {'e', 'n', ' '};
        char subcad2[] = {'X', 'X', 'X', 'X', 'X'};
        char cadena2[] = new char[150];
        
        int z=0;
        for(int i=0; i<frase.length; i++) {
            if(subcad1[0] == frase[i]) {
                int j = 1;
                
                while((j<subcad1.length) && (frase[i+j] == subcad1[j])) {
                    j++;
                }
                
                if(j==subcad1.length) {
                    for(int k=0; k<subcad2.length; k++)
                        cadena2[z++] = subcad2[k];
                    i += subcad1.length-1;
                }
                else
                    cadena2[z++] = frase[i];
            }
            else{
                cadena2[z++] = frase[i];
            }
        }
        
        System.out.println(cadena2);
    }
}