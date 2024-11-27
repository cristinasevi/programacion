/*
 En una variable introducir un número de 3 cifras y mostrar por pantalla ese
 mismo número pero con letras. No tengáis en cuenta los números 11, 12, 13, 14
 y 15, que se lea diez y uno, diez y dos, diez y tres…
 */
package Primera;

public class Ejercicio100 {
    public static void main(String[] args) {
        int num = 123;
        
        /*
        String unidades[] = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String decenas[] = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String centenas[] = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
        
        int unidad = num%10;
        int decena = (num%100) / 10;
        int centena = num/100;
        
        if(centena > 0)
            System.out.print(centenas[centena] + " ");
        if(decena > 0)
            System.out.print(decenas[decena] + " y ");
        if(unidad > 0)
            System.out.print(unidades[unidad] + "\n");
        */
        
        String valores[][] = {{"", " y uno", "y dos", "y tres", " y cuatro", " y cinco", " y seis", " y siete", " y ocho", " y nueve"}, 
                              {"", "diez", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"}, 
                              {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"}};
       
        letras(valores, 456, 0);
    }
    
    public static void letras(String valores[][], int num, int posicion) {
        if(num > 0) {
            letras(valores, num/10, posicion+1);
            System.out.print(valores[posicion][num%10]);
        }
    }
}