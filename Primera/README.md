# 1ª Evaluación

### Debug

Para realizar la depuración del código, sigue estos pasos:
1. Haz clic en el número de la columna que deseas depurar.
2. Presiona `Ctrl + Mayús + F5` para reiniciar la depuración.
3. Utiliza `F8` para ejecutar el código y continuar con la siguiente línea.

### Instanciar - Reservar memoria

Para reservar memoria en Java, se utilizan las siguientes sintaxis:

- Para instanciar un vector unidimensional:
  ```java
  int vector = new int[4]
- Para instanciaruna vector bidimensional:
  ```java
  int tabla[][] = new int[4][4] // se representa como new int[columna][fila]

### Operadores lógicos

- **AND**: representado como `&&`
- **OR**: representado como `||`

### Tipos de datos

**`int`**: Enteros

Representación: %d

**`String`**: Cadenas

Representación: %s 

Se delimitan con comillas dobles (" ")

**`double`**: Decimales 

Representación: %2.f (para formatear con dos decimales)

**`char`**: Caracteres

Representación: %c 

Se delimitan con comillas simples (' ')

### Métodos

- Los nombres de los métodos empiezan en minúscula.
- Los métodos que crees tienes que llamarlos en la función principal `main`.

#### -  Tipos de retorno

**`void`**: no devuelve nada.

**`String`, `int`, `int[]`, `char`...**: Devuelven el tipo de dato especificado.

#### -  Uso del return

- Debes incluir `return` al final de la función si no está definida como `void`; debe devolver el tipo de dato que hayas especificado.
- Cuando se ejecuta la instrucción `return`, la función termina, incluso si hay más instrucciones después de esta.
- Es posible tener más de un `return` en una función, pero no se aconseja debido a la complejidad que puede generar.

### Conversión de caracteres

- **`Character.toUpperCase(char)`**: Este método convierte un carácter en su equivalente en mayúsculas y devuelve el resultado. Por ejemplo:

  ```java
  char letra = 'a';
  char letraMayuscula = Character.toUpperCase(letra); // letraMayuscula será 'A'

- **`Character.toLowerCase(char)`**: Este método convierte un carácter en su equivalente en minúsculas y devuelve el resultado. Por ejemplo:

  ```java
  char letra = 'A';
  char letraMinuscula = Character.toLowerCase(letra); // letraMinuscula será 'a'

### Estructuras de control de bucle

**`for`**:
Se utiliza cuando sabes el número de iteraciones que quieres ejecutar.

**`while`**:
Se utiliza cuando no sabes el número de iteraciones que se necesitarán.

Dentro del bucle `while` no se puede declarar una variable, solo se puede incluir la condición.

### Refactorizar

La refactorización consiste en seleccionar un fragmento de código y encapsularlo en una función. 

1. **Selecciona el código** que deseas refactorizar.
2. Haz clic derecho sobre la selección.
3. Navega a **Refactor**.
4. Selecciona **Introduce** > **Method**.
5. Introduce un nombre para el nuevo método y asegúrate de configurarlo como `public`.

Este proceso ayuda a mejorar la legibilidad y la organización del código, facilitando su mantenimiento y reutilización.

### Operadores de Incremento en Programación

#### Preincrementativo
**Sintaxis:** `++j`

El valor de la variable `j` se incrementa primero y luego se utiliza en la expresión o en el contexto en el que se llame.

#### Posincrementativo
**Sintaxis:** `j++`

El valor de la variable `j` primero se utiliza en la expresión o en el contexto en el que se llame y luego se incrementa.

### Estructura de Control `switch`

La estructura `switch` permite ejecutar diferentes bloques de código según el valor de una expresión específica. Es útil cuando tienes múltiples condiciones que verificar. Elementos que componen un bloque `switch`:

- **`switch`**: Inicia la estructura y evalúa la expresión.
  
- **`case`**: Define una opción o caso. Si el valor de la expresión coincide con el valor del `case`, se ejecutará el bloque de código correspondiente a ese caso.
  
- **`break`**: Termina el bloque del `case` actual. Sin `break`, el código continuará ejecutando los siguientes `case` hasta encontrar un `break` o llegar al final del `switch`.
  
- **`default`**: Define el caso predeterminado, que se ejecuta si ningún otro `case` coincide con la expresión. Es opcional.

```java
switch (variable) {
  case valor1:
    // Código a ejecutar si variable == valor1
    break;
  case valor2:
    // Código a ejecutar si variable == valor2
    break;
  default:
    // Código a ejecutar si ningún caso coincide
}
```
### Funciones de la clase `String`

- **`length()`**: Devuelve la longitud de la cadena (número de caracteres).

 ```java
  String texto = "Hola";
  int longitud = texto.length(); // longitud será 4
```

- **`charAt(int index)`**: Devuelve el carácter que se encuentra en la posición especificada por el índice.

```java
  String texto = "Hola";
  char letra = texto.charAt(1); // letra será 'o'
```

- **`compareTo(String otraCadena)`**: Compara dos cadenas lexicográficamente. Devuelve un número negativo, cero o positivo dependiendo de si la cadena original es menor, igual o mayor que la cadena pasada como parámetro.

 ```java
  String texto1 = "Hola";
  String texto2 = "Mundo";
  int resultado = texto1.compareTo(texto2); // resultado depende de la comparación
```

- **`substring(int start, int end)`**: Devuelve una nueva cadena que contiene los caracteres de la cadena original desde la posición `start` hasta (pero sin incluir) la posición `end`.  
```java
  String texto = "Hola Mundo";
  String subcadena = texto.substring(0, 4); // subcadena será "Hola"
```

- **`replace(char oldChar, char newChar)`**: Reemplaza todas las apariciones de un carácter específico (`oldChar`) en la cadena por otro carácter (`newChar`). Devuelve una nueva cadena con los caracteres reemplazados.  
```java
  String texto = "Hola Mundo";
  String nuevoTexto = texto.replace('o', 'a'); // nuevoTexto será "Hala Munda"
```

- **`replace(String oldString, String newString)`**: Reemplaza todas las apariciones de una secuencia específica de caracteres (`oldString`) en la cadena original por otra secuencia (`newString`). Devuelve una nueva cadena con las secuencias reemplazadas.  
```java
  String texto = "Hola Mundo";
  String nuevoTexto = texto.replace("Mundo", "Java"); // nuevoTexto será "Hola Java"
```

- **`replaceAll(String regex, String replacement)`**: Reemplaza todas las ocurrencias que coincidan con la expresión regular (`regex`) en la cadena original por la cadena especificada (`replacement`). Devuelve una nueva cadena con los reemplazos aplicados.  

```java
  String texto = "Hola     Mundo";
  String nuevoTexto = texto.replaceAll(" +", "-"); // nuevoTexto será "Hola --- Mundo"
  // " +" es una expresión que significa uno o más espacios en blanco consecutivos.
```

- **`indexOf(String str)`**: Devuelve la posición (índice) de la primera aparición de la secuencia de caracteres especificada (`str`) en la cadena. Si no la encuentra, devuelve `-1`.  
```java
  String texto = "Hola Mundo";
  int posicion = texto.indexOf("Mundo"); // posicion será 5
```

- **`concat(String str)`**: Concatena (une) la cadena actual con otra cadena (`str`) y devuelve una nueva cadena resultante de la unión.  
```java
  String saludo = "Hola";
  String mundo = " Mundo";
  String frase = saludo.concat(mundo); // frase será "Hola Mundo"
```

- **`Character.toString(char c)`**: Convierte un carácter (`char`) en una cadena de texto (`String`).  
```java
  char letra = 'A';
  String texto = Character.toString(letra); // texto será "A"
```

### Recursividad

La **recursividad** es una técnica en programación donde una función se llama a sí misma para resolver un problema. Se utiliza comúnmente cuando un problema puede dividirse en subproblemas más pequeños del mismo tipo.

Una función recursiva consta de dos partes principales:
1. **Caso base**: Condición que detiene la recursión para evitar un bucle infinito.
2. **Caso recursivo**: Parte en la que la función se llama a sí misma con un subproblema más pequeño.

#### Ejemplo: Factorial de un número

El factorial de un número \( n \) (representado como \( n! \)) es el producto de todos los números enteros desde 1 hasta \( n \). Puede definirse recursivamente como:
- \( 0! = 1 \) (caso base)
- \( n! = n \times (n-1)! \) (caso recursivo)

**Código:**
```java
public class Recursividad {
    public static void main(String arg[]){
        int resultado = factorial(5);
        System.out.println("El resultado es " + resultado);
    }
    
    public static int factorial(int a) {
        if(a == 1)
            return a;
        else
            return factorial(a-1) * a;
    }
}
```

### Atributos de una clase

Los **atributos** de una clase son variables que se definen directamente dentro de la clase, pero fuera de cualquier método, constructor o bloque. Representan las propiedades o el estado de los objetos creados a partir de esa clase.

- **Ubicación**: Se declaran justo debajo de la definición de la clase (`public class`), pero fuera del método `main` o cualquier otro método.

- **Alcance**: Son **variables globales** que pueden ser accedidas y modificadas por cualquier método dentro de la clase. Sin embargo, su visibilidad fuera de la clase depende del modificador de acceso utilizado.

#### Modificadores de acceso comunes:

- **`public`**: El atributo es accesible desde cualquier clase.
- **`private`**: Solo accesible dentro de la propia clase.
- **`protected`**: Accesible dentro de la misma clase, sus subclases y otras clases del mismo paquete.
- **Sin modificador** (paquete): Accesible desde clases dentro del mismo paquete.

#### Ejemplo:

```java
public class Persona {
    // Atributos de la clase
    private String nombre;  // Solo accesible dentro de esta clase
    public int edad;        // Accesible desde cualquier clase
    protected double altura; // Accesible desde el mismo paquete o subclases

    // Constructor
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;  // Usamos "this" para diferenciar entre el atributo y el parámetro
        this.edad = edad;
        this.altura = altura;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }
}
```

### Constantes

Las constantes se declaran utilizando el modificador **`final`**. Este modificador indica que el valor de la variable no puede cambiar después de su inicialización.

#### Características:
- Se utiliza principalmente para definir valores que no deben ser modificados durante la ejecución del programa.
- Los nombres de las constantes se escriben en **mayúsculas** y separar palabras con guiones bajos (`_`) para diferenciarlas de otras variables.

#### Ejemplo:
```java
public class Ejemplo {
    final int ESCANOS = 7; // Declaración de una constante
}
```

---
