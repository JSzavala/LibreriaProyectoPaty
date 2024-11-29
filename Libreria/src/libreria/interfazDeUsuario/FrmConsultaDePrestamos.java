/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria.interfazDeUsuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import libreria.Procesamiento.*;

/**
 *
 * @author quiro
 */
public class FrmConsultaDePrestamos extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsultaDePrestamos
     */
    public FrmConsultaDePrestamos() {
        initComponents();
        ArrayList<Object> prestamos;
        //cbSolicitante.addItem(item);
        /*try{
            prestamos=ManejadorArchivos.leerArchivo("Prestamos.poo");
            DefaultTableModel modelo = (DefaultTableModel)tbConsultas.getModel();
            for(Object obj: prestamos){
                modelo.addRow(((Prestamo)obj).toArray());
            }
            tbConsultas.setModel(modelo);
        }catch(ClassNotFoundException ex){
            
        }catch(NullPointerException ex){
            
        }*/

    }

    private Object autorDe(Object titulo) {
        try {
            ArrayList lista = ManejadorArchivos.leerArchivo("Libros.poo");
            for (Object obj : lista) {
                if (((Libro) obj).getTitulo().equals(titulo)) {
                    return ((Libro) obj).getAutor();
                }
            }
        } catch (Exception ex) {
            //coso de que no se encontro nadota, luego lo vemos ñañañañ
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblConsultaPrestamos = new javax.swing.JLabel();
        btnGestionarPrestamos = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConsultaPrestamos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblConsultaPrestamos.setText("Consulta Prestamos");

        btnGestionarPrestamos.setText("Gestionar prestamos");
        btnGestionarPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarPrestamosActionPerformed(evt);
            }
        });

        btnDevolver.setText("Devolver");

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Prestamo", "Devolucion"
            }
        ));
        jScrollPane1.setViewportView(tbConsultas);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnGestionarPrestamos))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblConsultaPrestamos)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDevolver)
                        .addGap(30, 30, 30)
                        .addComponent(btnCancelar)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnDevolver))
                    .addComponent(btnGestionarPrestamos))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultaPrestamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGestionarPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPrestamosActionPerformed
        // TODO add your handling code here:
        FrmGestionDePrestamos gestionarPrestamos = new FrmGestionDePrestamos();
        gestionarPrestamos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionarPrestamosActionPerformed
    private void validMesYDia(int dia, int mes, int anio) throws InvalidDateFormat {
        if (dia > 31 || dia < 1) {
            throw new InvalidDateFormat("?");
        }
        if (mes < 1 || mes > 12) {
            throw new InvalidDateFormat("?");
        }
        if (dia > 30 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            throw new InvalidDateFormat("?");
        }
        if (dia > 29 && mes == 2) {
            throw new InvalidDateFormat("?");
        }
        if (anio < LocalDate.now().getYear()) {
            throw new InvalidDateFormat("?");
        }
    }
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        LocalDate fechaBusca = null;
        try {
            String fecha = txtFecha.getText();
            DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String[] dma = fecha.split("-");
            validMesYDia(Integer.parseInt(dma[0]), Integer.parseInt(dma[1]), Integer.parseInt(dma[2]));
            fechaBusca = LocalDate.parse(fecha, form);
        } catch (InvalidDateFormat ex) {
            //notificacion de error
            System.out.println("fecha");
        }
        if (fechaBusca != null) {
            try {
                ArrayList<Object> prestamos = ManejadorArchivos.leerArchivo("Prestamos.poo");
                for (Object obj : prestamos) {
                    System.out.println(((Prestamo) (obj)).getFechaPrestamo()+" "+fechaBusca);
                    if (((Prestamo) (obj)).getFechaPrestamo().equals(fechaBusca)) {
                        System.out.println("????");
                        DefaultTableModel modelo = (DefaultTableModel) tbConsultas.getModel();
                        ArrayList<Object> titulos, fechas;
                        titulos = ((Prestamo) (obj)).getNombresLibro();
                        fechas = ((Prestamo) (obj)).getFechaRegreso();
                        Object prop = ((Prestamo) (obj)).getNombreUsuario();
                        for (int i = 0; i < ((Prestamo) (obj)).getNombresLibro().size(); i++) {
                            modelo.addRow(new Object[]{titulos.get(i), autorDe(titulos.get(i)),
                                ((Prestamo) (obj)).getFechaPrestamo(), fechas.get(i)});
                            break;
                        }
                        tbConsultas.setModel(modelo);
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnVerActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConsultaDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultaDePrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnGestionarPrestamos;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaPrestamos;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
