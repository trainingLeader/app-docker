package com.testdocker.app_docker.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/welcome")
    public String Welcome()
    {
        return "Cordial saludo Docker";
    }
}
