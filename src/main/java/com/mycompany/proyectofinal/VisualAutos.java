/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import datos.AutosDAOJDBC;
import domain.AutosDTO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.*;

/**
 *
 * @author chinc
 */
public class VisualAutos extends javax.swing.JFrame {

    /**
     * Creates new form VisualAutos
     */
    public VisualAutos() {
        initComponents();
        mostrardatos();
        CargarData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtKm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Eliminar = new javax.swing.JButton();
        AGREGAR = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        AGREGAR2 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLEDATOS = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jLabel1.setText("REGISTROS AUTOS BARKAIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("MARCA:");

        txtMarca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("MODELO:");

        txtModelo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("COLOR:");

        txtColor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("KILOMETRAJE/KM:");

        txtKm.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtKm.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("CODIGO AUTO:");

        txtCodigo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 51, 51));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKm, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));

        Eliminar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        AGREGAR.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        Modificar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        AGREGAR2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        AGREGAR2.setText("NUEVO");

        Regresar.setBackground(new java.awt.Color(255, 51, 51));
        Regresar.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Regresar.setText("REGRESAR");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(Regresar)
                .addGap(75, 75, 75)
                .addComponent(Eliminar)
                .addGap(114, 114, 114)
                .addComponent(AGREGAR)
                .addGap(102, 102, 102)
                .addComponent(Modificar)
                .addGap(110, 110, 110)
                .addComponent(AGREGAR2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(AGREGAR)
                    .addComponent(Modificar)
                    .addComponent(AGREGAR2)
                    .addComponent(Regresar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        JTABLEDATOS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JTABLEDATOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTABLEDATOS);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("--------- GESTOR / MODIFICADOR INVENTARIO AUTOS ---------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
 AutosDAOJDBC autoJdbc = new AutosDAOJDBC();
        AutosDTO car = new AutosDTO();
        try {
            
            car.setMarca(txtMarca.getText());
            car.setModelo(txtModelo.getText());
            car.setColor(txtColor.getText());
            car.setKilometraje(Integer.parseInt(txtKm.getText()));
            
       
            autoJdbc.insert(car);
            CargarData();
            limpiar();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar "+ex);
        }      
  
    }//GEN-LAST:event_AGREGARActionPerformed
private void Modificar(){
     AutosDAOJDBC autojdbc = new AutosDAOJDBC();
        AutosDTO car = new AutosDTO();
        try {
            car.setid_autos(Integer.parseInt(txtCodigo.getText()));
           
           car.setMarca(txtMarca.getText());
            car.setModelo(txtModelo.getText());
            car.setColor(txtColor.getText());
            car.setKilometraje(Integer.parseInt(txtKm.getText()));
           
            autojdbc.update(car);
            CargarData();
            limpiar();       
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this, "Hay un error en la modificacion "+ex); 
        }    
}
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
       Modificar();
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    AutosDAOJDBC autojdbc = new AutosDAOJDBC();
        AutosDTO car = new AutosDTO();
        
        try {
            car.setid_autos(Integer.parseInt(txtCodigo.getText()));
            autojdbc.delete(car);
            CargarData();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        visualAccess form = new visualAccess();
        dispose();
        form.show();
        
    }//GEN-LAST:event_RegresarActionPerformed

    private void limpiar(){
        txtCodigo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtKm.setText("");
    
    }
    
    private void CargarData(){
        try{
            AutosDAOJDBC carJDBC = new AutosDAOJDBC();
            List<AutosDTO> cars = carJDBC.select();
             DefaultTableModel modeloTabla = (DefaultTableModel) JTABLEDATOS.getModel();
            modeloTabla.setRowCount(0);
            Object[] fila = new Object[5];    
            for(AutosDTO Auto: cars){  
                    fila[0] = Auto.getid_autos();
                    fila[1] = Auto.getMarca();
                    fila[2] = Auto.getModelo();
                    fila[3] = Auto.getColor();
                    fila[4] = Auto.getKilometraje();
                 
                    modeloTabla.addRow(fila);
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "OJO...! ERROR AL CARGAR "+ ex);
        }
    }
    
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualAutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    private javax.swing.JButton AGREGAR2;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable JTABLEDATOS;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
private void mostrardatos() {
       DefaultTableModel modelo=new DefaultTableModel();
       modelo.addColumn("Codigo Auto");
       modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Kilometraje/km");
       JTABLEDATOS.setModel(modelo);
       String consultasql = "select * from autos";
       String data[]=new String[5];
 
        try {
            data[0]=txtCodigo.getText();
            data[1]=txtMarca.getText();
            data[2]=txtModelo.getText();
            data[3]=txtColor.getText();
            data[4]=txtKm.getText();
            
            
        } catch (Exception e) {
        }
}
}
