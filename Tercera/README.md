# 3ª Evaluación

### Importación de clases

`import java.applet.`

- **AudioClip**: Permite gestionar la reproducción de sonidos en aplicaciones Java.

`import java.awt.`

- **Point**: Representa un punto en un espacio bidimensional con coordenadas (x, y).

`import java.util.`

- **Collections**: Proporciona métodos estáticos para operar sobre colecciones, como listas y conjuntos.


`import java.net.`

- **URL**: Representa una dirección de Internet.
- **MalformedURLException**: Excepción lanzada cuando una URL tiene un formato incorrecto.

### Uso de `getImage` y `getCodeBase`

- **`getCodeBase()`**: Devuelve la URL base desde donde se carga la aplicación o el applet.
- **`getImage(URL base, String location)`**: Carga una imagen desde la ubicación especificada en relación con la URL base.

Ejemplo de uso:
```java
fotogramas[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio01/Sprites/" + lugares[i] + (j+1) + ".gif"); // Ruta y nombre del archivo con extensión
```

### Operador Ternario o Si Inmediato

El operador ternario `? :` en Java permite simplificar expresiones condicionales en una sola línea.

**Sintaxis:**
```java
variable = (condición) ? valor_si_verdadero : valor_si_falso;
```
Ejemplo:
```java
this.valor = (valor > 10) ? 10 : valor;
```
