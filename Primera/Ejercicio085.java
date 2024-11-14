/*
 Combinar las palabras de frase1 y frase2 intercalándolas en frase3
 */
package Primera;

public class Ejercicio085 {
    public static void main(String arg[]){
        String frase1 = "Había vez circo alegraba el ";
        String frase2 = "una un que siempre corazón sin temer jamás ";
        String frase3 = "";
        
        int inicio1 = 0;
        int inicio2 = 0;
        int fin1 = frase1.indexOf(" ");
        int fin2 = frase2.indexOf(" ");
        
        while(fin1 != -1 || fin2 != -1) {
            if(fin1 != -1) {
                frase3 += frase1.substring(inicio1, fin1 + 1);
                inicio1 = fin1 + 1;
                fin1 = frase1.indexOf(" ", inicio1);
            }
            
            if(fin2 != -1) {
                frase3 += frase2.substring(inicio2, fin2 + 1);
                inicio2 = fin2 + 1;
                fin2 = frase2.indexOf(" ", inicio2);
            }
        }
        
        System.out.println(frase3);
    }
}