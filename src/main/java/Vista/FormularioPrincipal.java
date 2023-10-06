/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Mariana M
 */
public class FormularioPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPricipal
     */
    public FormularioPrincipal() {
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

        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLwelcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        mnu_cliente = new javax.swing.JMenu();
        registrocliente = new javax.swing.JMenuItem();
        editarcliente = new javax.swing.JMenuItem();
        mnu_mascota = new javax.swing.JMenu();
        mnu_vetrinario = new javax.swing.JMenu();
        registrarveterinario = new javax.swing.JMenuItem();
        mnu_vendedor = new javax.swing.JMenu();
        mnu_historiaclinica = new javax.swing.JMenu();
        mnu_factura = new javax.swing.JMenu();
        mnu_acercade = new javax.swing.JMenu();
        integrantes = new javax.swing.JMenuItem();
        mnu_salir1 = new javax.swing.JMenu();
        cerrarsesion = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Principal");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\imgmascota.png")); // NOI18N

        jLwelcome.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\imgbienvenido-.png")); // NOI18N

        mnu_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        mnu_cliente.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\iconcliente.png")); // NOI18N
        mnu_cliente.setText("Clientes");

        registrocliente.setText("Registrar nuevo cliente");
        registrocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroclienteActionPerformed(evt);
            }
        });
        mnu_cliente.add(registrocliente);

        editarcliente.setText("Editar");
        editarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarclienteActionPerformed(evt);
            }
        });
        mnu_cliente.add(editarcliente);

        barraMenu.add(mnu_cliente);

        mnu_mascota.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\iconMascotas.png")); // NOI18N
        mnu_mascota.setText("Mascotas");
        barraMenu.add(mnu_mascota);

        mnu_vetrinario.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\iconveterinario.png")); // NOI18N
        mnu_vetrinario.setText("Veterinarios");

        registrarveterinario.setText("Registrar Veterinario");
        registrarveterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarveterinarioActionPerformed(evt);
            }
        });
        mnu_vetrinario.add(registrarveterinario);

        barraMenu.add(mnu_vetrinario);

        mnu_vendedor.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\iconvendedor.png")); // NOI18N
        mnu_vendedor.setText("Vendedores");
        barraMenu.add(mnu_vendedor);

        mnu_historiaclinica.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\iconhistoriaclinica.png")); // NOI18N
        mnu_historiaclinica.setText("Historias Clínicas");
        barraMenu.add(mnu_historiaclinica);

        mnu_factura.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\iconfactura.png")); // NOI18N
        mnu_factura.setText("Facturas");
        barraMenu.add(mnu_factura);

        mnu_acercade.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\iconacerca-de.png")); // NOI18N
        mnu_acercade.setText("A cerca de nosotros");

        integrantes.setText("Integrantes ");
        mnu_acercade.add(integrantes);

        barraMenu.add(mnu_acercade);

        mnu_salir1.setIcon(new javax.swing.ImageIcon("E:\\USUARIO\\Escritorio\\Mariana Montoya\\INGENIERÍA INFORMÁTICA\\SEMESTRE IV\\TALLER DE PROGRAMACIÓN\\ProyectoVeterinaria\\src\\main\\java\\Vista\\images\\salida.png")); // NOI18N
        mnu_salir1.setText("Salir");

        cerrarsesion.setText("Cerrar sesión");
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });
        mnu_salir1.add(cerrarsesion);

        barraMenu.add(mnu_salir1);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addGap(84, 84, 84)
                .addComponent(jLwelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLwelcome))))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registroclienteActionPerformed

    private void editarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarclienteActionPerformed

    private void registrarveterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarveterinarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_registrarveterinarioActionPerformed

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarsesionActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem cerrarsesion;
    private javax.swing.JMenuItem editarcliente;
    private javax.swing.JMenuItem integrantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLwelcome;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JMenu mnu_acercade;
    private javax.swing.JMenu mnu_cliente;
    private javax.swing.JMenu mnu_factura;
    private javax.swing.JMenu mnu_historiaclinica;
    private javax.swing.JMenu mnu_mascota;
    private javax.swing.JMenu mnu_salir1;
    private javax.swing.JMenu mnu_vendedor;
    private javax.swing.JMenu mnu_vetrinario;
    private javax.swing.JMenuItem registrarveterinario;
    private javax.swing.JMenuItem registrocliente;
    // End of variables declaration//GEN-END:variables

    
    
    public JMenuItem getEditarcliente() {
        return editarcliente;
    }

    public void setEditarcliente(JMenuItem editarcliente) {
        this.editarcliente = editarcliente;
    }

    public JMenu getMnu_acercade() {
        return mnu_acercade;
    }

    public JMenu getMnu_cliente() {
        return mnu_cliente;
    }

    public void setMnu_cliente(JMenu mnu_cliente) {
        this.mnu_cliente = mnu_cliente;
    }

    public JMenu getMnu_factura() {
        return mnu_factura;
    }

    public void setMnu_factura(JMenu mnu_factura) {
        this.mnu_factura = mnu_factura;
    }

    public void setMnu_acercade(JMenu mnu_acercade) {
        this.mnu_acercade = mnu_acercade;
    }

    public void setMnu_historiaclinica(JMenu mnu_historiaclinica) {
        this.mnu_historiaclinica = mnu_historiaclinica;
    }

    public JMenu getMnu_mascota() {
        return mnu_mascota;
    }

    public void setMnu_mascota(JMenu mnu_mascota) {
        this.mnu_mascota = mnu_mascota;
    }

    public JMenu getMnu_salir1() {
        return mnu_salir1;
    }

    public void setMnu_salir1(JMenu mnu_salir1) {
        this.mnu_salir1 = mnu_salir1;
    }

    public JMenu getMnu_vendedor() {
        return mnu_vendedor;
    }

    public void setMnu_vendedor(JMenu mnu_vendedor) {
        this.mnu_vendedor = mnu_vendedor;
    }

    public JMenu getMnu_vetrinario() {
        return mnu_vetrinario;
    }

    public void setMnu_vetrinario(JMenu mnu_vetrinario) {
        this.mnu_vetrinario = mnu_vetrinario;
    }

    public JMenuItem getRegistrocliente() {
        return registrocliente;
    }

    public void setRegistrocliente(JMenuItem registrocliente) {
        this.registrocliente = registrocliente;
    }

    public JMenuItem getRegistrarveterinario() {
        return registrarveterinario;
    }

    public JMenuItem getCerrarsesion() {
        return cerrarsesion;
    }

    public JMenuItem getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(JMenuItem integrantes) {
        this.integrantes = integrantes;
    }

}
