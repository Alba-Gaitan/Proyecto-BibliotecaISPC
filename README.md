# Proyecto Gestión Biblioteca 

Llegó una solicitud a la Consultora ISPC para renovar un sistema de gestión de libros para la “Biblioteca Popular Los Lectores”.
Hay que analizar el caso propuesto con los requerimientos entregados por el cliente potencial. Este cliente solicita que se anexe a la aplicación de escritorio, un entorno web para autogestionar las reservas de libros por cada uno de los socios.

# MANOS A LA OBRA!
# MODELADO DE DATOS y CLASES

En base a lo que nos brindó el cliente, actualizar (generar en UML nuevos diagramas de Caso de Uso, Clases, secuencia) 
Revisar DER (Diagrama de Entidad Relación) y Modelo Relacional si contiene tablas necesarias y todos los campos necesarios de acuerdo a las Entidades y Atributos.
PARA el BACKEND

1-Hacer que el sistema funcione con base de datos.
2-Crear el jar y ejecutarlo desde acceso directo, armar script.
3-Quitar mensajes del sistema si es que los posee(Debug)
4-Cuando se reserva un libro (por defecto con 5 días ) cambiarlo a 15 días.
5-Analizar si el sistema tiene atributos que tal vez no sean necesarios en  Usuarios y libros . (Modificar para que sea más ameno).

# PARA el FRONTEND

Convertir el entorno gráfico de escritorio en Aplicación Web. (queda a libre elección la estética/identidad institucional de la aplicación) empleando los recursos ya aprendidos: -

HTML
CSS /Bootstrap (a elección)
JAVASCRIPT (opcional) 
ANGULAR (Módulos / Componentes y conexión mediante servicios)

## Integrantes

✔️  Gil Camila.\
✔️  Storello Brenda.\
✔️  Ledesma Sebastian.\
✔️  Gaitan Alba.



# ITPLibrary
Basic system for managing a library on Java. It's a school project that I did for Object Oriented Programming. Programmed in Java.

## Features
✔️ Graphic interface with Material Design style.\
✔️ Management of Leagues, Tournaments, Journeys, Teams, Coaches, Referees and Players.\
✔️ MySQL database connection.\
✔️ Management of books, loans and returns.\
✔️ Penalties for late returns.\
✔️ Movement logs.\
✔️ Lookup tables.

## Previews

<p align="center">
  <kbd>
    <img src="https://i.ibb.co/ngb5Fz1/Imagen1.png"></img>
    <img src="https://i.ibb.co/Fb5jzqD/Imagen2.png"></img>
    <img src="https://i.ibb.co/cDkTQp0/Imagen3.png"></img>
    <img src="https://i.ibb.co/Db7MbL2/Imagen4.png"></img>
    <img src="https://i.ibb.co/hLpVJ3g/Imagen5.png"></img>
    <img src="https://i.ibb.co/3N3H5LZ/Imagen6.png"></img>
    <img src="https://i.ibb.co/3fPvLTG/Imagen7.png"></img>
    <img src="https://i.ibb.co/87fjj12/Imagen8.png"></img>
  </kbd>
</p>

## Getting Started
Import the java project in your preferred IDE and import the database. Just edit the class `Connect.class` with your database connection credentials.

### Important
Consider download the [mysql-connector-java-5.1.13](http://www.java2s.com/Code/JarDownload/mysql/mysql-connector-java-5.1.13.jar.zip) and import it to the project before compiling.
