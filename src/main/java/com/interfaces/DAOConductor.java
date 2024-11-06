/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaces;

import com.models.Conductores;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Flia Castiblanco
 */
public interface DAOConductor {
    public void registrar(Conductores conductor)throws Exception;
    public void modificar(Conductores conductor)throws Exception;
    public void eliminar(int ConductorId)throws Exception;
    public List<Conductores> listar(String nombre_cond) throws Exception;
    public Conductores getConductorById(int ConductorId) throws Exception;
       
    public void login(String user, String pass, JFrame currentFrame)throws Exception;
    
}
