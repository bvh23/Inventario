///Hecho por Brian Vargas Henao. CC. 1.022.097.226
package inventario;

import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class PantallaCargandoMain {

    PantallaCargando screen;

    public PantallaCargandoMain() {
        inicioPantalla();
        screen.velocidadDeCarga();
    }

    private void inicioPantalla() {
        ImageIcon myImage = new ImageIcon(getClass().getResource("/imagenes/carga.jpg"));
        screen = new PantallaCargando(myImage);
        screen.setLocationRelativeTo(null);
        screen.setProgresoMax(100);
        screen.setVisible(true);
    }

    public static void main(String[] args) {
        new PantallaCargandoMain();
    }
}
