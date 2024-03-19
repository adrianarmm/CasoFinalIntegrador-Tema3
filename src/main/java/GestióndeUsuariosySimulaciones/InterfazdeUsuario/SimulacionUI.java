package GestióndeUsuariosySimulaciones.InterfazdeUsuario;
import javax.swing.*;
import java.awt.*;

import static jdk.internal.misc.OSEnvironment.initialize;

public class SimulacionUI {
    private JFrame frame;
    private JTextField CrecimientoRateField;
    private JTextField reproduccionRateField;
    private JTextField desastreRateField;
    private JTextField enfermerdadRateField;
    private JTextField cambioclimaticoRateField;
    private JButton iniciarButton;
    private JButton pausarButton;
    private JButton detenerButton;
    private JTextArea consolaArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                try {
                    SimulacionUI window = new SimulacionUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
    }

    public SimulacionUI() {
        initialize();
    }

    private void initializer () {
        frame = new JFrame("Simulador de Dinámicas Poblacionales");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        JLabel lblCrecimientoRate = new JLabel("Tasa de Crecimiento");
        frame.getContentPane().add(lblCrecimientoRate);

        CrecimientoRateField = new JTextField();
        frame.getContentPane().add(CrecimientoRateField);
        CrecimientoRateField.setColumns(10);

        JLabel lblReproduccionRate = new JLabel("Tasa de Reproducción");
        frame.getContentPane().add(lblReproduccionRate);
    }
}


