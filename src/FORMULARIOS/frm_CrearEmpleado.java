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
 * @author termi
 */
public class frm_CrearEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form frmAÑADIRempleado
     */
    public frm_CrearEmpleado() {
        initComponents();
        txtNombre.setEditable(false);
        txtNombre2.setEditable(false);
        txtApellido.setEditable(false);
        txtApellido2.setEditable(false);
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
    btnAtras = new javax.swing.JButton();
    btnAgregar = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtHorasTrabajadas = new javax.swing.JTextField();
    txtSalario = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    txtNombre2 = new javax.swing.JTextField();
    txtApellido = new javax.swing.JTextField();
    txtApellido2 = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txtCedula = new javax.swing.JTextField();
    btnBuscar = new javax.swing.JButton();
    jLabel9 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btnAtras.setBackground(new java.awt.Color(255, 102, 102));
    btnAtras.setText("<<ATRAS");
    btnAtras.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAtrasActionPerformed(evt);
      }
    });
    jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 90, 42));

    btnAgregar.setBackground(new java.awt.Color(0, 153, 153));
    btnAgregar.setText("+AGREGAR");
    btnAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarActionPerformed(evt);
      }
    });
    jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 92, 42));

    jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 0, 204));
    jLabel6.setText("Horas Trabajadas");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

    jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 0, 204));
    jLabel7.setText("Salario Por hora");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

    txtHorasTrabajadas.setBackground(new java.awt.Color(255, 204, 204));
    txtHorasTrabajadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jPanel1.add(txtHorasTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 314, -1));

    txtSalario.setBackground(new java.awt.Color(255, 204, 204));
    txtSalario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 314, -1));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 0, 204));
    jLabel1.setText("Pimer Nombre");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 0, 204));
    jLabel2.setText("Segundo Nombre");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 0, 204));
    jLabel3.setText("Primer Apellido");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 0, 204));
    jLabel4.setText("Segundo Apellido");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

    txtNombre.setBackground(new java.awt.Color(255, 204, 204));
    jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 234, -1));

    txtNombre2.setBackground(new java.awt.Color(255, 204, 204));
    jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 234, -1));

    txtApellido.setBackground(new java.awt.Color(255, 204, 204));
    jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 234, -1));

    txtApellido2.setBackground(new java.awt.Color(255, 204, 204));
    txtApellido2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jPanel1.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 234, -1));

    jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 0, 204));
    jLabel5.setText("Cedula");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 60, 40));

    txtCedula.setBackground(new java.awt.Color(255, 204, 255));
    txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 260, 40));

    btnBuscar.setBackground(new java.awt.Color(153, 255, 204));
    btnBuscar.setText("Buscar");
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarActionPerformed(evt);
      }
    });
    jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, 40));

    jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(0, 204, 204));
    jLabel9.setText("Datos del Empleado");
    jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

    jLabel8.setBackground(new java.awt.Color(255, 204, 204));
    jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/descargar6.jpg"))); // NOI18N
    jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 560));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        /*
        Usuario obj_Usuario = new Usuario();
        Empleado obj_Empleado = new Empleado();
        obj_Usuario.setCedula(txtCedula.getText());
        obj_Empleado.setCedula(txtCedula.getText());
        if (obj_Empleado.Buscar() == false) {
            if (txtNombre.getText().length() < 1 || txtNombre2.getText().length() < 1 || txtApellido.getText().length() < 1 || txtApellido2.getText().length() < 1 || txtHorasTrabajadas.getText().length() < 1 || txtSalario.getText().length() < 1) {
                JOptionPane.showMessageDialog(this, "No pueden agregarse empleados si hay campos vacios");
            } else {
                obj_Empleado.setNombre1(txtNombre.getText());
                obj_Empleado.setNombre2(txtNombre2.getText());
                obj_Empleado.setApellido1(txtApellido.getText());
                obj_Empleado.setApellido2(txtApellido2.getText());
                obj_Empleado.setHorasTrabajadas(Double.parseDouble(txtHorasTrabajadas.getText()));
                obj_Empleado.setSalarioHoras(Double.parseDouble(txtSalario.getText()));
                JOptionPane.showMessageDialog(this, "Empleado encontrado: " + obj_Empleado.Buscar());
            }
        } else {
            JOptionPane.showMessageDialog(this, "El empleado ya existe");
        }*/
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed


    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(frm_CrearEmpleado.class
                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_CrearEmpleado.class
                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_CrearEmpleado.class
                .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_CrearEmpleado.class
                .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_CrearEmpleado().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAgregar;
  private javax.swing.JButton btnAtras;
  private javax.swing.JButton btnBuscar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtApellido;
  private javax.swing.JTextField txtApellido2;
  private javax.swing.JTextField txtCedula;
  private javax.swing.JTextField txtHorasTrabajadas;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtNombre2;
  private javax.swing.JTextField txtSalario;
  // End of variables declaration//GEN-END:variables
}
