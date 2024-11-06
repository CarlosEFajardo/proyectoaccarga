/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaces;

import com.models.Licencias;
import java.util.List;

/**
 *
 * @author Flia Castiblanco
 */
public interface DAOLicencia {
    public void registrar(Licencias licencia)throws Exception;
    public void modificar(Licencias licencia)throws Exception;
    public void eliminar(int LicenciaId)throws Exception;
    public List<Licencias> listar(String cedula_cond) throws Exception;
    public Licencias getLicenciaById(int LicenciaId) throws Exception;
    
}
