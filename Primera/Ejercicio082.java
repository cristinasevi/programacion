/*
 Reemplazar una subcadena por ella misma en mayúsculas
 Función concat
 */
package Primera;

public class Ejercicio082 {
    public static void main(String arg[]){
        String frases[] = {"en un lugar", " lugar en La Mancha", ", de cuyo nombre", " no quiero acordarme"};
        String subCadena = "en";
        
        for(int i=0; i<frases.length; i++) {
            frases[i] = frases[i].replace(subCadena, subCadena.toUpperCase());
            System.out.print(frases[i]);
        }
        
        System.out.println();
        
        for(int i=0; i<frases.length; i++) {
            frases[i] = frases[i].concat("HOLA");
            System.out.print(frases[i]);
        }
    }
}

/*
 concat() --> concatena caracteres o cadenas
*/