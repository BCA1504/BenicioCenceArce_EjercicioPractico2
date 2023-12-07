package com.FideFlights.service;

import com.FideFlights.domain.VuelosDomain;

import java.util.List;

public interface VuelosService {
    List<VuelosDomain> getAllVuelos();

    public VuelosDomain obtenerVueloPorId(Long idVuelo);

    public Iterable<VuelosDomain> obtenerTodosLosVuelos();
}
