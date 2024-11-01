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

---
