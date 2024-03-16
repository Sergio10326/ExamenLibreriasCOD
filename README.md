# Librería Calculadora - Examen COD

Este repositorio contiene una librería de calculadora que ha sido ampliada para incluir una funcionalidad adicional de cálculo de raíces cuadradas.

## Modificaciones realizadas:

- Utilización de la librería calculadora existente.
- Creación de una nueva rama llamada "raices".
- Adición de un nuevo campo `RAIZ` como constante `static final` para ser utilizado como parámetro en el método `operar`.
- Incorporación de un nuevo caso en la estructura `switch` para calcular la raíz cuadrada.
- Implementación del método `Math.pow` para calcular la raíz cuadrada, donde el primer número actúa como radicando y el segundo como índice.
- Realización de un merge con squash hacia la rama principal (`main`).

## Creación del JAR:

Para compilar y generar el JAR de la librería, sigue los siguientes pasos:

1. Abre el proyecto en tu IDE.
2. Accede a "Proyect Structure" (Estructura del Proyecto).
3. Navega a "Artifacts" (Artefactos).
4. Selecciona "Jar".
5. Selecciona "From modules with dependences" (Desde módulos con dependencias).
6. Construye el proyecto.
7. Accede a "Build" > "Build Artifacts".

## Subida a GitHub:

Una vez que hayas generado el JAR, haz lo siguiente:

1. Realiza un `push` hacia el repositorio remoto en GitHub.
2. Crea una etiqueta (`tag`) para marcar la versión que incluye la funcionalidad de raíces cuadradas.
3. Crea una release en GitHub y añade el JAR generado como un activo adjunto.
