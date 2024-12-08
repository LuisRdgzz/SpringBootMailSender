# Spring Boot Mail Sender

## Descripción del Proyecto

Este proyecto implementa el envío de correos electrónicos utilizando **Spring Boot**, con integración a Gmail para la gestión de mensajes de correo. La aplicación permite enviar correos electrónicos tanto en formato texto plano como con archivos adjuntos.

### Tecnologías Utilizadas:
- **Spring Boot**
- **Maven**
- **Java**
- **Spring Web**
- **Lombok**
- **Spring Boot DevTools**
- **Java Mail Sender**

### Características Principales:
- **Envío de correos electrónicos**: Permite el envío de correos en formato plano y con archivos adjuntos.
- **Configuración personalizada de Spring Boot**: Se ha configurado un banner personalizado en la consola utilizando la URL proporcionada para una mejor identificación en el entorno de desarrollo.
- **Estructura del Proyecto**:
  - **config**: Contiene la clase `MailConfiguration` para gestionar la conexión SMTP y el envío de correos.
  - **service**: Contiene la interfaz `IEmailService` y su implementación `IEmailServiceImpl`, que gestionan la lógica de envío de correos.
  - **domain**: Incluye las clases `EmailDTO` y `EmailFileDTO`, que definen la estructura del correo y los archivos adjuntos.
  - **controller**: La clase `MailController` maneja los métodos `correoConMensaje` y `correoConMensajeYArchivo` para el envío de correos con y sin adjuntos.

### Proceso de Envío:
El envío de correos se realiza mediante un **POST mapping** en el controlador, donde el usuario puede enviar correos con o sin archivos adjuntos. Para los correos con archivos, es necesario crear una carpeta denominada **files** en el directorio **resources**, donde se almacenarán los archivos a enviar.

Este proyecto tiene como objetivo facilitar el envío de correos electrónicos dentro de aplicaciones Spring Boot, asegurando un código limpio, modular y escalable, siguiendo las mejores prácticas de desarrollo en Java.

## Cómo Ejecutar el Proyecto

1. Clonar el repositorio en tu máquina local.
2. Importar el proyecto en tu IDE (por ejemplo, IntelliJ IDEA).
3. Ejecutar la aplicación como una aplicación Spring Boot.
4. Realizar solicitudes POST para enviar correos electrónicos utilizando **Postman** o cualquier herramienta similar.

## Contribuciones

Si deseas contribuir al proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama para tu nueva característica (`git checkout -b feature/nueva-caracteristica`).
3. Haz commit de tus cambios (`git commit -am 'Añadir nueva característica'`).
4. Envía un pull request.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
