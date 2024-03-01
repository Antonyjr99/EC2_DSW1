package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Credenciales;

@RestController
public class AutenticacionController {

    @PostMapping("/autenticar")
    public ResponseEntity<String> autenticar(@RequestBody Credenciales credenciales) {
        // Verificar que se ingresen el usuario y la contraseña
        if (credenciales.getUsuario() == null || credenciales.getContrasena() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Debe ingresar usuario y contraseña");
        }
        
        // Verificar las credenciales
        if (credenciales.getUsuario().equals("@idat") && credenciales.getContrasena().equals("@inlearning")) {
            return ResponseEntity.ok("Validación correcta");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Datos incorrectos");
        }
    }
}
