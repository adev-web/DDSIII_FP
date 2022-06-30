/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import CLASES.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author termi
 */
public class frm_VerUsuario extends javax.swing.JFrame {

  /**
   * Creates new form frmBuscarUsuario
   */
  public frm_VerUsuario() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtCedulaBuscar = new javax.swing.JTextField();
    btnBuscarUsu = new javax.swing.JButton();
    jLabel12 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    cmbAño = new javax.swing.JComboBox<>();
    cmbMes = new javax.swing.JComboBox<>();
    cmbDia = new javax.swing.JComboBox<>();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    txtCedula = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    txtNombre2 = new javax.swing.JTextField();
    txtApellido = new javax.swing.JTextField();
    txtApellido2 = new javax.swing.JTextField();
    txtDireccion = new javax.swing.JTextField();
    txtTelefono = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    btnCrear = new javax.swing.JButton();
    btnAtras = new javax.swing.JButton();
    btnModificar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(0, 204, 204));
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel1.setText("Cedula");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 43, -1, -1));
    jPanel2.add(txtCedulaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 40, 229, -1));

    btnBuscarUsu.setText("Buscar");
    btnBuscarUsu.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarUsuActionPerformed(evt);
      }
    });
    jPanel2.add(btnBuscarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 40, -1, -1));

    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2022-06-25 at 6.39.58 PM.jpeg"))); // NOI18N
    jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, -1, -1));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 435, 90));

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Empleador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
    jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel2.setText("Primer Nombre");
    jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setText("Segundo Nombre");
    jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel4.setText("Primer Apellido");
    jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

    jLabel5.setText("Segundo Apellido");
    jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel6.setText("Cedula");
    jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

    jLabel7.setText("Fecha de Nacimiento");
    jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

    cmbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", " " }));
    cmbAño.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbAñoActionPerformed(evt);
      }
    });
    jPanel3.add(cmbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

    cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
    cmbMes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbMesActionPerformed(evt);
      }
    });
    jPanel3.add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

    cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
    jPanel3.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel8.setText("Direccion");
    jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

    jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel9.setText("Telefono");
    jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
    jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 299, -1));
    jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 299, -1));
    jPanel3.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 298, -1));
    jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 298, -1));
    jPanel3.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 298, -1));
    jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 298, -1));
    jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 298, -1));

    jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel10.setText("Datos Del Usuario");
    jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

    jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2022-06-25 at 6.39.58 PM.jpeg"))); // NOI18N
    jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 560));

    jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 440, 400));

    btnCrear.setBackground(new java.awt.Color(153, 255, 204));
    btnCrear.setText("+CREAR");
    btnCrear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCrearActionPerformed(evt);
      }
    });
    jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 90, 40));

    btnAtras.setBackground(new java.awt.Color(153, 255, 204));
    btnAtras.setText("ATRAS");
    btnAtras.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAtrasActionPerformed(evt);
      }
    });
    jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 80, 40));

    btnModificar.setBackground(new java.awt.Color(102, 255, 204));
    btnModificar.setText("Modificar");
    btnModificar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnModificarActionPerformed(evt);
      }
    });
    jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, 40));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuActionPerformed
      Usuario obj_Usuario = new Usuario();
      obj_Usuario.setCedula(txtCedulaBuscar.getText());
      if (obj_Usuario.Buscar()) {
        txtCedula.setText(obj_Usuario.getCedula());
        txtNombre.setText(obj_Usuario.getNombre1());
        txtNombre2.setText(obj_Usuario.getNombre2());
        txtApellido.setText(obj_Usuario.getApellido1());
        txtApellido2.setText(obj_Usuario.getApellido2());
        cmbAño.setSelectedItem(obj_Usuario.getAño());
        cmbMes.setSelectedItem(obj_Usuario.getMes());
        cmbDia.setSelectedItem(obj_Usuario.getDia());
        txtDireccion.setText(obj_Usuario.getDireccion());
        txtTelefono.setText(obj_Usuario.getTelefono());
      } else {
        txtCedula.setText("");
        txtNombre.setText("");
        txtNombre2.setText("");
        txtApellido.setText("");
        txtApellido2.setText("");
        cmbAño.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
        txtDireccion.setText("");
        txtTelefono.setText("");
        JOptionPane.showMessageDialog(this, "El Usuario no fue encontrado\nRegrese presione Crear para generar un nuevo usuario");
        //System.err.print(cmbAño.getSelectedIndex());
      }

    }//GEN-LAST:event_btnBuscarUsuActionPerformed

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
      frm_CrearEmpleado frm = new frm_CrearEmpleado();
      frm.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
      frm_Principal obj_Principal = new frm_Principal();
      Usuario obj_Usuario = new Usuario();
      obj_Principal.setLblName(obj_Usuario.getCurrentUser());
      obj_Principal.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cmbAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAñoActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_cmbAñoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      Usuario obj_Usuario = new Usuario();
      obj_Usuario.setCedulaSearch(txtCedulaBuscar.getText());
      if (txtCedulaBuscar.getText().length() > 0 && txtCedula.getText().length() > 0 && txtNombre.getText().length() > 0 && txtNombre2.getText().length() > 0 && txtApellido.getText().length() > 0 && txtApellido2.getText().length() > 0 && txtDireccion.getText().length() > 0 && txtTelefono.getText().length() > 0 && cmbDia.getSelectedIndex() > 0 && cmbMes.getSelectedIndex() > 0 && cmbAño.getSelectedIndex() > 0) {
        obj_Usuario.setCedula(txtCedula.getText());
        obj_Usuario.setNombre1(txtNombre.getText());
        obj_Usuario.setNombre2(txtNombre2.getText());
        obj_Usuario.setApellido1(txtApellido.getText());
        obj_Usuario.setApellido2(txtApellido2.getText());
        obj_Usuario.setAño(cmbAño.getItemAt(cmbAño.getSelectedIndex()));
        obj_Usuario.setDia(cmbDia.getItemAt(cmbDia.getSelectedIndex()));
        obj_Usuario.setMes(cmbMes.getItemAt(cmbMes.getSelectedIndex()));
        obj_Usuario.setDireccion(txtDireccion.getText());
        obj_Usuario.setTelefono(txtTelefono.getText());
        //System.out.println(obj_Usuario.ModificarUsuario());
        //obj_Usuario.ModificarUsuario();
        if (obj_Usuario.ModificarUsuario()) {
          JOptionPane.showMessageDialog(this, "El Usuario fue actualizado");
        } else {
          JOptionPane.showMessageDialog(this, "El Usuario no pudo ser actualizado");
        }
      } else {
        JOptionPane.showMessageDialog(this, "El Usuario no puede actualizarse si hay campos vacíos");
      }

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
      java.util.logging.Logger.getLogger(frm_VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(frm_VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(frm_VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(frm_VerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
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
        new frm_VerUsuario().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAtras;
  private javax.swing.JButton btnBuscarUsu;
  private javax.swing.JButton btnCrear;
  private javax.swing.JButton btnModificar;
  private javax.swing.JComboBox<String> cmbAño;
  private javax.swing.JComboBox<String> cmbDia;
  private javax.swing.JComboBox<String> cmbMes;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JTextField txtApellido;
  private javax.swing.JTextField txtApellido2;
  private javax.swing.JTextField txtCedula;
  private javax.swing.JTextField txtCedulaBuscar;
  private javax.swing.JTextField txtDireccion;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtNombre2;
  private javax.swing.JTextField txtTelefono;
  // End of variables declaration//GEN-END:variables
}
