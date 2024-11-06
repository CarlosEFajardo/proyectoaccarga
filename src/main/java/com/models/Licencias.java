/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author Flia Castiblanco
 */
public class Licencias {
    
    private int id_licencia;
    private int cedula_cond;
    private String fecha_Vencimiento;
    private String fecha_Expedicion;
    private String restriccion_Lic;
    private String estado_Lic;
    private String categoriaLic;

    public void setId_licencia(int id_licencia) {
        this.id_licencia = id_licencia;
    }

    public void setCedula_cond(int cedula_cond) {
        this.cedula_cond = cedula_cond;
    }

    public void setFecha_Vencimiento(String fecha_Vencimiento) {
        this.fecha_Vencimiento = fecha_Vencimiento;
    }

    public void setFecha_Expedicion(String fecha_Expedicion) {
        this.fecha_Expedicion = fecha_Expedicion;
    }

    public void setRestriccion_Lic(String restriccion_Lic) {
        this.restriccion_Lic = restriccion_Lic;
    }

    public void setEstado_Lic(String estado_Lic) {
        this.estado_Lic = estado_Lic;
    }

    public void setCategoriaLic(String categoriaLic) {
        this.categoriaLic = categoriaLic;
    }

    public int getId_licencia() {
        return id_licencia;
    }

    public int getCedula_cond() {
        return cedula_cond;
    }

    public String getFecha_Vencimiento() {
        return fecha_Vencimiento;
    }

    public String getFecha_Expedicion() {
        return fecha_Expedicion;
    }

    public String getRestriccion_Lic() {
        return restriccion_Lic;
    }

    public String getEstado_Lic() {
        return estado_Lic;
    }

    public String getCategoriaLic() {
        return categoriaLic;
    }

   
    
}
