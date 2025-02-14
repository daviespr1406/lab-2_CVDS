# lab-2_CVDS
en su proyecto# LABORATORIO 2 - PATTERNS

## TALLER 2
## PATTERNS - FACTORY
## PRE-RREQUISITOS
  - Java OpenJDK Runtime Environment: 17.x.x
  - Apache Maven: 3.9.x
## OBJETIVOS
  - Entender ¿qué es Maven?
  - Usar comandos de generación de arquetipos, compilación y ejecución de un proyecto usando Maven
  - Obtener puntos adicionales por PR qué corrijan o mejoren los laboratorios
  - LA HERRAMIENTA MAVEN
  - La herramienta Apache Maven se usa para gestionar y manejar proyectos de software. La base de maven para un proyecto es el concepto de un modelo de objeto de proyecto (POM), Maven puede gestionar la compilación, los informes y la documentación de un proyecto a partir de este modelo, que se concreta en el archivo pom.xml.

Ingresar a la página de la herramienta y entender:

  - Cuál es su mayor utilidad
    - Maven se usa para gestionar proyectos de software, facilitando la compilación, gestión de dependencias y empaquetado
  - Fases de maven
    - validate: Verifica que el proyecto esté correctamente configurado.
    - compile: Compila el código fuente del proyecto.
    - test: Ejecuta pruebas unitarias.
    - package: Empaqueta el código en un formato distribuible (JAR, WAR, etc.).
    - verify: Realiza verificaciones adicionales para garantizar que el paquete es válido.
    - install: Instala el paquete en el repositorio local.
    - deploy: Sube el paquete al repositorio remoto para compartirlo con otros desarrolladores
  - Ciclo de vida de la construcción
    - clean: Limpia los archivos generados en compilaciones previas.
    - default: Gestiona todo el proceso de construcción del proyecto, desde la compilación hasta el despliegue.
    - site: Genera documentación del proyecto.
  - Para qué sirven los plugins
    - Los plugins extienden la funcionalidad de Maven y permiten ejecutar tareas específicas dentro de las fases del ciclo de vida.
  - Qué es y para qué sirve el repositorio central de maven
    - Es un repositorio en línea que contiene una gran colección de bibliotecas y plugins utilizados en proyectos
## EJERCICIO DE LAS FIGURAS
### CREAR UN PROYECTO CON MAVEN
Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).

Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:

ProjectId: org.apache.maven.archetypes:maven-archetype-quickstart:1.0
Id del Grupo: edu.eci.cvds
Id del Artefacto: Patterns
Paquete: edu.eci.cvds.patterns.archetype
Se debió haber creado en el directorio, un nuevo proyecto Patterns a partir de un modelo o arquetipo, que crea un conjunto de directorios con un conjunto de archivos básicos.

 <image src="sources/1.png" alt="pantallazo de error">
  <image src="sources/2.png" alt="pantallazo de error">


Cambie al directorio Patterns:

$ cd Patterns
Para ver el conjunto de archivos y directorios creados por el comando mvn ejecute el comando tree.

$ tree
En caso de que no funcione en git bash, otra herramienta que se puede usar es PowerShell ya que ésta maneja el comando "tree".

 <image src="sources/3.png" alt="pantallazo de error">

En algunos sistemas operativos, este comando no funciona correctamente o puede requerir un parámetro (por ejemplo: tree /f). En caso que funcione, la salida muestra la estructura del proyecto, similar a como se muestra a continuación:S
AppTest.java
### AJUSTAR ALGUNAS CONFIGURACIONES EN EL PROYECTO
Edite el archivo pom.xml y realize la siguiente actualización:

Hay que cambiar la version del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:

<properties>
  <maven.compiler.target>1.8</maven.compiler.target>
  <maven.compiler.source>1.8</maven.compiler.source>
</properties>
 <image src="sources/4.png" alt="pantallazo de error">
 <image src="sources/5.png" alt="pantallazo de error">

COMPILAR Y EJECUTAR
Para compilar ejecute el comando:

$ mvn package
Si maven no actualiza las dependencias utilice la opción -U así:

$ mvn -U package
Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.

 <image src="sources/6.png" alt="pantallazo de error">


Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass". Tip: https://www.mojohaus.org/exec-maven-plugin/usage.html

Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación.

Utilizar la primera posición del parámetro que llega al método "main" para realizar elsaludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:

Buscar cómo enviar parámetros al plugin "exec".

Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!

 <image src="sources/6.png" alt="pantallazo de error">


Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito!

Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?

Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.


Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!
  <image src="sources/8.png" alt="pantallazo de error">
 <image src="sources/9.png" alt="pantallazo de error">

- Cree el archivo ShapeFactory.java en el directorio src/main/java/edu/eci/cvds/patterns/shapes implementando el patrón fábrica (Hint: https://refactoring.guru/design-patterns/catalog), haciendo uso de la instrucción switch-case de Java y usando las enumeraciones. ¿Cuál fábrica hiciste? y ¿Cuál es mejor?

<image src="sources/shapefactory.png">

Hicimos Factory Method

- Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
  - Sin parámetros
     <image src="sources/sinparametros.png">
  - Parámetro: qwerty
    <image src="sources/qwerty.png">
  - Parámetro: pentagon
    <image src="sources/pentagon.png">
  - Parámetro: Hexagon
    <image src="sources/Hexagon.png">

    Solo Hexagon funciona correctamente porque es una clase de shapes.

 ## Integrantes
  - David Espinosa
  - Emily Noreña
