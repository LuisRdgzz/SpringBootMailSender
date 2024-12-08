package com.spring.mail.sender.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/*Esta es la clase que se encarga de enviar los correos electronicos */
@Configuration
public class MailConfiguration {
    /*Para mandar a llamar nuestra propiedad que hemos creado en el aplicaction properties*/
    @Value("${email.sender}")
    private String emailUser;

    @Value("${email.password}")
    private String password;
    @Bean
    public JavaMailSender getJavaMailSender(){

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername(emailUser);//Correo electronico con el cual nosotros vamos a enviar el gmail
        mailSender.setPassword(password);


        Properties props =  mailSender.getJavaMailProperties();//Aca se esta obteniedo las propiedades del obje2cto mailSender
        props.put("mail.transport.protocol","smtp");//estamos indicando que se va a utilizar este protocolo para enviar el correo electonico
        props.put("mail.smtp.auth","true");//
        props.put("mail.smtp.starttls.enable","true");// de las propiedades mas importanets . ACA se esta habilitando el cifrado de comunicaion de la aplicacion y del correo
        props.put("mail.debug","true");// nos imprima informacion acerce de la informacion en la consola

            return mailSender;
    }
}
