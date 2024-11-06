/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accarga;

import com.db.Database;
import com.interfaces.DAOLicencia;
import com.models.Licencias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flia Castiblanco
 */
public class DAOLicenciaImpl extends Database implements DAOLicencia {

    @Override
    public void registrar(Licencias licencia) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO licencia_conduccion (id_Licencia, cedula_cond, fechaVencimiento, fechaExpedicion, restriccion_Lic, estado_Lic, categoria_Lic) VALUES (?, ?, ?, ?, ?, ?, ?);");
            
            st.setInt(1, licencia.getId_licencia());
            st.setInt(2, licencia.getCedula_cond());
            st.setString(3, licencia.getFecha_Vencimiento());
            st.setString(4, licencia.getFecha_Expedicion());
            st.setString(5, licencia.getRestriccion_Lic());
            st.setString(6, licencia.getEstado_Lic());
            st.setString(7, licencia.getCategoriaLic());
            
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
            
    }

    @Override
    public void modificar(Licencias licencia) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            
            PreparedStatement st = this.conexion.prepareStatement("UPDATE licencia_conduccion SET cedula_cond = ?, fechaVencimiento = ?, fechaExpedicion = ?, restriccion_Lic = ?, estado_Lic = ?, categoria_Lic = ? WHERE id_Licencia = ?;");            
            st.setInt (1, licencia.getCedula_cond());
            st.setString(2, licencia.getFecha_Vencimiento());
            st.setString(3, licencia.getFecha_Expedicion());
            st.setString(4, licencia.getRestriccion_Lic());
            st.setString(5, licencia.getEstado_Lic());
            st.setString(6, licencia.getCategoriaLic());
            st.setInt(7, licencia.getId_licencia());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        
        
    }

    @Override
    public void eliminar(int LicenciaId) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM licencia_conduccion WHERE id_Licencia= ?");
            
            st.setInt(1, LicenciaId);            
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<Licencias> listar(String cedula_cond) throws Exception {
        List<Licencias> lista = null;
        try {
            this.Conectar();       
            
            String Query = cedula_cond.isEmpty() ? "SELECT * FROM licencia_conduccion;" : "SELECT * FROM licencia_conduccion WHERE id_Licencia LIKE '%" + cedula_cond + "%'";
            PreparedStatement st = this.conexion.prepareStatement(Query);            
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Licencias licencia = new Licencias();         //Para obtener el usuario se crea un objeto de tipo Conductores                                
                licencia.setId_licencia(rs.getInt("id_Licencia"));
                licencia.setCedula_cond(rs.getInt("cedula_cond"));
                licencia.setFecha_Vencimiento(rs.getString("fechaVencimiento"));
                licencia.setFecha_Expedicion(rs.getString("fechaExpedicion"));
                licencia.setRestriccion_Lic(rs.getString("restriccion_Lic"));
                licencia.setEstado_Lic(rs.getString("estado_Lic"));
                licencia.setCategoriaLic(rs.getString("categoria_Lic"));
                
                lista.add(licencia);
            }
            rs.close();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        return lista;
        
    }

    @Override
    public Licencias getLicenciaById(int LicenciaId) throws Exception {
        
        Licencias licencia = new Licencias();
        try {
            this.Conectar();                                 
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM licencia_conduccion WHERE id_Licencia = ? LIMIT 1;");            // Limit es para que solo devuelva 1 solo id
            st.setInt(1, LicenciaId);
                        
            ResultSet rs = st.executeQuery();
            while (rs.next()){                
                
                licencia.setId_licencia(rs.getInt("id_Licencia"));
                licencia.setCedula_cond(rs.getInt("cedula_cond"));
                licencia.setFecha_Vencimiento(rs.getString("fechaVencimiento"));
                licencia.setFecha_Expedicion(rs.getString("fechaExpedicion"));
                licencia.setRestriccion_Lic(rs.getString("restriccion_Lic"));
                licencia.setEstado_Lic(rs.getString("estado_Lic"));
                licencia.setCategoriaLic(rs.getString("categoria_Lic"));
            }
            rs.close();
            st.close();            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        return licencia;
        
    }
    
}
