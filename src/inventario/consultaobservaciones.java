///Hecho por Brian Vargas Henao. CC. 1.022.097.226
package inventario;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class consultaobservaciones extends javax.swing.JFrame {

    DefaultTableModel model;

    public consultaobservaciones() {
        initComponents();
        cargar2("");

        setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage());
    }

    void cargar2(String valor) {

        String[] titulos = {"Serial", "Dependencia", "Usuario", "Placa", "Fecha Mantenimiento", "Mantenimiento"};
        String[] registros = new String[6];

        String sql = "SELECT * from observaciones where Serial LIKE '%" + valor + "%'";

        model = new DefaultTableModel(null, titulos);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("Serial");
                registros[1] = rs.getString("Dependencia");
                registros[2] = rs.getString("Usuario");
                registros[3] = rs.getString("Placa");
                registros[4] = rs.getString("FechaMantenimiento");
                registros[5] = rs.getString("Mantenimiento");

                model.addRow(registros);
            }

            t_datos2.setModel(model);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);
        }

        this.getContentPane().setBackground(Color.white);

        setExtendedState(consulta.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setTitle("Consulta de Mantenimientos");

        setDefaultCloseOperation(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        rdserial = new javax.swing.JRadioButton();
        rdtodo = new javax.swing.JRadioButton();
        rddependencia = new javax.swing.JRadioButton();
        rdnombre = new javax.swing.JRadioButton();
        txtplaca = new javax.swing.JTextField();
        rdusuario = new javax.swing.JRadioButton();
        txtserial = new javax.swing.JTextField();
        txtdependencia = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t_datos2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_datos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(t_datos2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Consulte las observaciones o mantenimientos de los equipos.");

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        rdserial.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdserial.setText("Serial");
        rdserial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdserialActionPerformed(evt);
            }
        });

        rdtodo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdtodo.setText("Mostrar Todo");
        rdtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtodoActionPerformed(evt);
            }
        });

        rddependencia.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rddependencia.setText("Dependencia");
        rddependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddependenciaActionPerformed(evt);
            }
        });

        rdnombre.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdnombre.setText("Placa");
        rdnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnombreActionPerformed(evt);
            }
        });

        rdusuario.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdusuario.setText("Usuario");
        rdusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdusuarioActionPerformed(evt);
            }
        });

        txtdependencia.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        txtdependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Catastro", "Desarrollo", "Infraestructura", "Valorizacion", "Archivo", "Almacen", "Planeacion", "Salud", "Sisben", "Control Interno", "Control Disciplinario", "Juridica", "Despacho 1a Dama", "Oficina de Calidad", "Alcaldia", "Hacienda", "Tesoreria", "Gobierno", "Sistemas", "Comunicaciones", "Inspeccion", "Transito", "Oficina de Empleo", "Comisaria de Familia", "Educacion", "Casa de la Cultura", "Programas Sociales", "Casa de la Mujer", "Invicop", "Junta de Daportes" }));

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarobservacion.png"))); // NOI18N
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdserial)
                                .addGap(18, 18, 18)
                                .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdusuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdnombre)
                                            .addComponent(rddependencia))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(126, 126, 126)
                                                .addComponent(rdtodo)
                                                .addGap(56, 56, 56)
                                                .addComponent(jButton3))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(928, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdtodo)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnombre)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdserial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdusuario)
                            .addComponent(rddependencia)
                            .addComponent(txtdependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnReportes))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        principal obj = new principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void rdserialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdserialActionPerformed
        if (rdserial.isSelected() == true) {
            txtserial.setEnabled(true);
            txtserial.requestFocus();
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_rdserialActionPerformed

    private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
        if (rdtodo.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.requestFocus();
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_rdtodoActionPerformed

    private void rddependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddependenciaActionPerformed
        if (rddependencia.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.requestFocus();
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtdependencia.setEnabled(true);
            txtdependencia.setSelectedItem(0);

        }        // TODO add your handling code here:

    }//GEN-LAST:event_rddependenciaActionPerformed

    private void rdusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdusuarioActionPerformed
        if (rdusuario.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.setText("");
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(true);
            txtusuario.requestFocus();
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }// TODO add your handling code here:
    }//GEN-LAST:event_rdusuarioActionPerformed

    private void rdnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnombreActionPerformed
        if (rdnombre.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.setText("");
            txtplaca.setEnabled(true);
            txtplaca.requestFocus();
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }// TODO add your handling code here:
    }//GEN-LAST:event_rdnombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String serial = txtserial.getText();
        String Placa = txtplaca.getText();
        String usuario = txtusuario.getText();
        String dependencia = txtdependencia.getSelectedItem().toString();

        if (rdserial.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"Serial", "Dependencia", "Usuario", "Placa", "Fecha Mantenimiento", "Mantenimiento"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos2.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM observaciones WHERE Serial='" + serial + "'";

                String[] registros = new String[6];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("Serial");
                    registros[1] = rs.getString("Dependencia");
                    registros[2] = rs.getString("Usuario");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("FechaMantenimiento");
                    registros[5] = rs.getString("Mantenimiento");
                    modelo.addRow(registros);

                }
                t_datos2.setModel(modelo);

            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rdnombre.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"Serial", "Dependencia", "Usuario", "Placa", "Fecha Mantenimiento", "Mantenimiento"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos2.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM observaciones WHERE Placa='" + Placa + "'";

                String[] registros = new String[6];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("Serial");
                    registros[1] = rs.getString("Dependencia");
                    registros[2] = rs.getString("Usuario");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("FechaMantenimiento");
                    registros[5] = rs.getString("Mantenimiento");
                    modelo.addRow(registros);

                }
                t_datos2.setModel(modelo);

            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rdusuario.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"Serial", "Dependencia", "Usuario", "Placa", "Fecha Mantenimiento", "Mantenimiento"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos2.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM observaciones WHERE Usuario='" + usuario + "'";

                String[] registros = new String[6];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("Serial");
                    registros[1] = rs.getString("Dependencia");
                    registros[2] = rs.getString("Usuario");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("FechaMantenimiento");
                    registros[5] = rs.getString("Mantenimiento");
                    modelo.addRow(registros);

                }
                t_datos2.setModel(modelo);

            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rddependencia.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"Serial", "Dependencia", "Usuario", "Placa", "Fecha Mantenimiento", "Mantenimiento"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos2.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM observaciones WHERE Dependencia='" + dependencia + "'";

                String[] registros = new String[6];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("Serial");
                    registros[1] = rs.getString("Dependencia");
                    registros[2] = rs.getString("Usuario");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("FechaMantenimiento");
                    registros[5] = rs.getString("Mantenimiento");
                    modelo.addRow(registros);

                }
                t_datos2.setModel(modelo);

            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rdtodo.isSelected() == true) {
            cargar2("");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Reporte_Mantenimientos obj = new Reporte_Mantenimientos();
        obj.setVisible(true);

    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(consultaobservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaobservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaobservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaobservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaobservaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rddependencia;
    private javax.swing.JRadioButton rdnombre;
    private javax.swing.JRadioButton rdserial;
    private javax.swing.JRadioButton rdtodo;
    private javax.swing.JRadioButton rdusuario;
    private javax.swing.JTable t_datos2;
    private javax.swing.JComboBox txtdependencia;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtserial;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    conexion cc = new conexion();
    Connection cn = cc.conexion();
}
