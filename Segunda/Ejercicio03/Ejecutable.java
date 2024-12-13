/*

 */
package Segunda.Ejercicio03;

public class Ejecutable {
    public static void main(String[] args) throws Exception{
        Nif persona1, persona2;
        
        persona1 = new Nif(73515833);
        persona2 = new Nif(73515833, 'T');
        
        try {
            System.out.println("Hola" + (20/0));
        }
        catch(ArithmeticException e) {
            System.out.println("Se ha producido un ERROR: " + e);
        }
        
        persona1.mostrar();
        persona2.mostrar();
    }
}

/*
 Exception -> cuando se produce un error en la ejecución del programa, se genera 
 automáticamnte, se instancia un objeto de una de las subclases de la clase Exception.
    
 try -> somete a tratamiento de exceptions. Tiene que ir acompañado de un catch.
    
 catch -> espera recibir un parámetro de lo que tiene que hacer al recibir una exception.

 throw -> lanza exception.
*/