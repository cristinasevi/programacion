/*
 Repartir las palabras de frase1 alternativamente en fraseA y fraseB
 */
package Primera;

public class Ejercicio089 {
    public static void main(String arg[]){
        String frase1 = "Había una vez un circo ";
        String fraseA = "";
        String fraseB = "";
        
        boolean alternar = true;
        alternar = !alternar;
        
        int inicio = 0;
        int fin = frase1.indexOf(" ");
        
        while(fin != -1) {
            if(fin != -1) {
                fraseA += frase1.substring(inicio, fin + 1);
                fraseB += fraseA.substring(inicio, fin + 1);
                inicio = fin + 1;
                fin = frase1.indexOf(" ", inicio);
            }
        }
        
        System.out.println(fraseA + " " + fraseB);
    }
}