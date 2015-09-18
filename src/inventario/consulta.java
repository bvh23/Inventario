///Hecho por Brian Vargas Henao. CC. 1.022.097.226
package inventario;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class consulta extends javax.swing.JFrame {

    DefaultTableModel model;

    public consulta() {
        initComponents();
        
        
        this.getContentPane().setBackground(Color.white);

        setExtendedState(consulta.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setTitle("Consulta de datos");

        setDefaultCloseOperation(0);
        
        cargar("");
        txtcant.setText("" + t_datos.getRowCount());

        setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage());

    }

    void cargar(String valor) {

        String[] titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
        String[] registros = new String[32];

        String sql = "SELECT * from formulario where CONCAT(CPU,' ',Serial,' ',Marca,' ',Placa,' ',Referencia,' ',Estado,' ',Dependencia,' ',Usuario,' ',NombrePC, ' ',Procesador,' ',RAM,' ',SistemaOperativo,' ',Office,' ',Antivirus,' ',DiscoDuro,' ',Ip,' ',FechaCompra,' ',Monitor,' ',SerialMonitor,' ',MarcaMonitor,' ',PlacaMonitor,' ',ReferenciaMonitor,' ',Teclado,' ',SerialTeclado, ' ',MarcaTeclado,' ',PlacaTeclado,' ',ReferenciaTeclado,' ',Mouse,' ',SerialMouse,' ',MarcaMouse,' ',PlacaMouse,' ',ReferenciaMouse) LIKE '%" + valor + "%'";

        model = new DefaultTableModel(null, titulos);

        conexion cc = new conexion();
        Connection cn = cc.conexion();
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("CPU");
                registros[1] = rs.getString("Serial");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("Placa");
                registros[4] = rs.getString("Referencia");
                registros[5] = rs.getString("Estado");
                registros[6] = rs.getString("Dependencia");
                registros[7] = rs.getString("Usuario");
                registros[8] = rs.getString("NombrePC");
                registros[9] = rs.getString("Procesador");
                registros[10] = rs.getString("RAM");
                registros[11] = rs.getString("SistemaOperativo");
                registros[12] = rs.getString("Office");
                registros[13] = rs.getString("Antivirus");
                registros[14] = rs.getString("DiscoDuro");
                registros[15] = rs.getString("Ip");
                registros[16] = rs.getString("FechaCompra");
                registros[17] = rs.getString("Monitor");
                registros[18] = rs.getString("SerialMonitor");
                registros[19] = rs.getString("MarcaMonitor");
                registros[20] = rs.getString("PlacaMonitor");
                registros[21] = rs.getString("ReferenciaMonitor");
                registros[22] = rs.getString("Teclado");
                registros[23] = rs.getString("SerialTeclado");
                registros[24] = rs.getString("MarcaTeclado");
                registros[25] = rs.getString("PlacaTeclado");
                registros[26] = rs.getString("ReferenciaTeclado");
                registros[27] = rs.getString("Mouse");
                registros[28] = rs.getString("SerialMouse");
                registros[29] = rs.getString("MarcaMouse");
                registros[30] = rs.getString("PlacaMouse");
                registros[31] = rs.getString("ReferenciaMouse");

                model.addRow(registros);
            }

            t_datos.setModel(model);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        rdserial = new javax.swing.JRadioButton();
        rdmarca = new javax.swing.JRadioButton();
        rdplaca = new javax.swing.JRadioButton();
        rdestado = new javax.swing.JRadioButton();
        rddependencia = new javax.swing.JRadioButton();
        rdusuario = new javax.swing.JRadioButton();
        txtserial = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtplaca = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtestado = new javax.swing.JComboBox();
        txtdependencia = new javax.swing.JComboBox();
        rdtodo = new javax.swing.JRadioButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Consulte los datos de los equipos registrados");

        t_datos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        t_datos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        t_datos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(t_datos);

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

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jLabel6.setText("Cantidad:");

        txtcant.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        txtcant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantActionPerformed(evt);
            }
        });

        rdserial.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdserial.setText("Serial");
        rdserial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdserialActionPerformed(evt);
            }
        });

        rdmarca.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdmarca.setText("Marca");
        rdmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmarcaActionPerformed(evt);
            }
        });

        rdplaca.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdplaca.setText("Placa");
        rdplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdplacaActionPerformed(evt);
            }
        });

        rdestado.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdestado.setText("Estado");
        rdestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdestadoActionPerformed(evt);
            }
        });

        rddependencia.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rddependencia.setText("Dependencia");
        rddependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddependenciaActionPerformed(evt);
            }
        });

        rdusuario.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdusuario.setText("Usuario");
        rdusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdusuarioActionPerformed(evt);
            }
        });

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        txtestado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        txtestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Activo", "De Baja" }));

        txtdependencia.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        txtdependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Catastro", "Desarrollo", "Infraestructura", "Valorizacion", "Archivo", "Almacen", "Planeacion", "Salud", "Sisben", "Control Interno", "Control Disciplinario", "Juridica", "Despacho 1a Dama", "Oficina de Calidad", "Alcaldia", "Hacienda", "Tesoreria", "Gobierno", "Sistemas", "Comunicaciones", "Inspeccion", "Transito", "Oficina de Empleo", "Comisaria de Familia", "Educacion", "Casa de la Cultura", "Programas Sociales", "Casa de la Mujer", "Invicop", "Junta de Daportes" }));

        rdtodo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdtodo.setText("Mostrar Todo");
        rdtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtodoActionPerformed(evt);
            }
        });

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarobservacion.png"))); // NOI18N
        btnReportes.setBorder(null);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(448, 448, 448))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdserial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdmarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmarca)))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdplaca)
                    .addComponent(rdusuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtplaca)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdestado)
                    .addComponent(rddependencia))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdependencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdtodo)
                    .addComponent(jButton3))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReportes)
                                .addGap(471, 471, 471)
                                .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(363, 363, 363))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(554, 554, 554)
                                .addComponent(jLabel6)
                                .addGap(378, 378, 378)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdserial)
                            .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdplaca)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rdusuario)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rdmarca)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdestado)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdtodo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rddependencia)
                            .addComponent(txtdependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReportes)
                        .addGap(99, 99, 99))
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        principal obj = new principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String serial = txtserial.getText();
        String marca = txtmarca.getText();
        String placa = txtplaca.getText();
        String usuario = txtusuario.getText();
        String estado = txtestado.getSelectedItem().toString();
        String dependencia = txtdependencia.getSelectedItem().toString();

        if (rdserial.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM formulario WHERE serial='" + serial + "'";

                String[] registros = new String[32];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("CPU");
                    registros[1] = rs.getString("Serial");
                    registros[2] = rs.getString("Marca");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("Referencia");
                    registros[5] = rs.getString("Estado");
                    registros[6] = rs.getString("Dependencia");
                    registros[7] = rs.getString("Usuario");
                    registros[8] = rs.getString("NombrePC");
                    registros[9] = rs.getString("Procesador");
                    registros[10] = rs.getString("RAM");
                    registros[11] = rs.getString("SistemaOperativo");
                    registros[12] = rs.getString("Office");
                    registros[13] = rs.getString("Antivirus");
                    registros[14] = rs.getString("DiscoDuro");
                    registros[15] = rs.getString("Ip");
                    registros[16] = rs.getString("FechaCompra");
                    registros[17] = rs.getString("Monitor");
                    registros[18] = rs.getString("SerialMonitor");
                    registros[19] = rs.getString("MarcaMonitor");
                    registros[20] = rs.getString("PlacaMonitor");
                    registros[21] = rs.getString("ReferenciaMonitor");
                    registros[22] = rs.getString("Teclado");
                    registros[23] = rs.getString("SerialTeclado");
                    registros[24] = rs.getString("MarcaTeclado");
                    registros[25] = rs.getString("PlacaTeclado");
                    registros[26] = rs.getString("ReferenciaTeclado");
                    registros[27] = rs.getString("Mouse");
                    registros[28] = rs.getString("SerialMouse");
                    registros[29] = rs.getString("MarcaMouse");
                    registros[30] = rs.getString("PlacaMouse");
                    registros[31] = rs.getString("ReferenciaMouse");
                    modelo.addRow(registros);

                }
                t_datos.setModel(modelo);
                txtcant.setText("" + t_datos.getRowCount());
            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rdmarca.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM formulario WHERE marca='" + marca + "'";

                String[] registros = new String[32];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("CPU");
                    registros[1] = rs.getString("Serial");
                    registros[2] = rs.getString("Marca");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("Referencia");
                    registros[5] = rs.getString("Estado");
                    registros[6] = rs.getString("Dependencia");
                    registros[7] = rs.getString("Usuario");
                    registros[8] = rs.getString("NombrePC");
                    registros[9] = rs.getString("Procesador");
                    registros[10] = rs.getString("RAM");
                    registros[11] = rs.getString("SistemaOperativo");
                    registros[12] = rs.getString("Office");
                    registros[13] = rs.getString("Antivirus");
                    registros[14] = rs.getString("DiscoDuro");
                    registros[15] = rs.getString("Ip");
                    registros[16] = rs.getString("FechaCompra");
                    registros[17] = rs.getString("Monitor");
                    registros[18] = rs.getString("SerialMonitor");
                    registros[19] = rs.getString("MarcaMonitor");
                    registros[20] = rs.getString("PlacaMonitor");
                    registros[21] = rs.getString("ReferenciaMonitor");
                    registros[22] = rs.getString("Teclado");
                    registros[23] = rs.getString("SerialTeclado");
                    registros[24] = rs.getString("MarcaTeclado");
                    registros[25] = rs.getString("PlacaTeclado");
                    registros[26] = rs.getString("ReferenciaTeclado");
                    registros[27] = rs.getString("Mouse");
                    registros[28] = rs.getString("SerialMouse");
                    registros[29] = rs.getString("MarcaMouse");
                    registros[30] = rs.getString("PlacaMouse");
                    registros[31] = rs.getString("ReferenciaMouse");
                    modelo.addRow(registros);

                }
                t_datos.setModel(modelo);
                txtcant.setText("" + t_datos.getRowCount());
            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rdplaca.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM formulario WHERE placa='" + placa + "'";

                String[] registros = new String[32];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("CPU");
                    registros[1] = rs.getString("Serial");
                    registros[2] = rs.getString("Marca");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("Referencia");
                    registros[5] = rs.getString("Estado");
                    registros[6] = rs.getString("Dependencia");
                    registros[7] = rs.getString("Usuario");
                    registros[8] = rs.getString("NombrePC");
                    registros[9] = rs.getString("Procesador");
                    registros[10] = rs.getString("RAM");
                    registros[11] = rs.getString("SistemaOperativo");
                    registros[12] = rs.getString("Office");
                    registros[13] = rs.getString("Antivirus");
                    registros[14] = rs.getString("DiscoDuro");
                    registros[15] = rs.getString("Ip");
                    registros[16] = rs.getString("FechaCompra");
                    registros[17] = rs.getString("Monitor");
                    registros[18] = rs.getString("SerialMonitor");
                    registros[19] = rs.getString("MarcaMonitor");
                    registros[20] = rs.getString("PlacaMonitor");
                    registros[21] = rs.getString("ReferenciaMonitor");
                    registros[22] = rs.getString("Teclado");
                    registros[23] = rs.getString("SerialTeclado");
                    registros[24] = rs.getString("MarcaTeclado");
                    registros[25] = rs.getString("PlacaTeclado");
                    registros[26] = rs.getString("ReferenciaTeclado");
                    registros[27] = rs.getString("Mouse");
                    registros[28] = rs.getString("SerialMouse");
                    registros[29] = rs.getString("MarcaMouse");
                    registros[30] = rs.getString("PlacaMouse");
                    registros[31] = rs.getString("ReferenciaMouse");
                    modelo.addRow(registros);

                }
                t_datos.setModel(modelo);
                txtcant.setText("" + t_datos.getRowCount());
            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rdusuario.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM formulario WHERE usuario='" + usuario + "'";

                String[] registros = new String[32];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("CPU");
                    registros[1] = rs.getString("Serial");
                    registros[2] = rs.getString("Marca");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("Referencia");
                    registros[5] = rs.getString("Estado");
                    registros[6] = rs.getString("Dependencia");
                    registros[7] = rs.getString("Usuario");
                    registros[8] = rs.getString("NombrePC");
                    registros[9] = rs.getString("Procesador");
                    registros[10] = rs.getString("RAM");
                    registros[11] = rs.getString("SistemaOperativo");
                    registros[12] = rs.getString("Office");
                    registros[13] = rs.getString("Antivirus");
                    registros[14] = rs.getString("DiscoDuro");
                    registros[15] = rs.getString("Ip");
                    registros[16] = rs.getString("FechaCompra");
                    registros[17] = rs.getString("Monitor");
                    registros[18] = rs.getString("SerialMonitor");
                    registros[19] = rs.getString("MarcaMonitor");
                    registros[20] = rs.getString("PlacaMonitor");
                    registros[21] = rs.getString("ReferenciaMonitor");
                    registros[22] = rs.getString("Teclado");
                    registros[23] = rs.getString("SerialTeclado");
                    registros[24] = rs.getString("MarcaTeclado");
                    registros[25] = rs.getString("PlacaTeclado");
                    registros[26] = rs.getString("ReferenciaTeclado");
                    registros[27] = rs.getString("Mouse");
                    registros[28] = rs.getString("SerialMouse");
                    registros[29] = rs.getString("MarcaMouse");
                    registros[30] = rs.getString("PlacaMouse");
                    registros[31] = rs.getString("ReferenciaMouse");
                    modelo.addRow(registros);

                }
                t_datos.setModel(modelo);
                txtcant.setText("" + t_datos.getRowCount());
            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rdestado.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM formulario WHERE estado='" + estado + "'";

                String[] registros = new String[32];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("CPU");
                    registros[1] = rs.getString("Serial");
                    registros[2] = rs.getString("Marca");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("Referencia");
                    registros[5] = rs.getString("Estado");
                    registros[6] = rs.getString("Dependencia");
                    registros[7] = rs.getString("Usuario");
                    registros[8] = rs.getString("NombrePC");
                    registros[9] = rs.getString("Procesador");
                    registros[10] = rs.getString("RAM");
                    registros[11] = rs.getString("SistemaOperativo");
                    registros[12] = rs.getString("Office");
                    registros[13] = rs.getString("Antivirus");
                    registros[14] = rs.getString("DiscoDuro");
                    registros[15] = rs.getString("Ip");
                    registros[16] = rs.getString("FechaCompra");
                    registros[17] = rs.getString("Monitor");
                    registros[18] = rs.getString("SerialMonitor");
                    registros[19] = rs.getString("MarcaMonitor");
                    registros[20] = rs.getString("PlacaMonitor");
                    registros[21] = rs.getString("ReferenciaMonitor");
                    registros[22] = rs.getString("Teclado");
                    registros[23] = rs.getString("SerialTeclado");
                    registros[24] = rs.getString("MarcaTeclado");
                    registros[25] = rs.getString("PlacaTeclado");
                    registros[26] = rs.getString("ReferenciaTeclado");
                    registros[27] = rs.getString("Mouse");
                    registros[28] = rs.getString("SerialMouse");
                    registros[29] = rs.getString("MarcaMouse");
                    registros[30] = rs.getString("PlacaMouse");
                    registros[31] = rs.getString("ReferenciaMouse");
                    modelo.addRow(registros);

                }
                t_datos.setModel(modelo);
                txtcant.setText("" + t_datos.getRowCount());
            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rddependencia.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM formulario WHERE dependencia='" + dependencia + "'";

                String[] registros = new String[32];

                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(ConsultaSQL);
                while (rs.next()) {
                    registros[0] = rs.getString("CPU");
                    registros[1] = rs.getString("Serial");
                    registros[2] = rs.getString("Marca");
                    registros[3] = rs.getString("Placa");
                    registros[4] = rs.getString("Referencia");
                    registros[5] = rs.getString("Estado");
                    registros[6] = rs.getString("Dependencia");
                    registros[7] = rs.getString("Usuario");
                    registros[8] = rs.getString("NombrePC");
                    registros[9] = rs.getString("Procesador");
                    registros[10] = rs.getString("RAM");
                    registros[11] = rs.getString("SistemaOperativo");
                    registros[12] = rs.getString("Office");
                    registros[13] = rs.getString("Antivirus");
                    registros[14] = rs.getString("DiscoDuro");
                    registros[15] = rs.getString("Ip");
                    registros[16] = rs.getString("FechaCompra");
                    registros[17] = rs.getString("Monitor");
                    registros[18] = rs.getString("SerialMonitor");
                    registros[19] = rs.getString("MarcaMonitor");
                    registros[20] = rs.getString("PlacaMonitor");
                    registros[21] = rs.getString("ReferenciaMonitor");
                    registros[22] = rs.getString("Teclado");
                    registros[23] = rs.getString("SerialTeclado");
                    registros[24] = rs.getString("MarcaTeclado");
                    registros[25] = rs.getString("PlacaTeclado");
                    registros[26] = rs.getString("ReferenciaTeclado");
                    registros[27] = rs.getString("Mouse");
                    registros[28] = rs.getString("SerialMouse");
                    registros[29] = rs.getString("MarcaMouse");
                    registros[30] = rs.getString("PlacaMouse");
                    registros[31] = rs.getString("ReferenciaMouse");
                    modelo.addRow(registros);

                }
                t_datos.setModel(modelo);
                txtcant.setText("" + t_datos.getRowCount());
            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rdtodo.isSelected() == true) {
            cargar("");
            txtcant.setText("" + t_datos.getRowCount());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rdserialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdserialActionPerformed
        if (rdserial.isSelected() == true) {
            txtserial.setEnabled(true);
            txtserial.requestFocus();
            txtmarca.setEnabled(false);
            txtmarca.setText("");
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtestado.setSelectedIndex(0);
            txtestado.setEnabled(false);
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_rdserialActionPerformed

    private void rdestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdestadoActionPerformed
        if (rdtodo.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.requestFocus();
            txtmarca.setEnabled(false);
            txtmarca.setText("");
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtestado.setSelectedItem(0);
            txtestado.setEnabled(true);
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);
            cargar("");

        }// TODO add your handling code here:
    }//GEN-LAST:event_rdestadoActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void rdmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmarcaActionPerformed
        if (rdmarca.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.setText("");
            txtmarca.setEnabled(true);
            txtserial.requestFocus();
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtestado.setSelectedIndex(0);
            txtestado.setEnabled(false);
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmarcaActionPerformed

    private void rdplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdplacaActionPerformed
        if (rdplaca.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.setText("");
            txtmarca.setEnabled(false);
            txtmarca.setText("");
            txtplaca.setEnabled(true);
            txtplaca.requestFocus();
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtestado.setSelectedIndex(0);
            txtestado.setEnabled(false);
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }// TODO add your handling code here:
    }//GEN-LAST:event_rdplacaActionPerformed

    private void rdusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdusuarioActionPerformed
        if (rdusuario.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.setText("");
            txtmarca.setEnabled(false);
            txtmarca.setText("");
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(true);
            txtusuario.requestFocus();
            txtestado.setSelectedIndex(0);
            txtestado.setEnabled(false);
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }// TODO add your handling code here:
    }//GEN-LAST:event_rdusuarioActionPerformed

    private void rddependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddependenciaActionPerformed
        if (rddependencia.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.requestFocus();
            txtmarca.setEnabled(false);
            txtmarca.setText("");
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtestado.setSelectedIndex(0);
            txtestado.setEnabled(false);
            txtdependencia.setEnabled(true);
            txtdependencia.setSelectedItem(0);

        }        // TODO add your handling code here:


    }//GEN-LAST:event_rddependenciaActionPerformed

    private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
        if (rdtodo.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.requestFocus();
            txtmarca.setEnabled(false);
            txtmarca.setText("");
            txtplaca.setEnabled(false);
            txtplaca.setText("");
            txtusuario.setEnabled(false);
            txtusuario.setText("");
            txtestado.setSelectedIndex(0);
            txtestado.setEnabled(false);
            txtdependencia.setEnabled(false);
            txtdependencia.setSelectedIndex(0);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_rdtodoActionPerformed

    private void txtcantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyPressed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Reporte_Serial obj = new Reporte_Serial();
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
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consulta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rddependencia;
    private javax.swing.JRadioButton rdestado;
    private javax.swing.JRadioButton rdmarca;
    private javax.swing.JRadioButton rdplaca;
    private javax.swing.JRadioButton rdserial;
    private javax.swing.JRadioButton rdtodo;
    private javax.swing.JRadioButton rdusuario;
    private javax.swing.JTable t_datos;
    private javax.swing.JTextField txtcant;
    private javax.swing.JComboBox txtdependencia;
    private javax.swing.JComboBox txtestado;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtserial;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    conexion cc = new conexion();
    Connection cn = cc.conexion();

}
