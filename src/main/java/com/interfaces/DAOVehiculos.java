/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaces;

import com.models.Vehiculos;
import java.util.List;

/**
 *
 * @author Flia Castiblanco
 */
public interface DAOVehiculos {
    public void registrar(Vehiculos vehiculo)throws Exception;
    public void modificar(Vehiculos vehiculo)throws Exception;
    public void eliminar(String VehiculoId)throws Exception;        
    public List<Vehiculos> listar(String id_vehiculo) throws Exception;
    public Vehiculos getVehiculoById(String VehiculoId) throws Exception;
    
     
    
    
    /* 
    public void registrar(Vehiculos conductor)throws Exception;
    public void modificar(Vehiculos conductor)throws Exception;
    public void eliminar(Vehiculos conductor)throws Exception;        
    public List<Vehiculos> listar() throws Exception;

    */
}
