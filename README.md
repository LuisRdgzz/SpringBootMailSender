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

