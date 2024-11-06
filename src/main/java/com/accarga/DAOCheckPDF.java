/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accarga;

import com.interfaces.DAOpdf;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Flia Castiblanco
 */
//public class DAOCheckPDF implements DAOpdf, Printable{
public class DAOCheckPDF extends JPanel implements Printable{
    
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        
        if(pageIndex==0){
            
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            try {            
                printAll(graphics2d);
            } catch (Exception ex) {
                Logger.getLogger(DAOCheckPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
            return PAGE_EXISTS;
            
        } else {
            return NO_SUCH_PAGE;
        }
        
    }

/*    
    @Override
    public void printAll(Graphics2D graphics2d) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
*/
    

    
    
}
