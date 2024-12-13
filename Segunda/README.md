# 2ª Evaluación

## Programación Orientada a Objetos (POO)

### Clases y Atributos

- **Clase**: Es una definición que contiene atributos y métodos. Los atributos representan las características o propiedades de la clase.
- **Atributos**: Son las variables que pertenecen a una clase y que describen sus características.

### Métodos

Los métodos son las funciones dentro de una clase que permiten realizar operaciones sobre los atributos de la misma.

#### Tipos de Métodos

##### 1. Método Constructor
- Instancia objetos de la clase.
- No devuelve ningún valor (ni siquiera `void`).
- Siempre se llama igual que la clase.

##### 2. Método Getter
- Devuelve el valor de un atributo.
- Su propósito es permitir el acceso controlado a los atributos privados de una clase.

##### 3. Método Setter
- Modifica el valor de un atributo.
- Se utiliza para cambiar el estado de un atributo privado de manera controlada.

### Modificadores

#### Encapsulamiento y Visibilidad

- **`private`**: Los atributos privados están protegidos y no se pueden acceder directamente desde fuera de la clase. Para interactuar con ellos, se utilizan los métodos `getter` y `setter`.
- **`public`**: Permite que un atributo o método sea accesible desde cualquier parte del programa.
- **`this`**: Es una referencia al objeto actual de la clase. Se utiliza para diferenciar los atributos de los parámetros cuando tienen el mismo nombre.

#### Modificadores Especiales

- **`abstract`**: Define una clase o método abstracto. Una clase abstracta no puede ser instanciada directamente. Se utiliza para definir una base común para otras clases. Los métodos abstractos deben ser implementados por las subclases.
**Ejemplo**:
```java
abstract class Animal {
  // Método abstracto: obliga a las subclases a implementarlo
  abstract void habla();
}

public class Perro extends Animal {
    public void habla() {
        System.out.println("El perro ladra");
    }
}
```
- **`final`**: Declara una constante (cuando se aplica a variables) o evita la herencia (cuando se aplica a clases) o la sobreescritura (cuando se aplica a métodos).
**Ejemplo**:
```java
public final double PI = 3.14159; // Constante
```

### Herencia

- **`extends`**: Permite que una clase amplíe otra clase, heredando sus atributos y métodos.
- **`super`**: Se utiliza para acceder a los atributos y métodos de la superclase. Es especialmente útil dentro del constructor de una subclase para inicializar los atributos heredados.

#### Ejemplo:
```java
public class Chalet extends Casa {
    private double tamanyoJardin; // Encapsulamiento del atributo

    // Constructor de la subclase
    public Chalet(String direccion, int nM, String material, int nH, double tamanyoJardin) {
        super(direccion, nM, material, nH); // Llama al constructor de la superclase
        this.tamanyoJardin = tamanyoJardin; // Atributo propio de la subclase
    }

    public void mostrarDetalles() {
        super.mostrar(); // Llama al método de la superclase
        System.out.println("Tamaño del jardín: " + tamanyoJardin);
    }
}
```

### Manejo de Excepciones

Las excepciones son mecanismos para manejar errores en tiempo de ejecución. Se generan automáticamente cuando ocurre un error o se pueden lanzar manualmente con `throw`.

#### Conceptos Clave

- **`throws Exception`**: Declara que un método puede lanzar una excepción, lo que obliga al código que lo llama a manejar esa excepción.
- **`throw`**: Lanza una excepción manualmente.
- **`try`**: Define un bloque de código que puede generar excepciones.
- **`catch`**: Maneja las excepciones lanzadas dentro de un bloque `try`.

#### Ejemplo:
```java
public Nif(int dni, char letra) throws Exception {
    this.dni = dni;
    if(letra != tabla[dni%23])
        throw new Exception("Has introducido mal la letra"); 
    this.letra = letra;
}
```
En este ejemplo, si la letra no coincide con el valor esperado, se lanza una excepción con un mensaje específico.

### Manejo de Excepciones con `try` y `catch`

```java
try {
    System.out.println("Hola" + (20 / 0));
} catch (ArithmeticException e) {
    System.out.println("Se ha producido un ERROR: " + e);
}
```
En este caso:
- El bloque `try` intenta ejecutar un código que podría causar una excepción.
- Si ocurre una excepción, el bloque `catch` la maneja, imprimiendo un mensaje de error.

### Notas Adicionales:
- Las excepciones heredan de la clase `Exception`.
- Puedes personalizar el manejo de errores mediante múltiples bloques `catch` o mediante excepciones definidas por el usuario.















### Creación Automática de Métodos

Puedes generar métodos de manera automática en algunos entornos de desarrollo integrado (IDE), como sigue:

1. Haz clic derecho en el editor de código.
2. Selecciona la opción **Insert Code**.
3. Escoge entre Constructor, Getter o Setter.

### Archivo Ejecutable

- Se crean variables para almacenar objetos de las clases.
- Los objetos se instancian utilizando los constructores definidos en las clases.
- Se accede a los métodos `get` y `mostrar` para interactuar con los atributos y mostrar información sobre los objetos creados.

#### Ejemplo:
```java
public class Ejecutable {
    public static void main(String[] args) {
        Casa casa1, casa2;
        Chalet chalet1;

        // Instanciamos con todos los atributos del método constructor
        casa1 = new Casa("C/. María Auxiliadora nº59", 1200, "Ladrillo", 200);
        casa2 = new Casa("Plaza del Pilar Nº1", 2000, "Piedra");

        chalet1 = new Chalet("Avd. de la Ilustración Nº3", 2000, "Ladrillo", 5, 80, false);

        // Llamamos a los métodos a través del objeto
        System.out.println(casa1.getDireccion());
        System.out.println(casa2.getDireccion());

        casa1.mostrar();
        casa2.mostrar();

        chalet1.mostrar();
    }
}
```

---
