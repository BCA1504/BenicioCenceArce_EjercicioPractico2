package com.FideFlights.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FideFlights.dao.ClienteDao;
import com.FideFlights.domain.ClienteDomain;
import com.FideFlights.service.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public ClienteDomain autenticarCliente(String correo, String contrasena) {
        ClienteDomain cliente = clienteDao.findByCorreoAndContrasena(correo, contrasena);
        if (cliente != null && cliente.getRol() != null) {
            return cliente;
        }
        return null;
    }
}