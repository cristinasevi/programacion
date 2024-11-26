/*
 Ley D'Hondt
 */
package Primera;

public class Ejercicio097 {
    public static void main(String arg[]){
        int votos[] = {119421, 157420, 57398, 46645, 91978};
        String partidos[] = {"PP", "PSOE", "Podemos", "Ciudadanos", "VOX"};
        int divisor[] = {1, 1, 1, 1, 1};
        final int ESCANOS = 7; // modificador final, es para declarar una constante (su valor no cambia)
        // los nombres de las constantes se escriben en MAYUSCULAS
        
        int max = 0;
        
        for(int i=0; i<ESCANOS; i++) {
            max = 0;
            for(int j=0; j<votos.length; j++) {
                if(votos[j]/divisor[j] > votos[max]/divisor[max])
                    max = j;
            }
            divisor[max] += 1;
        }
        
        for(int i=0; i<votos.length; i++) {
            System.out.printf("%s tiene %d escaños\n", partidos[i], divisor[i]-1);   
        }   
    }
}