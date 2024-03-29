package FORMULARIOS;

import CLASES.Util;
import CLASES.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;

public class frm_GestionarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form frm_IngresarUsuario
     */
    public frm_GestionarUsuario() {
        initComponents();
        txt_Cedula.setEditable(false);
        txt_UserId.setEditable(false);
        txt_Password.setEditable(false);
        txt_Nombre.setEditable(false);
        txt_Apellido.setEditable(false);
        txt_Direccion.setEditable(false);
        btn_Guardar.setEnabled(false);
        btn_Editar.setEnabled(false);
        txt_Password.setEchoChar('*');
        this.centreWindow(this);

    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    public void emptyFields() {
        txt_Cedula.setText("");
        txt_UserId.setText("");
        txt_Password.setText("");
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Direccion.setText("");
    }

    public void EnableFields() {
        txt_UserId.setEditable(true);
        txt_Password.setEditable(true);
        txt_Nombre.setEditable(true);
        txt_Apellido.setEditable(true);
        txt_Direccion.setEditable(true);
    }

    public void disableFields() {
        txt_UserId.setEditable(false);
        txt_Password.setEditable(false);
        txt_Nombre.setEditable(false);
        txt_Apellido.setEditable(false);
        txt_Direccion.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_Buscar = new javax.swing.JButton();
        txt_searchCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_mostrar = new javax.swing.JLabel();
        lbl_ocultar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Cedula = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        txt_UserId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Buscar.setBackground(new java.awt.Color(0, 204, 204));
        btn_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 75, 30));

        txt_searchCedula.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel2.add(txt_searchCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 229, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cedula");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2022-06-25 at 6.39.58 PM.jpeg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 435, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Empleador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_mostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_eye_40px.png"))); // NOI18N
        lbl_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_mostrarMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 115, -1, -1));

        lbl_ocultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_eye_40px.png"))); // NOI18N
        lbl_ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_ocultarMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 115, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 125, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Primer Nombre");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 125, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Primer Apellido");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 125, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cedula");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 125, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Dirección");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 125, 30));

        txt_Cedula.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel3.add(txt_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 230, 30));

        txt_Nombre.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel3.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 230, 30));

        txt_Apellido.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel3.add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 230, 30));

        txt_Direccion.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel3.add(txt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 230, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Datos del Usuario");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Usuario");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 125, 30));

        txt_Password.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel3.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 230, 30));

        txt_UserId.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel3.add(txt_UserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 230, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2022-06-25 at 6.39.58 PM.jpeg"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 560));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 440, 300));

        btn_Guardar.setBackground(new java.awt.Color(153, 255, 204));
        btn_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 75, 30));

        btn_Regresar.setBackground(new java.awt.Color(153, 255, 204));
        btn_Regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Regresar.setText("Atrás");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 75, 30));

        btn_Editar.setBackground(new java.awt.Color(102, 255, 204));
        btn_Editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 75, 30));

        btn_Nuevo.setBackground(new java.awt.Color(102, 255, 204));
        btn_Nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 75, 30));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        Usuario obj_Usuario = new Usuario();
        Util decode = new Util();
        boolean checkerUser = obj_Usuario.db_SearchUser(txt_searchCedula.getText());
        emptyFields();
        if (txt_searchCedula.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID del Usuario para buscarlo.");
        } else {
            if (checkerUser) {
                disableFields();
                btn_Editar.setEnabled(true);
                btn_Guardar.setEnabled(false);
                txt_Cedula.setEditable(false);
                txt_Cedula.setText(obj_Usuario.getCedula());
                txt_UserId.setText(obj_Usuario.getUserId());
                txt_Password.setText(decode.decode(obj_Usuario.getPassword()));
                txt_Nombre.setText(obj_Usuario.getNombre1());
                txt_Apellido.setText(obj_Usuario.getApellido1());
                txt_Direccion.setText(obj_Usuario.getDireccion());
            } else {
                emptyFields();
                btn_Editar.setEnabled(true);
                JOptionPane.showMessageDialog(this, "El Usuario no fue encontrado\nRegrese presione Crear para generar un nuevo usuario");
            }
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Usuario obj_Usuario = new Usuario();
        boolean checkUser = obj_Usuario.db_SearchUser(txt_Cedula.getText());
        String pass = new String(txt_Password.getPassword());
        Util encode = new Util();
        String passEncode = encode.encode(pass);
        try {
            if (txt_Cedula.getText().length() == 0 || txt_UserId.getText().length() == 0 || pass.length() < 8 || txt_Nombre.getText().length() == 0 || txt_Apellido.getText().length() == 0 || txt_Direccion.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Debe rellenar todos los campos!!");
            } else {

                if (checkUser) {
                    if (this.getCrear_modificar() == 2) {
                        obj_Usuario.setCedula(txt_Cedula.getText());
                        obj_Usuario.setUserId(txt_UserId.getText());
                        obj_Usuario.setPassword(passEncode);
                        obj_Usuario.setNombre1(txt_Nombre.getText());
                        obj_Usuario.setApellido1(txt_Apellido.getText());
                        obj_Usuario.setDireccion(txt_Direccion.getText());
                        obj_Usuario.db_ModifyUser();
                        JOptionPane.showMessageDialog(this, "El usuario fue modificado con éxito!");
                        emptyFields();
                        btn_Guardar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Este usuario, ya se encuentra registrado en la base de datos.");
                        txt_Cedula.setText(obj_Usuario.getCedula());
                        txt_UserId.setText(obj_Usuario.getUserId());
                        txt_Password.setText(obj_Usuario.getPassword());
                        txt_Nombre.setText(obj_Usuario.getNombre1());
                        txt_Apellido.setText(obj_Usuario.getApellido1());
                        txt_Direccion.setText(obj_Usuario.getDireccion());
                    }
                } else {
                    txt_Cedula.setEditable(true);
                    if (this.getCrear_modificar() == 1) {
                        obj_Usuario.setCedula(txt_Cedula.getText());
                        obj_Usuario.setNombre1(txt_Nombre.getText());
                        obj_Usuario.setPassword(passEncode);
                        obj_Usuario.setUserId(txt_UserId.getText());
                        obj_Usuario.setApellido1(txt_Apellido.getText());
                        obj_Usuario.setDireccion(txt_Direccion.getText());
                        obj_Usuario.db_InsertUser();
                        JOptionPane.showMessageDialog(this, "El usuario fue insertado con éxito!");
                        btn_Guardar.setEnabled(false);
                        emptyFields();
                    } else {
                        JOptionPane.showMessageDialog(this, "Este usuario, ya se encuentra registrado en la base de datos.");
                        txt_Cedula.setText(obj_Usuario.getCedula());
                        txt_UserId.setText(obj_Usuario.getUserId());
                        txt_Password.setText(obj_Usuario.getPassword());
                        txt_Nombre.setText(obj_Usuario.getNombre1());
                        txt_Apellido.setText(obj_Usuario.getApellido1());
                        txt_Direccion.setText(obj_Usuario.getDireccion());
                    }
                }
            }
            txt_searchCedula.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Los datos del Usuario no lograron ser guardados");
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        frm_Principal obj_Principal = new frm_Principal();
        obj_Principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        EnableFields();
        setCrear_modificar(2);
        txt_Cedula.setEditable(false);
        btn_Editar.setEnabled(false);
        btn_Guardar.setEnabled(true);
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        EnableFields();
        emptyFields();
        setCrear_modificar(1);
        btn_Editar.setEnabled(false);
        btn_Guardar.setEnabled(true);
        txt_Cedula.setEditable(true);
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void lbl_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_mostrarMouseClicked
        lbl_mostrar.setVisible(false);
        lbl_ocultar.setVisible(true);
        txt_Password.setEchoChar((char) 0);
    }//GEN-LAST:event_lbl_mostrarMouseClicked

    private void lbl_ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ocultarMouseClicked
        lbl_mostrar.setVisible(true);
        lbl_ocultar.setVisible(false);
        txt_Password.setEchoChar('*');
    }//GEN-LAST:event_lbl_ocultarMouseClicked

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
            java.util.logging.Logger.getLogger(frm_GestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_GestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_GestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_GestionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_GestionarUsuario().setVisible(true);
            }
        });
    }

    private int crear_modificar;

    public int getCrear_modificar() {
        return crear_modificar;
    }

    public void setCrear_modificar(int crear_modificar) {
        this.crear_modificar = crear_modificar;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_mostrar;
    private javax.swing.JLabel lbl_ocultar;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_UserId;
    private javax.swing.JTextField txt_searchCedula;
    // End of variables declaration//GEN-END:variables
}
