///Hecho por Brian Vargas Henao. CC. 1.022.097.226
package inventario;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

    Connection conexion = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conexion;
    }

}
