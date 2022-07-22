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
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author termi
 */
public class frm_CrearPlanilla extends javax.swing.JFrame {

    /**
     * Creates new form frmCrearPlanilla
     */
    public frm_CrearPlanilla() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlanilla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("CALCULO DE PLANILLA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 29, -1, -1));

        btnMostrar.setBackground(new java.awt.Color(51, 255, 204));
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 142, 51));

        btnRegresar.setBackground(new java.awt.Color(255, 153, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, 100, 40));

        btnModificar.setBackground(new java.awt.Color(51, 255, 204));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 140, 50));

        btnAgregarEmpleado.setBackground(new java.awt.Color(51, 255, 204));
        btnAgregarEmpleado.setText("+Adicionar Empleado");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 153, 51));

        btnEliminarEmpleado.setBackground(new java.awt.Color(51, 255, 204));
        btnEliminarEmpleado.setText("-Eliminar Empleado");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 142, 51));

        tblPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre1", "Nombre2", "Apellido1", "Apellido2", "HT", "S xH", "Salario Bruto", "SS", "SE", "Salario Neto"
            }
        ));
        jScrollPane2.setViewportView(tblPlanilla);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 1083, 271));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/luz-de-neón-fondo-pared-ladrillo-habitación-abstracto-209837783.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 450));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        frm_CrearEmpleado FRM = new frm_CrearEmpleado();
        FRM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
       /* Empleado objEmpelado = new Empleado();
        int numFilaSeleccionada = tblPlanilla.getSelectedRow();
        int Desicion = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar a Este Empleado");
        if (Desicion == 0) {
            objEmpelado.setCedula((String) tblPlanilla.getValueAt(numFilaSeleccionada, 0));

            if (objEmpelado.EliminarEmpleado()) {
                JOptionPane.showMessageDialog(rootPane, "Usuario eliminado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se ha eliminado");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No Se Ha Eliminado el Empleado ");
        }*/
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        /*ArrayList<Empleado> lista = new ArrayList<>();
        Empleado objEmpelado = new Empleado();
        lista = objEmpelado.mostrarTodo();
        DefaultTableModel modelo = (DefaultTableModel) tblPlanilla.getModel();
        int cantidad = modelo.getRowCount();
        for (int i = 0; i < cantidad; i++) {
            modelo.removeRow(0);
        }
        for (int i = 0; i < lista.size(); i++) {
            String[] arr = {lista.get(i).getCedula(), lista.get(i).getNombre1(), lista.get(i).getNombre2(),
                lista.get(i).getApellido1(), lista.get(i).getApellido2(), lista.get(i).getHorasTrabajadas() + "",
                lista.get(i).getSalarioHoras() + "", lista.get(i).SalarioBruto() + "", lista.get(i).SeguroSocial() + "",
                lista.get(i).SeguroEducativo() + "", lista.get(i).SalarioNeto() + ""};
            modelo.addRow(arr);
        }*/
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frm_Principal obj_Principal = new frm_Principal();
        Usuario obj_Usuario = new Usuario();
        obj_Principal.setLblName(obj_Usuario.getCurrentUser());
        obj_Principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        /*Empleado objEmpelado = new Empleado();
        int numFilaSeleccionada = tblPlanilla.getSelectedRow();
        int Desicion = JOptionPane.showConfirmDialog(rootPane, "Desea Modificar a Este Empleado");

        if (Desicion == 0) {
            objEmpelado.setCedula((String) tblPlanilla.getValueAt(numFilaSeleccionada, 0));
            objEmpelado.setNombre1((String) tblPlanilla.getValueAt(numFilaSeleccionada, 1));
            objEmpelado.setNombre2((String) tblPlanilla.getValueAt(numFilaSeleccionada, 2));
            objEmpelado.setApellido1((String) tblPlanilla.getValueAt(numFilaSeleccionada, 3));
            objEmpelado.setApellido2((String) tblPlanilla.getValueAt(numFilaSeleccionada, 4));
            objEmpelado.setSalarioHoras(Double.parseDouble((String) tblPlanilla.getValueAt(numFilaSeleccionada, 5)));
            objEmpelado.setHorasTrabajadas(Double.parseDouble((String) tblPlanilla.getValueAt(numFilaSeleccionada, 6)));

            if (objEmpelado.ModificarEmpleado()) {
                JOptionPane.showMessageDialog(rootPane, "Usuario Modificado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se Ha Modificado");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No Se Ha Modoficado el Empleado ");
        }
         */
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_CrearPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_CrearPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_CrearPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_CrearPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frm_CrearPlanilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPlanilla;
    // End of variables declaration//GEN-END:variables
}
