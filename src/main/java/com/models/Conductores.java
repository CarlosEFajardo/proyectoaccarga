/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author Flia Castiblanco
 */
public class Conductores {
    
    private int id_conductor;
    private int numero_licencia;
    private String nombre_cond;
    private String apellido_1;
    private String apellido_2;
    private String telefono;
    private String ciudad;
    private String direccion;
    private String EPS;
    private String ARL;
    private String soat;
    private String email;
    private String contraseña;        
    private String tipo_user;
    private int estado_cuenta;

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public void setNumero_licencia(int numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    public void setNombre_cond(String nombre_cond) {
        this.nombre_cond = nombre_cond;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public void setARL(String ARL) {
        this.ARL = ARL;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setTipo_user(String tipo_user) {
        this.tipo_user = tipo_user;
    }

    public void setEstado_cuenta(int estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public int getNumero_licencia() {
        return numero_licencia;
    }

    public String getNombre_cond() {
        return nombre_cond;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEPS() {
        return EPS;
    }

    public String getARL() {
        return ARL;
    }

    public String getSoat() {
        return soat;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public String getTipo_user() {
        return tipo_user;
    }

    public int getEstado_cuenta() {
        return estado_cuenta;
    }
    
}
