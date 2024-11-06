/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accarga;

import com.db.Database;
import com.interfaces.DAOConductor;
import com.models.Conductores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Flia Castiblanco
 */
public class DAOConductorImpl extends Database implements DAOConductor {

    @Override
    public void registrar(Conductores conductor) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO conductor(id_conductor, nombre_cond, apellido_1, apellido_2, telefono, ciudad, direccion, EPS, ARL, soat, email, contraseña, tipo_user) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            st.setInt(1, conductor.getId_conductor());
            st.setString(2, conductor.getNombre_cond());
            st.setString(3, conductor.getApellido_1());
            st.setString(4, conductor.getApellido_2());
            st.setString(5, conductor.getTelefono());
            st.setString(6, conductor.getCiudad());
            st.setString(7, conductor.getDireccion());
            st.setString(8, conductor.getEPS());
            st.setString(9, conductor.getARL());
            st.setString(10, conductor.getSoat());
            st.setString(11, conductor.getEmail());
            st.setString(12, conductor.getContraseña());
            st.setString(13, conductor.getTipo_user());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
            
    }

    @Override
    public void modificar(Conductores conductor) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            PreparedStatement st = this.conexion.prepareStatement("UPDATE conductor SET nombre_cond = ?, apellido_1 = ?, apellido_2 = ?, telefono = ?, ciudad = ?, direccion = ?, EPS = ?, ARL = ?, soat = ?, email = ?, contraseña = ? WHERE id_conductor = ?;");            
            st.setString (1, conductor.getNombre_cond());
            st.setString(2, conductor.getApellido_1());
            st.setString(3, conductor.getApellido_2());
            st.setString(4, conductor.getTelefono());
            st.setString(5, conductor.getCiudad());
            st.setString(6, conductor.getDireccion());
            st.setString(7, conductor.getEPS());
            st.setString(8, conductor.getARL());
            st.setString(9, conductor.getSoat());
            st.setString(10, conductor.getEmail());
            st.setString(11, conductor.getContraseña());
            st.setInt(12, conductor.getId_conductor());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        
        
    }

    @Override
    public void eliminar(int ConductorId) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM conductor WHERE id_conductor = ?");
            
            st.setInt(1, ConductorId);            
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<Conductores> listar(String nombre_cond) throws Exception {
        List<Conductores> lista = null;
        try {
            this.Conectar();       
            
            String Query = nombre_cond.isEmpty() ? "SELECT * FROM conductor;" : "SELECT * FROM conductor WHERE nombre_cond LIKE '%" + nombre_cond + "%'";
            PreparedStatement st = this.conexion.prepareStatement(Query);            
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                Conductores conductor = new Conductores();         //Para obtener el usuario se crea un objeto de tipo Conductores                
                conductor.setId_conductor(rs.getInt("id_conductor"));
                conductor.setNumero_licencia(rs.getInt("numero_licencia"));
                conductor.setNombre_cond(rs.getString("nombre_cond"));
                conductor.setApellido_1(rs.getString("apellido_1"));
                conductor.setApellido_2(rs.getString("apellido_2"));
                conductor.setTelefono(rs.getString("telefono"));
                conductor.setCiudad(rs.getString("ciudad"));
                conductor.setDireccion(rs.getString("direccion"));
                conductor.setEPS(rs.getString("EPS"));
                conductor.setARL(rs.getString("ARL"));
                conductor.setSoat(rs.getString("soat"));
                conductor.setEmail(rs.getString("email"));
                conductor.setContraseña(rs.getString("contraseña"));
                conductor.setEstado_cuenta(rs.getInt("estado_cuenta"));
                
                lista.add(conductor);
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
    public Conductores getConductorById(int ConductorId) throws Exception {
        
        Conductores conductor = new Conductores();
        try {
            this.Conectar();                                 
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM conductor WHERE id_conductor = ? LIMIT 1;");            // Limit es para que solo devuelva 1 solo id
            st.setInt(1, ConductorId);
                        
            ResultSet rs = st.executeQuery();
            while (rs.next()){

                conductor.setId_conductor(rs.getInt("id_conductor"));
                conductor.setNumero_licencia(rs.getInt("numero_licencia"));
                conductor.setNombre_cond(rs.getString("nombre_cond"));
                conductor.setApellido_1(rs.getString("apellido_1"));
                conductor.setApellido_2(rs.getString("apellido_2"));
                conductor.setTelefono(rs.getString("telefono"));
                conductor.setCiudad(rs.getString("ciudad"));
                conductor.setDireccion(rs.getString("direccion"));
                conductor.setEPS(rs.getString("EPS"));
                conductor.setARL(rs.getString("ARL"));
                conductor.setSoat(rs.getString("soat"));
                conductor.setEmail(rs.getString("email"));
                conductor.setContraseña(rs.getString("contraseña"));
                conductor.setEstado_cuenta(rs.getInt("estado_cuenta"));
            }
            rs.close();
            st.close();            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        return conductor;
        
    }

    @Override
    public void login(String user, String pass, JFrame currentFrame) throws Exception {        
                        
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            PreparedStatement st = this.conexion.prepareStatement("SELECT id_conductor, contraseña, tipo_user FROM conductor WHERE estado_cuenta = 1 AND id_conductor = ?;");            
            st.setString(1, user);
            
            ResultSet rs = st.executeQuery();            
                        
            if(rs.next()){
                // SI EXISTE EL USUARIO                                
                String u = String.valueOf(rs.getInt("id_conductor"));
                String p = rs.getString("contraseña");
                String tipo = rs.getString("tipo_user");                
                //conductor.setId_conductor(u);                
                if(pass.equals(p)){
                    //Vamos a JFrame CONDUCTOR o ADMINISTRADOR
                   
                    if(tipo.equals("Conductor")){                    
                    Dashboard newframe = new Dashboard();        
                    newframe.setVisible(true);                    
                    currentFrame.dispose(); // Cierra el JFrame actual
                    
                    
                    } else if(tipo.equals("Administrador")){                    
                    Dashboard newframe = new Dashboard();        
                    newframe.setVisible(true);
                    currentFrame.dispose(); // Cierra el JFrame actual
                    
                    }
                }    
                
            } else {
                //EL USUARIO NO EXISTE
                javax.swing.JOptionPane.showMessageDialog(null, "El Usuario No Existe \n", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            }                                                           
                                    
            rs.close();
            st.close();                     
                    
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }                                
        
    }
    
}
