/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import CLASES.Usuario;

/**
 *
 * @author termi
 */
public class frm_Principal extends javax.swing.JFrame {

  /**
   * Creates new form FRMPRINCIPAL
   */
  public frm_Principal() {
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
    btnCrearUsuario = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    btnVerEmpleado = new javax.swing.JLabel();
    btnCrearPlanilla = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    JLBexit = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU PRINCIPAL"));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    btnCrearUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    btnCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_add_user_male_96px.png"))); // NOI18N
    btnCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    btnCrearUsuario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(java.awt.event.MouseEvent evt) {
        btnCrearUsuarioMouseMoved(evt);
      }
    });
    btnCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnCrearUsuarioMouseClicked(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnCrearUsuarioMouseExited(evt);
      }
    });
    jPanel1.add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 120));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 233, 222));
    jLabel3.setText("Crear Usuario");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

    btnVerEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    btnVerEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_find_user_male_96px.png"))); // NOI18N
    btnVerEmpleado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(java.awt.event.MouseEvent evt) {
        btnVerEmpleadoMouseMoved(evt);
      }
    });
    btnVerEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnVerEmpleadoMouseClicked(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnVerEmpleadoMouseExited(evt);
      }
    });
    jPanel1.add(btnVerEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 140, 120));

    btnCrearPlanilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    btnCrearPlanilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_insert_table_96px_9.png"))); // NOI18N
    btnCrearPlanilla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(java.awt.event.MouseEvent evt) {
        btnCrearPlanillaMouseMoved(evt);
      }
    });
    btnCrearPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnCrearPlanillaMouseClicked(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btnCrearPlanillaMouseExited(evt);
      }
    });
    jPanel1.add(btnCrearPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 130, 120));

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(51, 255, 255));
    jLabel5.setText("Ver Usuario");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 51, 153));
    jLabel6.setText("Crear Planilla");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 110, 30));

    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_user_150px_2.png"))); // NOI18N
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 160, 140));

    lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    lblNombre.setForeground(new java.awt.Color(255, 255, 51));
    lblNombre.setText("Jose Gonzalez");
    jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 250, 40));

    JLBexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_Close_40px_2.png"))); // NOI18N
    JLBexit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
      public void mouseMoved(java.awt.event.MouseEvent evt) {
        JLBexitMouseMoved(evt);
      }
    });
    JLBexit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        JLBexitMouseClicked(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        JLBexitMouseExited(evt);
      }
    });
    jPanel1.add(JLBexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 40));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo-color-verde-azul-neon-claro-fondo-degradado-borroso-abstracto-plantilla-banner_335640-3440 (1).jpg"))); // NOI18N
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 790, 450));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseClicked

      frm_CrearUsuario FRM = new frm_CrearUsuario();
      FRM.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnCrearUsuarioMouseClicked

    private void btnCrearUsuarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseMoved

      btnCrearUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

    }//GEN-LAST:event_btnCrearUsuarioMouseMoved

    private void btnCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearUsuarioMouseExited
      btnCrearUsuario.setBorder(null);
    }//GEN-LAST:event_btnCrearUsuarioMouseExited

    private void btnVerEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEmpleadoMouseClicked
      frm_VerUsuario frm = new frm_VerUsuario();
      frm.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnVerEmpleadoMouseClicked

    private void btnVerEmpleadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEmpleadoMouseMoved

      btnVerEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));


    }//GEN-LAST:event_btnVerEmpleadoMouseMoved

    private void btnVerEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEmpleadoMouseExited

      btnVerEmpleado.setBorder(null);

    }//GEN-LAST:event_btnVerEmpleadoMouseExited

    private void btnCrearPlanillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPlanillaMouseClicked
      frm_CrearPlanilla FRM = new frm_CrearPlanilla();
      FRM.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnCrearPlanillaMouseClicked

    private void btnCrearPlanillaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPlanillaMouseMoved

      btnCrearPlanilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));


    }//GEN-LAST:event_btnCrearPlanillaMouseMoved

    private void btnCrearPlanillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearPlanillaMouseExited

      btnCrearPlanilla.setBorder(null);

    }//GEN-LAST:event_btnCrearPlanillaMouseExited

    private void JLBexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBexitMouseClicked

      System.exit(0);


    }//GEN-LAST:event_JLBexitMouseClicked

    private void JLBexitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBexitMouseMoved

      JLBexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));


    }//GEN-LAST:event_JLBexitMouseMoved

  public void setLblName(String userValue) {
    this.lblNombre.setText(userValue);
  }

    private void JLBexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBexitMouseExited

      JLBexit.setBorder(null);


    }//GEN-LAST:event_JLBexitMouseExited

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
      java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        new frm_Principal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel JLBexit;
  private javax.swing.JLabel btnCrearPlanilla;
  private javax.swing.JLabel btnCrearUsuario;
  private javax.swing.JLabel btnVerEmpleado;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblNombre;
  // End of variables declaration//GEN-END:variables
}
