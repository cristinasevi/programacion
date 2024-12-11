/*
 La clase Animal tiene los atributos generales de todos
 */
package Segunda.Ejercicio02;

abstract class Animal {
    // abstract -> cuando no se quiera permitir instanciar objetos de esa clase
    int ID;
    String fnac;
    boolean vacunado;
    private String nombre;

    // Método constructor
    public Animal(int ID, String fnac, boolean vacunado, String nombre) {
        this.ID = ID;
        this.fnac = fnac;
        this.vacunado = vacunado;
        this.nombre = nombre;
    }
    
    // Método get
    public String getNombre() {
        return nombre;
    }
    
    // Método set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    abstract void habla();
    // obliga a que todas las subclases de esta clase implementen este método
}