/*
 Clase -> son definiciones en los que añades atributos
 Los métodos se encargan de cambiar el valor de esos atributos
 Método constructor -> instancia objetos de la clase, no devuelve nada (ni siquiera void) y se llama igual que la clase
 Método getter -> devuelve valor de un atributo 
 Método setter -> modifica el valor del atributo 
 */
package Segunda.Ejercicio01;

public class Casa {
    // private -> encapsulamiento (no te deja acceder directamente, tendrías que hacerlo con un get)
    private String direccion; 
    private double numMetros;
    private String material;
    private int numHabitaciones;
    
    // Método constructor
    public Casa(String direccion, double nM, String material, int nH) {
        // this -> el objeto de la clase
        this.direccion = direccion; 
        numMetros = nM;
        this.material = material;
        this.numHabitaciones = nH;
    }
    public Casa(String direccion, double nM, String material) {
        this.direccion = direccion; 
        numMetros = nM;
        this.material = material;
        this.numHabitaciones = 0;
    }
    
    // Método get
    public String getDireccion() {
        return this.direccion;
    }
    public double getNumMetros() {
        return numMetros;
    }
    public String getMaterial() {
        return material;
    }
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    // Método set
    public void setDireccion(String dir) {
        direccion = dir;
    }
    public void setNumMetros(double nM) {
        numMetros = nM;
    }
    public void setMaterial(String mat) {
        material = mat;
    }
    public void setNumHabitaciones(int nH) {
        numHabitaciones = nH;
    }
    
    // Método que muestre por pantalla una frase con las características de una casa
    public void mostrar() {
        System.out.printf("Dirección: %s, número de metros: %.2f, material: %s, número de habitaciones: %d\n", direccion, numMetros, material, numHabitaciones);
    }
}

/*
 Crear Métodos automáticamente: 
 Boton detecha -> Insert Code -> Constructor o Getter o Setter
*/