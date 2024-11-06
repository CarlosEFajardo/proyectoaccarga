/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author Flia Castiblanco
 */
public class Checklist {
    
    private int id_checklist;
    private int id_conductor;
    private int id_ruta_entrega;      
    private int no_trailer;
    private String fecha_creacion;
    private String hora_creacion;
    private String observaciones;    
/* Folio del Checklist*/    
    private int id_folio;
    private int id_checklist_fk;
    private int gl_combustible;
    private String soat_vigente;
    private String TMecanica_vigente;
    private String arl_eps_vigente;
    private String carpa_limpia;
    private String carpa_perf;
    private String carr_compu_Bestado;
    private String carr_tablas_Bestado;
    private String carr_limpia;
    private String carr_obser;

    
        

    public void setId_checklist(int id_checklist) {
        this.id_checklist = id_checklist;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public void setId_ruta_entrega(int id_ruta_entrega) {
        this.id_ruta_entrega = id_ruta_entrega;
    }
    
    public void setNo_trailer(int no_trailer) {
        this.no_trailer = no_trailer;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setHora_creacion(String hora_creacion) {
        this.hora_creacion = hora_creacion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setId_folio(int id_folio) {
        this.id_folio = id_folio;
    }
    
    public void setId_checklist_fk(int id_checklist_fk) {
        this.id_checklist_fk = id_checklist_fk;
    }

    public void setGl_combustible(int gl_combustible) {
        this.gl_combustible = gl_combustible;
    }

    public void setSoat_vigente(String soat_vigente) {
        this.soat_vigente = soat_vigente;
    }

    public void setTMecanica_vigente(String TMecanica_vigente) {
        this.TMecanica_vigente = TMecanica_vigente;
    }

    public void setArl_eps_vigente(String arl_eps_vigente) {
        this.arl_eps_vigente = arl_eps_vigente;
    }
    
    public void setCarpa_limpia(String carpa_limpia) {
        this.carpa_limpia = carpa_limpia;
    }
    
    public void setCarpa_perf(String carpa_perf) {
        this.carpa_perf = carpa_perf;
    }

    public void setCarr_compu_Bestado(String carr_compu_Bestado) {
        this.carr_compu_Bestado = carr_compu_Bestado;
    }

    public void setCarr_tablas_Bestado(String carr_tablas_Bestado) {
        this.carr_tablas_Bestado = carr_tablas_Bestado;
    }

    public void setCarr_limpia(String carr_limpia) {
        this.carr_limpia = carr_limpia;
    }

    public void setCarr_obser(String carr_obser) {
        this.carr_obser = carr_obser;
    }


    

    public int getId_checklist() {
        return id_checklist;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public int getId_ruta_entrega() {
        return id_ruta_entrega;
    }
    
    public int getNo_trailer() {
        return no_trailer;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public String getHora_creacion() {
        return hora_creacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public int getId_folio() {
        return id_folio;
    }
    
    public int getId_checklist_fk() {
        return id_checklist_fk;
    }

    public int getGl_combustible() {
        return gl_combustible;
    }

    public String getSoat_vigente() {
        return soat_vigente;
    }

    public String getTMecanica_vigente() {
        return TMecanica_vigente;
    }

    public String getArl_eps_vigente() {
        return arl_eps_vigente;
    }
    
    public String getCarpa_limpia() {
        return carpa_limpia;
    }
    
    public String getCarpa_perf() {
        return carpa_perf;
    }

    public String getCarr_compu_Bestado() {
        return carr_compu_Bestado;
    }

    public String getCarr_tablas_Bestado() {
        return carr_tablas_Bestado;
    }

    public String getCarr_limpia() {
        return carr_limpia;
    }

    public String getCarr_obser() {
        return carr_obser;
    }


   

    
    
}
