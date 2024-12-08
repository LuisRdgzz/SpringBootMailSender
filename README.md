

---



# Spring Boot Mail Sender

## Descripción del Proyecto

Este proyecto implementa el envío de correos electrónicos utilizando **Spring Boot**, con integración a Gmail para la gestión de mensajes de correo. La aplicación permite enviar correos electrónicos tanto en formato texto plano como con archivos adjuntos.

### Tecnologías Utilizadas:

**Spring Boot DevTools**  
**Spring Web**  
**Lombok**  
**Maven**  
**Java Mail Sender**  
**Java**  
**Spring Boot**

### Características Principales:
- **Estructura del Proyecto**:
  - **config**: Contiene la clase `MailConfiguration` para gestionar la conexión SMTP y el envío de correos.
  - **service**: Contiene la interfaz `IEmailService` y su implementación `IEmailServiceImpl`, que gestionan la lógica de envío de correos.
  - **domain**: Incluye las clases `EmailDTO` y `EmailFileDTO`, que definen la estructura del correo y los archivos adjuntos.
  - **controller**: La clase `MailController` maneja los métodos `correoConMensaje` y `correoConMensajeYArchivo` para el envío de correos con y sin adjuntos.

### Proceso de Envío:
El envío de correos se realiza mediante un **POST mapping** en el controlador, donde el usuario puede enviar correos con o sin archivos adjuntos. Para los correos con archivos, es necesario crear una carpeta denominada **files** en el directorio **resources**, donde se almacenarán los archivos a enviar.

Este proyecto tiene como objetivo facilitar el envío de correos electrónicos dentro de aplicaciones Spring Boot, asegurando un código limpio, modular y escalable, siguiendo las mejores prácticas de desarrollo en Java.

---



# Spring Boot Mail Sender

## Project Description

This project implements the sending of emails using **Spring Boot**, with Gmail integration for managing email messages. The application allows sending both plain text emails and emails with attachments.

### Technologies Used:

**Spring Boot DevTools**  
**Spring Web**  
**Lombok**  
**Maven**  
**Java Mail Sender**  
**Java**  
**Spring Boot**

### Main Features:
- **Project Structure**:
  - **config**: Contains the `MailConfiguration` class to manage the SMTP connection and email sending.
  - **service**: Contains the `IEmailService` interface and its implementation `IEmailServiceImpl`, which handles the email sending logic.
  - **domain**: Includes the `EmailDTO` and `EmailFileDTO` classes, which define the structure of the email and attachments.
  - **controller**: The `MailController` class handles the methods `sendEmailWithMessage` and `sendEmailWithMessageAndFile` for sending emails with and without attachments.

### Sending Process:
Emails are sent via a **POST mapping** in the controller, where the user can send emails with or without attachments. For emails with attachments, it is necessary to create a folder named **files** in the **resources** directory, where the files to be sent will be stored.

This project aims to facilitate email sending within Spring Boot applications, ensuring clean, modular, and scalable code, following the best practices for Java development.

---

Now you have both the Spanish and English versions of your README!
