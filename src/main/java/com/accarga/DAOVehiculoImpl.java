/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accarga;

import com.db.Database;
import com.interfaces.DAOVehiculos;
import com.models.Vehiculos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flia Castiblanco
 */
public class DAOVehiculoImpl extends Database implements DAOVehiculos{

    @Override
    public void registrar(Vehiculos vehiculo) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()

            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO vehiculo (id_vehiculo, id_conductor, tipo_veh, tipo_servicio, año, marca, modelo, capacidad_max_carga, km_recorrido, estado_veh, fecha_ultimo_manten) VALUES (?,?,?,?,?,?,?,?,?,?,?);");                                
            st.setString(1, vehiculo.getId_vehiculo());
            st.setInt(2, vehiculo.getId_conductor());
            st.setString(3, vehiculo.getTipo_veh());
            st.setString(4, vehiculo.getTipo_servicio());
            st.setString(5, vehiculo.getAño());
            st.setString(6, vehiculo.getMarca());
            st.setString(7, vehiculo.getModelo());
            st.setInt(8, vehiculo.getCapacidad_max_carga());
            st.setFloat(9, vehiculo.getKm_recorrido());
            st.setString(10, vehiculo.getEstado_veh());
            st.setString(11, vehiculo.getFecha_ultimo_manten());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
            
    }

    @Override
    public void modificar(Vehiculos vehiculo) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            PreparedStatement st = this.conexion.prepareStatement("UPDATE vehiculo SET id_vehiculo = ?, tipo_veh = ?, tipo_servicio = ?, año = ?, marca = ?, modelo = ?, capacidad_max_carga = ?, km_recorrido = ?, estado_veh = ?, fecha_ultimo_manten = ? WHERE id_vehiculo = ?;");                       
                        
            st.setInt(1, vehiculo.getId_conductor());
            st.setString(2, vehiculo.getTipo_veh());
            st.setString(3, vehiculo.getTipo_servicio());
            st.setString(4, vehiculo.getAño());
            st.setString(5, vehiculo.getMarca());
            st.setString(6, vehiculo.getModelo());
            st.setInt(7, vehiculo.getCapacidad_max_carga());
            st.setFloat(8, vehiculo.getKm_recorrido());
            st.setString(9, vehiculo.getEstado_veh());
            st.setString(10, vehiculo.getFecha_ultimo_manten());
            st.setString(11, vehiculo.getId_vehiculo());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        
        
    }

    @Override
    public void eliminar(String VehiculoId) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM vehiculo WHERE id_vehiculo = ?");
            
            st.setString(1, VehiculoId);            
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<Vehiculos> listar(String id_vehiculo) throws Exception {
        List<Vehiculos> lista = null;
        try {
            this.Conectar();       
            
            String Query = id_vehiculo.isEmpty() ? "SELECT * FROM vehiculo;" : "SELECT * FROM vehiculo WHERE id_vehiculo LIKE '%" + id_vehiculo + "%'";
            PreparedStatement st = this.conexion.prepareStatement(Query);            
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Vehiculos vehiculo = new Vehiculos();         //Para obtener el usuario se crea un objeto de tipo Conductores                
                
                vehiculo.setId_vehiculo(rs.getString("id_vehiculo"));
                vehiculo.setId_conductor(rs.getInt("id_conductor"));
                vehiculo.setTipo_veh(rs.getString("tipo_veh"));
                vehiculo.setTipo_servicio(rs.getString("tipo_servicio"));
                vehiculo.setAño(rs.getString("año"));
                vehiculo.setMarca(rs.getString("marca"));
                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setCapacidad_max_carga(rs.getInt("capacidad_max_carga"));
                vehiculo.setKm_recorrido(rs.getFloat("km_recorrido"));
                vehiculo.setEstado_veh(rs.getString("estado_veh"));
                vehiculo.setFecha_ultimo_manten(rs.getString("fecha_ultimo_manten"));                
                            
                lista.add(vehiculo);
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
    public Vehiculos getVehiculoById(String VehiculoId) throws Exception {
        
        Vehiculos vehiculo = new Vehiculos();
        try {
            this.Conectar();                                 
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM vehiculo WHERE id_vehiculo = ? LIMIT 1;");            // Limit es para que solo devuelva 1 solo id
            st.setString(1, VehiculoId);
                        
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                
                vehiculo.setId_vehiculo(rs.getString("id_vehiculo"));
                vehiculo.setId_conductor(rs.getInt("id_conductor"));
                vehiculo.setTipo_veh(rs.getString("tipo_veh"));
                vehiculo.setTipo_servicio(rs.getString("tipo_servicio"));
                vehiculo.setAño(rs.getString("año"));
                vehiculo.setMarca(rs.getString("marca"));
                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setCapacidad_max_carga(rs.getInt("capacidad_max_carga"));
                vehiculo.setKm_recorrido(rs.getFloat("km_recorrido"));
                vehiculo.setEstado_veh(rs.getString("estado_veh"));
                vehiculo.setFecha_ultimo_manten(rs.getString("fecha_ultimo_manten"));  
                
            }
            rs.close();
            st.close();            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        return vehiculo;
        
    }
    
}
