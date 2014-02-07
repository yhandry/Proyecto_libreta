package libreta;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author 
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame promedio = new JFrame("Libreta");
        promedio.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel contenido = new Inicial();
        promedio.setLocation(300, 150);
        promedio.getContentPane().add(contenido, BorderLayout.CENTER);
        promedio.pack();
        promedio.setVisible(true);
    }

}
