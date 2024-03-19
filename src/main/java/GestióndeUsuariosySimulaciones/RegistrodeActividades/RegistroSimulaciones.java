package GestióndeUsuariosySimulaciones.RegistrodeActividades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroSimulaciones {

    private static final String FILE_PATH = "registro_simulaciones.csv";
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void registrarSimulacion(String configuracion, String resultado) {
        // Añadir marca temporal al registro
        String timestamp = LocalDateTime.now().format(dateTimeFormatter);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String registro = String.join(",", timestamp, configuracion, resultado);
            writer.write(registro);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de registro: " + e.getMessage());
        }
    }
}
