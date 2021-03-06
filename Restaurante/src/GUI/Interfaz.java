/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import data.Cliente;
import data.Cuenta;
import data.Cliente;
import data.Mesero;
import java.awt.Image;
import GUI.VentanaCliente;
import restaurante.Restaurante;
        
        
import java.util.Date;
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    public static HashMap<String,Mesero>   listadoMeseros       = new HashMap<>();
    public static ArrayList<Cliente>  listadoCliente       = new ArrayList<>();
    public static ArrayList<Cuenta>  listadoCuentas       = new ArrayList<>();
    private DefaultTableModel modelo;
    Date fecha = new Date();
    public static String nombreVentanaCliente = ""; 
    public static String cedulaVentanaCliente = "";
    public static String telefonoVentanaCliente = "";
    double montoEntrada=0;
    double montoPlatoFuerte=0;
    double montoBebida=0;
    double monto=0;
    double impuesto=0;
    double total = 0;
    
       
       
    
    String usuario;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
//        Restaurante.main(new String[1]);
        initComponents();
        deshabilitar();
        fecha();
        setResizable(false);
        setLocationRelativeTo(null);
        
        jPanel1.setOpaque(false);
        jPanel2.setOpaque(false);
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/sources/img/ImagenFondo.png"));
        uno = new ImageIcon(uno.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        
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
        btnNuevoCliente = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        cbomesa = new javax.swing.JComboBox<>();
        cbosopa = new javax.swing.JComboBox<>();
        cboplato = new javax.swing.JComboBox<>();
        cbobebida = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        btnEliminarFactura = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Almuerzos De A Tres");
        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Restaurante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bodoni MT", 0, 14))); // NOI18N

        btnNuevoCliente.setBackground(new java.awt.Color(255, 204, 0));
        btnNuevoCliente.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/nuevo-usuario.png"))); // NOI18N
        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoClienteMouseClicked(evt);
            }
        });
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/guardar (1).png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 204, 0));
        btnCancelar.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/prohibido.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnFactura.setBackground(new java.awt.Color(255, 204, 0));
        btnFactura.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/impresora.png"))); // NOI18N
        btnFactura.setText("Imprimir Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        cbomesa.setBackground(new java.awt.Color(255, 204, 0));
        cbomesa.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        cbomesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4" }));
        cbomesa.setBorder(null);

        cbosopa.setBackground(new java.awt.Color(255, 204, 0));
        cbosopa.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        cbosopa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sopa de Arroz", "Sopa de Colicero", "Fruta", "Sopa de Pasta" }));
        cbosopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbosopaActionPerformed(evt);
            }
        });

        cboplato.setBackground(new java.awt.Color(255, 204, 0));
        cboplato.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        cboplato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mojarra", "Bistec a Caballo", "Pechuga Gratinada", "Sushi" }));
        cboplato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboplatoActionPerformed(evt);
            }
        });

        cbobebida.setBackground(new java.awt.Color(255, 204, 0));
        cbobebida.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        cbobebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mora", "Fresa", "Mango", "Corozo" }));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel2.setText("Contrsaeña");

        btnEntrar.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/ingresar-boton-de-flecha-en-esquema-de-cuadrado.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEntrar)
                .addGap(4, 4, 4))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel4.setText("Mesa");

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel5.setText("Entradas");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel6.setText("Platos Fuertes");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel7.setText("Bebidas");

        lbFecha.setBackground(new java.awt.Color(255, 204, 0));
        lbFecha.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        lbFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/calendario.png"))); // NOI18N
        lbFecha.setText("jLabel8");

        btnEliminarFactura.setBackground(new java.awt.Color(255, 204, 0));
        btnEliminarFactura.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        btnEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/img/boton-eliminar.png"))); // NOI18N
        btnEliminarFactura.setText("Eliminar Factura");
        btnEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnNuevoCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbomesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbosopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboplato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cbobebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarFactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFactura)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbFecha))
                        .addGap(34, 34, 34))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboplato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbosopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbomesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbobebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCliente)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnFactura)
                    .addComponent(btnEliminarFactura)))
        );

        tblOrdenes.setAutoCreateRowSorter(true);
        tblOrdenes.setBackground(new java.awt.Color(255, 204, 0));
        tblOrdenes.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente #", "Mesa #", "Entrada", "Plato Fuerte", "Bebida"
            }
        ));
        tblOrdenes.setGridColor(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(tblOrdenes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      cargarCliente();            
      
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbosopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbosopaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbosopaActionPerformed

    private void btnNuevoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoClienteMouseClicked
        
    }//GEN-LAST:event_btnNuevoClienteMouseClicked

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:
        
       //this.dispose();

       VentanaCliente ventanaCliente = new VentanaCliente();
       ventanaCliente.setVisible(true);
       nombreVentanaCliente = ventanaCliente.nombre; 
       cedulaVentanaCliente = ventanaCliente.cedula;  
       telefonoVentanaCliente = ventanaCliente.telefono;
       habilitar();
       
       

      //VentanaCliente.main(new String [1]);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFacturaActionPerformed
        eliminarFactura();
    }//GEN-LAST:event_btnEliminarFacturaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            deshabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked

    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        login();
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        generarFactura();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void cboplatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboplatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboplatoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
                
            }
        });
        
        
                
        
    }
    
    
    
    private void login(){
        
        cargarMeseros();
        int i = 0;  
        int k = listadoMeseros.size();
        for (Mesero meseros : listadoMeseros.values()){
            if (txtUsuario.getText().equals(meseros.getUsuario()) && txtContrasena.getText().equals(meseros.getContrasena())){
                this.btnNuevoCliente.setEnabled(true);
                JOptionPane.showMessageDialog(rootPane, "Acceso permitido");
            }
            else {
                i=i+1;
            }
         }

       if (k==i){
            deshabilitar();
            JOptionPane.showMessageDialog(rootPane, "Digite usuario y contraseña válidos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
       
    }
    private String fecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        lbFecha.setText(formato.format(fecha));
        return " ";
    }
    
    private void deshabilitar(){
        this.cbobebida.setEnabled(false);
        this.cbomesa.setEnabled(false);
        this.cboplato.setEnabled(false);
        this.cbosopa.setEnabled(false);
       
        
        
        this.btnCancelar.setEnabled(false);
        this.btnGuardar.setEnabled(false);
        this.btnFactura.setEnabled(false);
        this.btnEliminarFactura.setEnabled(false);
        this.btnFactura.setEnabled(false);           
        this.btnNuevoCliente.setEnabled(false);           
    }
    private void habilitar(){
        this.cbobebida.setEnabled(true);
        this.cbomesa.setEnabled(true);
        this.cboplato.setEnabled(true);
        this.cbosopa.setEnabled(true);
       
        
        
        this.btnCancelar.setEnabled(true);
        this.btnGuardar.setEnabled(true);
        this.btnFactura.setEnabled(true);   
        this.btnEliminarFactura.setEnabled(true);
        this.btnFactura.setEnabled(true);           
                   
    
    }
    
    private void cargarMeseros(){
        
            
        
        
        listadoMeseros = new HashMap();
        
        Mesero mesero1 = new Mesero("cam","1234","Camilo","23423", "31422");// usuario, contraseña
        Mesero mesero2 = new Mesero("ale","1409","Alejandra","23423", "31422");// usuario, contraseña
        Mesero mesero3 = new Mesero("San","1347","Sandra","23423", "31422");// usuario, contraseña
        Mesero mesero4 = new Mesero("Alv","1417","Alvaro","23423", "31422");// usuario, contraseña
        Mesero mesero5 = new Mesero("Jun","2417","Juan","23423", "31422");// usuario, contraseña
       
        
        listadoMeseros.put(mesero1.getContrasena(),mesero1);
        listadoMeseros.put(mesero2.getContrasena(),mesero2);
        listadoMeseros.put(mesero3.getContrasena(),mesero3);
        listadoMeseros.put(mesero4.getContrasena(),mesero4);
        listadoMeseros.put(mesero5.getContrasena(),mesero5);
    }
    
        private void cargarCliente() {
                
                modelo = new DefaultTableModel();
                String[] registro = new String[5];
                String[] titulos = {"Cliente", "Mesa", "Entrada", "Plato Fuerte", "Bebida"};
              
                switch(this.cbosopa.getSelectedItem().toString()){
                    case "Sopa de Arroz":
                        montoEntrada= 1000;
                        break;
                    case "Sopa de Colicero":
                        montoEntrada = 2000;
                        break;
                    case "Fruta":
                        montoEntrada = 3000;
                        break;
                    case "Sopa de Pasta":
                        montoEntrada = 4000;
                        break;
                    default:
                        break;
                    
                }
                switch(this.cboplato.getSelectedItem().toString()){
                    case "Mojarra":
                        montoPlatoFuerte= 1000;
                        break;
                    case "Bistec a Caballo":
                        montoPlatoFuerte = 2000;
                        break;
                    case "Pechuga Gratinada":
                        montoPlatoFuerte = 3000;
                        break;
                    case "Sushi":
                        montoPlatoFuerte = 4000;
                        break;
                    default:
                        break;
        
                }
                switch(this.cbobebida.getSelectedItem().toString()){
                    case "Mora":
                        montoBebida= 1000;
                        break;
                    case "Fresa":
                        montoBebida = 2000;
                        break;
                    case "Mango":
                        montoBebida = 3000;
                        break;
                    case "Corozo":
                        montoBebida = 4000;
                        break;
                    default:
                        break;
                }
                       monto = montoPlatoFuerte+montoBebida+montoEntrada;
                       impuesto = monto*0.07;
                       total = monto + impuesto;
                      
                               Cuenta cuenta0 =  new Cuenta(fecha, 
                        this.cbomesa.getSelectedItem().toString(),
                        this.cbosopa.getSelectedItem().toString(),
                        this.cboplato.getSelectedItem().toString(),
                        this.cbobebida.getSelectedItem().toString(),
                        monto,
                        impuesto,
                        total);
                
                Cliente cliente0 = new Cliente(cuenta0, nombreVentanaCliente, cedulaVentanaCliente, telefonoVentanaCliente);               
                  listadoCliente.add(cliente0);
                modelo = new DefaultTableModel(null, titulos);
                for (Cliente clientes : listadoCliente){
                    registro[0] = clientes.getNombre();
                    registro[1] = clientes.getCuentaCliente().getMesa();
                    registro[2] = clientes.getCuentaCliente().getEntrada();
                    registro[3] = clientes.getCuentaCliente().getPlato();
                    registro[4] = clientes.getCuentaCliente().getBebida();
                    modelo.addRow(registro);
                }
                tblOrdenes.setModel(modelo);
                

    }
      private void eliminarFactura(){
    DefaultTableModel dtm = (DefaultTableModel) tblOrdenes.getModel(); 
      String nombre0=(String) tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 0);
      String mesa0=(String) tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 1);
      String entrada0=(String) tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 2);
      String plato0=(String) tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 3);
      String bebida0=(String) tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 4);
      for (Cliente clientes : listadoCliente){
                    if(nombre0 == clientes.getNombre()
                            && mesa0 == clientes.getCuentaCliente().getMesa()
                            && entrada0 == clientes.getCuentaCliente().getEntrada()
                            && plato0 == clientes.getCuentaCliente().getPlato()
                            && bebida0 == clientes.getCuentaCliente().getBebida()){
                        listadoCliente.remove(clientes);
                        
                 }
                    
                }
      
      dtm.removeRow(tblOrdenes.getSelectedRow()); 
      }
      private void generarFactura(){
          System.out.println("Cliente: "+tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 0));
          System.out.println(tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 1));
          System.out.println("Entrada: "+tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 2));
          System.out.println("Plato Fuerte: "+tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 3));
          System.out.println("Bebida: "+tblOrdenes.getValueAt(tblOrdenes.getSelectedRow(), 4));
 
      
      }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarFactura;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JComboBox<String> cbobebida;
    private javax.swing.JComboBox<String> cbomesa;
    private javax.swing.JComboBox<String> cboplato;
    private javax.swing.JComboBox<String> cbosopa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JTable tblOrdenes;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables


}
