package com.ivanperez.tarea1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Tarea1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tarea1Application.class, args);
    }

    @GetMapping("/hola")
    public String saludar() {
        return "hola";  // esto buscará el archivo hola.html en templates
    }
}
