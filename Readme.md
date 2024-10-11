# Sistema de Tareas

## Descripción
Este Sistema de Tareas es una aplicación web desarrollada como parte de una prueba técnica para una posición de Java Developer. Permite a los usuarios listar, crear y eliminar tareas, proporcionando una interfaz sencilla y funcional para la gestión de actividades.

## Características Principales
- Listado de tareas
- Creación de nuevas tareas
- Eliminación de tareas
- Interfaz de usuario intuitiva

## Tecnologías Utilizadas
### Backend
- Java 8
- Spring Boot
- MySQL
- MyBatis

### Frontend
- Thymeleaf
- Bootstrap

## Instalación y Ejecución
1. Clonar el repositorio.
2. Navegar al directorio del proyecto.
3. Revisar y, si es necesario, ajustar la configuración de la base de datos MySQL en `application.properties`
4. Compilar y ejecutar el proyecto.


Nota: Los scripts de la base de datos deberían ejecutarse automáticamente, pero es recomendable verificar que la base de datos se haya creado correctamente.

5. Abrir un navegador web y visitar `http://localhost:8080`

## Notas Adicionales
- Este proyecto fue diseñado para tener el backend y frontend en un solo repositorio, facilitando así su despliegue.
- Al no especificarse una tecnología para el frontend en los requisitos de la prueba técnica, se optó por utilizar Thymeleaf como motor de plantillas. Esta elección permite una integración sencilla del frontend con el backend de Spring Boot, manteniendo todo el proyecto en una única estructura.
- La base de datos se encuentra configurada y cuenta con scripts para levantarse automáticamente. Sin embargo, se recomienda revisar la configuración en `application.properties` para asegurar que coincida con su entorno local.


---


# Task Management System

## Description
This Task Management System is a web application developed as part of a technical test for a Java Developer position. It allows users to list, create, and delete tasks, providing a simple and functional interface for activity management.

## Main Features
- Task listing
- Creation of new tasks
- Deletion of tasks
- Intuitive user interface

## Technologies Used
### Backend
- Java 8
- Spring Boot
- MySQL
- MyBatis

### Frontend
- Thymeleaf
- Bootstrap

## Installation and Execution
1. Clone the repository:
2. Navigate to the project directory.
3. Check and if necessary, adjust the MySQL database configuration in `application.properties`
4. Compile and run the project.

Note: The database scripts should run automatically, but it's advisable to verify that the database has been created correctly.

5. Open a web browser and visit `http://localhost:8080`

## Additional Notes
- This project was designed to have the backend and frontend in a single repository, thus facilitating it's deployment.
- As no specific technology for the frontend was specified in the technical test requirements, Thymeleaf was chosen as the template engine. This choice allows for seamless integration of the frontend with the Spring Boot backend, keeping the entire project in a single structure.
- The database is configured and includes scripts to be set up automatically. However, it is recommended to review the configuration in `application.properties` to ensure it matches your local environment.