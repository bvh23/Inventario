package inventario;

import javax.swing.JOptionPane;

public class VentanaInicial {
    
    public static void main(String[]arg){
    try{
        JOptionPane.showMessageDialog(null,"Conexion Correcta.");
    
    login log = new login();
    log.setVisible(true);
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, "No hay conexion:\n" + "Error al conectar.", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
            
    }
}
    
}
