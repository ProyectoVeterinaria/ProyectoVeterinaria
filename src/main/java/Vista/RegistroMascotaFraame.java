/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Mariana M
 */
public class RegistroMascotaFraame extends javax.swing.JDialog {

   
    public RegistroMascotaFraame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE); //
        this.setLocationRelativeTo(null);
        llenarComboBoxDesdeArchivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        imgVeterinario = new javax.swing.JLabel();
        pnlFormulario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        Raza = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        pnlRegistrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        NomDueno = new javax.swing.JComboBox<>();
        pnlModificar = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        pnlMostrar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        pnlRegistrar1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        itmModificar = new javax.swing.JMenu();
        ItmModificar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmMostrar = new javax.swing.JMenuItem();
        itmNomostrar = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ItmEliminar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itmrRegistrar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itmSalir = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de registro veterinario");

        imgVeterinario.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\imgMascotaR.png"));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre Dueño");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Raza");

        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Labrador Retriever", "Mestizo", "Pastor Alemán", "Bulldog Francés", "Golden Retriever", "Beagle", "Poodle (Caniche)", "Boxer", "Dachshund (Teckel o Salchicha)", "Yorkshire Terrier", "Rottweiler", "Gato Persa", "Gato Siamés", "Gato Maine Coon", "Gato Bengalí", "Gato Ragdoll", "Gato Exótico de Pelo Corto", "Gato Azul Ruso", "Gato Sphynx", "Gato Birmano", "Gato Abisinio", "Otro" }));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconlimpiar.png"));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconanadir.png"));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        NomDueno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconanadir.png"));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModificarLayout = new javax.swing.GroupLayout(pnlModificar);
        pnlModificar.setLayout(pnlModificarLayout);
        pnlModificarLayout.setHorizontalGroup(
            pnlModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlModificarLayout.setVerticalGroup(
            pnlModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(161, 161, 161))
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Raza, 0, 270, Short.MAX_VALUE)
                            .addComponent(txtedad)
                            .addComponent(txtNombre)
                            .addComponent(NomDueno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(NomDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(pnlRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(536, 536, 536))
        );

        jScrollPane3.setForeground(new java.awt.Color(0, 255, 204));

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Raza", "Nombre Dueño"
            }
        ));
        jScrollPane3.setViewportView(tablaMostrar);

        jScrollPane1.setViewportView(jScrollPane3);

        javax.swing.GroupLayout pnlMostrarLayout = new javax.swing.GroupLayout(pnlMostrar);
        pnlMostrar.setLayout(pnlMostrarLayout);
        pnlMostrarLayout.setHorizontalGroup(
            pnlMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMostrarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMostrarLayout.setVerticalGroup(
            pnlMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMostrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlRegistrar1Layout = new javax.swing.GroupLayout(pnlRegistrar1);
        pnlRegistrar1.setLayout(pnlRegistrar1Layout);
        pnlRegistrar1Layout.setHorizontalGroup(
            pnlRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );
        pnlRegistrar1Layout.setVerticalGroup(
            pnlRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        itmModificar.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconeditar.png"));
        itmModificar.setText("Modificar");

        ItmModificar.setText("Filtrar y modificar");
        itmModificar.add(ItmModificar);

        jMenuBar1.add(itmModificar);

        jMenu2.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconmostrar.png"));
        jMenu2.setText("Mostrar");

        itmMostrar.setText("Mostrar registros");
        jMenu2.add(itmMostrar);

        itmNomostrar.setSelected(true);
        itmNomostrar.setText("Dejar de mostrar");
        jMenu2.add(itmNomostrar);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconeliminar.png"));
        jMenu3.setText("Eliminar");

        ItmEliminar.setText("Eliminar");
        jMenu3.add(ItmEliminar);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconcancelar.png"));
        jMenu5.setText("Registrar");

        itmrRegistrar.setText("Registrar");
        jMenu5.add(itmrRegistrar);

        jMenuBar1.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\iconcancelar.png"));
        jMenu4.setText("Salir");

        itmSalir.setText("Salir");
        jMenu4.add(itmSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(imgVeterinario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(pnlMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(imgVeterinario))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(pnlMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(pnlRegistrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RegistroMascotaFraame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RegistroMascotaFraame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RegistroMascotaFraame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RegistroMascotaFraame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroMascotaFraame dialog = new RegistroMascotaFraame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmEliminar;
    private javax.swing.JMenuItem ItmModificar;
    private javax.swing.JComboBox<String> NomDueno;
    private javax.swing.JComboBox<String> Raza;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel imgVeterinario;
    private javax.swing.JMenu itmModificar;
    private javax.swing.JMenuItem itmMostrar;
    private javax.swing.JCheckBoxMenuItem itmNomostrar;
    private javax.swing.JMenuItem itmSalir;
    private javax.swing.JMenuItem itmrRegistrar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlModificar;
    private javax.swing.JPanel pnlMostrar;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlRegistrar1;
    private javax.swing.JTable tablaMostrar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtedad;
    // End of variables declaration//GEN-END:variables
    
    //getters y setters para usarlos en controlador
    public JButton getLimpiar() {
        return btnLimpiar;
    }  

    public JTable getTablaMostrar() {
        return tablaMostrar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JPanel getPnlMostrar() {
        return pnlMostrar;
    }
    

    public JButton getRegistrar() {
        return btnRegistrar;
    }

    public String getEdad() {
        return txtedad.getText();
    }

   public void setEdad(String edad) {
        this.txtedad.setText(edad);
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JPanel getPnlFormulario() {
        return pnlFormulario;
    }



    public JMenuItem getItmEliminar() {
        return ItmEliminar;
    }

    public String getRaza() {
        return Raza.getSelectedItem().toString();
    }

    public JMenuItem getItmModificar() {
        return ItmModificar;
    }

    public JMenuItem getItmMostrar() {
        return itmMostrar;
    }

    public JCheckBoxMenuItem getItmNomostrar() {
        return itmNomostrar;
    }

    public JMenuItem getItmSalir() {
        return itmSalir;
    }
   

   public String getNombre() {
        return txtNombre.getText();
    }

       public void setNombre(String nombre) {
    this.txtNombre.setText(nombre);
}


    public String getNombreDueno() {
        return NomDueno.getSelectedItem().toString();
    }

    public void setNombreDueno(String nombre) {
        this.NomDueno.setSelectedItem(nombre);
    }

    public JPanel getPnlModificar() {
        return pnlModificar;
    }

    public JPanel getPnlRegistrar() {
        return pnlRegistrar;
    }

    public JMenuItem getItmRegistrar() {
        return itmrRegistrar;
    }

  

    // Método para leer el archivo y llenar el JComboBox
       public void llenarComboBoxDesdeArchivo() {
        String filePath = "src/main/java/Modelo/clientes.txt"; // Reemplaza con la ruta real de tu archivo
        JComboBox<String> comboBox = NomDueno; // Obtener el JComboBox

        // Llenar el JComboBox utilizando el método fillComboBoxFromFile
        fillComboBoxFromFile(comboBox, filePath);
    }

    // Método para leer el archivo y llenar el JComboBox
    private void fillComboBoxFromFile(JComboBox<String> comboBox, String filePath) {
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Dividir la línea en campos usando un separador (por ejemplo, coma, espacio, tabulación)
            String[] campos = line.split(";"); // Reemplaza " " con el separador correcto

            if (campos.length > 0) {
                // Tomar solo el primer campo y agregarlo al JComboBox
                comboBox.addItem(campos[0]);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public void setRaza(String raza) {
    this.Raza.setSelectedItem(raza);
}
   

    

    
    

}