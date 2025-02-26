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

#### Constantes

Las constantes se deben escribir en mayúsculas, separando las palabras con guiones bajos (`_`).
```java
public static final int FILAS = 6;
public static final int COLUMNAS = 8;
```

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

#### Math.abs()

Es un método de la clase `Math` que devuelve el valor absoluto de un número. Es decir, convierte cualquier valor negativo en su equivalente positivo.

**Sintaxis**:
```java
int resultado = Math.abs(valor);
```
**Ejemplo**:
```java
int anchura, altura;
anchura = Math.abs(finX - inicioX);
altura = Math.abs(finY - inicioY);
```

#### Math.random()

Es un método de la clase `Math` que devuelve un número decimal aleatorio entre 0.0 y 1 pero sin incluir el 1. Para obtener valores en un rango específico, se debe multiplicar el resultado y convertirlo a entero si es necesario.

**Sintaxis**:
```java
int resultado = ((int)(Math.random());
```
**Ejemplo**:
```java
int radio = ((int)(Math.random()*30)+20); // valor entre 20 y 50 sin incluir 50
```

#### Parsear

Parsear es el proceso de convertir un dato de un tipo a otro.

**Ejemplos**:
```java
int radio = ((int)(Math.random()*30)+20); // Se convierte el dato de float a int
int numero = Integer.parseInt("123"); // Convierte una cadena en un entero
float decimal = Float.parseFloat("3.14"); // Convierte una cadena en un número decimal
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

### Importación de clases

`import java.applet.`

- **Applet**: Clase base para crear un applet, que es una aplicación gráfica que se ejecuta dentro de un navegador.

`import java.util.`

- **Random**: Clase que contiene métodos para generar números aleatorios.
  - **`nextInt()`**: Método que devuelve un número entero aleatorio.
- **List**: Interfaz que representa una lista ordenada de elementos.
- **ArrayList**: Implementación de la interfaz `List` basada en una matriz redimensionable. Permite almacenar elementos de forma dinámica.
- **ConcurrentModificationException**: Excepción que se lanza cuando se detecta una modificación concurrente en una colección mientras se itera sobre ella con un iterador no seguro.

`import java.awt.`

#### Ventanas y Contenedores
- **Frame**: Clase base para crear una ventana. Permite agregar componentes como botones, paneles y otros elementos gráficos.
  - `BorderLayout`: distribución que los elementos los ubica norte, sur, este, oeste y centro.
  - `LinearLayout`: ubica los elementos en línea.
- **Panel**: Contenedor que organiza y agrupa otros componentes.

#### Diseño y Estilo
- **GridLayout**: Organiza los componentes en una cuadrícula, dividiendo el espacio en un número de filas y columnas.
- **FlowLayout**: Organiza los componentes de forma secuencial (de izquierda a derecha). Los elementos se reubican en nuevas líneas cuando no hay suficiente espacio horizontal.
- **Font**: Clase que permite manejar estilos y tamaños de fuentes para el texto en componentes gráficos.
- **Color**: Maneja colores en gráficos. Espera recibir 3 parámetros entre 0 y 255 (RGB).
  Ejemplos: `Color.BLACK`, `Color.BLUE`, `Color.CYAN`, `Color.DARK_GRAY`, `Color.GRAY`, `Color.LIGHT_GRAY`, `Color.MAGENTA`, `Color.ORANGE`, `Color.PINK`, `Color.RED`, `Color.YELLOW`.

#### Interacción y Eventos
- **Event**: Clase que maneja los eventos (acciones) que se producen dentro de la interfaz.
- **Cursor**: Representa el cursor en una aplicación gráfica. Puedes personalizar el cursor para que cambie dependiendo del contexto (por ejemplo, una mano, un texto, una cruz...).
  Ejemplos: `Cursor.CROSSHAIR_CURSOR`, `Cursor.DEFAULT_CURSOR`, `Cursor.E_RESIZE_CURSOR`, `Cursor.HAND_CURSOR`, `Cursor.MOVE_CURSOR`, `Cursor.NE_RESIZE_CURSOR`, `Cursor.NW_RESIZE_CURSOR`, `Cursor.N_RESIZE_CURSOR`,`Cursor.TEXT_CURSOR`, `Cursor.WAIT_CURSOR`.

#### Componentes Gráficos
- **Graphics**: Clase utilizada para dibujar en la ventana (por ejemplo: formas geométricas).
- **Button**: Clase que representa un botón que los usuarios pueden presionar.
- **Label**: Muestra texto estático en la interfaz gráfica.
- **TextArea**: Representa un área de texto donde los usuarios pueden escribir múltiples líneas.
- **FileDialog**: Abre un cuadro de diálogo que permite al usuario seleccionar un archivo para abrir o guardar.
- **Canvas**: Área donde se pueden realizar dibujos personalizados utilizando gráficos. Permite crear gráficos, imágenes o formas dentro de la interfaz gráfica.
- **Image**: Representa una imagen. Puedes cargar imágenes desde archivos y manipularlas en aplicaciones gráficas.
- **Rectangle**: Representa y maneja rectángulos en coordenadas bidimensionales (X, Y) con un ancho (width) y una altura (height).

#### Menús
- **MenuBar**: Crea una barra de menús, que puede contener menús como "Archivo", "Editar", etc.
- **Menu**: Crea un menú dentro de una barra de menús. Los elementos de un menú son de tipo `MenuItem`.
- **MenuItem**: representa un elemento dentro de un menú. Un `MenuItem` puede ejecutar una acción cuando el usuario lo selecciona.

#### Componentes de Entrada de Datos
- **TextField**: Campo de texto de una sola línea donde los usuarios pueden escribir. Permite obtener y establecer texto, así como controlar su visibilidad y tamaño.
- **Choice**: Cuadro de selección desplegable que permite al usuario elegir una opción de una lista de elementos predefinidos.
- **List**: Lista de opciones donde los usuarios pueden seleccionar elementos.
Es similar a `Choice` pero permite ver más de una opción a la vez.
- **Checkbox**: Cuadro de verificación que puede estar marcado o desmarcado. Permite al usuario seleccionar o deseleccionar una opción.

`import java.io.`

#### Lectura de Archivos
- **DataInputStream**: Permite leer datos primitivos (como enteros, flotantes o caracteres) de un flujo de entrada (generalmente un archivo).
- **FileInputStream**: Clase para leer bytes de un archivo. Suele utilizarse para leer archivos binarios.

#### Escritura de Archivos
- **FileOutputStream**: Clase para escribir bytes en un archivo. Es útil para crear o modificar archivos binarios.
- **DataOutputStream**: Permite escribir datos primitivos en un flujo de salida, como un archivo.

#### Manejo de Errores
- **FileNotFoundException**: Excepción que se lanza cuando un archivo no se encuentra o no se puede abrir.
- **IOException**: Excepción general para manejar errores relacionados con entrada y salida de datos (como problemas al leer o escribir en archivos).


### Métodos en el Frame

#### Creación de instancias de clases

```java
Panel panel = new Panel();  
Button boton1 = new Button("Siguiente");
```

#### Agregar objetos al Frame

```java
panel.add(boton1); // Agrega el boton1 al panel
this.add("South", panel); // Agrega el panel al sur del Frame
this.pack(); // Ajusta el tamaño del Frame para que se ajuste al contenido
this.setSize(300,300); // Ajusta las dimensiones del Frame (es lo mismo que resize())
this.setVisible(true); // Muestra el Frame (es lo mismo que show())
```

#### Método inicializar

```java
public void inicializar() {
    posX = r.nextInt(200);
    posY = r.nextInt(200);
    anchura = r.nextInt(100);
    altura = r.nextInt(100);
    color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
}
```

#### Método setup()

```java
public void setup() {
    setupMenu();
    Panel principal = new Panel();
    principal.setLayout(new GridLayout(4, 1));
    
    principal.add(new Label("Cambian las características de la ventana", Label.CENTER));
    Panel panel1 = new Panel();
    panel1.add(new Button("Título"));
    panel1.add(new Button("MenuBar"));
    panel1.add(new Button("Resizable"));
    principal.add(panel1);
    
    principal.add(new Label("Salidas en la ventana", Label.CENTER));
    Panel panel2 = new Panel();
    panel2.add(new Button("Cursor"));
    panel2.add(new Button("Background"));
    panel2.add(new Button("Foreground"));
    panel2.add(new Button("Font"));
    principal.add(panel2);
    
    this.add("South", principal);

    /* indicamos donde se tiene que abrir el cuadro de diálogo, el texto que 
    queremos poner y el tipo de plantilla que queremos para el cuadro */
    abrirFichero = new FileDialog(this, "Abrir Fichero", FileDialog.LOAD); 
    guardarFichero = new FileDialog(this, "Guardar Fichero", FileDialog.SAVE); 
}
```

```java
public void setup() {
    Panel principal = new Panel();
    principal.setLayout(new GridLayout(3, 3));
    Panel paneles[][] = new Panel[3][3];
    for(int i=0; i<3; i++)
        for(int j=0; j<3; j++) {
            paneles[i][j] = new Panel();
            paneles[i][j].setLayout(new FlowLayout(FlowLayout.LEFT));
        }
    paneles[0][0].add(new Label("Campo de texto:"));
    paneles[0][0].add(new MiTextField("", 15)); // espera recibir el texto (puedes dejarlo vacío) y la anchura (según la función creada abajo)
    
    textArea = new TextArea(5, 10);
    textArea.setBackground(Color.YELLOW);
    paneles[0][1].add(textArea);
    
    paneles[0][2].add(new MiBoton("Borrar", textArea)); // espera recibir el texto que va a tener el botón y el textArea (según la función creada abajo)
    
    String opciones[] = {"Sí", "No", "Quizás"};
    paneles[1][0].add(new MiChoice(opciones, textArea)); // espera recibir un vector de Strings y un TextArea (según la función creada abajo)
    
    String deportes[] = {"Atletismo", "Baloncesto", "Tenis", "Esgrima", "Balonmano", "Patinaje"};
    paneles[1][1].add(new MiLista(deportes, textArea));
    
    paneles[1][2].add(new MiCanvas()); // no espera recibir ningún parámetro (según la función creada abajo)
    
    String alimentos[] = {"Patatas", "Cebollas", "Tomates", "Lechuga"};
    paneles[2][0].add(new MiCheckBoxGroup(alimentos));
    
    for(int i=0; i<3; i++)
        for(int j=0; j<3; j++)
            principal.add(paneles[i][j]);
    
    this.add("Center", principal);
}
```

```java
public void setup() {
    this.add("North", new Label("Elige tu comanda", Label.CENTER));
    this.chComida = new Choice();
    for(int i=0; i<comidas.length; i++)
        chComida.add(comidas[i]);
    add("West", chComida);
    
    listasPlatos = new List[comidas.length];
    for(int i=0; i<comidas.length; i++) {
        listasPlatos[i] = new List(5, true);
        for(int j=0; j<platos[i].length; j++) {
            listasPlatos[i].add(platos[i][j]);
        }
    }
    
    presentar = listasPlatos[0];    
    add("East", presentar);
    texto = new TextField("", 40);
    add("South", texto);
}
```

#### Método setupMenu()

```java
public void setupMenuBar(){
  porDefecto = new MenuBar();
  Menu fileMenu = new Menu("File");
  fileMenu.add(new MenuItem("Exit"));
  porDefecto.add(fileMenu);
  this.setMenuBar(porDefecto);
  alternativo = new MenuBar();
  Menu archivoMenu = new Menu("Archivo");
  archivoMenu.add(new MenuItem("Salir"));
  alternativo.add(archivoMenu);
}
```
```java
public void setupMenuBar(){
  MenuBar menuBar = new MenuBar();
  Menu menu1 = new Menu("Fichero");
  menu1.add(new MenuItem("Nuevo"));
  menu1.addSeparator();
  menu1.add(new MenuItem("Salir"));
  menuBar.add(menu1);
  Menu menu2 = new Menu("Dibujar");
  menu2.add(new MenuItem("Línea"));
  menu2.add(new MenuItem("Óvalo"));
  menu2.add(new MenuItem("Rectángulo"));
  menuBar.add(menu2);
  this.setMenuBar(menuBar);
}
```

### Funciones Gráficas 

- **`setColor(Color c)`**: Establece el color del objeto Graphics para los siguientes dibujos.
- **`drawOval(int x, int y, int width, int height)`**: Dibuja un óvalo solo con el contorno, sin relleno.
- **`fillOval(int x, int y, int width, int height)`**: Dibuja un óvalo relleno con el color establecido.
- **`drawString(String texto, int x, int y)`**: Dibuja un texto en la ventana en la posición (x, y).
- **`drawLine(int x1, int y1, int x2, int y2)`**: Dibuja una línea desde el punto (x1, y1) hasta (x2, y2).
- **`drawRect(int x, int y, int width, int height)`**: Dibuja un rectángulo solo con el contorno, sin relleno.
- **`fillRect(int x, int y, int width, int height)`**: Dibuja un rectángulo relleno con el color establecido.
- **`drawImage(Image img, int x, int y, ImageObserver observer)`**: Dibuja una imagen en la posición (x, y).
- **`createImage(int width, int height)`**: Crea una imagen vacía en memoria con las dimensiones especificadas, que luego puede ser manipulada y pintada con Graphics.

### Método handleEvent 

Este método maneja diferentes eventos de la interfaz gráfica, como cerrar la ventana, presionar botones, interactuar con menús y listas, entre otros.
`public boolean handleEvent(Event ev)`.

#### Cerrar la Ventana
Si el usuario intenta cerrar la ventana, la aplicación se finaliza con `System.exit(0)`.

```java
if(ev.id == Event.WINDOW_DESTROY) { // Evento de cerrar la ventana
    System.exit(0);  // Termina la aplicación
    return true;
}
```

#### Eventos de Botón
Maneja los eventos generados por los botones de la interfaz.

```java
else if(ev.id == Event.ACTION_EVENT) {  // Evento de acción (botón)
    if(ev.target instanceof Button) {  // Verifica si el evento proviene de un botón
        if(ev.arg.equals("Salir")) {  
            System.exit(0);  // Termina la aplicación
            return true;
        } 
        else if(ev.arg.equals("Siguiente")) {  
            ovalo.inicializar();  // Reinicia el objeto óvalo
            repaint();  // Redibuja la ventana
            return true;
        }
        else if(ev.arg.equals("Título")) {  
            if(this.getTitle().equals(tituloInicial))
                this.setTitle("Título Alternativo");
            else
                this.setTitle(tituloInicial);
            return true;
        }
        else if(ev.arg.equals("MenuBar")) {  
            if(this.getMenuBar() == porDefecto)
                this.setMenuBar(alternativo);
            else
                this.setMenuBar(porDefecto);
            return true;
        }
        else if(ev.arg.equals("Resizable")) {  
            this.setResizable(!this.isResizable()); // Alterna entre redimensionable y fijo
            return true;
        }
        else if(ev.arg.equals("Cursor")) {  
            this.setCursor(cursores[(posCursor++) % cursores.length]); // Cambia el cursor
            return true;
        }
        else if(ev.arg.equals("Background")) {  
            this.setBackground(colores[(posColor++) % colores.length]); // Cambia el color de fondo
            return true;
        }
        else if(ev.arg.equals("Foreground")) {  
            this.setForeground(colores[(posColor++) % colores.length]); // Cambia el color del texto
            return true;
        }
        else if(ev.arg.equals("Font")) {  
            this.setFont(new Font(fuentes[(posLetra++) % fuentes.length], Font.BOLD, 15)); // Cambia la fuente
            repaint();
            return true;
        }
    }
}
```

#### Eventos de Menú
Gestiona acciones dentro de la barra de menú, como abrir, guardar o crear un nuevo archivo.

```java
else if(ev.id == Event.ACTION_EVENT) {  
    if(ev.target instanceof MenuItem) {  
        if(ev.arg.equals("Salir")) {  
            System.exit(0);
            return true;
        }
        else if(ev.arg.equals("Nuevo")) {  
            texto.setText(" ");  // Borra el contenido de la caja de texto
            return true;
        }
        else if(ev.arg.equals("Abrir")) {  
            abrirFichero.setVisible(true);
            String inFile = abrirFichero.getDirectory() + abrirFichero.getFile();
            leerFichero(inFile);  // Llama al método que lee el archivo
            return true;
        }
        else if(ev.arg.equals("Guardar")) {  
            guardarFichero.setVisible(true);
            String outFile = guardarFichero.getDirectory() + guardarFichero.getFile();
            guardarFichero(outFile);  // Llama al método que guarda el archivo
            return true;
        }
    }
}
```

#### Eventos de Selección (Choice)
Detecta cuando el usuario cambia una opción en un `Choice` (desplegable) y actualiza la interfaz.

```java
else if(ev.id == Event.ACTION_EVENT) {  
    if(ev.target instanceof Choice) {  
        this.remove(presentar);
        presentar = listasPlatos[chComida.getSelectedIndex()];  
        this.add(presentar);
        this.setVisible(true);
        texto.setText(chComida.getSelectedItem() + ": ");
    }
}
```

#### Eventos de Lista (List)
Maneja la selección o deselección de elementos en una `List`, concatenando los elementos seleccionados en una cadena de texto.

```java
else if((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)) {  
    String frase = chComida.getSelectedItem() + ": ";
    String elecciones[] = presentar.getSelectedItems();
    for(int i=0; i<elecciones.length; i++)
        frase = frase.concat(" ").concat(elecciones[i]);
    texto.setText(frase);
}
```

#### Eventos de Dibujo
Maneja la selección de diferentes herramientas de dibujo en el lienzo.

```java
else if(ev.arg.equals("Línea")) {
    canvas.setTipo(DosPuntos.LINEA);
    return true;
}
else if(ev.arg.equals("Óvalo")) {
    canvas.setTipo(DosPuntos.OVALO);
    return true;
}
else if(ev.arg.equals("Rectángulo")) {
    canvas.setTipo(DosPuntos.RECTANGULO);
    return true;
}
else if(ev.arg.equals("Nuevo")) {
    //canvas.getGraphics().clearRect(0, 0, 400, 400);
    canvas.getLista().clear();
    canvas.repaint();
    return true;
}
```

#### Caso por Defecto
Si el evento no es manejado por los casos anteriores, el método devuelve `false`.

```java
return false;
```

#### Método leerFichero()

```java
private void leerFichero(String inFile) {
    DataInputStream inStream;
    try {
        inStream = new DataInputStream(new FileInputStream(inFile));
        String nuevo_texto = "";
        String linea;
        while((linea = inStream.readLine()) != null)
            nuevo_texto += linea + "\n";
        texto.setText(nuevo_texto);
    }
    catch (FileNotFoundException e) {}
    catch(IOException e) {}
}
```

#### Método guardarFichero()

```java
private void guardarFichero(String outFile) {
    DataOutputStream outStream;
    try {
        outStream = new DataOutputStream(new FileOutputStream(outFile));
        outStream.writeBytes(texto.getText());
    }
    catch (FileNotFoundException e) {}
    catch(IOException e) {}
}
```

#### Método mouseDown() 

```java
public boolean mouseDown(Event ev, int x, int y) {
    actual = new DosPuntos(x, y, tipo);
    return true;
}
```
```java
public boolean mouseDown(Event e, int x, int y) {
    for(int i=0; i<pelotas.size(); i++) {
        if(pelotas.get(i).contains(x, y))
            pelotas.remove(i);
    }
    return true;
} 
```
```java
public boolean mouseDown(Event e, int x, int y) {
    balas.add(new Bullet(x));
    return true;
}
```

#### Método mouseMove()

```java
public boolean mouseMove(Event e, int x, int y) {
    pistola.actualizar(x);
    return true;
}
```

#### Método mouseDrag()

```java
public boolean mouseDrag(Event ev, int x, int y) {
    actual.finX = x;
    actual.finY = y;
    repaint();
    return true;
}
```

#### Método mouseUp()

```java
public boolean mouseUp(Event ev, int x, int y) {
    lista.add(actual);
    actual = null; 
    return true;
}
```

#### Método keyDown()

```java
public boolean keyDown(Event e, int tecla) {
    if(tecla == 1006) // tecla 1006 -> flecha izquierda
        raqueta.setX(IZQUIERDA);
    if(tecla == 1007) // tecla 1007 -> flecha derecha
        raqueta.setX(DERECHA);
    if(tecla == 32) // tecla 32 -> espacio
        pajaro.saltar();
    return true;
}
```

#### Class TextField

```java
class MiTextField extends TextField {
    public MiTextField(String string, int i) {
        super(string, i);
    }
    public boolean action(Event ev, Object obj) {
        String texto = this.getText();
        this.setText(texto.toUpperCase()); // transforma el texto a mayúsculas
        return true;
    }
}
```

#### Class Button

```java
class MiBoton extends Button {
    private final TextArea textoAreaB;
    public MiBoton(String texto, TextArea textoAreaB) {
        super(texto);
        this.textoAreaB = textoAreaB;
        
    }
    public boolean action(Event ev, Object obj) {
        textoAreaB.setText(" ");
        return true;
    }
}
```

#### Class Choice

```java
class MiChoice extends Choice {
    private final TextArea textoAreaB;
    public MiChoice(String opciones[], TextArea texto2) {
        super();
        for(int i=0; i<opciones.length; i++)
            this.add(opciones[i]);
        textoAreaB = texto2;
    }
    public boolean action(Event ev, Object obj) {
        textoAreaB.setText(this.getSelectedItem());
        return true;
    }
}
```

#### Class List

```java
class MiLista extends List {
    private final TextArea textoAreaC;
    public MiLista(String deportes[], TextArea textoAreaC) {
        super(5, true); // 5 porque queremos mostrar 5 elementos de la lista
        this.textoAreaC = textoAreaC;
        for(int i=0; i<deportes.length; i++)
            this.add(deportes[i]);
    }
    public boolean handleEvent(Event ev) {
        if(ev.id == Event.ACTION_EVENT) {
            this.textoAreaC.setText("Doble Click");
            return true;
        }
        else if(ev.id == Event.LIST_SELECT) {
            this.textoAreaC.setText("Selecciono un elemento");
            String elementos[] = this.getSelectedItems();
            String texto = "";
            for(int i=0; i<elementos.length; i++)
                texto += elementos[i] + "\n";
            this.textoAreaC.setText(texto);
            return true;
        }
        else if(ev.id == Event.LIST_DESELECT) {
            this.textoAreaC.setText("Deselecciono un elemento");
            return true;
        }
        return false;
    }
}
```

#### Class Canvas

```java
class MiCanvas extends Canvas {
    int posx = 20;
    int posy = 20;
    public MiCanvas() {
        super();
        this.setSize(75, 75);
        this.setBackground(Color.YELLOW);
        this.setForeground(Color.RED);
        this.setVisible(true);
    }
    
    public void paint(Graphics g) {
        g.fillRect(posx, posy, 5, 5); // declaramos un rectángulo
    }
    
    public boolean mouseDown(Event ev, int x, int y) {
        posx = x;
        posy = y;
        repaint();
        return true;
    }
}
```

#### Class Panel

```java
class MiCheckBoxGroup extends Panel {
    Checkbox checkBoxes[];
    TextField resultado;

    public MiCheckBoxGroup(String elementos[]) {
        super();
        this.setLayout(new GridLayout(elementos.length + 1, 1)); // se pondrán los elementos unos debajo de otros
        checkBoxes = new Checkbox[elementos.length];
        for(int i=0; i<elementos.length; i++) {
            checkBoxes[i] = new Checkbox(elementos[i]);
            this.add(checkBoxes[i]);
        }
        
        resultado = new TextField("", 15);
        this.add(resultado);
    }
    
    public boolean action(Event ev, Object obj) {
        String mostrar = "";
        for(int i=0; i<checkBoxes.length; i++)
            if(checkBoxes[i].getState())
                mostrar += checkBoxes[i].getLabel() + " ";
        resultado.setText(mostrar);
        return false;
    }
}
```

### Colección `List<>` y `ArrayList<>`

`List<>`: Interfaz que representa una colección ordenada de elementos, donde se puede acceder a los elementos mediante su índice. Permite duplicados y es ideal para almacenar listas de objetos.

`ArrayList<>`: Es una implementación de la interfaz List que representa una colección dinámica de elementos, donde se puede acceder a los elementos mediante su índice. Es ideal para almacenar listas de objetos y permite que el tamaño de la lista se ajuste automáticamente según sea necesario.

- `private List<Nombre_Clase> lista`: Declara una lista de objetos de tipo Nombre_Clase, donde cada objeto representa un punto con coordenadas (x, y). Esta lista almacenará todos los atributos que se agreguen a la clase.
- `public List<Nombre_Clase> getLista()`: Método getter que devuelve la lista actual de objetos Nombre_Clase. Permite acceder a la lista almacenados desde fuera de la clase.
- `public void setLista(List<Nombre_Clase> lista)`: Método setter que permite modificar la lista de objetos Nombre_Clase. Se puede usar para asignar una nueva lista de atributos.

### Métodos de List

- `.size()`: Devuelve el número de elementos que contiene la lista.
- `.get(i)`: Devuelve el elemento que se encuentra en el índice i de la lista. La indexación comienza desde 0.
- `.remove(i)`: Elimina el elemento que se encuentra en el índice i de la lista.
- `.isEmpty()`: Devuelve `true` si la lista está vacía y `false` en caso contrario.

### Métodos de Rectangle

- `.contains(x, y)`: Comprueba si el punto con coordenadas (x, y) está dentro del área definida por el rectángulo.
- `.intersects(Rectangle r)`: Comprueba si el Rectangle actual se superpone con otro Rectangle pasado como argumento.

### Interfaz `implements Runnable`

`Runnable`: Interfaz funcional que permite definir código que puede ser ejecutado en un hilo separado.

**Método `run()`**

Contiene el código que será ejecutado cuando se inicie el hilo.
```java
public class MiTarea implements Runnable {
    Thread animacion;
    String frames[] = {"*", "**", "***", "****", "*****", "******", "*****", "****", "***", "**", "*"};
    int actual = 0;

    public static void main(String[] args) {
        MiTarea tarea = new MiTarea();
        animacion = new Thread(this);
        animacion.start();
    }

    public void run() {
        do {
            actual = (actual + 1) % frames.length;
            repaint();
            try {
                Thread.sleep(300); // milisegundos que el proceso va a dormir
            } catch (InterruptedException e) {}
        }
        while(true);     
    }
}
```

### Métodos en el Applet

#### init()
Se llama cuando se carga el applet por primera vez. Es donde se inicializan los valores y recursos necesarios.
```java
public void init() {
    posX = 80;
    posY = 100;
    imagen = this.createImage(300, 300);
    noseve = imagen.getGraphics();
    direccion = DERECHA;
    naves = new ArrayList<Nave>();
    for(int i=0; i<10; i++)
    naves.add(new Nave());
    tiempoAleatorio = (int)(Math.random()*2000)+2000;
    this.setSize(300, 300);
}
```

#### start()
Se llama después de `init()` o cada vez que el applet se vuelve visible o se reanuda. Se utiliza para iniciar los hilos o tareas en segundo plano.
```java
public void start() {
    animacion = new Thread(this); 
    animacion.start();
}
```

#### paint(Graphics g)()
Se llama cada vez que el applet necesita ser redibujado, como cuando la ventana es redimensionada o vuelve a aparecer después de estar oculta.
```java
public void paint(Graphics g) {
    // g.fillRect(posX, posY, anchura, altura);
    noseve.setColor(Color.black);
    noseve.fillRect(0, 0, 300, 300);
    for(Nave nave : naves)
    nave.paint(noseve);
    if(!continua) noseve.drawString("GAME OVER", 120, 140); 
    g.drawImage(imagen, 0, 0, this);
}
```

#### stop()
Se llama cuando el applet deja de ser visible o es suspendido, por ejemplo, si el usuario navega fuera de la página que contiene el applet.
```java
animacion.stop();
```

#### update()
```java
public void update(Graphics g) {
    paint(g);
}
```

#### run()
```java
public void run() {
    do {
        actualizar();
        repaint();
        try {
            Thread.sleep(20); 
        } catch (InterruptedException e) {}
    }
    while(true); 
}
```

### Foreach

Es un bucle de forma simplificada para iterar sobre colecciones y arreglos. Su sintaxis es:
```java
for (Tipo elemento : colección) {
    // Operaciones con elemento
}
```
Ejemplo:
```java
for(Ladrillo ladrillo : ladrillos) {
    if(this.intersects(ladrillo)) {
        ladrillos.remove(ladrillo);
        this.velY = -this.velY;
        break;
    }
}

for(Columna columna : columnas)
    columna.paint(noseve);

for(Columna columna : columnas)
    columna.update();
```

### Métodos intersects
```java
if(this.intersects(raqueta))
    velY = -velY;
```
```java
for(int i=0; i<ladrillos.size(); i++) {
    if(this.intersects(ladrillos.get(i))) {
        ladrillos.remove(i);
        this.velY = -this.velY;
        break; 
    }
}

for(Ladrillo ladrillo : ladrillos) {
    if(this.intersects(ladrillo)) {
        ladrillos.remove(ladrillo);
        this.velY = -this.velY;
        break;
    }
}
```
```java
public boolean chocar(Rectangle rect1, Rectangle rect2) {
    return this.intersects(rect1) || this.intersects(rect2);
}

if(!columnas.isEmpty()) {
    continua = !pajaro.chocar(columnas.get(0).rect1,columnas.get(0).rect2);

    if(columnas.get(0).rect1.x < -Columna.ANCHURA)
        columnas.remove(0);
}
```
```java
return this.intersects(cact);
```
```java
public void colision(ArrayList<Coche> coches) {
    for(Coche coche : coches)
        if(coche.intersects(this))
            RanaApp.continua = false;
}
```

### ConcurrentModificationException

Se utiliza para detienerse porque se produce un error al modificar la colección durante la iteración.

```java
try {
    for(Coche coche : coches)
        if(coche.update())
            coches.remove(coche);
} catch(ConcurrentModificationException e){}
```

---
