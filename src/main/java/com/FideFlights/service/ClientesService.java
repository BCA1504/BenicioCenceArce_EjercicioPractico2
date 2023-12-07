package com.FideFlights.service;

import com.FideFlights.domain.ClienteDomain;

public interface ClientesService {

    // Método para autenticar al cliente
    ClienteDomain autenticarCliente(String correo, String contrasena);
}