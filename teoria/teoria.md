# Parte Teórica – Taller Programación II

---

## Investigar qué es Markdown

Markdown es un lenguaje de marcado ligero diseñado para dar formato a texto plano de manera sencilla y legible. Fue creado por John Gruber en 2004 con el objetivo de permitir escribir documentos estructurados usando una sintaxis simple basada en caracteres como #, *, -, [], entre otros. 

Markdown permite convertir texto plano en HTML de forma automática, por lo que es ampliamente utilizado en documentación técnica, repositorios de GitHub, blogs, foros y entornos académicos. Su principal ventaja es que el texto sigue siendo legible incluso sin ser procesado.

---

# GIT

## 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es un espacio de almacenamiento donde se guarda no solo el código fuente de un proyecto, sino también todo su historial de cambios. Internamente contiene una carpeta oculta llamada .git que almacena los commits, ramas, referencias y configuraciones.

La diferencia con un proyecto “normal” es que un proyecto común solo contiene archivos actuales, mientras que un repositorio Git permite llevar control de versiones, regresar a estados anteriores, trabajar colaborativamente y mantener trazabilidad de los cambios realizados.

---

## 2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?

- Working Directory: Es el directorio de trabajo donde se encuentran los archivos del proyecto y donde el desarrollador realiza modificaciones.
- Staging Area (Index): Es un área intermedia donde se preparan los cambios antes de realizar un commit. Permite seleccionar qué modificaciones se incluirán en la siguiente versión.
- Repository: Es la base de datos interna de Git donde se almacenan permanentemente los commits y el historial del proyecto.

---

## 3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

Git almacena la información mediante objetos:

- Blob: Contiene el contenido de un archivo.
- Tree: Representa la estructura de directorios y relaciona blobs y otros trees.
- Commit: Guarda una instantánea del proyecto junto con metadatos como autor, fecha y mensaje.
- Tag: Es una referencia que apunta a un commit específico, generalmente usada para marcar versiones importantes.

---

## 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Un commit se crea con el comando:

git commit -m "mensaje descriptivo"

Un objeto commit almacena:
- Autor y correo electrónico
- Fecha y hora
- Mensaje descriptivo
- Referencia al commit padre
- Referencia al árbol (tree) que representa el estado del proyecto en ese momento

---

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

- git fetch descarga los cambios del repositorio remoto pero no los integra automáticamente al proyecto local.
- git pull descarga los cambios y los fusiona automáticamente con la rama actual.

---

## 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Un branch es una línea de desarrollo independiente dentro del repositorio. Internamente, una rama es simplemente un puntero que apunta a un commit específico. Cuando se crea un nuevo commit, el puntero de la rama se actualiza para apuntar a ese nuevo commit.

---

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Un merge se realiza con el comando:

git merge nombre_rama

Consiste en combinar los cambios de una rama con otra. Pueden surgir conflictos cuando dos ramas modifican la misma línea de un archivo. Git marca esas diferencias y el desarrollador debe editar manualmente el archivo para decidir qué cambios conservar, luego realizar un nuevo commit.

---

## 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

El comando git add mueve los cambios del working directory al staging area. Solo los archivos agregados al staging serán incluidos en el próximo commit. Si se omite este paso, los cambios no serán confirmados y no formarán parte del historial del repositorio.

---

## 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

.gitignore es un archivo que indica a Git qué archivos o carpetas no deben ser rastreados. Se utiliza para excluir archivos temporales, compilados, configuraciones locales o dependencias que no deben almacenarse en el repositorio.

---

## 10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

git commit --amend modifica el último commit realizado, permitiendo cambiar el mensaje o agregar archivos olvidados. En cambio, un nuevo commit crea un registro adicional en el historial sin alterar los commits anteriores.

---

## 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

git stash permite guardar temporalmente cambios no confirmados sin hacer commit. Es útil cuando se necesita cambiar de rama rápidamente sin perder modificaciones en curso.

---

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

- git reset: Mueve el puntero de la rama a un commit anterior.
- git revert: Crea un nuevo commit que deshace los cambios de otro commit.
- git checkout: Permite cambiar de rama o restaurar archivos a un estado anterior.

---

## 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

origin es el nombre por defecto del repositorio remoto principal.  
upstream se usa comúnmente en forks para referenciar el repositorio original.

Comandos comunes:
git remote add
git remote -v
git fetch
git push
git pull

---

## 14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

- git log: Muestra el historial de commits.
- git diff: Muestra diferencias entre versiones.
- git show: Muestra información detallada de un commit específico.

---

# PROGRAMACIÓN

## 15. ¿Cuáles son los tipos de datos primitivos en Java?

Los tipos de datos primitivos en Java son:
byte, short, int, long, float, double, char y boolean.

---

## 16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

if y else permiten ejecutar código dependiendo de una condición.  
switch evalúa múltiples opciones basadas en el valor de una variable.  
Los bucles como for, while y do-while permiten repetir instrucciones mientras se cumpla una condición.

---

## 17. ¿Por qué es importante usar nombres significativos para variables y métodos?

Porque mejora la legibilidad, facilita el mantenimiento del código y permite que otros desarrolladores comprendan fácilmente la lógica del programa.

---

## 18. ¿Qué es la Programación Orientada a Objetos (POO)?

Es un paradigma de programación basado en la creación de objetos que combinan atributos y métodos. Permite modelar problemas reales mediante clases y objetos.

---

## 19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

Encapsulamiento, abstracción, herencia y polimorfismo.

---

## 20. ¿Qué es la herencia en POO y cómo se utiliza en Java?

La herencia es el mecanismo que permite que una clase herede atributos y métodos de otra clase. En Java se utiliza mediante la palabra clave extends.

---

## 21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

Son palabras clave que controlan la visibilidad de clases, atributos y métodos.  
Los más comunes son: public, private, protected y default.

---

## 22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

Una variable de entorno es un valor definido en el sistema operativo que almacena información de configuración. En Java son importantes para definir rutas como JAVA_HOME o PATH, permitiendo que el compilador y la máquina virtual funcionen correctamente.
