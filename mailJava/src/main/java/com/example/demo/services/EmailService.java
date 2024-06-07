package com.example.demo.services;

import com.example.demo.EmailDto;
import jakarta.mail.MessagingException;

public interface EmailService  {
    public void sendMail(EmailDto emailDto) throws MessagingException;


}
