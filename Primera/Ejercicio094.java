/*
 Implementar una función que devuelva el número de campanadas que se han
 escuchado a lo largo del día, hasta la hora que le pasemos.
 Teniendo en cuenta que a las 13 horas se toca 1, a las 14 horas 2, ...
 Implementar la función dos veces, una con recursividad y la otra sin ella.
 */
package Primera;

public class Ejercicio094 {
    public static void main(String arg[]){
        System.out.printf("Se han tocado %d campanadas a lo largo del día\n", campanadas1(13));
        
        System.out.printf("Se han tocado %d campanadas a lo largo del día\n", campanadas2(13));
    }
    
    public static int campanadas1(int hora) {
        int acum = 0;
        for(int i=1; i<=hora; i++)
            if(i > 12)
                acum += i-12;
            else
                acum += i;
        return acum;
    }
  
    public static int campanadas2(int hora) {
        if(hora == 1) 
            return hora;
        if(hora > 12) {
            return campanadas2(hora-1) + (hora-12);
        }
        else
            return campanadas2(hora-1) + hora;
    }
}