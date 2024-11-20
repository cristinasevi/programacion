/*
 Mostrar las campanadas que se han dado a lo largo del día
 */
package Primera;

public class Ejercicio094 {
    public static void main(String arg[]){
        int resultado = campanadas(13);
        System.out.printf("Se han tocado %d campanadas a lo largo del día\n", resultado);
    }
    
    public static int campanadas(int hora) {
        if(hora == 1) 
            return hora;
        if(hora > 12) {
            hora -= 12;
            return hora;
        }
        else
            return campanadas(hora-1) + hora;
    }
}