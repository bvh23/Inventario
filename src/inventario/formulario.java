package inventario;

///Hecho por Brian Vargas Henao. CC. 1.022.097.226

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class formulario extends javax.swing.JFrame {

    public formulario() {
        
        initComponents();
       
        this.getContentPane().setBackground(Color.white);
        
        setExtendedState(formulario.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setTitle("Ingreso de datos");  
        setDefaultCloseOperation(0);
        limpiar();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage());   
    }
        
      void limpiar(){
    
        t_CPU.setSelectedIndex(0);
        t_serial.setText(""); 
        t_marca.setText("");
        t_placa.setText("");
        t_referencia.setText("");
        t_estado.setSelectedIndex(0);
        t_dependencia.setSelectedIndex(0);
        t_usuario.setText("");
        t_Nombre.setText("");
        t_Procesador.setText("");
        t_ram.setText("");
        cmbSO.setSelectedIndex(0);
        cmbOffice.setSelectedIndex(0);
        cmbAntivirus.setSelectedIndex(0);
        t_Disco.setText("");
        t_IP.setText("");
        t_fechadecompra.setSelectedIndex(0);
        t_fechadecompra2.setSelectedIndex(0);
        t_fechadecompra3.setSelectedIndex(0);
        cmbMonitor.setSelectedIndex(0);
        t_SerialM1.setText("");
        t_MarcaM1.setText("");
        t_PlacaM1.setText("");
        t_ReferenciaM1.setText("");
        cmbTeclado.setSelectedIndex(0);
        t_SerialT1.setText("");
        t_MarcaT1.setText("");
        t_PlacaT1.setText("");
        t_ReferenciaT1.setText("");
        cmbMouse.setSelectedIndex(0);
        t_SerialR.setText("");
        t_MarcaR.setText("");
        t_PlacaR.setText("");
        t_ReferenciaR.setText("");
    
    }
      
      public void Validar(){
      
      if(t_serial.getText().equals("")){jLabel31.setVisible(true);}else{jLabel31.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_dependencia.getSelectedItem().equals("Seleccione>>")){jLabel32.setVisible(true);}else{jLabel32.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(cmbSO.getSelectedItem().equals("Seleccione>>")){jLabel33.setVisible(true);}else{jLabel33.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_marca.getText().equals("")){jLabel34.setVisible(true);}else{jLabel34.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_usuario.getText().equals("")){jLabel35.setVisible(true);}else{jLabel35.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(cmbOffice.getSelectedItem().equals("Seleccione>>")){jLabel36.setVisible(true);}else{jLabel36.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_placa.getText().equals("")){jLabel37.setVisible(true);}else{jLabel37.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_Nombre.getText().equals("")){jLabel38.setVisible(true);}else{jLabel38.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(cmbAntivirus.getSelectedItem().equals("Seleccione>>")){jLabel39.setVisible(true);}else{jLabel39.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_referencia.getText().equals("")){jLabel40.setVisible(true);}else{jLabel40.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_Procesador.getText().equals("")){jLabel41.setVisible(true);}else{jLabel41.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_Disco.getText().equals("")){jLabel42.setVisible(true);}else{jLabel42.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_estado.getSelectedItem().equals("Seleccione>>")){jLabel43.setVisible(true);}else{jLabel43.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_ram.getText().equals("")){jLabel44.setVisible(true);}else{jLabel44.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_IP.getText().equals("")){jLabel45.setVisible(true);}else{jLabel45.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_SerialM1.getText().equals("")){jLabel48.setVisible(true);}else{jLabel48.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_MarcaM1.getText().equals("")){jLabel49.setVisible(true);}else{jLabel49.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_PlacaM1.getText().equals("")){jLabel50.setVisible(true);}else{jLabel50.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_ReferenciaM1.getText().equals("")){jLabel51.setVisible(true);}else{jLabel51.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_SerialT1.getText().equals("")){jLabel47.setVisible(true);}else{jLabel47.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_MarcaT1.getText().equals("")){jLabel52.setVisible(true);}else{jLabel52.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_PlacaT1.getText().equals("")){jLabel53.setVisible(true);}else{jLabel53.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_ReferenciaT1.getText().equals("")){jLabel54.setVisible(true);}else{jLabel54.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_SerialR.getText().equals("")){jLabel56.setVisible(true);}else{jLabel56.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_MarcaR.getText().equals("")){jLabel57.setVisible(true);}else{jLabel57.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_PlacaR.getText().equals("")){jLabel58.setVisible(true);}else{jLabel58.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      if(t_ReferenciaR.getText().equals("")){jLabel59.setVisible(true);}else{jLabel59.setVisible(false);}JOptionPane.showMessageDialog(null,"Campo Vacío.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
      
      }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t_CPU = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_serial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_placa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_referencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t_dependencia = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        t_usuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_Procesador = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t_ram = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_Disco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbSO = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbOffice = new javax.swing.JComboBox();
        cmbAntivirus = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        t_IP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t_fechadecompra = new javax.swing.JComboBox();
        t_fechadecompra2 = new javax.swing.JComboBox();
        t_fechadecompra3 = new javax.swing.JComboBox();
        t_estado = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        cmbMonitor = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        t_SerialR = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        t_MarcaR = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        t_PlacaR = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        t_ReferenciaR = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        cmbTeclado = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        t_SerialM1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        t_MarcaM1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        t_PlacaM1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        t_ReferenciaM1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        cmbMouse = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        t_SerialT1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        t_MarcaT1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        t_PlacaT1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        t_ReferenciaT1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Registro de equipos");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese todos  los datos");

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

        t_CPU.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_CPU.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CPU" }));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("Serial:");

        t_serial.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("Marca:");

        t_marca.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("Placa:");

        t_placa.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setText("Referencia:");

        t_referencia.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel9.setText("Dependencia:");

        t_dependencia.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_dependencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Catastro", "Desarrollo", "Infraestructura", "Valorizacion", "Archivo", "Almacen", "Planeacion", "Salud", "Sisben", "Control Interno", "Control Disciplinario", "Juridica", "Despacho 1a Dama", "Oficina de Calidad", "Alcaldia", "Hacienda", "Tesoreria", "Gobierno", "Sistemas", "Comunicaciones", "Inspeccion", "Transito", "Oficina de Empleo", "Comisaria de Familia", "Educacion", "Casa de la Cultura", "Programas Sociales", "Casa de la Mujer", "Invicop", "Junta de Daportes" }));

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel10.setText("Usuario:");

        t_usuario.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel12.setText("Nombre:");

        t_Nombre.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setText("Procesador:");

        t_Procesador.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel13.setText("RAM:");

        t_ram.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel14.setText("Disco:");

        t_Disco.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel15.setText("S.O:");

        cmbSO.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbSO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Windows XP Profesional SP3", "Windows Vista", "Windows 7 Profesional 32 bits", "Windows 7 Profesional 64 bits", "Windows 8 Profesional 32 bits", "Windows 8 Profesional 64 bits", "Windows 8.1 Profesional 32 bits", "Windows 8.1 Profesional 64 bits", "Windows 10 Profesional 32 bits", "Windows 10 Profesional 64 bits" }));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel16.setText("Office:");

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel17.setText("Antivirus:");

        cmbOffice.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbOffice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Office Standard 2007", "Office Profesional 2007", "Office Pyme 2007", "Office Standard 2010", "Office Profesional 2010", "Office Pyme 2010", "Office Standard 2013", "Office Profesional 2013", "Office Pyme 2013", "Office Standard 2016", "Office Profesional 2016", "Office Pyme 2016" }));
        cmbOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOfficeActionPerformed(evt);
            }
        });

        cmbAntivirus.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbAntivirus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Symantec Endpoint", "Kaspersky", "Norton", "McAfee", "Nod32" }));

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel18.setText("IP:");

        t_IP.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel11.setText("Fecha:");

        t_fechadecompra.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_fechadecompra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes>>", "00", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        t_fechadecompra.setAutoscrolls(true);

        t_fechadecompra2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_fechadecompra2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia>>", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        t_fechadecompra3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_fechadecompra3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año>>", "0000", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));

        t_estado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        t_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione>>", "Activo", "De Baja" }));

        jLabel31.setForeground(new java.awt.Color(255, 0, 51));
        jLabel31.setText("*");

        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setText("*");

        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setText("*");

        jLabel34.setForeground(new java.awt.Color(255, 0, 51));
        jLabel34.setText("*");

        jLabel35.setForeground(new java.awt.Color(255, 0, 51));
        jLabel35.setText("*");

        jLabel36.setForeground(new java.awt.Color(255, 0, 51));
        jLabel36.setText("*");

        jLabel37.setForeground(new java.awt.Color(255, 0, 51));
        jLabel37.setText("*");

        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setText("*");

        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setText("*");

        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setText("*");

        jLabel41.setForeground(new java.awt.Color(255, 0, 51));
        jLabel41.setText("*");

        jLabel42.setForeground(new java.awt.Color(255, 0, 51));
        jLabel42.setText("*");

        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setText("*");

        jLabel44.setForeground(new java.awt.Color(255, 0, 51));
        jLabel44.setText("*");

        jLabel45.setForeground(new java.awt.Color(255, 0, 51));
        jLabel45.setText("*");

        jLabel46.setForeground(new java.awt.Color(255, 0, 51));
        jLabel46.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(24, 24, 24)
                        .addComponent(t_fechadecompra, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_fechadecompra2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_fechadecompra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbSO, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(t_dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(t_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jLabel34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(cmbAntivirus, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_Procesador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Disco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t_ram, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(t_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(t_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)
                        .addComponent(t_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel3)
                        .addComponent(jLabel37)
                        .addComponent(jLabel40)
                        .addComponent(jLabel43))
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(t_Procesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(t_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(t_dependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel35)
                    .addComponent(jLabel38)
                    .addComponent(jLabel41)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(cmbOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAntivirus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(t_IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cmbSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(t_Disco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel36)
                    .addComponent(jLabel39)
                    .addComponent(jLabel42)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_fechadecompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_fechadecompra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_fechadecompra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel46))
                        .addContainerGap())))
        );

        cmbMonitor.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbMonitor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monitor" }));

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

        jLabel56.setForeground(new java.awt.Color(255, 0, 51));
        jLabel56.setText("*");

        jLabel57.setForeground(new java.awt.Color(255, 0, 51));
        jLabel57.setText("*");

        jLabel58.setForeground(new java.awt.Color(255, 0, 51));
        jLabel58.setText("*");

        jLabel59.setForeground(new java.awt.Color(255, 0, 51));
        jLabel59.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addGap(47, 47, 47)
                .addComponent(t_SerialR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(t_MarcaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addGap(8, 8, 8)
                .addComponent(jLabel21)
                .addGap(29, 29, 29)
                .addComponent(t_PlacaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(t_ReferenciaR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
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
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbTeclado.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbTeclado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teclado" }));

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

        jLabel48.setForeground(new java.awt.Color(255, 0, 51));
        jLabel48.setText("*");

        jLabel49.setForeground(new java.awt.Color(255, 0, 51));
        jLabel49.setText("*");

        jLabel50.setForeground(new java.awt.Color(255, 0, 51));
        jLabel50.setText("*");

        jLabel51.setForeground(new java.awt.Color(255, 0, 51));
        jLabel51.setText("*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addGap(34, 34, 34)
                .addComponent(jLabel23)
                .addGap(47, 47, 47)
                .addComponent(t_SerialM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(t_MarcaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(29, 29, 29)
                .addComponent(t_PlacaM1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel51)
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
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbMouse.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        cmbMouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mouse" }));

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

        jLabel47.setForeground(new java.awt.Color(255, 0, 51));
        jLabel47.setText("*");

        jLabel52.setForeground(new java.awt.Color(255, 0, 51));
        jLabel52.setText("*");

        jLabel53.setForeground(new java.awt.Color(255, 0, 51));
        jLabel53.setText("*");

        jLabel54.setForeground(new java.awt.Color(255, 0, 51));
        jLabel54.setText("*");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addGap(34, 34, 34)
                .addComponent(jLabel27)
                .addGap(47, 47, 47)
                .addComponent(t_SerialT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(t_MarcaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(32, 32, 32)
                .addComponent(t_PlacaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(26, 26, 26)
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
                    .addComponent(jLabel47)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_CPU, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(t_CPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
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
        
        String CPU,Serial,Marca,Placa,Referencia,Estado,Dependencia,Usuario,NombrePC,Procesador,RAM,SistemaOperativo,Office,Antivirus,DiscoDuro,Ip,FechaCompra,Monitor,SerialMonitor,MarcaMonitor,PlacaMonitor,ReferenciaMonitor,Teclado,SerialTeclado,MarcaTeclado,PlacaTeclado,ReferenciaTeclado,Mouse,SerialMouse,MarcaMouse,PlacaMouse,ReferenciaMouse;
        String sql="";
        
        CPU = t_CPU.getSelectedItem().toString();
        Serial = t_serial.getText();  
        Marca = t_marca.getText();
        Placa = t_placa.getText();
        Referencia = t_referencia.getText();
        Estado = t_estado.getSelectedItem().toString();
        Dependencia = t_dependencia.getSelectedItem().toString();
        Usuario = t_usuario.getText();
        NombrePC = t_Nombre.getText();
        Procesador = t_Procesador.getText();
        RAM = t_ram.getText();
        SistemaOperativo = cmbSO.getSelectedItem().toString();
        Office = cmbOffice.getSelectedItem().toString();
        Antivirus = cmbAntivirus.getSelectedItem().toString();
        DiscoDuro = t_Disco.getText();
        Ip = t_IP.getText(); 
        FechaCompra = t_fechadecompra.getSelectedItem().toString();
        Monitor = cmbMonitor.getSelectedItem().toString();
        SerialMonitor = t_SerialM1.getText();
        MarcaMonitor = t_MarcaM1.getText();
        PlacaMonitor = t_PlacaM1.getText();
        ReferenciaMonitor = t_ReferenciaM1.getText(); 
        Teclado = cmbTeclado.getSelectedItem().toString();
        SerialTeclado = t_SerialT1.getText();
        MarcaTeclado = t_MarcaT1.getText();
        PlacaTeclado = t_PlacaT1.getText();
        ReferenciaTeclado = t_ReferenciaT1.getText();
        Mouse = cmbMouse.getSelectedItem().toString();
        SerialMouse = t_SerialR.getText();
        MarcaMouse = t_MarcaR.getText();
        PlacaMouse = t_PlacaR.getText();
        ReferenciaMouse = t_ReferenciaR.getText(); 
        String fechaC=t_fechadecompra.getSelectedItem().toString()+"-" + t_fechadecompra2.getSelectedItem().toString()+"-"+ t_fechadecompra3.getSelectedItem().toString();

        Validar();
        
        sql="INSERT INTO formulario (CPU,Serial,Marca,Placa,Referencia,Estado,Dependencia,Usuario,NombrePC,Procesador,RAM,SistemaOperativo,Office,Antivirus,DiscoDuro,Ip,FechaCompra,Monitor,SerialMonitor,MarcaMonitor,PlacaMonitor,ReferenciaMonitor,Teclado,SerialTeclado,MarcaTeclado,PlacaTeclado,ReferenciaTeclado,Mouse,SerialMouse,MarcaMouse,PlacaMouse,ReferenciaMouse) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
     
        PreparedStatement pst1;
        
            pst1 = cn.prepareStatement(sql);
       
        pst1.setString(1,CPU);
        pst1.setString(2,Serial); 
        pst1.setString(3,Marca);
        pst1.setString(4,Placa);
        pst1.setString(5,Referencia);
        pst1.setString(6,Estado);
        pst1.setString(7,Dependencia);
        pst1.setString(8,Usuario);
        pst1.setString(9,NombrePC);
        pst1.setString(10,Procesador);
        pst1.setString(11,RAM);
        pst1.setString(12,SistemaOperativo);
        pst1.setString(13,Office);
        pst1.setString(14,Antivirus);
        pst1.setString(15,DiscoDuro);
        pst1.setString(16,Ip);
        pst1.setString(17,fechaC);
        pst1.setString(18,Monitor);
        pst1.setString(19,SerialMonitor);
        pst1.setString(20,MarcaMonitor);
        pst1.setString(21,PlacaMonitor);
        pst1.setString(22,ReferenciaMonitor);
        pst1.setString(23,Teclado);
        pst1.setString(24,SerialTeclado);
        pst1.setString(25,MarcaTeclado);
        pst1.setString(26,PlacaTeclado);
        pst1.setString(27,ReferenciaTeclado);
        pst1.setString(28,Mouse);
        pst1.setString(29,SerialMouse);
        pst1.setString(30,MarcaMouse);
        pst1.setString(31,PlacaMouse);
        pst1.setString(32,ReferenciaMouse);
  
        int a= pst1.executeUpdate();
  
        if (a>=0){
            JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
            limpiar();
        }  
        
        else{

        }
   
         } catch (SQLException ex) {
            Logger.getLogger(formulario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo registrar:\n"+ "Asegurese de que el serial que esta intentando registrar ya exista.\n"+ "O asegurese de no haber ingresado la letra (ñ) en algún campo.", "Registro denegado",JOptionPane.ERROR_MESSAGE);
         
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOfficeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOfficeActionPerformed

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbAntivirus;
    private javax.swing.JComboBox cmbMonitor;
    private javax.swing.JComboBox cmbMouse;
    private javax.swing.JComboBox cmbOffice;
    private javax.swing.JComboBox cmbSO;
    private javax.swing.JComboBox cmbTeclado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox t_CPU;
    private javax.swing.JTextField t_Disco;
    private javax.swing.JTextField t_IP;
    private javax.swing.JTextField t_MarcaM1;
    private javax.swing.JTextField t_MarcaR;
    private javax.swing.JTextField t_MarcaT1;
    private javax.swing.JTextField t_Nombre;
    private javax.swing.JTextField t_PlacaM1;
    private javax.swing.JTextField t_PlacaR;
    private javax.swing.JTextField t_PlacaT1;
    private javax.swing.JTextField t_Procesador;
    private javax.swing.JTextField t_ReferenciaM1;
    private javax.swing.JTextField t_ReferenciaR;
    private javax.swing.JTextField t_ReferenciaT1;
    private javax.swing.JTextField t_SerialM1;
    private javax.swing.JTextField t_SerialR;
    private javax.swing.JTextField t_SerialT1;
    private javax.swing.JComboBox t_dependencia;
    private javax.swing.JComboBox t_estado;
    private javax.swing.JComboBox t_fechadecompra;
    private javax.swing.JComboBox t_fechadecompra2;
    private javax.swing.JComboBox t_fechadecompra3;
    private javax.swing.JTextField t_marca;
    private javax.swing.JTextField t_placa;
    private javax.swing.JTextField t_ram;
    private javax.swing.JTextField t_referencia;
    private javax.swing.JTextField t_serial;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables

}

