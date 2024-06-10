package com.example.demo.controller;

import com.example.demo.EmailDto;
import com.example.demo.services.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/send-email")
public class EmailController {

    @Autowired
   private EmailService emailService;

    @PostMapping
    private ResponseEntity<String> sendEmail(@RequestBody EmailDto emailDto) throws MessagingException {
        emailService.sendMail(emailDto);
        return new ResponseEntity<>("Correo enviado exitosamente", HttpStatus.OK);
    }

    @GetMapping
    private  String showWeb(){
        return "email";
    }


}
