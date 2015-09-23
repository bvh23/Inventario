package inventario;

import javax.swing.JOptionPane;

public class VentanaInicial {

    public static void main(String[] arg) {
        try {
            
             JOptionPane.showMessageDialog(null, "Conexión Correcta");

            login log = new login();
            log.setVisible(true);
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No hay conexión", "Registro denegado", JOptionPane.ERROR_MESSAGE);

        }
    }
}
