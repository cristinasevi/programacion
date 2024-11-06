/*
 Eliminar la subcadena de la cadena, tantas veces como aparezca
 */
package Primera;

public class Ejercicio074 {
    public static void main(String arg[]){
        char cadena[] = {'e', 'e', 'n', ' ', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'L', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a'};
        char subCadena[] = {'e', 'n', ' '};
        
        int k=0;
        for(int i=0; i<cadena.length; i++) {
            if(subCadena[0] == cadena[i])
                for(int j=0; j<subCadena.length; j++)
                    cadena[i] = subCadena[k+1];
        }   
        
        System.out.println(cadena);
    }
}