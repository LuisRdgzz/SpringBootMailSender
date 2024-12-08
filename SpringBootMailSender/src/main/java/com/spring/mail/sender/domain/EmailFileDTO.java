package com.spring.mail.sender.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
public class EmailFileDTO {

    private String [] toUser;
    private String  subject;
    private String  message;
    private  MultipartFile file;

    public String[] getToUser() {
        return toUser;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setToUser(String[] toUser) {
        this.toUser = toUser;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
