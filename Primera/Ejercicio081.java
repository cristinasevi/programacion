/*
 Función charAt
 Buscar cuántas 'a' hay en frase
 */
package Primera;

public class Ejercicio081 {
    public static void main(String arg[]){
        String frase[] = {"En un lugar", " lugar de La Mancha", ", de cuyo nombre", " no quiero acordarme"};
        int cont = 0;
        frase[0].charAt;
        
        for(int i=0; i<frase.length; i++)
            if(frase.charAt(i) == 'a')
                cont++;
        
        System.out.printf("En la frase aparecen %d 'a'\n", cont);
    }
}