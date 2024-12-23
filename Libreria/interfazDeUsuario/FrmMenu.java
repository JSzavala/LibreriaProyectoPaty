/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria.interfazDeUsuario;

/**
 *
 * @author quiro
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        lblMenu = new javax.swing.JLabel();
        btnGestionDeSolicitantes = new javax.swing.JButton();
        btnGestionDeLibros = new javax.swing.JButton();
        btnConsultaDePrestamos = new javax.swing.JButton();
        btnResumenDelDia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMenu.setText("MENU");

        btnGestionDeSolicitantes.setText("Gestion de solicitantes");
        btnGestionDeSolicitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionDeSolicitantesActionPerformed(evt);
            }
        });

        btnGestionDeLibros.setText("Gestion de libros");
        btnGestionDeLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionDeLibrosActionPerformed(evt);
            }
        });

        btnConsultaDePrestamos.setText("Consulta de prestamos");
        btnConsultaDePrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDePrestamosActionPerformed(evt);
            }
        });

        btnResumenDelDia.setText("Resumen del dia");
        btnResumenDelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenDelDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionDeSolicitantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionDeLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultaDePrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResumenDelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestionDeSolicitantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestionDeLibros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultaDePrestamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResumenDelDia)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionDeSolicitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionDeSolicitantesActionPerformed
        // TODO add your handling code here:
        FrmGestionDeSolicitantes gestionDeSolicitantes = new FrmGestionDeSolicitantes();
        gestionDeSolicitantes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionDeSolicitantesActionPerformed

    private void btnGestionDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionDeLibrosActionPerformed
        // TODO add your handling code here:
        FrmGestionDeLibros gestionDeLibros = new FrmGestionDeLibros();
        gestionDeLibros.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionDeLibrosActionPerformed

    private void btnConsultaDePrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDePrestamosActionPerformed
        // TODO add your handling code here:
        FrmConsultaDePrestamos consultaDePrestamos = new FrmConsultaDePrestamos();
        consultaDePrestamos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaDePrestamosActionPerformed

    private void btnResumenDelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenDelDiaActionPerformed
        // TODO add your handling code here:
        FrmResumenDelDia resumenDelDia = new FrmResumenDelDia();
        resumenDelDia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResumenDelDiaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaDePrestamos;
    private javax.swing.JButton btnGestionDeLibros;
    private javax.swing.JButton btnGestionDeSolicitantes;
    private javax.swing.JButton btnResumenDelDia;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
