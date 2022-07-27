/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import CLASES.Empleado;
import CLASES.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class frm_DatosPlanilla extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_DatosPlanilla
     */
    public frm_DatosPlanilla() {
        initComponents();

        centreWindow(this);
    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerPlanilla = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbAño = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();
        cmbDia = new javax.swing.JComboBox<>();
        btnCrearPlanilla = new javax.swing.JButton();
        btnAdicionarEmpleado = new javax.swing.JButton();

        btnVerPlanilla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerPlanilla.setText("Ver Planilla");
        btnVerPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPlanillaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Planilla"));

        jLabel1.setText("Seleccione la Fecha");

        cmbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", " " }));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        btnCrearPlanilla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearPlanilla.setText("Crear Planilla");
        btnCrearPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlanillaActionPerformed(evt);
            }
        });

        btnAdicionarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdicionarEmpleado.setText("Adicionar Empleado");
        btnAdicionarEmpleado.setEnabled(false);
        btnAdicionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCrearPlanilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdicionarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlanillaActionPerformed
        Empleado obj_emp = new Empleado();
        if (cmbAño.getSelectedIndex() == 0 || cmbMes.getSelectedIndex() == 0 || cmbDia.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Rellene todos los Campos");
        } else {
            obj_emp.setAño(this.cmbAño.getItemAt(cmbAño.getSelectedIndex()));
            obj_emp.setMes(this.cmbMes.getSelectedIndex() + "");
            obj_emp.setDia(this.cmbDia.getSelectedIndex() + "");
            int dia, mes;
            dia = Integer.parseInt(obj_emp.getDia());
            mes = Integer.parseInt(obj_emp.getMes());
            int intPlanilla = 0;
            if (dia < 10 || mes < 10) {
                intPlanilla = Integer.parseInt(obj_emp.getAño() + "0" + obj_emp.getMes() + "0" + obj_emp.getDia());
            } else if (dia < 10) {
                intPlanilla = Integer.parseInt(obj_emp.getAño() + "" + obj_emp.getMes() + "0" + obj_emp.getDia());
            } else if (mes < 10) {
                intPlanilla = Integer.parseInt(obj_emp.getAño() + "0" + obj_emp.getMes() + "" + obj_emp.getDia());
            } else {
                intPlanilla = Integer.parseInt(obj_emp.getAño() + "" + obj_emp.getMes() + "" + obj_emp.getDia());
            }
            if (intPlanilla > obj_emp.db_intLastPlanilla()) {
                obj_emp.db_Insert_Planilla();
                JOptionPane.showMessageDialog(null, "Planilla insertada correctamente");
                btnAdicionarEmpleado.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No puede ingresar planillas anteriores a la planilla actual");
                btnAdicionarEmpleado.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnCrearPlanillaActionPerformed

    private void btnVerPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPlanillaActionPerformed
        frm_Planilla next_frm = new frm_Planilla();
        next_frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerPlanillaActionPerformed

    private void btnAdicionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEmpleadoActionPerformed
        // TODO add your handling code here:

        frm_SeleccionSalario frm = new frm_SeleccionSalario();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdicionarEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frm_DatosPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_DatosPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_DatosPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_DatosPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        new frm_DatosPlanilla().setVisible(true);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEmpleado;
    private javax.swing.JButton btnCrearPlanilla;
    private javax.swing.JButton btnVerPlanilla;
    private javax.swing.JComboBox<String> cmbAño;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
