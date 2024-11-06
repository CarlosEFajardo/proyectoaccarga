/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.views;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author Flia Castiblanco
 */
public class CheckEditPDF extends javax.swing.JPanel implements Printable{
    
   // boolean isEdition = false;  // Incializamos el Boolean "isEdition" en False(Lo ponemos como predeterminado)
    //com.models.Conductores conductorEdition;
    
    /**
     * Creates new form Principal
     */
     
    public CheckEditPDF() {    
        initComponents();
        InitStyles();
    }
    
                                                            // Con esta funcion, traemos los datos de un Conductor seleccionado para editarlos.
/*    public CheckEditPDF(Conductores conductor){           //Al poner por parametro el objeto de tipo "conductores", cuando "isEdition" sea true, los campos Txt se van a traer los datos de la clase "conductor"
        initComponents();
        /*isEdition = true;                                // Si el parametro de la función InitStyles es true para "isEdition", Entonces se podrán rellenar los campos de Txt con la info a editar.
        conductorEdition = conductor;
        InitStyles();
    }
*/    
                                                         
                                                            
    private void InitStyles(){                      // En lugar de poner "isEdition" como parametro, lo inicializamos de forma global
        
    // Titulos en Semibold para Lbl
        TitleLbl1.putClientProperty( "FlatLaf.style", "font: 16 $semibold.font" );
        TitleLbl2.putClientProperty( "FlatLaf.style", "font: 16 $semibold.font" );
        TitleLbl3.putClientProperty( "FlatLaf.style", "font: 16 $semibold.font" );
        
        trailerLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        observacionLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );        
        EPSLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        horaLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        soatLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );

        
    // Placeholders para Txt        
        /*apellido1Txt.putClientProperty("JTextField.placeholderText", "Primer Apellido");
        apellido2Txt.putClientProperty("JTextField.placeholderText", "Segundo Apellido");
        TelTxt.putClientProperty("JTextField.placeholderText", "No. Celular");
        cityTxt.putClientProperty("JTextField.placeholderText", "Ciudad");
        direccionTxt.putClientProperty("JTextField.placeholderText", "Direccion");
        EPSTxt.putClientProperty("JTextField.placeholderText", "EPS");
        ARLTxt.putClientProperty("JTextField.placeholderText", "ARL");
        soatTxt.putClientProperty("JTextField.placeholderText", "No. SOAT");
        EmailTxt.putClientProperty("JTextField.placeholderText", "Correo Electronico");
        PassTxt.putClientProperty("JTextField.placeholderText", "Contraseña"); */

        
        /*if(isEdition){
          //  Title.setText("Editar Usuario");
            saveBtn.setText("Guardar");
            
            if(conductorEdition != null){      //Cuando los Txt estén vacíos, se rellenan con los datos del "conductor" seleccionado (todos los datos de cada Conductor se almacenan en la "clase" "conductorEdition" para poder editarlos)
                
                cedulaTxt.setText(String.valueOf(conductorEdition.getId_conductor()));
                nameCondTxt.setText(conductorEdition.getNombre_cond());
                apellido1Txt.setText(conductorEdition.getApellido_1());
                apellido2Txt.setText(conductorEdition.getApellido_2());
                TelTxt.setText(conductorEdition.getTelefono());
                cityTxt.setText(conductorEdition.getCiudad());
                direccionTxt.setText(conductorEdition.getDireccion());
                soatTxt.setText(conductorEdition.getSoat());
                EPSTxt.setText(conductorEdition.getEPS());
                ARLTxt.setText(conductorEdition.getARL());
                EmailTxt.setText(conductorEdition.getEmail());
                PassTxt.setText(conductorEdition.getContraseña());
                
            }
        
        }  */      
        

    }
    
     
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        codeLbl = new javax.swing.JLabel();
        F_ElabLbl = new javax.swing.JLabel();
        F_RevLbl = new javax.swing.JLabel();
        versionLbl = new javax.swing.JLabel();
        honestLbl = new javax.swing.JLabel();
        tablasPanel = new javax.swing.JPanel();
        TitleLbl1 = new javax.swing.JLabel();
        FechaLbl = new javax.swing.JLabel();
        horaLbl = new javax.swing.JLabel();
        vehiculoLbl = new javax.swing.JLabel();
        cedulaLbl = new javax.swing.JLabel();
        trailerLbl = new javax.swing.JLabel();
        TitleLbl2 = new javax.swing.JLabel();
        estadoLbl = new javax.swing.JLabel();
        SiNoLbl = new javax.swing.JLabel();
        observacionLbl = new javax.swing.JLabel();
        carpaLimLbl = new javax.swing.JLabel();
        carpaLimTxt = new javax.swing.JLabel();
        carpaLimObs = new javax.swing.JLabel();
        carpaPerfLbl = new javax.swing.JLabel();
        carpaPerfTxt = new javax.swing.JLabel();
        carpaPerfObs = new javax.swing.JLabel();
        TitleLbl3 = new javax.swing.JLabel();
        soatLbl = new javax.swing.JLabel();
        soatTxt = new javax.swing.JLabel();
        LicLbl = new javax.swing.JLabel();
        LicTxt = new javax.swing.JLabel();
        TMecanicaLbl = new javax.swing.JLabel();
        TMecanicaTxt = new javax.swing.JLabel();
        EPSLbl = new javax.swing.JLabel();
        EPSTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(918, 1488));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(918, 1488));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/favicon.png"))); // NOI18N
        imgLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(imgLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 170, 120));

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("INSPECCIÓN DE VEHICULOS");
        titleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 460, 120));

        codeLbl.setText("  Código: GL-F-005");
        codeLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(codeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 160, 30));

        F_ElabLbl.setText("  F. Elaboración: 19/05/2016");
        F_ElabLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(F_ElabLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 160, 30));

        F_RevLbl.setText("  F. Revisión: 14/04/2023");
        F_RevLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(F_RevLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 160, 30));

        versionLbl.setText("  Versión: 004");
        versionLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.add(versionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 160, 30));

        honestLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        honestLbl.setText("Confiamos en su Veracidad y Honestidad para diligenciar La Inspección de Su Vehículo");
        bg.add(honestLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 490, -1));

        tablasPanel.setBackground(new java.awt.Color(255, 255, 255));
        tablasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLbl1.setBackground(new java.awt.Color(204, 204, 204));
        TitleLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLbl1.setText("DATOS GENERALES");
        TitleLbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(TitleLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 788, 35));

        FechaLbl.setText("  Fecha:");
        FechaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(FechaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 170, 40));

        horaLbl.setText("  Hora:");
        horaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(horaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 36, 130, 40));

        vehiculoLbl.setText("  Placa de Vehiculo:");
        vehiculoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(vehiculoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 36, 180, 40));

        cedulaLbl.setText("  Cedula:");
        cedulaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(cedulaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 36, 180, 40));

        trailerLbl.setText("  No. Trailer");
        trailerLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(trailerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 36, 130, 40));

        TitleLbl2.setBackground(new java.awt.Color(204, 204, 204));
        TitleLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLbl2.setText("ESTADO DEL VEHICULO");
        TitleLbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(TitleLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 790, 35));

        estadoLbl.setText("   Estado de Carpa");
        tablasPanel.add(estadoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, 30));

        SiNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SiNoLbl.setText("SI / NO");
        tablasPanel.add(SiNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, 30));

        observacionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        observacionLbl.setText("OBSERVACIONES");
        tablasPanel.add(observacionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 310, 30));

        carpaLimLbl.setText("  A. Carpa Limpia:");
        carpaLimLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(carpaLimLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 40));

        carpaLimTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(carpaLimTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 180, 40));

        carpaLimObs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(carpaLimObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 310, 40));

        carpaPerfLbl.setText("  B. Perforaciones de Carpa:");
        carpaPerfLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(carpaPerfLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 40));

        carpaPerfTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(carpaPerfTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 180, 40));

        carpaPerfObs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(carpaPerfObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 310, 40));

        TitleLbl3.setBackground(new java.awt.Color(204, 204, 204));
        TitleLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLbl3.setText("VERIFICACION DE DOCUMENTOS");
        TitleLbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(TitleLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 790, 35));

        soatLbl.setText("  SOAT Vigente");
        soatLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(soatLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 230, 40));

        soatTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(soatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 255, 140, 40));

        LicLbl.setText("  Licencia de Conducción Vigente");
        LicLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(LicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 295, 230, 40));

        LicTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(LicTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 295, 140, 40));

        TMecanicaLbl.setText("  Revisión Tecnico Mecanica Vigente");
        TMecanicaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(TMecanicaLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 255, 240, 40));

        TMecanicaTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(TMecanicaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 255, 150, 40));

        EPSLbl.setText("  ARL y EPS Vigente");
        EPSLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(EPSLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 295, 240, 40));

        EPSTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablasPanel.add(EPSTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 295, 150, 40));

        bg.add(tablasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 790, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

       
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EPSLbl;
    private javax.swing.JLabel EPSTxt;
    private javax.swing.JLabel F_ElabLbl;
    private javax.swing.JLabel F_RevLbl;
    private javax.swing.JLabel FechaLbl;
    private javax.swing.JLabel LicLbl;
    private javax.swing.JLabel LicTxt;
    private javax.swing.JLabel SiNoLbl;
    private javax.swing.JLabel TMecanicaLbl;
    private javax.swing.JLabel TMecanicaTxt;
    private javax.swing.JLabel TitleLbl1;
    private javax.swing.JLabel TitleLbl2;
    private javax.swing.JLabel TitleLbl3;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel carpaLimLbl;
    private javax.swing.JLabel carpaLimObs;
    private javax.swing.JLabel carpaLimTxt;
    private javax.swing.JLabel carpaPerfLbl;
    private javax.swing.JLabel carpaPerfObs;
    private javax.swing.JLabel carpaPerfTxt;
    private javax.swing.JLabel cedulaLbl;
    private javax.swing.JLabel codeLbl;
    private javax.swing.JLabel estadoLbl;
    private javax.swing.JLabel honestLbl;
    private javax.swing.JLabel horaLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel observacionLbl;
    private javax.swing.JLabel soatLbl;
    private javax.swing.JLabel soatTxt;
    private javax.swing.JPanel tablasPanel;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel trailerLbl;
    private javax.swing.JLabel vehiculoLbl;
    private javax.swing.JLabel versionLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex==0){
            
            Graphics2D graphics2d = (Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            printAll(graphics2d);            
            return PAGE_EXISTS;
            
        } else {
            return NO_SUCH_PAGE;
        }
    }

    
}
