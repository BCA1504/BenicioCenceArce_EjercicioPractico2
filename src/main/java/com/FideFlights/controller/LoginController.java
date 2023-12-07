package com.FideFlights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.FideFlights.domain.ClienteDomain;
import com.FideFlights.service.ClientesService;

@Controller
public class LoginController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/login")
    public String login(@RequestParam String correo, @RequestParam String contrasena, Model model) {
        ClienteDomain cliente = clientesService.autenticarCliente(correo, contrasena);
        
        if (cliente != null) {
            if (cliente.getRol().getId() == 1) {
                // Es usuario
                return "redirect:/user/dashboard";
            } else if (cliente.getRol().getId() == 2) {
                // Es administrador
                return "redirect:/admin/dashboard";
            }
        }

        // Si la autenticación falla, puedes redirigir a una página de error o volver a la página de inicio de sesión
        model.addAttribute("error", "Correo o contraseña incorrectos");
        return "login";
    }
}