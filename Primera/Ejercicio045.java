/*
 Funciones o Métodos
 */
package Primera;

public class Ejercicio045 {
    public static void main (String arg[]){
        String palabras;  
        escribir();
        hablar("Buenos días");
        animalHabla("Me llamo Toby","Guau, guau");
        palabras = concatenar("En un lugar ", "de La Mancha");
        System.out.println(palabras);
        System.out.printf("La suma de 345 + 55 es %d\n", suma(345, 55));
    }
    
    public static void escribir(){
        System.out.println("Hola!");
    }
    
    public static void hablar(String frase){
        System.out.println(frase);
    }
    
    public static void animalHabla(String frase, String onomatopeya){
        System.out.println(frase + " : " + onomatopeya);
    }
    
    public static String concatenar(String frase1, String frase2){
        return (frase1 + frase2);
    }
    
    public static int suma(int num1, int num2){
        return(num1 + num2);
    }
}

/*
 Los nombres de lo métodos empiezan en minúscula
 Los métodos que crees tienes que llamarlos en la función principal: main

 void --> no devuelve nada
 String --> devuelve un string
 int --> devuelve un entero
 
 return --> tienes que poner lo que tiene que devolver que hayas definido, 
 ejemplo: si has puesto que es String tienes que ponerlo entre comillas

 cuando se ejecuta la función return, la función se acaba aunque haya funciones después
 en una función se puede poner más de un return (pero no se aconseja)
*/