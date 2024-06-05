<p align="center">
  <img src=https://github.com/DavidVF7/Conversor-de-Monedas/assets/103916971/645bfae6-38cf-4f90-add7-8f9b3929cb5a"
</p>

# Conversor de Monedas 💵💱💶

Desarrollado como parte del Challenge Conversor de Monedas, propuesto por Alura Latam en colaboración con Oracle en el programa ONE, como parte de la especialización Back-End.

## Descripción 📝

Este proyecto es un Conversor de Monedas desarrollado en Java que te permite convertir diferentes divisas utilizando una API de tasas de cambio en tiempo real. Con este conversor, se pueden realizar solicitudes a la API, analizar la respuesta JSON, filtrar las monedas de interés y mostrar los resultados a los usuarios de manera clara y concisa. Además, la aplicación guarda un historial de conversiones que incluye una marca de tiempo para cada consulta, lo que permite al usuario realizar un seguimiento de sus conversiones anteriores y ver cuándo y a qué hora se realizaron.

## Tecnologías Utilizadas 💻

- **Lenguaje de Programación:** Java
- **API de Tasas de Cambio:** Se utilizó una API de tasas de cambio en tiempo real para obtener las tasas de conversión entre diferentes divisas.
- **Biblioteca Gson:** Gson se empleó para analizar la respuesta JSON de la API y convertirla en objetos Java para su manipulación.
- **Control de Versiones:** Git/GitHub se usaron para el control de versiones del proyecto y la colaboración en equipo.
- **Entorno de Desarrollo Integrado (IDE):** IntelliJ IDEA fue el entorno de desarrollo utilizado para escribir, depurar y ejecutar el código Java.

## Clases y Funcionalidades 🧩

### Calculos.java

Esta clase es responsable de manejar la lógica relacionada con las conversiones de moneda. Aquí se definen métodos para almacenar valores de moneda, realizar conversiones y obtener mensajes de respuesta.

### ConsultaConversion.java

Clase responsable de realizar consultas a una API externa para obtener las tasas de cambio entre diferentes monedas.

### GeneradorDeArchivos.java

Esta clase se encarga de guardar el historial de consultas en un archivo de texto.

### Principal.java

El punto de entrada principal del programa. Aquí se maneja la interacción con el usuario a través de la consola, mostrando un menú de opciones y gestionando las conversiones de moneda.

## 👨‍💻 Desarrollado por
- David Velasco Fierros

## Instrucciones de Uso 🚀

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en IntelliJ IDEA u otro IDE de tu elección.
3. Ejecuta la clase Principal.java para iniciar el programa.
4. Sigue las instrucciones en pantalla para realizar conversiones de moneda.

¡Disfruta convirtiendo monedas!

## ¿Cómo funciona? 🎥
Aquí puedes ver una demostración visual de cómo funciona el proyecto:

[Demostración del proyecto](https://youtu.be/a42KEl1l0kY)
