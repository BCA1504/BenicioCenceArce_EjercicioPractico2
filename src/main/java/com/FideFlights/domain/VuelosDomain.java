package com.FideFlights.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "Vuelos")
public class VuelosDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero_vuelo;
    private String destino;
    private String lugar_salida;
    private Time hora_salida;
    private Date fecha_salida;
    private Date fecha_llegada;
    private String modelo_avion;


    public VuelosDomain() {
    }

    public VuelosDomain(String numero_vuelo, String destino, String lugar_salida, Time hora_salida, Date fecha_salida, Date fecha_llegada, String modelo_avion) {
        this.numero_vuelo = numero_vuelo;
        this.destino = destino;
        this.lugar_salida = lugar_salida;
        this.hora_salida = hora_salida;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.modelo_avion = modelo_avion;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(String numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getLugar_salida() {
        return lugar_salida;
    }

    public void setLugar_salida(String lugar_salida) {
        this.lugar_salida = lugar_salida;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getModelo_avion() {
        return modelo_avion;
    }

    public void setModelo_avion(String modelo_avion) {
        this.modelo_avion = modelo_avion;
    }
}