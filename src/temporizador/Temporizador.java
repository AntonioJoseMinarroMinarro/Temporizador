package temporizador;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class Temporizador {
    public static void main(String[] args) {  
        Temporizador.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
        System.exit(0);
    }
    
    public static void enMarcha(int intervalo, boolean sonido) {
        class DameLaHora implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sonido) { Toolkit.getDefaultToolkit().beep(); }
                System.out.println("La hora es: " + new Date());
            }
        }
        new Timer(intervalo, new DameLaHora()).start();
    }
}