/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author Flia Castiblanco
 */
public class Vehiculos {
    private String id_vehiculo;
    private int id_conductor;
    private String tipo_veh;
    private String tipo_servicio;
    private String año;
    private String marca;
    private String modelo;
    private int capacidad_max_carga;
    private Float km_recorrido;
    private String estado_veh;
    private String fecha_ultimo_manten;

    public void setId_vehiculo(String id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }


    public void setTipo_veh(String tipo_veh) {
        this.tipo_veh = tipo_veh;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad_max_carga(int capacidad_max_carga) {
        this.capacidad_max_carga = capacidad_max_carga;
    }

    public void setKm_recorrido(Float km_recorrido) {
        this.km_recorrido = km_recorrido;
    }

    public void setEstado_veh(String estado_veh) {
        this.estado_veh = estado_veh;
    }

    public void setFecha_ultimo_manten(String fecha_ultimo_manten) {
        this.fecha_ultimo_manten = fecha_ultimo_manten;
    }

    public String getId_vehiculo() {
        return id_vehiculo;
    }

    public int getId_conductor() {
        return id_conductor;
    }


    public String getTipo_veh() {
        return tipo_veh;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public String getAño() {
        return año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad_max_carga() {
        return capacidad_max_carga;
    }

    public Float getKm_recorrido() {
        return km_recorrido;
    }

    public String getEstado_veh() {
        return estado_veh;
    }

    public String getFecha_ultimo_manten() {
        return fecha_ultimo_manten;
    }
    
    
}
