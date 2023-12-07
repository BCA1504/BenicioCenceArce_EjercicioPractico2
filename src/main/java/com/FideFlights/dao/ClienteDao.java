package com.FideFlights.dao;

import com.FideFlights.domain.ClienteDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<ClienteDomain, Long> {

    // Método para buscar cliente por correo y contraseña
    ClienteDomain findByCorreoAndContrasena(String correo, String contrasena);
}