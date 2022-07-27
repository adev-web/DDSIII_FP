/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import CLASES.Empleado;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;

public class frm_GestionarEmpleado extends javax.swing.JFrame {

    public frm_GestionarEmpleado() {
        initComponents();
        txtCurrentCedula.setEditable(false);
        txtNombre.setEditable(false);
        txtNombre2.setEditable(false);
        txtApellido.setEditable(false);
        txtApellido2.setEditable(false);
        cmbAño.setEnabled(true);
        cmbMes.setEnabled(true);
        cmbDia.setEnabled(true);
        txtDireccion.setEditable(false);
        txtTelefono.setEditable(false);
        btn_Guardar.setEnabled(false);
        btn_Editar.setEnabled(false);
        btn_Atras.setEnabled(true);
        centreWindow(this);
    }

    private int crear_modificar;

    public int getCrear_modificar() {
        return crear_modificar;
    }

    public void setCrear_modificar(int crear_modificar) {
        this.crear_modificar = crear_modificar;
    }

    public void emptyFields() {
        txtCurrentCedula.setText("");
        txtNombre.setText("");
        txtNombre2.setText("");
        txtApellido.setText("");
        txtApellido2.setText("");
        cmbAño.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbDia.setSelectedIndex(0);
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    public void EnableFields() {
        txtNombre.setEditable(true);
        txtNombre2.setEditable(true);
        txtApellido.setEditable(true);
        txtApellido2.setEditable(true);
        cmbAño.setEnabled(true);
        cmbMes.setEnabled(true);
        cmbDia.setEnabled(true);
        txtDireccion.setEditable(true);
        txtTelefono.setEditable(true);
    }

    public void disableFields() {
        txtCurrentCedula.setEditable(false);
        txtNombre.setEditable(false);
        txtNombre2.setEditable(false);
        txtApellido.setEditable(false);
        txtApellido2.setEditable(false);
        cmbAño.setEnabled(true);
        cmbMes.setEnabled(true);
        cmbDia.setEnabled(true);
        txtDireccion.setEditable(false);
        txtTelefono.setEditable(false);

    }

    public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_Buscar = new javax.swing.JButton();
        txtSearchCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        txtCurrentCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_Atras = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 40, -1, -1));
        jPanel2.add(txtSearchCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 40, 229, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cedula");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 43, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2022-06-25 at 6.39.58 PM.jpeg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 435, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Empleador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Primer Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Segundo Nombre");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Primer Apellido");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Segundo Apellido");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cedula");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 20));

        cmbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", " " }));
        jPanel3.add(cmbAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 75, 20));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        jPanel3.add(cmbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 240, 100, 20));

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 240, 60, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Direccion");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Telefono");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 20));

        txtCurrentCedula.setEditable(false);
        jPanel3.add(txtCurrentCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 30));

        txtNombre.setEditable(false);
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 260, 30));

        txtNombre2.setEditable(false);
        jPanel3.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 260, 30));

        txtApellido.setEditable(false);
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 260, 30));

        txtApellido2.setEditable(false);
        jPanel3.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 260, 30));

        txtDireccion.setEditable(false);
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 260, 30));

        txtTelefono.setEditable(false);
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 260, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Datos del Empleado");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2022-06-25 at 6.39.58 PM.jpeg"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 560));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 440, 400));

        btn_Guardar.setBackground(new java.awt.Color(153, 255, 204));
        btn_Guardar.setText("Guardar");
        btn_Guardar.setEnabled(false);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 565, 75, 30));

        btn_Atras.setBackground(new java.awt.Color(153, 255, 204));
        btn_Atras.setText("Atrás");
        btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 565, 75, 30));

        btn_Editar.setBackground(new java.awt.Color(102, 255, 204));
        btn_Editar.setText("Editar");
        btn_Editar.setEnabled(false);
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 565, 75, 30));

        btn_Nuevo.setBackground(new java.awt.Color(102, 255, 204));
        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 565, 75, 30));

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

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        Empleado obj_Empleado = new Empleado();
        btn_Guardar.setEnabled(false);
        boolean checkUsuario = obj_Empleado.db_SearchEmpleado(txtSearchCedula.getText());
        emptyFields();
        //////////////////////////////
        if (txtSearchCedula.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, ""
                + "Ingrese el ID del Empleado para buscarlo.");
        } else {
            if (checkUsuario) {
                disableFields();
                txtCurrentCedula.setEditable(false);
                btn_Editar.setEnabled(true);
                txtCurrentCedula.setText(obj_Empleado.getCedula());
                txtNombre.setText(obj_Empleado.getNombre1());
                txtNombre2.setText(obj_Empleado.getNombre2());
                txtApellido.setText(obj_Empleado.getApellido1());
                txtApellido2.setText(obj_Empleado.getApellido2());
                cmbAño.setSelectedItem((obj_Empleado.getAño()));
                cmbMes.setSelectedIndex(Integer.parseInt(obj_Empleado.getMes()));
                cmbDia.setSelectedIndex(Integer.parseInt(obj_Empleado.getDia()));
                txtDireccion.setText(obj_Empleado.getDireccion());
                txtTelefono.setText(obj_Empleado.getTelefono());
                btn_Editar.setEnabled(true);
            } else {
                emptyFields();
                btn_Editar.setEnabled(false);
                JOptionPane.showMessageDialog(this, ""
                    + "El empleado no se encuentra almacenado en la base de datos."
                    + "\nHaga click en el boton 'Nuevo', llene todos los campos\n"
                    + "y presione el boton 'Guardar'.");
            }
        }
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Empleado obj_Empleado = new Empleado();
        boolean checkEmpleado = obj_Empleado.db_SearchEmpleado(txtCurrentCedula.getText());
        if (txtCurrentCedula.getText().length() == 0 || txtNombre.getText().length() == 0 || txtNombre2.getText().length() == 0 || txtApellido.getText().length() == 0 || txtApellido2.getText().length() == 0 || txtDireccion.getText().length() == 0 || txtTelefono.getText().length() == 0 || cmbAño.getSelectedIndex() == 0 || cmbMes.getSelectedIndex() == 0 || cmbDia.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "RELLENE TODOS LOS ESPACIOS!!");
        } else {
            if (checkEmpleado) {
                if (this.getCrear_modificar() == 2) {
                    obj_Empleado.setCedula(txtCurrentCedula.getText());
                    obj_Empleado.setNombre1(txtNombre.getText());
                    obj_Empleado.setNombre2(txtNombre2.getText());
                    obj_Empleado.setApellido1(txtApellido.getText());
                    obj_Empleado.setApellido2(txtApellido2.getText());
                    obj_Empleado.setAño(cmbAño.getItemAt(cmbAño.getSelectedIndex()));
                    obj_Empleado.setMes(cmbMes.getSelectedIndex() + "");
                    obj_Empleado.setDia(cmbDia.getSelectedIndex() + "");
                    obj_Empleado.setDireccion(txtDireccion.getText());
                    obj_Empleado.setTelefono(txtTelefono.getText());
                    JOptionPane.showMessageDialog(this, "El empleado fue modificado con éxito!");
                    obj_Empleado.db_ModifyEmpleado();
                    txtCurrentCedula.setEditable(false);
                    btn_Buscar.setEnabled(false);
                    btn_Guardar.setEnabled(false);
                    btn_Editar.setEnabled(false);
                    btn_Nuevo.setEnabled(true);

                    disableFields();
                    emptyFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Este empleado, ya se encuentra registrado en la base de datos.");
                    txtCurrentCedula.setText(obj_Empleado.getCedula());
                    txtNombre.setText(obj_Empleado.getNombre1());
                    txtNombre2.setText(obj_Empleado.getNombre2());
                    txtApellido.setText(obj_Empleado.getApellido1());
                    txtApellido2.setText(obj_Empleado.getApellido2());
                    cmbAño.setSelectedItem((obj_Empleado.getAño()));
                    cmbMes.setSelectedIndex(Integer.parseInt(obj_Empleado.getMes()));
                    cmbDia.setSelectedIndex(Integer.parseInt(obj_Empleado.getDia()));
                    txtDireccion.setText(obj_Empleado.getDireccion());
                    txtTelefono.setText(obj_Empleado.getTelefono());
                }
            } else {
                txtCurrentCedula.setEditable(true);
                if (this.getCrear_modificar() == 1) {
                    obj_Empleado.setCedula(this.txtCurrentCedula.getText());
                    obj_Empleado.setNombre1(this.txtNombre.getText());
                    obj_Empleado.setNombre2(this.txtNombre2.getText());
                    obj_Empleado.setApellido1(this.txtApellido.getText());
                    obj_Empleado.setApellido2(this.txtApellido2.getText());
                    obj_Empleado.setAño(this.cmbAño.getItemAt(cmbAño.getSelectedIndex()));
                    obj_Empleado.setMes(this.cmbMes.getSelectedIndex() + "");
                    obj_Empleado.setDia(this.cmbDia.getSelectedIndex() + "");
                    obj_Empleado.setDireccion(this.txtDireccion.getText());
                    obj_Empleado.setTelefono(this.txtTelefono.getText());
                    JOptionPane.showMessageDialog(this, "El empleado fue creado con éxito!");
                    txtCurrentCedula.setEditable(false);
                    btn_Buscar.setEnabled(false);
                    btn_Guardar.setEnabled(false);
                    btn_Editar.setEnabled(false);
                    btn_Nuevo.setEnabled(true);
                    disableFields();
                    obj_Empleado.db_InsertEmpleado();
                } else {
                    JOptionPane.showMessageDialog(this, "Este empleado, ya se encuentra registrado en la base de datos.");
                    txtCurrentCedula.setText(obj_Empleado.getCedula());
                    txtNombre.setText(obj_Empleado.getNombre1());
                    txtNombre2.setText(obj_Empleado.getNombre2());
                    txtApellido.setText(obj_Empleado.getApellido1());
                    txtApellido2.setText(obj_Empleado.getApellido2());
                    cmbAño.setSelectedItem((obj_Empleado.getAño()));
                    cmbMes.setSelectedIndex(Integer.parseInt(obj_Empleado.getMes()));
                    cmbDia.setSelectedIndex(Integer.parseInt(obj_Empleado.getDia()));
                    txtDireccion.setText(obj_Empleado.getDireccion());
                    txtTelefono.setText(obj_Empleado.getTelefono());
                }
            }
        }
        txtSearchCedula.setText("");
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AtrasActionPerformed
        frm_Principal obj_Principal = new frm_Principal();
        obj_Principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AtrasActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        txtCurrentCedula.setEditable(false);
        txtSearchCedula.setEditable(false);
        txtSearchCedula.setText("");
        btn_Buscar.setEnabled(false);
        btn_Nuevo.setEnabled(false);
        btn_Editar.setEnabled(false);
        btn_Guardar.setEnabled(true);
        setCrear_modificar(2);
        EnableFields();
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        txtCurrentCedula.setEditable(true);
        txtSearchCedula.setText("");
        txtSearchCedula.setEditable(false);
        btn_Buscar.setEnabled(false);
        btn_Nuevo.setEnabled(false);
        btn_Editar.setEnabled(false);
        btn_Guardar.setEnabled(true);
        setCrear_modificar(1);
        EnableFields();
        emptyFields();
    }//GEN-LAST:event_btn_NuevoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_GestionarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frm_GestionarEmpleado().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atras;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
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
    private javax.swing.JTextField txtCurrentCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtSearchCedula;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void sendFields(String creado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
