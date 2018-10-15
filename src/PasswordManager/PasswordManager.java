/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordManager;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Sebastián
 */
public class PasswordManager extends javax.swing.JFrame {
     

    
    public PasswordManager() {
       
        
        initComponents();
        this.setLocationRelativeTo(null);
        btn_modificar.setBackground(new Color(102,102,255));
        btn_modificar.setForeground(Color.white);
        btn_eliminar.setBackground(new Color(102,102,255));
        btn_eliminar.setForeground(Color.white);
        btn_guardar.setBackground(new Color(102,102,255));
        btn_guardar.setForeground(Color.white);
        titulo.requestFocus();
        InicializarTabla();
        this.setVisible(true);

    }

      
    public void InicializarTabla(){
        
        
        //Creo un modelo del tipo de tabla que diseñe en netbeans
        DefaultTableModel tabla = (DefaultTableModel)jTable1.getModel();
        tabla.setRowCount(0);
        //Cambiar el estilo del header de la Tabla
        jTable1.getTableHeader().setFont(new Font("Roboto Light", 0, 17));
        jTable1.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 35));
        jTable1.getTableHeader().setBackground(new Color (51,51,51));
        jTable1.getTableHeader().setForeground(Color.white);
        
        
        //Centrar contenido de las filas en la tabla.
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        jTable1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        
        String cuenta = Login.cuenta;
        String sql = "select ID,sitio,password,usuario from informacion where user= ?";
        Object row[] = new Object[4];
        
        try (Connection conn = Conexion.connect();
             PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // set the value
            pstmt.setString(1, cuenta);
            //
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            while (rs.next()) {
                row[0]=(rs.getInt("ID"));
                row[1]=(rs.getString("sitio"));
                row[2]=(rs.getString("usuario"));
                row[3]=(rs.getString("password"));
                tabla.addRow(row);
                
             }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    
        public void EliminarFila(){

            DefaultTableModel tabla = (DefaultTableModel)jTable1.getModel();
            int row,column;
            Object valor;

            row = jTable1.getSelectedRow();
            column = 0;

            if(row == -1){
                Main.Mensaje("No seleccionaste ninguna fila para eliminar", "Advertencia","");
            }else{
                valor = tabla.getValueAt(row, column);
                tabla.removeRow(row);
                Conexion.EliminarFila(valor);
                Main.Mensaje("La cuenta se eliminó correctamente.", "", "correcto");
            }
            tabla.setRowCount(0);
            this.InicializarTabla();
        
    }
    
       public static List<Object> valor = new ArrayList<Object>();
       
        public void Modificar(){
            DefaultTableModel tabla = (DefaultTableModel)jTable1.getModel();
            int row;

            row = jTable1.getSelectedRow();

            if(row == -1){
                Main.Mensaje("No seleccionaste ningun registro para modificar", "Advertencia","");
            }else{
                valor.add(tabla.getValueAt(row, 0));
                valor.add(tabla.getValueAt(row, 1));
                valor.add(tabla.getValueAt(row, 2));
                valor.add(tabla.getValueAt(row, 3));
                Modificar_dialog dialog = new Modificar_dialog(this, true);
                InicializarTabla();
            }
     
    }
        
    public void BuscarRegistro(){
        TableRowSorter tablafiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(tablafiltro);
        String buscar = textfield_buscar.getText().trim().toUpperCase();
        tablafiltro.setRowFilter(RowFilter.regexFilter(buscar, 1));       

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
        fondo_cerrar = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        fondo_minimizar = new javax.swing.JPanel();
        minimizar = new javax.swing.JLabel();
        textfield_sitio = new javax.swing.JTextField();
        textfield_usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        textfield_pass = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_eliminar = new javax.swing.JButton();
        label_cerrarsesion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_sitioweb = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        textfield_buscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(fondo_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 30, 40));

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

        jPanel1.add(fondo_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 30, 40));

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
        jPanel1.add(textfield_sitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 400, 30));

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
        jPanel1.add(textfield_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 400, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 400, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 400, 10));

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
        jPanel1.add(textfield_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 400, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 400, 10));

        btn_eliminar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_eliminar.setText("Eliminar registro");
        btn_eliminar.setBorder(null);
        btn_eliminar.setFocusPainted(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 170, 40));

        label_cerrarsesion.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        label_cerrarsesion.setForeground(new java.awt.Color(255, 255, 255));
        label_cerrarsesion.setText("Cerrar Sesión");
        label_cerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_cerrarsesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_cerrarsesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_cerrarsesionMouseExited(evt);
            }
        });
        jPanel1.add(label_cerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 90, 20));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setFont(new java.awt.Font("Roboto Light", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sitio", "Cuenta", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setRowHeight(28);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable1.setSelectionForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 630, 290));

        btn_guardar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setFocusPainted(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sitio.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clave.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 40, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 30, 40));

        lb_password.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Contraseña");
        jPanel1.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 100, 30));

        lb_sitioweb.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb_sitioweb.setForeground(new java.awt.Color(255, 255, 255));
        lb_sitioweb.setText("Sitio web");
        jPanel1.add(lb_sitioweb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, 30));

        lb_username.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lb_username.setForeground(new java.awt.Color(255, 255, 255));
        lb_username.setText("Usuario");
        jPanel1.add(lb_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 70, 30));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 40));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password Manager");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        btn_modificar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_modificar.setText("Modificar registro");
        btn_modificar.setBorder(null);
        btn_modificar.setFocusPainted(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 170, 40));

        titulo.setFont(new java.awt.Font("Roboto Light", 1, 52)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Password Manager");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 510, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 570, 10));

        textfield_buscar.setBackground(new java.awt.Color(51, 51, 51));
        textfield_buscar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        textfield_buscar.setForeground(new java.awt.Color(255, 255, 255));
        textfield_buscar.setBorder(null);
        textfield_buscar.setCaretColor(new java.awt.Color(255, 255, 255));
        textfield_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfield_buscarMouseClicked(evt);
            }
        });
        textfield_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textfield_buscarKeyPressed(evt);
            }
        });
        jPanel1.add(textfield_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 570, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buscar registro");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 140, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  (Columna Sitio)");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        fondo_cerrar.setBackground(Color.decode("#5555fd"));
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        fondo_cerrar.setBackground(Color.decode("#6666ff"));
    }//GEN-LAST:event_cerrarMouseExited

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseEntered
        fondo_minimizar.setBackground(Color.decode("#5555fd"));
    }//GEN-LAST:event_minimizarMouseEntered

    private void minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseExited
        fondo_minimizar.setBackground(Color.decode("#6666ff"));
    }//GEN-LAST:event_minimizarMouseExited

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        EliminarFila();
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void label_cerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_cerrarsesionMouseClicked
        this.dispose();
        Login login = new Login();

    }//GEN-LAST:event_label_cerrarsesionMouseClicked

    private void label_cerrarsesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_cerrarsesionMouseEntered
        label_cerrarsesion.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_label_cerrarsesionMouseEntered

    private void label_cerrarsesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_cerrarsesionMouseExited
        label_cerrarsesion.setForeground(Color.decode("#ffffff"));
    }//GEN-LAST:event_label_cerrarsesionMouseExited

    private void textfield_sitioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_sitioMouseClicked
        jSeparator1.setBackground(new Color(102,102,255));
        jSeparator2.setBackground(Color.white);
        jSeparator3.setBackground(Color.white);
        jSeparator4.setBackground(Color.white);
    }//GEN-LAST:event_textfield_sitioMouseClicked

    private void textfield_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_usuarioMouseClicked
        jSeparator2.setBackground(new Color(102,102,255));
        jSeparator1.setBackground(Color.white);
        jSeparator3.setBackground(Color.white);
        jSeparator4.setBackground(Color.white);
    }//GEN-LAST:event_textfield_usuarioMouseClicked

    private void textfield_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_passMouseClicked
        jSeparator3.setBackground(new Color(102,102,255));
        jSeparator1.setBackground(Color.white);
        jSeparator2.setBackground(Color.white);
        jSeparator4.setBackground(Color.white);
    }//GEN-LAST:event_textfield_passMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String sitio,usuario,password;
        sitio = textfield_sitio.getText().trim();
        usuario = textfield_usuario.getText().trim();
        password = textfield_pass.getText().trim();
        Conexion.IngresarRegistro(sitio, usuario, password);
        Main.Mensaje("El registro se guardo correctamente.","","correcto");
        InicializarTabla();
        textfield_sitio.setText("");
        textfield_usuario.setText("");
        textfield_pass.setText("");
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
      Modificar();
       
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void textfield_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfield_buscarMouseClicked
        jSeparator4.setBackground(new Color(102,102,255));
        jSeparator1.setBackground(Color.white);
        jSeparator2.setBackground(Color.white);
        jSeparator3.setBackground(Color.white);
    }//GEN-LAST:event_textfield_buscarMouseClicked

    private void textfield_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfield_buscarKeyPressed
       BuscarRegistro();
        
    }//GEN-LAST:event_textfield_buscarKeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPanel fondo_cerrar;
    private javax.swing.JPanel fondo_minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_cerrarsesion;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_sitioweb;
    private javax.swing.JLabel lb_username;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTextField textfield_buscar;
    private javax.swing.JTextField textfield_pass;
    private javax.swing.JTextField textfield_sitio;
    private javax.swing.JTextField textfield_usuario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
