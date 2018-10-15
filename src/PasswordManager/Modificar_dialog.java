/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordManager;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author Sebastián
 */
public class Modificar_dialog extends javax.swing.JDialog {

    
    
    public Modificar_dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Centrar Frame
        this.setLocationRelativeTo(null);
        //Dar color a los botones
        btn_aceptar.setBackground(new Color(102,102,255));
        btn_aceptar.setForeground(Color.white);
        //Dar color a la letra de los botones
        btn_cancelar.setForeground(Color.white);
        btn_cancelar.setBackground(new Color(102,102,255));
        
        //Dar valor a los textfield
        List<Object> valor = PasswordManager.valor;
        textfield_sitio.setText(valor.get(1).toString());
        textfield_usuario.setText(valor.get(2).toString());
        textfield_pass.setText(valor.get(3).toString());
        
        //Hacer visible el frame
        this.setVisible(true);
    }

    
    public void RealizarCambios(){
        String sitio,usuario,pass;
        int id = (int) PasswordManager.valor.get(0);
        sitio = textfield_sitio.getText().trim();
        usuario = textfield_usuario.getText().trim();
        pass = textfield_pass.getText().trim();
        Conexion.ModificarRegistro(id,sitio,usuario,pass);
        Main.Mensaje("El registro se modifico correctamente", "", "correcto");
        this.dispose();
       
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
        btn_cancelar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        lb_sitioweb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textfield_sitio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lb_username = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textfield_usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lb_password = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textfield_pass = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fondo_cerrar = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cancelar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 140, 40));

        btn_aceptar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 140, 40));

        lb_sitioweb.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb_sitioweb.setForeground(new java.awt.Color(255, 255, 255));
        lb_sitioweb.setText("Sitio web");
        jPanel1.add(lb_sitioweb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sitio.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 40, 40));

        textfield_sitio.setBackground(new java.awt.Color(51, 51, 51));
        textfield_sitio.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        textfield_sitio.setForeground(new java.awt.Color(255, 255, 255));
        textfield_sitio.setBorder(null);
        textfield_sitio.setCaretColor(new java.awt.Color(255, 255, 255));
        textfield_sitio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfield_sitioMouseClicked(evt);
            }
        });
        jPanel1.add(textfield_sitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 400, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 400, 10));

        lb_username.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb_username.setForeground(new java.awt.Color(255, 255, 255));
        lb_username.setText("Usuario");
        jPanel1.add(lb_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 70, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 30, 40));

        textfield_usuario.setBackground(new java.awt.Color(51, 51, 51));
        textfield_usuario.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        textfield_usuario.setForeground(new java.awt.Color(255, 255, 255));
        textfield_usuario.setBorder(null);
        textfield_usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        textfield_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfield_usuarioMouseClicked(evt);
            }
        });
        jPanel1.add(textfield_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 400, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 400, 10));

        lb_password.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Contraseña");
        jPanel1.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clave.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 40, 50));

        textfield_pass.setBackground(new java.awt.Color(51, 51, 51));
        textfield_pass.setFont(new java.awt.Font("Roboto Light", 0, 16)); // NOI18N
        textfield_pass.setForeground(new java.awt.Color(255, 255, 255));
        textfield_pass.setBorder(null);
        textfield_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        textfield_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfield_passMouseClicked(evt);
            }
        });
        jPanel1.add(textfield_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 400, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 400, 10));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password Manager");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 53)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Modificar Registro");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 430, 80));

        fondo_cerrar.setBackground(new java.awt.Color(102, 102, 255));

        cerrar.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fondo_cerrarLayout = new javax.swing.GroupLayout(fondo_cerrar);
        fondo_cerrar.setLayout(fondo_cerrarLayout);
        fondo_cerrarLayout.setHorizontalGroup(
            fondo_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo_cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fondo_cerrarLayout.setVerticalGroup(
            fondo_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo_cerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(fondo_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        RealizarCambios();
        
        
        
        
        
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void textfield_sitioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_sitioMouseClicked
        jSeparator1.setBackground(new Color(102,102,255));
        jSeparator2.setBackground(Color.white);
        jSeparator3.setBackground(Color.white);
    }//GEN-LAST:event_textfield_sitioMouseClicked

    private void textfield_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_usuarioMouseClicked
        jSeparator2.setBackground(new Color(102,102,255));
        jSeparator1.setBackground(Color.white);
        jSeparator3.setBackground(Color.white);
    }//GEN-LAST:event_textfield_usuarioMouseClicked

    private void textfield_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_passMouseClicked
        jSeparator3.setBackground(new Color(102,102,255));
        jSeparator1.setBackground(Color.white);
        jSeparator2.setBackground(Color.white);
    }//GEN-LAST:event_textfield_passMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        fondo_cerrar.setBackground(Color.decode("#5555fd"));
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        fondo_cerrar.setBackground(Color.decode("#6666ff"));
    }//GEN-LAST:event_cerrarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPanel fondo_cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_sitioweb;
    private javax.swing.JLabel lb_username;
    private javax.swing.JTextField textfield_pass;
    private javax.swing.JTextField textfield_sitio;
    private javax.swing.JTextField textfield_usuario;
    // End of variables declaration//GEN-END:variables
}