/*
 Tenemos una cadena de caracteres cargada con palabras, cada palabra 
 está separada de la siguiente por un espacio en blanco.
 Modificar la cadena de manera que cada palabra quede con su 
 primer y último caracter en mayúsculas.
 */
package Primera;

public class Ejercicio075 {
    public static void main(String arg[]){
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'm', 'a', 'n', 'c', 'h', 'a', ' '};
        
        int inicio = 0;

        for(int i=0; i<frase.length; i++) {
            if(frase[i] == ' '){
                frase[inicio] = Character.toUpperCase(frase[inicio]);
                    frase[i -1] = Character.toUpperCase(frase[i-1]);
                    inicio=i+1;
            }
        } 
        
        System.out.println(frase);
        
        /*
        int inicio = 0, fin = 0;
        
        while(fin < frase.length) {
            while(frase[fin] != ' ')
                fin++;
            frase[inicio] = Character.toUpperCase(frase[inicio]);
            frase[fin-1] = Character.toUpperCase(frase[fin-1]);
            
            inicio = fin = fin + 1;
        }
       
        System.out.println(frase);
        */
    }
}