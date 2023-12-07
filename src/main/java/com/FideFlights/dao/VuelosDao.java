package com.FideFlights.dao;

import com.FideFlights.domain.VuelosDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VuelosDao extends JpaRepository<VuelosDomain, Long>{
    
}
