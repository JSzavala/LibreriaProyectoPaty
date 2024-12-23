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
public class FrmGestionDePrestamos extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestionDePrestamos
     */
    public FrmGestionDePrestamos() {
        initComponents();
        ArrayList<Object> prestamos;
        ArrayList<Object> libros;
        ArrayList<Object> solicitantes;
        //cbSolicitante.addItem(item);
        /*try {
            prestamos = ManejadorArchivos.leerArchivo("Prestamos.poo");
            DefaultTableModel modelo = (DefaultTableModel) tbPrestamo.getModel();
            for (Object obj : prestamos) {
                Prestamo prestamo = (Prestamo) obj;
                ArrayList<Object> titulos, fechas;
                boolean devuelto;
                titulos = prestamo.getNombresLibro();
                fechas = prestamo.getFechaRegreso();
                devuelto = prestamo.getDevuelto();
                for (int i = 0; i < titulos.size(); i++){
                    System.out.println(titulos.get(i) + " " + fechas.get(i));
                    modelo.addRow(new Object[]{titulos.get(i), fechas.get(i), (devuelto == true ? "Disponible" : "No disponible")});
                }
            }
            tbPrestamo.setModel(modelo);
        } catch (ClassNotFoundException ex) {

        } catch (NullPointerException ex) {

        }*/
        //Quiza sea mejor idea poner todo esto en el mismo try,
        //pero que f l o j e r a
        try {
            libros = ManejadorArchivos.leerArchivo("Libros.poo");
            for (Object obj : libros) {
                if (((Libro) obj).isDisponibilidad()) {
                    cbLibro.addItem(((Libro) obj).toString());
                }
            }
        } catch (ClassNotFoundException ex) {

        } catch (NullPointerException ex) {

        }
        try {
            solicitantes = ManejadorArchivos.leerArchivo("Solicitantes.poo");
            for (Object obj : solicitantes) {
                cbSolicitante.addItem(((Solicitantes) obj).toString());
            }
        } catch (ClassNotFoundException ex) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGestionarPrestamos = new javax.swing.JLabel();
        lblSolicitante = new javax.swing.JLabel();
        cbSolicitante = new javax.swing.JComboBox<>();
        lblLibro = new javax.swing.JLabel();
        cbLibro = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        lblFechaLimite = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrestamo = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnInformeConsultas = new javax.swing.JButton();
        txtFechaLimite = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGestionarPrestamos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblGestionarPrestamos.setText("Gestionar Prestamos");

        lblSolicitante.setText("Solicitante:");

        cbSolicitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        lblLibro.setText("Libro:");

        btnAgregar.setText("Agregar libro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblFechaLimite.setText("Fecha Limite");

        tbPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Libro", "Fecha de entrega", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tbPrestamo);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnInformeConsultas.setText("Informe de consultas");
        btnInformeConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeConsultasActionPerformed(evt);
            }
        });

        jLabel2.setText("Formato: DD-MM-YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblLibro)
                                        .addGap(41, 41, 41)
                                        .addComponent(cbLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblSolicitante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFechaLimite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2))
                            .addComponent(lblGestionarPrestamos))
                        .addGap(0, 113, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInformeConsultas))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGestionarPrestamos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSolicitante)
                            .addComponent(cbSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLibro)
                            .addComponent(cbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaLimite)
                    .addComponent(txtFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInformeConsultas)
                    .addComponent(btnAceptar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnInformeConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeConsultasActionPerformed
        // TODO add your handling code here:
        FrmConsultaDePrestamos consultaDePrestamos = new FrmConsultaDePrestamos();
        consultaDePrestamos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInformeConsultasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        boolean aux=false;
        for (int i = 0; i < tbPrestamo.getModel().getRowCount(); i++) {
            if(cbLibro.getSelectedItem()==(tbPrestamo.getModel().getValueAt(i, 0))){
                    aux=true;
                    break;
                }
            }
        if(!aux){
            LocalDate fechaLimite = null;
            try {
                String fecha = txtFechaLimite.getText();
                DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String[] dma = fecha.split("-");
                validMesYDia(Integer.parseInt(dma[0]), Integer.parseInt(dma[1]), Integer.parseInt(dma[2]));
                fechaLimite = LocalDate.parse(fecha, form);
            } catch (InvalidDateFormat ex) {
                //notificacion de error
                System.out.println("fecha");
            }
            if (fechaLimite != null){
                DefaultTableModel modelo = (DefaultTableModel) tbPrestamo.getModel();
                modelo.addRow(new Object[]{cbLibro.getSelectedItem(), fechaLimite, "No disponible"});
                tbPrestamo.setModel(modelo);
            }     
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        ArrayList<Object> titulos = new ArrayList<>();
        ArrayList<Object> fechas = new ArrayList<>();
        for (int i = 0; i < tbPrestamo.getModel().getRowCount(); i++) {
            titulos.add(tbPrestamo.getModel().getValueAt(i, 0));
            fechas.add(tbPrestamo.getModel().getValueAt(i, 2));
        }
        try {
            ManejadorArchivos.agregarObjeto("Prestamos.poo", new Prestamo(titulos, cbSolicitante.getSelectedItem(),
                    false, LocalDate.now(), fechas));
        } catch (ClassNotFoundException ex) {
            System.out.println("No estaba el archivo");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed
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
            java.util.logging.Logger.getLogger(FrmGestionDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestionDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestionDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestionDePrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestionDePrestamos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnInformeConsultas;
    private javax.swing.JComboBox<String> cbLibro;
    private javax.swing.JComboBox<String> cbSolicitante;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaLimite;
    private javax.swing.JLabel lblGestionarPrestamos;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblSolicitante;
    private javax.swing.JTable tbPrestamo;
    private javax.swing.JTextField txtFechaLimite;
    // End of variables declaration//GEN-END:variables
}
