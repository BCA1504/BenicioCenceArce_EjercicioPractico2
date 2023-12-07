package com.FideFlights.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FideFlights.dao.VuelosDao;
import com.FideFlights.domain.VuelosDomain;

@Service
public class VueloServiceImpl {

    @Autowired
    private VuelosDao vueloDao;

    public Iterable<VuelosDomain> obtenerTodosLosVuelos() {
        return vueloDao.findAll();
    }

    public VuelosDomain obtenerVueloPorId(Long id) {
        return vueloDao.findById(id).orElse(null);
    }

}