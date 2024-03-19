package GestióndeUsuariosySimulaciones;

import javax.swing.*;
import java.awt.*;

public class SimulacionUI {
    private JFrame frame;
    private JTextField crecimientoRateField;
    private JTextField reproduccionRateField;
    private JTextField desastreRateField;
    private JTextField enfermedadRateField;
    private JTextField cambioClimaticoRateField;
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
        initializer();
    }

    private void initializer() {
        frame = new JFrame("Simulador de Dinámicas Poblacionales");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        JLabel lblCrecimientoRate = new JLabel("Tasa de Crecimiento:");
        frame.getContentPane().add(lblCrecimientoRate);

        crecimientoRateField = new JTextField();
        frame.getContentPane().add(crecimientoRateField);
        crecimientoRateField.setColumns(10);

        JLabel lblReproduccionRate = new JLabel("Tasa de Reproducción:");
        frame.getContentPane().add(lblReproduccionRate);

        reproduccionRateField = new JTextField();
        frame.getContentPane().add(reproduccionRateField);
        reproduccionRateField.setColumns(10);

        JLabel lblDesastreRate = new JLabel("Tasa de Desastre:");
        frame.getContentPane().add(lblDesastreRate);

        desastreRateField = new JTextField();
        frame.getContentPane().add(desastreRateField);
        desastreRateField.setColumns(10);

        JLabel lblEnfermedadRate = new JLabel("Tasa de Enfermedad:");
        frame.getContentPane().add(lblEnfermedadRate);

        enfermedadRateField = new JTextField();
        frame.getContentPane().add(enfermedadRateField);
        enfermedadRateField.setColumns(10);

        JLabel lblCambioClimaticoRate = new JLabel("Tasa de Cambio Climático:");
        frame.getContentPane().add(lblCambioClimaticoRate);

        cambioClimaticoRateField = new JTextField();
        frame.getContentPane().add(cambioClimaticoRateField);
        cambioClimaticoRateField.setColumns(10);

        iniciarButton = new JButton("Iniciar");
        frame.getContentPane().add(iniciarButton);

        pausarButton = new JButton("Pausar");
        frame.getContentPane().add(pausarButton);

        detenerButton = new JButton("Detener");
        frame.getContentPane().add(detenerButton);

        consolaArea = new JTextArea(5, 30); // Definir un tamaño inicial para el área de texto.
        JScrollPane scrollPane = new JScrollPane(consolaArea); // Añadir scroll al JTextArea.
        frame.getContentPane().add(scrollPane);
    }
}


