 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaces;

import com.models.Checklist;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Flia Castiblanco
 */
public interface DAOChecklist {
    public void registrar(Checklist check)throws Exception;      
    public void UltimoId(Checklist check) throws Exception;
    public void registroCheckFolio(Checklist check)throws Exception;
    
    //public void autoincrement(JLabel label)throws Exception; //Se usará en el Futuro
    
//    public void eliminar(int ChecklistId)throws Exception;
//    public List<Checklist> listar(String nombre_cond) throws Exception;
//    public Checklist getChecklistById(int ChecklistId) throws Exception;
       
    
}
