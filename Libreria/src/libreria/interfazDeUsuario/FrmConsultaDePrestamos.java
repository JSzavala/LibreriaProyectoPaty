/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria.interfazDeUsuario;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
        try{
            prestamos=ManejadorArchivos.leerArchivo("Prestamos.poo");
            
            for(Object obj: prestamos){
                cbPrestamos.addItem(((Prestamo)obj).toString());
            }
        }catch(ClassNotFoundException ex){
            
        }catch(NullPointerException ex){
            
        }

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
           JOptionPane.showMessageDialog(null,"No se encontro el autor solicitado","Error en el autor",JOptionPane.ERROR_MESSAGE);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnVerNombre = new javax.swing.JButton();
        cbPrestamos = new javax.swing.JComboBox<>();
        btnVerPrestamo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblFechaPrestamo = new javax.swing.JLabel();
        lblFechaDevolucion = new javax.swing.JLabel();

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
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor"
            }
        ));
        jScrollPane1.setViewportView(tbConsultas);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnInforme.setText("Informe del dia");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        btnVerNombre.setText("Ver");
        btnVerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerNombreActionPerformed(evt);
            }
        });

        btnVerPrestamo.setText("Ver");
        btnVerPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPrestamoActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado:");

        jLabel4.setText("Fecha Devolucion:");

        jLabel5.setText("Fecha Prestamo:");

        lblEstado.setText("----------");

        lblFechaPrestamo.setText("----------");

        lblFechaDevolucion.setText("----------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGestionarPrestamos)
                        .addComponent(lblConsultaPrestamos))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(btnVerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPrestamos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnVerPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInforme)
                        .addGap(18, 18, 18)
                        .addComponent(btnDevolver)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEstado)
                                            .addComponent(jLabel3))
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblFechaDevolucion)
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblFechaPrestamo)
                                        .addGap(52, 52, 52)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstado)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaPrestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaDevolucion)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionarPrestamos)
                    .addComponent(btnInforme)
                    .addComponent(btnDevolver)
                    .addComponent(btnCancelar))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultaPrestamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerPrestamo)
                .addGap(34, 34, 34)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerNombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
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
    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        JOptionPane.showMessageDialog(null, "Ventas: "+Contadores.getPrestamos()+"\nDevoluciones: "+Contadores.getDevoluciones());
    }//GEN-LAST:event_btnInformeActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        // TODO add your handling code here:
        ArrayList<Object> prestamos,libros;
        try{
            prestamos=ManejadorArchivos.leerArchivo("Prestamos.poo");
            libros=ManejadorArchivos.leerArchivo("Libros.poo");
            for(int i=0; i<prestamos.size(); i++){
                ((Prestamo)prestamos.get(i)).setDevuelto(true);
                ManejadorArchivos.reemplazarObjeto("Prestamos.poo",i,((Prestamo)prestamos.get(i)));
            }
            for(int i=0; i<libros.size(); i++){
                ((Libro)libros.get(i)).setDisponibilidad(true);
                ManejadorArchivos.reemplazarObjeto("Libros.poo",i,((Libro)libros.get(i)));
            }
            for(int i=0; i<tbConsultas.getModel().getRowCount(); i++){
                tbConsultas.getModel().setValueAt("Disponible", i, 3);
            }
        }catch(ClassNotFoundException ex){
            
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void btnVerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerNombreActionPerformed
        /*LocalDate fechaBusca = null;
        try {
            String fecha = txtFecha.getText();
            DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String[] dma = fecha.split("-");
            validMesYDia(Integer.parseInt(dma[0]), Integer.parseInt(dma[1]), Integer.parseInt(dma[2]));
            fechaBusca = LocalDate.parse(fecha, form);
        } catch (InvalidDateFormat ex) {
            //notificacion de error
            JOptionPane.showMessageDialog(null,"Error en el formato de fecha","ERROR",JOptionPane.ERROR_MESSAGE);
        }   catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"Debes llenar el campo solicitado","ERROR en los datos",JOptionPane.ERROR_MESSAGE);
        }   catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Debes llenar el campo solicitado","ERROR",JOptionPane.ERROR_MESSAGE);
        }   catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null,"La fecha no esta completa, utiliza el formato indicado","ERROR en la fecha",JOptionPane.ERROR_MESSAGE);
        }
        if (txtNombre.getText().length()>=1) {
            try {
                ArrayList<Object> prestamos = ManejadorArchivos.leerArchivo("Prestamos.poo");
                for (Object obj : prestamos) {
                    //System.out.println(((Prestamo) (obj)).getFechaPrestamo()+" "+fechaBusca);
                    if (((Prestamo) (obj)).getNombreUsuario().equals(txtNombre.getText())) {
                        //System.out.println("????");
                        DefaultTableModel modelo = (DefaultTableModel) tbConsultas.getModel();
                        ArrayList<Object> titulos, fechas;
                        titulos = ((Prestamo) (obj)).getNombresLibro();
                        fechas = ((Prestamo) (obj)).getFechaRegreso();
                        Object prop = ((Prestamo) (obj)).getNombreUsuario();
                        for (int i = 0; i < ((Prestamo) (obj)).getNombresLibro().size(); i++) {
                            modelo.addRow(new Object[]{titulos.get(i), autorDe(titulos.get(i)),
                                ((Prestamo) (obj)).getFechaPrestamo(),(((Prestamo) (obj)).getDevuelto()?"Disponible":"No disponible")});
                            break;
                        }
                        tbConsultas.setModel(modelo);
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }*/
    }//GEN-LAST:event_btnVerNombreActionPerformed

    private void btnVerPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPrestamoActionPerformed
        int idPrestamo=cbPrestamos.getSelectedIndex();
            try {
                Object prestamo = ManejadorArchivos.leerObjeto("Prestamos.poo",idPrestamo);
                DefaultTableModel modelo = (DefaultTableModel) tbConsultas.getModel();
                for(Object titulo: ((Prestamo)(prestamo)).getNombresLibro()){
                    modelo.addRow(new Object[]{titulo,autorDe(titulo)});
                }
                tbConsultas.setModel(modelo);
                lblEstado.setText(((Prestamo)(prestamo)).getDevuelto()?"Devuelto":"No devuelto");
                lblFechaPrestamo.setText(((Prestamo)(prestamo)).getFechaPrestamo().toString());
                lblFechaDevolucion.setText(((Prestamo)(prestamo)).getFechaRegreso().toString());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
    }//GEN-LAST:event_btnVerPrestamoActionPerformed

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
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnVerNombre;
    private javax.swing.JButton btnVerPrestamo;
    private javax.swing.JComboBox<String> cbPrestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaPrestamos;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaDevolucion;
    private javax.swing.JLabel lblFechaPrestamo;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
