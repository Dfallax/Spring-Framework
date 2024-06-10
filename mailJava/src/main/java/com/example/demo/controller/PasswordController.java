package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PasswordController {

    @GetMapping("new-password")
    public String showPasswordForm() {
        return "new-password"; // Nombre de la plantilla para recoger contraseñas
    }

}
