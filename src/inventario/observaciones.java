package inventario;
///Hecho por Brian Vargas Henao. CC. 1.022.097.226

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class observaciones extends javax.swing.JFrame {
    
    

    public observaciones() {
        initComponents();
        limpiar();
                setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage());

        
    }
        
        
        void limpiar(){
    
   
        t_fecha1.setSelectedIndex(0);
        t_fecha2.setSelectedIndex(0);
        t_fecha3.setSelectedIndex(0);
        t_Nombre.setText("");
        t_serial.setText("");
        t_Usuario.setText("");
        t_observacion.setText("");
        cmbDependencia.setSelectedIndex(0);
    
        
        this.getContentPane().setBackground(Color.white);
        
        setExtendedState(observaciones.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setTitle("Observaciones");
        
        setDefaultCloseOperation(0);
        
        }
        
         void limpiar2(){
    
        t_serial.setText("");
        t_fecha1.setSelectedIndex(0);
        t_fecha2.setSelectedIndex(0);
        t_fecha3.setSelectedIndex(0);
        t_observacion.setText("");
         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_serial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_fecha1 = new javax.swing.JComboBox();
        t_fecha2 = new javax.swing.JComboBox();
        t_fecha3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_observacion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        t_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbDependencia = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        t_Nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese los mantenimientos o eventos realizados al equipo.");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setText("Serial:");

        t_serial.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("Fecha:");

        t_fecha1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_fecha1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes>>", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        t_fecha2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_fecha2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia>>", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        t_fecha3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_fecha3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año>>", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("Observación:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        t_observacion.setColumns(20);
        t_observacion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_observacion.setRows(5);
        jScrollPane1.setViewportView(t_observacion);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");

        t_Usuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("Dependencia:");

        cmbDependencia.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbDependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Catastro", "Desarrollo", "Infraestructura", "Valorizacion", "Archivo", "Almacen", "Planeacion", "Salud", "Sisben", "Control Interno", "Control Disciplinario", "Juridica", "Despacho 1a Dama", "Oficina de Calidad", "Alcaldia", "Hacienda", "Tesoreria", "Gobierno", "Sistemas", "Comunicaciones", "Inspeccion", "Transito", "Oficina de Empleo", "Comisaria de Familia", "Educacion", "Casa de la Cultura", "Programas Sociales", "Casa de la Mujer", "Invicop", "Junta de Daportes" }));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setText("Nombre PC:");

        t_Nombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t_fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(358, 358, 358))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(t_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        principal obj= new principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexion cc = new conexion();
        Connection cn = cc.conexion();
        
        String Serial,NombrePC,Usuario,Dependencia,FechaMantenimiento,Mantenimiento;
        String sql="";
        
        Serial = t_serial.getText();
        NombrePC = t_Nombre.getText();
        Usuario = t_Usuario.getText();
        Dependencia = cmbDependencia.getSelectedItem().toString();
        FechaMantenimiento = t_fecha1.getSelectedItem().toString()+"-" + t_fecha2.getSelectedItem().toString()+"-"+ t_fecha3.getSelectedItem().toString();        
        Mantenimiento = t_observacion.getText();
        
        
        sql="INSERT INTO observaciones (Serial,NombrePC,Usuario,Dependencia,FechaMantenimiento,Mantenimiento) VALUES(?,?,?,?,?,?)";
        try {
        PreparedStatement pst;
        
            pst = cn.prepareStatement(sql);
       
        
        pst.setString(1,Serial);
        pst.setString(2,NombrePC);
        pst.setString(3,Usuario);
        pst.setString(4,Dependencia);
        pst.setString(5,FechaMantenimiento);
        pst.setString(6,Mantenimiento);
        
        int n = pst.executeUpdate();
        
         if (n>=0){
            JOptionPane.showMessageDialog(null, "Observación guardada correctamente");
            limpiar();
        } 

         } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null,"No se pudo Guardar el Mantenimiento:\n"+"\n"+ "Asegurese de haber digitado el Serial del equipo al cual le realizaron el mantenimiento.","Registro denegado",JOptionPane.ERROR_MESSAGE);
        System.out.print(e.getMessage());
        
    }
            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(observaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new observaciones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDependencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_Nombre;
    private javax.swing.JTextField t_Usuario;
    private javax.swing.JComboBox t_fecha1;
    private javax.swing.JComboBox t_fecha2;
    private javax.swing.JComboBox t_fecha3;
    private javax.swing.JTextArea t_observacion;
    private javax.swing.JTextField t_serial;
    // End of variables declaration//GEN-END:variables
}
