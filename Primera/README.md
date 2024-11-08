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
  int tabla[][] = new int[4][] // se representa como new int[columna][fila]

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

- Los nombres de lo métodos empiezan en minúscula.
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

---
