# 3ª Evaluación

### Importación de clases

`import java.applet.`

- **AudioClip**: Permite gestionar la reproducción de sonidos en aplicaciones Java.

`import java.awt.`

- **Point**: Representa un punto en un espacio bidimensional con coordenadas (x, y).
- **HeadlessException**: Excepción que se lanza cuando se intenta utilizar una funcionalidad gráfica en un entorno sin soporte para interfaz gráfica.

`import java.util.`

- **Collections**: Proporciona métodos estáticos para operar sobre colecciones, como listas y conjuntos.

**Collections.shuffle(cartas)**: Este método es útil para simular mezclas de cartas u ordenar aleatoriamente cualquier lista.

`import java.net.`

- **URL**: Representa una dirección de Internet.
- **MalformedURLException**: Excepción lanzada cuando una URL tiene un formato incorrecto.

### Uso de `getImage`, `getAudioClip` y `getCodeBase`

- **`getCodeBase()`**: Devuelve la URL base desde donde se carga la aplicación o el applet.
- **`getImage(URL base, String location)`**: Carga una imagen desde la ubicación especificada en relación con la URL base.
- **`getAudioClip(URL url)`**: Carga y devuelve un clip de audio desde la URL especificada.

Ejemplo de uso con Imagenes:
```java
fotogramas[i][j] = getImage(getCodeBase(), "Tercera/Ejercicio01/Sprites/" + lugares[i] + (j+1) + ".gif"); // Ruta y nombre del archivo con extensión
```
Ejemplo de uso con Audios:
```java
try {
    error = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/error.wav"));
    acierto = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/correct.wav"));
    exito = getAudioClip(new URL(getCodeBase(), "Tercera/Ejercicio04/sonidos/exito.wav"));
} catch (MalformedURLException e) {}
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

### Configuración de Campos de Texto

En las interfaces gráficas, es común controlar si un campo puede ser editado o está habilitado, esto se usa cuando se quiere evitar que el usuario modifique un campo.

- **apuesta.setEditable(false)**: Hace que no se pueda editar el contenido del campo de texto "apuesta".
- **apuesta.setEnabled(false)**: Bloquea completamente el campo, deshabilitándolo visual y funcionalmente.

### Dibujo de Letras en Casillas

- `g.setColor(color)` y `g.fillRect(x, y, width, height)`: Pinta el fondo de la casilla.
- `g.setColor(Color.BLACK)` y `g.drawRect(x, y, width, height)`: Dibuja el borde de la casilla.
- `g.setFont(new Font("TimesRoman", Font.PLAIN, 24))`: Establece el tipo y tamaño de letra.
- `g.setColor(Color.WHITE)` y `g.drawString(""+valor, x+20, y+40)`: Pinta el valor numérico dentro de la casilla, en color blanco.

