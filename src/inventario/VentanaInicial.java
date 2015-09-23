package inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class VentanaInicial {

    public static void main(String[] arg) {
        try {
            Connection conexion = null;
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
       
             JOptionPane.showMessageDialog(null, "Conexión Correcta");

            login log = new login();
            log.setVisible(true);
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No hay conexión", "Registro denegado", JOptionPane.ERROR_MESSAGE);

        }
    }
   

    
}
