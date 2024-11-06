/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.views;

import com.accarga.DAOConductorImpl;
import com.interfaces.DAOConductor;
import com.models.Conductores;

/**
 *
 * @author Flia Castiblanco
 */
public class UpConductores extends javax.swing.JPanel {
    
    boolean isEdition = false;  // Incializamos el Boolean "isEdition" en False(Lo ponemos como predeterminado)
    com.models.Conductores conductorEdition;
    
    /**
     * Creates new form Principal
     */
    // 
    public UpConductores() {    
        initComponents();
        InitStyles();
    }
    
                                                            // Con esta funcion, traemos los datos de un Conductor seleccionado para editarlos.
    public UpConductores(Conductores conductor){           //Al poner por parametro el objeto de tipo "conductores", cuando "isEdition" sea true, los campos Txt se van a traer los datos de la clase "conductor"
        initComponents();
        isEdition = true;                                // Si el parametro de la función InitStyles es true para "isEdition", Entonces se podrán rellenar los campos de Txt con la info a editar.
        conductorEdition = conductor;
        InitStyles();
    }
    
                                                         
                                                            
    private void InitStyles(){                      // En lugar de poner "isEdition" como parametro, lo inicializamos de forma global
        
    // Titulos en Semibold para Lbl
        Title.putClientProperty( "FlatLaf.style", "font: 20 $semibold.font" );
        cedulaLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        nameCondLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        apellido1Lbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        apellido2Lbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        EPSLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        EmailLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        ARLLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        cityLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        PassLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        soatLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        direccionLbl.putClientProperty( "FlatLaf.style", "font: $semibold.font" );
        
    // Placeholders para Txt
        cedulaTxt.putClientProperty("JTextField.placeholderText", "No.Cedula");
        nameCondTxt.putClientProperty("JTextField.placeholderText", "Nombres");
        apellido1Txt.putClientProperty("JTextField.placeholderText", "Primer Apellido");
        apellido2Txt.putClientProperty("JTextField.placeholderText", "Segundo Apellido");
        TelTxt.putClientProperty("JTextField.placeholderText", "No. Celular");
        cityTxt.putClientProperty("JTextField.placeholderText", "Ciudad");
        direccionTxt.putClientProperty("JTextField.placeholderText", "Direccion");
        EPSTxt.putClientProperty("JTextField.placeholderText", "EPS");
        ARLTxt.putClientProperty("JTextField.placeholderText", "ARL");
        soatTxt.putClientProperty("JTextField.placeholderText", "No. SOAT");
        EmailTxt.putClientProperty("JTextField.placeholderText", "Correo Electronico");
        PassTxt.putClientProperty("JTextField.placeholderText", "Contraseña");

        
        if(isEdition){
            Title.setText("Editar Usuario");
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
        
        }       
        

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
        Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cedulaLbl = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        nameCondLbl = new javax.swing.JLabel();
        nameCondTxt = new javax.swing.JTextField();
        apellido1Lbl = new javax.swing.JLabel();
        apellido1Txt = new javax.swing.JTextField();
        apellido2Lbl = new javax.swing.JLabel();
        TelLbl = new javax.swing.JLabel();
        TelTxt = new javax.swing.JTextField();
        apellido2Txt = new javax.swing.JTextField();
        cityLbl = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        direccionLbl = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        soatLbl = new javax.swing.JLabel();
        soatTxt = new javax.swing.JTextField();
        EPSLbl = new javax.swing.JLabel();
        EPSTxt = new javax.swing.JTextField();
        ARLLbl = new javax.swing.JLabel();
        ARLTxt = new javax.swing.JTextField();
        EmailLbl = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        PassLbl = new javax.swing.JLabel();
        PassTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(750, 430));

        Title.setText("Registrar un Nuevo Conductor");

        cedulaLbl.setText("Cedula del Conductor");

        cedulaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaTxtActionPerformed(evt);
            }
        });

        nameCondLbl.setText("Nombres del Conductor");

        nameCondTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCondTxtActionPerformed(evt);
            }
        });

        apellido1Lbl.setText("Primer Apellido ");

        apellido1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido1TxtActionPerformed(evt);
            }
        });

        apellido2Lbl.setText("Segundo Apellido");

        TelLbl.setText("Telefono");

        apellido2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido2TxtActionPerformed(evt);
            }
        });

        cityLbl.setText("Ciudad");

        cityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTxtActionPerformed(evt);
            }
        });

        direccionLbl.setText("Dirección");

        direccionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTxtActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        soatLbl.setText("SOAT");

        EPSLbl.setText("EPS");

        EPSTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EPSTxtActionPerformed(evt);
            }
        });

        ARLLbl.setText("ARL");

        ARLTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARLTxtActionPerformed(evt);
            }
        });

        EmailLbl.setText("Email");

        PassLbl.setText("Contraseña");

        saveBtn.setBackground(new java.awt.Color(13, 138, 200));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Registrar");
        saveBtn.setBorder(null);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(apellido1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(apellido1Txt))
                                        .addGap(36, 36, 36)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(apellido2Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(apellido2Txt)))
                                    .addComponent(nameCondTxt)
                                    .addComponent(cedulaTxt)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(cityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(direccionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(cityTxt)
                                        .addGap(36, 36, 36)
                                        .addComponent(direccionTxt))
                                    .addComponent(TelTxt)
                                    .addComponent(TelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nameCondLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedulaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(soatTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(PassTxt)
                                                    .addComponent(EmailTxt)
                                                    .addComponent(PassLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(EmailLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(EPSLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EPSTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ARLLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ARLTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addComponent(soatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(cedulaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(nameCondLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(nameCondTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(apellido2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(TelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(soatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(soatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EPSLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(ARLLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EPSTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ARLTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(EmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PassLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

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

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String cedula = cedulaTxt.getText();
        String nombre = nameCondTxt.getText();
        String apellido1 = apellido1Txt.getText();
        String apellido2 = apellido2Txt.getText();
        String Tel = TelTxt.getText();
        String ciudad = cityTxt.getText();
        String direccion = direccionTxt.getText();
        String EPS = EPSTxt.getText();
        String ARL = ARLTxt.getText();
        String soat = soatTxt.getText();
        String Email = EmailTxt.getText();
        String Pass = PassTxt.getText();
        
        
        //Validaciones para los campos de texto
        // Si uno de lso campos requerido estpa vacío(isEmpty), ocurrirá lo siguiente:
        if(cedula.isEmpty() || nombre.isEmpty() || apellido1.isEmpty() || Tel.isEmpty() || ciudad.isEmpty() || direccion.isEmpty() || EPS.isEmpty() || ARL.isEmpty() || soat.isEmpty() || Email.isEmpty() || Pass.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            cedulaTxt.requestFocus();       //Establece el cursor en el campo de la cedula
            return;                         //Con esto, vamos a parar la ejecución del Boton, y paramos la incersión a la BD hasta que se llenen los campos requeridos
        }
            
                    
        com.models.Conductores conductor = isEdition ? conductorEdition : new com.models.Conductores();        //IF es una Edición, ENTONCES Asignale a la variable "conductor" lo que traigas en la "conductorEdition"(Es una Variable Global). SI NO se trata de una Edición de tipo conductor, CREA un NEW objeto de tipo "Conductores"
                                                                                                              // Y lo que traigas del objeto "conductor", rellenala con la info que se haya tecleado en los campos de abajo
        conductor.setId_conductor(Integer.parseInt(cedula));
        conductor.setNombre_cond(nombre);
        conductor.setApellido_1(apellido1);
        conductor.setApellido_2(apellido2);
        conductor.setTelefono(Tel);
        conductor.setCiudad(ciudad);
        conductor.setDireccion(direccion);
        conductor.setEPS(EPS);
        conductor.setARL(ARL);
        conductor.setSoat(soat);
        conductor.setEmail(Email);
        conductor.setContraseña(Pass);
        
        try {
            
            DAOConductor dao = new DAOConductorImpl();
            
            if (!isEdition){                //IF no es una edición, registralo. ELSE modificalo
                dao.registrar(conductor);
            } else {
                dao.modificar(conductor);
            }
            
            
            String successMsg = isEdition ? "Modificado" : "Registrado";
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario " + successMsg + " con Exito \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            if(!isEdition){
                cedulaTxt.setText("");
                nameCondTxt.setText("");
                apellido1Txt.setText("");
                apellido2Txt.setText("");
                TelTxt.setText("");
                cityTxt.setText("");
                direccionTxt.setText("");
                EPSTxt.setText("");
                ARLTxt.setText("");
                soatTxt.setText("");
                EmailTxt.setText("");
                PassTxt.setText("");
            }
            
        } catch(Exception e) {                    
            //Si hubo un error en la conexión con BD, o con la Incersión de Datos, entonces:
            System.out.println(e.getMessage()); 
            String errorMsg = isEdition ? "Modificar" : "Registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un Error al " + errorMsg + " al Usuario \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void apellido2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido2TxtActionPerformed

    private void apellido1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido1TxtActionPerformed

    private void cityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTxtActionPerformed

    private void direccionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxtActionPerformed

    private void EPSTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EPSTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EPSTxtActionPerformed

    private void ARLTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARLTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ARLTxtActionPerformed

    private void cedulaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaTxtActionPerformed

    private void nameCondTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCondTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameCondTxtActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ARLLbl;
    private javax.swing.JTextField ARLTxt;
    private javax.swing.JLabel EPSLbl;
    private javax.swing.JTextField EPSTxt;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel PassLbl;
    private javax.swing.JTextField PassTxt;
    private javax.swing.JLabel TelLbl;
    private javax.swing.JTextField TelTxt;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel apellido1Lbl;
    private javax.swing.JTextField apellido1Txt;
    private javax.swing.JLabel apellido2Lbl;
    private javax.swing.JTextField apellido2Txt;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel cedulaLbl;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel direccionLbl;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nameCondLbl;
    private javax.swing.JTextField nameCondTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel soatLbl;
    private javax.swing.JTextField soatTxt;
    // End of variables declaration//GEN-END:variables
}
