///Hecho por Brian Vargas Henao. CC. 1.022.097.226
package inventario;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class modificar extends javax.swing.JFrame {

    DefaultTableModel model;

    public modificar() {
        initComponents();

        this.getContentPane().setBackground(Color.white);

        setExtendedState(modificar.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setTitle("Modificar datos");

        setDefaultCloseOperation(0);

        t_fecha.setText(FechaActual());

        cargar("");
        limpiar();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage());

    }

    void limpiar() {

        t_estado.setSelectedIndex(0);
        t_usuario.setText("");
        t_dependencia.setSelectedIndex(0);
        t_Placa.setText("");
        cmbsistema.setSelectedIndex(0);
        cmbantivirus.setSelectedIndex(0);
        cmboffice.setSelectedIndex(0);
        t_IP.setText("");
        t_Nombre.setText("");
        cmbMotivo.setSelectedIndex(0);
        t_SerialM1.setText("");
        t_MarcaM1.setText("");
        t_PlacaM1.setText("");
        t_ReferenciaM1.setText("");
        t_SerialT1.setText("");
        t_MarcaT1.setText("");
        t_PlacaT1.setText("");
        t_ReferenciaT1.setText("");
        t_SerialR.setText("");
        t_MarcaR.setText("");
        t_PlacaR.setText("");
        t_ReferenciaR.setText("");

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

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
            cmbMotivo.setEnabled(false);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void modificardatos() {

        conexion cc = new conexion();
        Connection cn = cc.conexion();

        try {
            PreparedStatement pst1 = cn.prepareStatement("UPDATE formulario SET Estado='" + t_estado.getSelectedItem().toString() + "',Usuario='" + t_usuario.getText() + "',Dependencia='" + t_dependencia.getSelectedItem().toString() + "',Placa='" + t_Placa.getText() + "',SistemaOperativo='" + cmbsistema.getSelectedItem().toString() + "',Office='" + cmboffice.getSelectedItem().toString() + "',Antivirus='" + cmbantivirus.getSelectedItem().toString() + "',Ip='" + t_IP.getText().toString() + "',NombrePC='" + t_Nombre.getText().toString() + "',SerialMonitor='" + t_SerialM1.getText().toString() + "',MarcaMonitor='" + t_MarcaM1.getText().toString() + "',PlacaMonitor='" + t_PlacaM1.getText().toString() + "',ReferenciaMonitor='" + t_ReferenciaM1.getText().toString() + "',SerialTeclado='" + t_SerialT1.getText().toString() + "',MarcaTeclado='" + t_MarcaT1.getText().toString() + "',PlacaTeclado='" + t_PlacaT1.getText().toString() + "',ReferenciaTeclado='" + t_ReferenciaT1.getText().toString() + "',SerialMouse='" + t_SerialR.getText().toString() + "',MarcaMouse='" + t_MarcaR.getText().toString() + "',PlacaMouse='" + t_PlacaR.getText().toString() + "',ReferenciaMouse='" + t_ReferenciaR.getText().toString() + "' WHERE Serial= '" + txtserial.getText() + "'|| Placa= '" + t_Placa.getText() + "'");

            pst1.executeUpdate();

            JOptionPane.showMessageDialog(null, "Actualizado Correctamente");

            cargar("");

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar:\n" + "\n" + "Asegurese de haber seleccionado el equipo y haber escogido el motivo por el cual va a cambiar el dato.", "Registro denegado", JOptionPane.ERROR_MESSAGE);
            System.out.print(e.getMessage());

        }
        {

            String Serial, Dependencia, Usuario, Placa, FechaMantenimiento, Mantenimiento;
            String sql = "";

            Serial = t_Serial.getText();
            Dependencia = t_dependencia.getSelectedItem().toString();
            Usuario = t_usuario.getText();
            Placa = t_Placa.getText();
            FechaMantenimiento = t_fecha.getText();
            Mantenimiento = cmbMotivo.getSelectedItem().toString();

            sql = "INSERT INTO observaciones (Serial,Dependencia,Usuario,Placa,FechaMantenimiento,Mantenimiento) VALUES(?,?,?,?,?,?)";
            try {
                PreparedStatement pst2;

                pst2 = cn.prepareStatement(sql);

                pst2.setString(1, Serial);
                pst2.setString(2, Dependencia);
                pst2.setString(3, Usuario);
                pst2.setString(4, Placa);
                pst2.setString(5, FechaMantenimiento);
                pst2.setString(6, Mantenimiento);

                pst2.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se pudo registrar Mantenimiento", "Registro denegado", JOptionPane.ERROR_MESSAGE);

            }

            limpiar();
        }

    }

    public void Validar() {
        int cont = 0;

        if (t_estado.getSelectedItem().equals("Seleccione>>")) {
            jLabel18.setVisible(true);
            cont = 1;
        } else {
            jLabel18.setVisible(false);
            cont = 0;
        }
        if (t_dependencia.getSelectedItem().equals("Seleccione>>")) {
            jLabel37.setVisible(true);
            cont = 1;
        } else {
            jLabel37.setVisible(false);
            cont = 0;
        }
        if (cmbsistema.getSelectedItem().equals("Seleccione>>")) {
            jLabel35.setVisible(true);
            cont = 1;
        } else {
            jLabel35.setVisible(false);
            cont = 0;
        }
        if (t_usuario.getText().equals("")) {
            jLabel33.setVisible(true);
            cont = 1;
        } else {
            jLabel33.setVisible(false);
            cont = 0;
        }
        if (cmboffice.getSelectedItem().equals("Seleccione>>")) {
            jLabel38.setVisible(true);
            cont = 1;
        } else {
            jLabel38.setVisible(false);
            cont = 0;
        }
        if (t_Placa.getText().equals("")) {
            jLabel31.setVisible(true);
            cont = 1;
        } else {
            jLabel31.setVisible(false);
            cont = 0;
        }
        if (t_Nombre.getText().equals("")) {
            jLabel39.setVisible(true);
            cont = 1;
        } else {
            jLabel39.setVisible(false);
            cont = 0;
        }
        if (cmbantivirus.getSelectedItem().equals("Seleccione>>")) {
            jLabel34.setVisible(true);
            cont = 1;
        } else {
            jLabel34.setVisible(false);
            cont = 0;
        }

        if (t_IP.getText().equals("")) {
            jLabel36.setVisible(true);
            cont = 1;
        } else {
            jLabel36.setVisible(false);
            cont = 0;
        }

        if (t_SerialM1.getText().equals("")) {
            jLabel40.setVisible(true);
            cont = 1;
        } else {
            jLabel40.setVisible(false);
            cont = 0;
        }
        if (t_MarcaM1.getText().equals("")) {
            jLabel41.setVisible(true);
            cont = 1;
        } else {
            jLabel41.setVisible(false);
            cont = 0;
        }
        if (t_PlacaM1.getText().equals("")) {
            jLabel42.setVisible(true);
            cont = 1;
        } else {
            jLabel42.setVisible(false);
            cont = 0;
        }
        if (t_ReferenciaM1.getText().equals("")) {
            jLabel43.setVisible(true);
            cont = 1;
        } else {
            jLabel43.setVisible(false);
            cont = 0;
        }
        if (t_SerialT1.getText().equals("")) {
            jLabel44.setVisible(true);
            cont = 1;
        } else {
            jLabel44.setVisible(false);
            cont = 0;
        }
        if (t_MarcaT1.getText().equals("")) {
            jLabel45.setVisible(true);
            cont = 1;
        } else {
            jLabel45.setVisible(false);
            cont = 0;
        }
        if (t_PlacaT1.getText().equals("")) {
            jLabel46.setVisible(true);
            cont = 1;
        } else {
            jLabel46.setVisible(false);
            cont = 0;
        }
        if (t_ReferenciaT1.getText().equals("")) {
            jLabel47.setVisible(true);
            cont = 1;
        } else {
            jLabel47.setVisible(false);
            cont = 0;
        }
        if (t_SerialR.getText().equals("")) {
            jLabel48.setVisible(true);
            cont = 1;
        } else {
            jLabel48.setVisible(false);
            cont = 0;
        }
        if (t_MarcaR.getText().equals("")) {
            jLabel49.setVisible(true);
            cont = 1;
        } else {
            jLabel49.setVisible(false);
            cont = 0;
        }
        if (t_PlacaR.getText().equals("")) {
            jLabel50.setVisible(true);
            cont = 1;
        } else {
            jLabel50.setVisible(false);
            cont = 0;
        }
        if (t_ReferenciaR.getText().equals("")) {
            jLabel51.setVisible(true);
            cont = 1;
        } else {
            jLabel51.setVisible(false);
            cont = 0;
        }
        if (cmbMotivo.getSelectedItem().equals("Seleccione>>")) {
            jLabel52.setVisible(true);
            cont = 1;
        } else {
            jLabel52.setVisible(false);
            cont = 0;
        }
        
        if (cont == 1) {

            modificardatos();

        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar:\n" + "Tiene Campos vacíos.", "Registro denegado", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdserial = new javax.swing.JRadioButton();
        rdtodo = new javax.swing.JRadioButton();
        rdplaca = new javax.swing.JRadioButton();
        txtplaca = new javax.swing.JTextField();
        txtserial = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        t_dependencia = new javax.swing.JComboBox();
        t_estado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_Placa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbsistema = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cmboffice = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cmbantivirus = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        t_IP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t_Nombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbMotivo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        t_SerialR = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        t_MarcaR = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        t_PlacaR = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        t_ReferenciaR = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        t_SerialM1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        t_MarcaM1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        t_PlacaM1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        t_ReferenciaM1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        t_SerialT1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        t_MarcaT1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        t_PlacaT1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        t_ReferenciaT1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t_Serial = new javax.swing.JTextField();
        t_fecha = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Modifique datos de los equipos registrados");

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
        t_datos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(t_datos);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
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

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setText("Realice la búsqueda por cualquiera de los siguientes campos, luego clic derecho sobre el equipo y seleccionar modificar.");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel8.setText("Indique el motivo, modifique el dato y luego pulse el boton actualizar.");

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

        rdplaca.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        rdplaca.setText("Placa");
        rdplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdplacaActionPerformed(evt);
            }
        });

        txtplaca.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        txtserial.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        t_dependencia.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_dependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Catastro", "Desarrollo", "Infraestructura", "Valorizacion", "Archivo", "Almacen", "Planeacion", "Salud", "Sisben", "Control Interno", "Control Disciplinario", "Juridica", "Despacho 1a Dama", "Oficina de Calidad", "Alcaldia", "Hacienda", "Tesoreria", "Gobierno", "Sistemas", "Comunicaciones", "Inspeccion", "Transito", "Oficina de Empleo", "Comisaria de Familia", "Educacion", "Casa de la Cultura", "Programas Sociales", "Casa de la Mujer", "Invicop", "Junta de Daportes" }));

        t_estado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Activo", "De Baja" }));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("Dependencia:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setText("Estado:");

        t_usuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("Placa:");

        t_Placa.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel9.setText("S.O:");

        cmbsistema.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbsistema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Windows XP Profesional SP3", "Windows Vista", "Windows 7 Profesional 32 bits", "Windows 7 Profesional 64 bits", "Windows 8 Profesional 32 bits", "Windows 8 Profesional 64 bits", "Windows 8.1 Profesional 32 bits", "Windows 8.1 Profesional 64 bits", "Windows 10 Profesional 32 bits", "Windows 10 Profesional 64 bits" }));
        cmbsistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsistemaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel10.setText("Office:");

        cmboffice.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmboffice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Office Standard 2007", "Office Profesional 2007", "Office Pyme 2007", "Office Standard 2010", "Office Profesional 2010", "Office Pyme 2010", "Office Standard 2013", "Office Profesional 2013", "Office Pyme 2013", "Office Standard 2016", "Office Profesional 2016", "Office Pyme 2016" }));

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel11.setText("Antivirus:");

        cmbantivirus.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbantivirus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Symantec Endpoint", "Kaspersky", "Norton", "McAfee", "Nod32" }));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel12.setText("IP:");

        t_IP.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel13.setText("Nombre PC:");

        t_Nombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");

        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("*");

        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("*");

        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("*");

        jLabel36.setForeground(new java.awt.Color(255, 0, 0));
        jLabel36.setText("*");

        jLabel37.setForeground(new java.awt.Color(255, 0, 0));
        jLabel37.setText("*");

        jLabel38.setForeground(new java.awt.Color(255, 0, 0));
        jLabel38.setText("*");

        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        jLabel39.setText("*");

        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_Placa)
                            .addComponent(cmbantivirus, 0, 209, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsistema, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmboffice, 0, 209, Short.MAX_VALUE)
                        .addComponent(t_dependencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(t_dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel33)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(cmbsistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmboffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel38)
                    .addComponent(jLabel35))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbantivirus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(t_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(t_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel39)))
        );

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("Motivo:");

        cmbMotivo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbMotivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<<Seleccione", "Cambio de Estado", "Cambio de Usuario", "Cambio de Dependencia", "Cambio de Placa", "Cambio de Sistema Operativo", "Cambio de Office", "Cambio de Antivirus", "Cambio de Dirección IP", "Cambio de Nombre PC", "Cambio de Monitor", "Cambio de Teclado", "Cambio de Mouse" }));
        cmbMotivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMotivoItemStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel19.setText("Serial:");

        t_SerialR.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel20.setText("Marca:");

        t_MarcaR.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel21.setText("Placa:");

        t_PlacaR.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel22.setText("Referencia:");

        t_ReferenciaR.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel48.setForeground(new java.awt.Color(255, 0, 0));
        jLabel48.setText("*");

        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setText("*");

        jLabel50.setForeground(new java.awt.Color(255, 0, 0));
        jLabel50.setText("*");

        jLabel51.setForeground(new java.awt.Color(255, 0, 0));
        jLabel51.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(47, 47, 47)
                .addComponent(t_SerialR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(t_MarcaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(29, 29, 29)
                .addComponent(t_PlacaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(t_ReferenciaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(t_SerialR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(t_MarcaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(t_PlacaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(t_ReferenciaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel23.setText("Serial:");

        t_SerialM1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel24.setText("Marca:");

        t_MarcaM1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel25.setText("Placa:");

        t_PlacaM1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel26.setText("Referencia:");

        t_ReferenciaM1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel40.setForeground(new java.awt.Color(255, 0, 0));
        jLabel40.setText("*");

        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setText("*");

        jLabel42.setForeground(new java.awt.Color(255, 0, 0));
        jLabel42.setText("*");

        jLabel43.setForeground(new java.awt.Color(255, 0, 0));
        jLabel43.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(47, 47, 47)
                .addComponent(t_SerialM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(t_MarcaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(29, 29, 29)
                .addComponent(t_PlacaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(t_ReferenciaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(t_SerialM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(t_MarcaM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(t_PlacaM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(t_ReferenciaM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel27.setText("Serial:");

        t_SerialT1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel28.setText("Marca:");

        t_MarcaT1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel29.setText("Placa:");

        t_PlacaT1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel30.setText("Referencia:");

        t_ReferenciaT1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel44.setForeground(new java.awt.Color(255, 0, 0));
        jLabel44.setText("*");

        jLabel45.setForeground(new java.awt.Color(255, 0, 0));
        jLabel45.setText("*");

        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setText("*");

        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText("*");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(47, 47, 47)
                .addComponent(t_SerialT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(t_MarcaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(29, 29, 29)
                .addComponent(t_PlacaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(t_ReferenciaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(t_SerialT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(t_MarcaT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(t_PlacaT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(t_ReferenciaT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel15.setText("Teclado");

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel16.setText("Mouse");

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel17.setText("CPU");

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel14.setText("Monitor");

        t_Serial.setEditable(false);
        t_Serial.setBorder(null);

        t_fecha.setEditable(false);
        t_fecha.setBorder(null);

        jLabel52.setForeground(new java.awt.Color(255, 0, 0));
        jLabel52.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdserial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdplaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(221, 221, 221)
                                        .addComponent(rdtodo)
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(164, 164, 164)
                                        .addComponent(t_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)
                                        .addComponent(t_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdserial)
                        .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdplaca)
                            .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdtodo)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        principal obj = new principal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = t_datos.getSelectedRow();
        if (fila >= 0) {

            cmbMotivo.setEnabled(true);

            t_Serial.setText(t_datos.getValueAt(fila, 1).toString());
            t_estado.setSelectedItem(t_datos.getValueAt(fila, 5).toString());
            t_dependencia.setSelectedItem(t_datos.getValueAt(fila, 6).toString());
            t_usuario.setText(t_datos.getValueAt(fila, 7).toString());
            t_Placa.setText(t_datos.getValueAt(fila, 3).toString());
            cmbsistema.setSelectedItem(t_datos.getValueAt(fila, 11).toString());
            cmboffice.setSelectedItem(t_datos.getValueAt(fila, 12).toString());
            cmbantivirus.setSelectedItem(t_datos.getValueAt(fila, 13).toString());
            t_IP.setText(t_datos.getValueAt(fila, 15).toString());
            t_Nombre.setText(t_datos.getValueAt(fila, 8).toString());
            t_SerialM1.setText(t_datos.getValueAt(fila, 18).toString());
            t_MarcaM1.setText(t_datos.getValueAt(fila, 19).toString());
            t_PlacaM1.setText(t_datos.getValueAt(fila, 20).toString());
            t_ReferenciaM1.setText(t_datos.getValueAt(fila, 21).toString());
            t_SerialT1.setText(t_datos.getValueAt(fila, 23).toString());
            t_MarcaT1.setText(t_datos.getValueAt(fila, 24).toString());
            t_PlacaT1.setText(t_datos.getValueAt(fila, 25).toString());
            t_ReferenciaT1.setText(t_datos.getValueAt(fila, 26).toString());
            t_SerialR.setText(t_datos.getValueAt(fila, 28).toString());
            t_MarcaR.setText(t_datos.getValueAt(fila, 29).toString());
            t_PlacaR.setText(t_datos.getValueAt(fila, 30).toString());
            t_ReferenciaR.setText(t_datos.getValueAt(fila, 31).toString());

        } else {
            JOptionPane.showMessageDialog(null, "No selecciono fila");

        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Validar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static String FechaActual() {

        Date Fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("MM/dd/yyy");

        return formatofecha.format(Fecha);

    }

    private void rdserialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdserialActionPerformed
        if (rdserial.isSelected() == true) {
            txtserial.setEnabled(true);
            txtserial.requestFocus();
            txtplaca.setEnabled(false);
            txtplaca.setText("");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_rdserialActionPerformed

    private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
        if (rdtodo.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.requestFocus();
            txtplaca.setEnabled(false);
            txtplaca.setText("");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_rdtodoActionPerformed

    private void rdplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdplacaActionPerformed
        if (rdplaca.isSelected() == true) {
            txtserial.setEnabled(false);
            txtserial.setText("");
            txtplaca.setEnabled(true);
            txtplaca.requestFocus();

        }// TODO add your handling code here:
    }//GEN-LAST:event_rdplacaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Serial = txtserial.getText();
        String Placa = txtplaca.getText();

        if (rdserial.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);
            try {

                String ConsultaSQL = "SELECT * FROM formulario WHERE serial='" + Serial + "'";

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

                t_estado.setEnabled(false);
                t_usuario.setEnabled(false);
                t_dependencia.setEnabled(false);
                t_Placa.setEnabled(false);
                cmbsistema.setEnabled(false);
                cmboffice.setEnabled(false);
                cmbantivirus.setEnabled(false);
                t_IP.setEnabled(false);
                t_Nombre.setEnabled(false);
                t_SerialM1.setEnabled(false);
                t_MarcaM1.setEnabled(false);
                t_PlacaM1.setEnabled(false);
                t_ReferenciaM1.setEnabled(false);
                t_SerialT1.setEnabled(false);
                t_MarcaT1.setEnabled(false);
                t_PlacaT1.setEnabled(false);
                t_ReferenciaT1.setEnabled(false);
                t_SerialR.setEnabled(false);
                t_MarcaR.setEnabled(false);
                t_PlacaR.setEnabled(false);
                t_ReferenciaR.setEnabled(false);

                limpiar();

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

                String ConsultaSQL = "SELECT * FROM formulario WHERE placa='" + Placa + "'";

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

                t_estado.setEnabled(false);
                t_usuario.setEnabled(false);
                t_dependencia.setEnabled(false);
                t_Placa.setEnabled(false);
                cmbsistema.setEnabled(false);
                cmboffice.setEnabled(false);
                cmbantivirus.setEnabled(false);
                t_IP.setEnabled(false);
                t_Nombre.setEnabled(false);
                t_SerialM1.setEnabled(false);
                t_MarcaM1.setEnabled(false);
                t_PlacaM1.setEnabled(false);
                t_ReferenciaM1.setEnabled(false);
                t_SerialT1.setEnabled(false);
                t_MarcaT1.setEnabled(false);
                t_PlacaT1.setEnabled(false);
                t_ReferenciaT1.setEnabled(false);
                t_SerialR.setEnabled(false);
                t_MarcaR.setEnabled(false);
                t_PlacaR.setEnabled(false);
                t_ReferenciaR.setEnabled(false);

                limpiar();

            } catch (SQLException ex) {
                Logger.getLogger(consulta.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (rdtodo.isSelected() == true) {
            DefaultTableModel modelo = new DefaultTableModel();
            String[] Titulos = {"CPU", "Serial", "Marca", "Placa", "Referencia", "Estado", "Dependencia", "Usuario", "NombrePC", "Procesador", "RAM", "SistemaOperativo", "Office", "Antivirus", "DiscoDuro", "Ip", "FechaCompra", "Monitor", "SerialMonitor", "MarcaMonitor", "PlacaMonitor", "ReferenciaMonitor", "Teclado", "SerialTeclado", "MarcaTeclado", "PlacaTeclado", "ReferenciaTeclado", "Mouse", "SerialMouse", "MarcaMouse", "PlacaMouse", "ReferenciaMouse"};
            modelo.setColumnIdentifiers(Titulos);
            this.t_datos.setModel(modelo);

            cargar("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbMotivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMotivoItemStateChanged

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Estado")) {

            t_estado.setEnabled(true);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }
        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Usuario")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(true);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Dependencia")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(true);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Placa")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(true);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Sistema Operativo")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(true);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Office")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(true);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Antivirus")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(true);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Dirección IP")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(true);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Nombre PC")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(true);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Monitor")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(true);
            t_MarcaM1.setEnabled(true);
            t_PlacaM1.setEnabled(true);
            t_ReferenciaM1.setEnabled(true);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Teclado")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(true);
            t_MarcaT1.setEnabled(true);
            t_PlacaT1.setEnabled(true);
            t_ReferenciaT1.setEnabled(true);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

        if (cmbMotivo.getSelectedItem().toString().equals("Cambio de Mouse")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(true);
            t_MarcaR.setEnabled(true);
            t_PlacaR.setEnabled(true);
            t_ReferenciaR.setEnabled(true);

        } else if (cmbMotivo.getSelectedItem().toString().equals("<<Seleccione")) {

            t_estado.setEnabled(false);
            t_usuario.setEnabled(false);
            t_dependencia.setEnabled(false);
            t_Placa.setEnabled(false);
            cmbsistema.setEnabled(false);
            cmboffice.setEnabled(false);
            cmbantivirus.setEnabled(false);
            t_IP.setEnabled(false);
            t_Nombre.setEnabled(false);
            t_SerialM1.setEnabled(false);
            t_MarcaM1.setEnabled(false);
            t_PlacaM1.setEnabled(false);
            t_ReferenciaM1.setEnabled(false);
            t_SerialT1.setEnabled(false);
            t_MarcaT1.setEnabled(false);
            t_PlacaT1.setEnabled(false);
            t_ReferenciaT1.setEnabled(false);
            t_SerialR.setEnabled(false);
            t_MarcaR.setEnabled(false);
            t_PlacaR.setEnabled(false);
            t_ReferenciaR.setEnabled(false);
        }

    }//GEN-LAST:event_cmbMotivoItemStateChanged

    private void cmbsistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsistemaActionPerformed

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
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbMotivo;
    private javax.swing.JComboBox cmbantivirus;
    private javax.swing.JComboBox cmboffice;
    private javax.swing.JComboBox cmbsistema;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdplaca;
    private javax.swing.JRadioButton rdserial;
    private javax.swing.JRadioButton rdtodo;
    private javax.swing.JTextField t_IP;
    private javax.swing.JTextField t_MarcaM1;
    private javax.swing.JTextField t_MarcaR;
    private javax.swing.JTextField t_MarcaT1;
    private javax.swing.JTextField t_Nombre;
    private javax.swing.JTextField t_Placa;
    private javax.swing.JTextField t_PlacaM1;
    private javax.swing.JTextField t_PlacaR;
    private javax.swing.JTextField t_PlacaT1;
    private javax.swing.JTextField t_ReferenciaM1;
    private javax.swing.JTextField t_ReferenciaR;
    private javax.swing.JTextField t_ReferenciaT1;
    private javax.swing.JTextField t_Serial;
    private javax.swing.JTextField t_SerialM1;
    private javax.swing.JTextField t_SerialR;
    private javax.swing.JTextField t_SerialT1;
    private javax.swing.JTable t_datos;
    private javax.swing.JComboBox t_dependencia;
    private javax.swing.JComboBox t_estado;
    private javax.swing.JTextField t_fecha;
    private javax.swing.JTextField t_usuario;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtserial;
    // End of variables declaration//GEN-END:variables
conexion cc = new conexion();
    Connection cn = cc.conexion();

}
