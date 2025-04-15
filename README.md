# Gestor de Tareas Avanzado (Desktop Application)

## Descripción del Proyecto

Este proyecto es una aplicación de escritorio desarrollada en Java que permite a los usuarios gestionar sus tareas de manera eficiente. Aplica los principios de la Programación Orientada a Objetos (POO) y se conecta a una base de datos para la persistencia de la información. Permite la creación, edición, eliminación, filtrado y ordenación de tareas, así como la gestión de proyectos y etiquetas.

## Tecnologías Utilizadas

* **Lenguaje de Programación:** Java
* **Interfaz Gráfica:** [Elegir: Java Swing / JavaFX]
* **Base de Datos:** [Elegir: MySQL / PostgreSQL / SQLite / otra]
* **Driver de Base de Datos:** [Especificar el driver JDBC utilizado, ej: `mysql-connector-java`, `org.postgresql.jdbc`, `org.xerial.sqlitejdbc`]
* **Herramientas de Desarrollo:** [Elegir: IntelliJ IDEA / Eclipse / otra]
* **Control de Versiones:** Git

## Funcionalidades Principales

* **Gestión de Tareas:**
    * Crear nuevas tareas con título, descripción, fecha de vencimiento, prioridad y estado.
    * Editar y eliminar tareas existentes.
    * Marcar tareas como completadas.
    * Filtrar tareas por estado, prioridad, fecha de vencimiento y etiquetas.
    * Ordenar tareas por diferentes criterios.
* **Gestión de Proyectos:**
    * Crear, editar y eliminar proyectos.
    * Asignar tareas a proyectos específicos.
    * Visualizar el progreso de los proyectos (basado en el porcentaje de tareas completadas).
* **Gestión de Etiquetas:**
    * Crear, editar y eliminar etiquetas para categorizar tareas.
    * Asignar múltiples etiquetas a una tarea.
    * Filtrar tareas por etiqueta.
* **(Opcional) Gestión de Usuarios:**
    * Crear, editar y eliminar cuentas de usuario.
    * Autenticación básica de usuarios (inicio de sesión).
    * Asignación de tareas y proyectos a usuarios específicos.
* **Persistencia de Datos:**
    * Almacenamiento y recuperación de toda la información (tareas, proyectos, etiquetas, usuarios - si se implementa) en la base de datos configurada.

## Cómo Empezar

Sigue estos pasos para configurar y ejecutar el proyecto en tu entorno local:

### Prerrequisitos

* **Java Development Kit (JDK):** Asegúrate de tener instalado el JDK (versión [especificar versión]). Puedes descargarlo desde [enlace de descarga del JDK].
* **IDE (Opcional):** Se recomienda utilizar un IDE como IntelliJ IDEA o Eclipse para facilitar el desarrollo.
* **Base de Datos:** Ten instalada la base de datos que hayas elegido ([MySQL / PostgreSQL / SQLite / otra]).
* **Driver JDBC:** Descarga el driver JDBC correspondiente a tu base de datos y asegúrate de que esté disponible en tu proyecto (por ejemplo, añadiéndolo como dependencia en tu IDE o incluyéndolo en la carpeta del proyecto).

### Configuración

1.  **Clonar el Repositorio:**
    ```bash
    git clone [https://docs.github.com/es/repositories/creating-and-managing-repositories/about-repositories](https://docs.github.com/es/repositories/creating-and-managing-repositories/about-repositories)
    cd [nombre del directorio del proyecto]
    ```

2.  **Configurar la Base de Datos:**
    * Crea una nueva base de datos con el nombre que desees.
    * Ejecuta el script SQL para crear las tablas necesarias (este script debería estar en la carpeta `sql/` o similar). Puedes encontrar un ejemplo de esquema de base de datos en el archivo `sql/schema.sql` (ejemplo).
    * Configura los detalles de la conexión a la base de datos (URL, usuario, contraseña) en el archivo de configuración de la aplicación (por ejemplo, dentro de una clase Java o en un archivo `.properties`).

3.  **Importar el Proyecto en el IDE (Opcional):**
    * Abre tu IDE (IntelliJ IDEA o Eclipse).
    * Importa el proyecto existente desde la ubicación donde lo clonaste.
    * Asegúrate de que el IDE reconozca correctamente el JDK y las dependencias del proyecto (incluyendo el driver JDBC).

### Ejecución

1.  **Compilar el Proyecto:** Si estás utilizando un IDE, el proyecto debería compilarse automáticamente. Si no, puedes usar el compilador de Java (`javac`) desde la línea de comandos.

2.  **Ejecutar la Aplicación:** Ejecuta la clase principal de tu aplicación desde el IDE o utilizando el comando `java` desde la línea de comandos:
    ```bash
    java [paquete principal].[clase principal]
    ```
    (Reemplaza `[paquete principal].[clase principal]` con la ruta completa a tu clase `main`).

## Estructura del Proyecto (Ejemplo)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tuproyecto/
│   │   │       ├── database/        # Clases para la interacción con la base de datos (DAO)
│   │   │       ├── model/           # Clases que representan las entidades (Tarea, Proyecto, Usuario, Etiqueta)
│   │   │       ├── service/         # Clases con la lógica de negocio
│   │   │       ├── ui/              # Clases para la interfaz de usuario ([swing / javafx])
│   │   │       └── Main.java        # Clase principal para iniciar la aplicación
│   ├── resources/      # Archivos de configuración, imágenes, etc.
├── sql/
│   └── schema.sql       # Ejemplo de esquema de la base de datos
├── .gitignore
├── README.md
└── LICENSE

## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1.  Haz un fork del repositorio.
2.  Crea una nueva rama para tu contribución (`git checkout -b feature/nueva-funcionalidad`).
3.  Realiza tus cambios y commitea (`git commit -am 'Añade nueva funcionalidad'`).
4.  Sube tus cambios a la rama remota (`git push origin feature/nueva-funcionalidad`).
5.  Crea un nuevo Pull Request.

## Licencia

Este proyecto está bajo la licencia [Especificar la licencia, ej: MIT License]. Consulta el archivo `LICENSE` para obtener más detalles.

## Contacto

Sebasth Segura
sebasthsegura05@gmail.com
