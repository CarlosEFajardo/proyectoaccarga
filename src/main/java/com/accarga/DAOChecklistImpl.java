/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accarga;

import com.db.Database;
import com.interfaces.DAOChecklist;
import com.models.Checklist;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Flia Castiblanco
 */
public class DAOChecklistImpl extends Database implements DAOChecklist {

    @Override
    public void registrar(Checklist check) throws Exception {
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            //INSERT INTO checklist (id_conductor, id_ruta_entrega, fecha_creacion, hora_creacion, observaciones) VALUES (?, ?, NOW(), NOW(), ?);
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO checklist (id_conductor, id_ruta_entrega, no_trailer, fecha_creacion, hora_creacion, observaciones) VALUES (?, ?, ?, NOW(), NOW(), ?);");
            st.setInt(1, check.getId_conductor());
            st.setInt(2, check.getId_ruta_entrega());
            st.setInt(3, check.getNo_trailer());
            st.setString(4, check.getObservaciones());
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
            
    }
    
    
    @Override
    public void UltimoId(Checklist check) throws Exception {
        try {
        this.Conectar(); // Conectar con la base de datos
        PreparedStatement st = this.conexion.prepareStatement(
            "SELECT id_checklist FROM checklist ORDER BY id_checklist DESC LIMIT 1;"
        );

        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            
            int idChecklist = rs.getInt("id_checklist");                // Obtiene el último id_checklist            
            check.setId_checklist_fk(idChecklist);                  // Establece el valor en el campo id_checklist_fk del objeto Checklist
        } else {
            // Si no hay registros, puedes asignar un valor predeterminado o lanzar una excepción
            throw new Exception("No se encontró ningún id_checklist en la base de datos.");
        }

        // Cerrar el ResultSet y el PreparedStatement
        rs.close();
        st.close();

    } catch (Exception e) {
        throw e;
    } finally {
        this.Cerrar();
    }


    }

    @Override
    public void registroCheckFolio(Checklist check) throws Exception {
        
        try{
            this.Conectar();                                                    //A partir de acá ya podremos trabajar con la BD,  pues los forumlarios ya se conectan con la BD
            //conexion ya está inicializada por el método Conectar()
            //INSERT INTO check_folio (id_checklist_fk, gl_combustible, soat_vigente, TMecanica_vigente, arl_eps_vigente, carpa_limpia, carpa_perforaciones, carroce_comp_Bestado, carroce_tablas_Bestado, carroce_limpia, carroce_obser) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO check_folio (id_checklist_fk, gl_combustible, soat_vigente, TMecanica_vigente, arl_eps_vigente, carpa_limpia, carpa_perforaciones, carroce_comp_Bestado, carroce_tablas_Bestado, carroce_limpia, carroce_obser) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            st.setInt(1, check.getId_checklist_fk());            
            st.setInt(2, check.getGl_combustible());
            st.setString(3, check.getSoat_vigente());
            st.setString(4, check.getTMecanica_vigente());
            st.setString(5, check.getArl_eps_vigente());
            st.setString(6, check.getCarpa_limpia());
            st.setString(7, check.getCarpa_perf());
            st.setString(8, check.getCarr_compu_Bestado());
            st.setString(9, check.getCarr_tablas_Bestado());
            st.setString(10, check.getCarr_limpia());
            st.setString(11, check.getCarr_obser());            
            
            st.executeUpdate();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        
        
    }
    
    
}

/* ------------------ SIN ACTIVARSE - USO FUTURO - PONER DATOS EN DISTINTOS JLabel -------------
    @Override
    public void autoincrement(JLabel label) throws Exception {
        
        Checklist check = new Checklist();
        try{
            this.Conectar();                                                    
            
            PreparedStatement st = this.conexion.prepareStatement("SELECT id_checklist FROM checklist ORDER BY id_checklist DESC LIMIT 1;");
            //st.setInt(1, ChecklistId);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                // SI EXISTE EL USUARIO                                
                int id = rs.getInt("id_checklist");              
                label.setText("Codigo: GL-F-00"+String.valueOf(id));
                check.setId_checklist_fk(id);             
                
            }  else {               // Si no hay registros, Escribe en ese Lable "No disponible"
            label.setText("No disponible");
            }
                               
            rs.close();
            st.close();
            
        } catch(Exception e){
            throw e;            
        } finally{
            this.Cerrar();
        }
        
    }
     ------------------ -------------*/




/*    
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

*/

    

    
    

