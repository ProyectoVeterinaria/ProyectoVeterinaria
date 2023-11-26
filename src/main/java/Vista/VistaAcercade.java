/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

/**
 *
 * @author Mariana M
 */
public class VistaAcercade extends javax.swing.JDialog {

    /**
     * Creates new form VistaAcercade
     */
    public VistaAcercade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbSara = new javax.swing.JLabel();
        jlbAlejandro = new javax.swing.JLabel();
        jlbMariana = new javax.swing.JLabel();
        jlbversion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de nosotros");

        jlbSara.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbSara.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\Icon1.png"));
        jlbSara.setText("Sara Munera Ocampo");

        jlbAlejandro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbAlejandro.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\Icon3.png"));
        jlbAlejandro.setText("Alejandro Correa Arias");

        jlbMariana.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbMariana.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Vista\\images\\Icon2.png"));
        jlbMariana.setText("Mariana Montoya Sepúlveda");

        jlbversion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jlbversion.setText("Versión 2.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMariana)
                    .addComponent(jlbAlejandro)
                    .addComponent(jlbSara))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbversion)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlbMariana)
                .addGap(18, 18, 18)
                .addComponent(jlbSara)
                .addGap(18, 18, 18)
                .addComponent(jlbAlejandro)
                .addGap(18, 18, 18)
                .addComponent(jlbversion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaAcercade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VistaAcercade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VistaAcercade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VistaAcercade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaAcercade dialog = new VistaAcercade(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jlbAlejandro;
    private javax.swing.JLabel jlbMariana;
    private javax.swing.JLabel jlbSara;
    private javax.swing.JLabel jlbversion;
    // End of variables declaration//GEN-END:variables
}
