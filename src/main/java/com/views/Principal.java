/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.views;

import java.awt.Color;

/**
 *
 * @author Flia Castiblanco
 */
public class Principal extends javax.swing.JPanel {
    
    
    
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        InitStyles();
                        
        
    }

    private void InitStyles(){
        ViewTxt1.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        ViewTxt1.setForeground(Color.black);
        ViewTxt2.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt2.setForeground(Color.black);
        ViewTxt3.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt3.setForeground(Color.black);        
        ViewTxt5.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt5.setForeground(Color.black);
        ViewTxt6.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt6.setForeground(Color.black);
        ViewTxt7.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt7.setForeground(Color.black);
        ViewTxt8.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt8.setForeground(Color.black);
        ViewTxt9.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt9.setForeground(Color.black);
        ViewTxt10.putClientProperty( "FlatLaf.styleClass", "large" );
        ViewTxt10.setForeground(Color.black);
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
        imgView = new javax.swing.JLabel();
        ViewTxt1 = new javax.swing.JLabel();
        ViewTxt2 = new javax.swing.JLabel();
        ViewTxt3 = new javax.swing.JLabel();
        ViewTxt5 = new javax.swing.JLabel();
        ViewTxt6 = new javax.swing.JLabel();
        ViewTxt7 = new javax.swing.JLabel();
        ViewTxt8 = new javax.swing.JLabel();
        ViewTxt9 = new javax.swing.JLabel();
        ViewTxt10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(750, 430));

        imgView.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/camiones2.png"))); // NOI18N
        imgView.setMaximumSize(getMaximumSize());

        ViewTxt1.setLabelFor(ViewTxt1);
        ViewTxt1.setText("Bienvenido Carlos...");

        ViewTxt2.setText("A tu Plataforma de gestión de AC CARGA ESPECIALIZADA. Garantiza el cumplimiento de las normativas");

        ViewTxt3.setText("y Mejora la eficiencia en la gestión de la flota y la carga con esta herramienta.");

        ViewTxt5.setText("Aquí podrás llevar un control detallado del flujo de operaciones logísticas,");

        ViewTxt6.setText("gracias a herramientas de:");

        ViewTxt7.setText("• Aprobación de los checklists de seguridad antes de cada viaje");

        ViewTxt8.setText("• Gestión de información de Conductores");

        ViewTxt9.setText("• Supervisión de asignación de tareas");

        ViewTxt10.setText("• Gestión de Vehículos y Oficinas");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTxt6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTxt5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTxt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addGap(129, 129, 129))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewTxt10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTxt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTxt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewTxt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(308, 308, 308))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(imgView, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ViewTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(ViewTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ViewTxt5, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewTxt6, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(ViewTxt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(ViewTxt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(ViewTxt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(ViewTxt10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addComponent(imgView, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
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

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ViewTxt1;
    private javax.swing.JLabel ViewTxt10;
    private javax.swing.JLabel ViewTxt2;
    private javax.swing.JLabel ViewTxt3;
    private javax.swing.JLabel ViewTxt5;
    private javax.swing.JLabel ViewTxt6;
    private javax.swing.JLabel ViewTxt7;
    private javax.swing.JLabel ViewTxt8;
    private javax.swing.JLabel ViewTxt9;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel imgView;
    // End of variables declaration//GEN-END:variables
}
