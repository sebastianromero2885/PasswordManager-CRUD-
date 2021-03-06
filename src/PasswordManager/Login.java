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
public class Login extends javax.swing.JFrame {

    //Atributos de la clase login

    
    
    //Constructor del Frame Login
    public Login() {
        
        initComponents();
        btn_aceptar.setBackground(new Color(102,102,255));
        btn_aceptar.setForeground(Color.white);
        label_registro.requestFocus();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Avatar = new javax.swing.JLabel();
        label_iniciarsesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        icon_pass = new javax.swing.JLabel();
        icon_user = new javax.swing.JLabel();
        textfield_user = new javax.swing.JTextField();
        label_registro = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        fondo_cerrar = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        fondo_minimizar = new javax.swing.JPanel();
        minimizar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(51, 51, 51));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        Fondo.add(Avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 151));

        label_iniciarsesion.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        label_iniciarsesion.setForeground(new java.awt.Color(255, 255, 255));
        label_iniciarsesion.setText("   Inicia Sesión");
        Fondo.add(label_iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 129, 28));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 250, 10));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 250, 10));

        icon_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contra.png"))); // NOI18N
        Fondo.add(icon_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 30, 50));

        icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        Fondo.add(icon_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 30, 50));

        textfield_user.setBackground(new java.awt.Color(51, 51, 51));
        textfield_user.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        textfield_user.setForeground(new java.awt.Color(255, 255, 255));
        textfield_user.setBorder(null);
        textfield_user.setCaretColor(new java.awt.Color(255, 255, 255));
        textfield_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfield_userMouseClicked(evt);
            }
        });
        Fondo.add(textfield_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 250, 30));

        label_registro.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        label_registro.setForeground(new java.awt.Color(255, 255, 255));
        label_registro.setText("Si no estas registrado haz click aqui");
        label_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_registroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_registroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_registroMouseExited(evt);
            }
        });
        Fondo.add(label_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 230, 20));

        btn_aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(null);
        btn_aceptar.setFocusPainted(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        Fondo.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 110, 40));

        fondo_cerrar.setBackground(new java.awt.Color(102, 102, 255));
        fondo_cerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        fondo_cerrar.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        Fondo.add(fondo_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 40));

        fondo_minimizar.setBackground(new java.awt.Color(102, 102, 255));
        fondo_minimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizar.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        minimizar.setForeground(new java.awt.Color(255, 255, 255));
        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setText("-");
        minimizar.setAlignmentX(0.5F);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarMouseExited(evt);
            }
        });
        fondo_minimizar.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        Fondo.add(fondo_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password Manager");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 40));

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        jPasswordField.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordField.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField.setBorder(null);
        jPasswordField.setCaretColor(new java.awt.Color(255, 255, 255));
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });
        Fondo.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 250, 30));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_registroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_registroMouseEntered
        label_registro.setForeground(new Color(102,102,255)); 
    }//GEN-LAST:event_label_registroMouseEntered

    private void label_registroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_registroMouseExited
        label_registro.setForeground(Color.decode("#ffffff"));
    }//GEN-LAST:event_label_registroMouseExited

    
    
    public static String cuenta = "";
    
    
    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        List datos;
        String user,password;
        boolean verificacion;
        user = textfield_user.getText().trim();
        password = jPasswordField.getText().trim();
        if ("".equals(user)) {
            Main.Mensaje("El campo 'Usuario' esta vacio.","Advertencia","");
        }
        else if("".equals(password)){
            Main.Mensaje("El campo 'Contraseña' esta vacio.","Advertencia","");
        }
        else{
            datos = Conexion.VerificarUsuario(user, password);
            verificacion = (Boolean) datos.get(0);
            cuenta = datos.get(1).toString();
            if (verificacion == true) {
                Main.Mensaje("Usuario o contraseña incorrecta.","Error","error");
            }
            else{
                this.dispose();
                PasswordManager window = new PasswordManager();
                window.setVisible(true);

            }
            
        }
        
    }//GEN-LAST:event_btn_aceptarActionPerformed

    


   
    
    
    

    private void label_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_registroMouseClicked
        this.dispose();
        Registro registro = new Registro();
        
    }//GEN-LAST:event_label_registroMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseEntered
        fondo_minimizar.setBackground(Color.decode("#5555fd"));
    }//GEN-LAST:event_minimizarMouseEntered

    private void minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseExited
        fondo_minimizar.setBackground(Color.decode("#6666ff"));
    }//GEN-LAST:event_minimizarMouseExited

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        fondo_cerrar.setBackground(Color.decode("#5555fd"));
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        fondo_cerrar.setBackground(Color.decode("#6666ff"));
    }//GEN-LAST:event_cerrarMouseExited

    private void textfield_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_userMouseClicked
        jSeparator2.setBackground(new Color(102,102,255));
        jSeparator1.setBackground(Color.white);
    }//GEN-LAST:event_textfield_userMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        jSeparator1.setBackground(new Color(102,102,255));
        jSeparator2.setBackground(Color.white);
    }//GEN-LAST:event_jPasswordFieldMouseClicked

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Avatar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPanel fondo_cerrar;
    private javax.swing.JPanel fondo_minimizar;
    private javax.swing.JLabel icon_pass;
    private javax.swing.JLabel icon_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_iniciarsesion;
    private javax.swing.JLabel label_registro;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTextField textfield_user;
    // End of variables declaration//GEN-END:variables
}
