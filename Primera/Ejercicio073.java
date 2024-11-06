/*
 Eliminar de frase el caracter
 */
package Primera;

public class Ejercicio073 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char caracter = 'n';
        
        int longitud = frase.length;
        for(int i=0; i<longitud; i++)
            if(frase[i] == caracter) {
                for(int z=i; z<longitud-1; z++)
                    frase[z] = frase[z+1];
                frase[longitud-1] = ' ';
                longitud--;
            }
        
        System.out.println(frase);
                
        /*int k=0;
        for(int i=0; i<frase.length; i++)
            if(frase[i] != caracter)
                frase[k++] = frase[i];
         
        for(int i=k; i<frase.length; i++)
            frase[i] = ' ';
        
        System.out.println(frase);
        */
    }
}