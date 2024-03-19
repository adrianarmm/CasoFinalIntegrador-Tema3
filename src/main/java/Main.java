import GestióndeUsuariosySimulaciones.Usuario;
import ModeladodeEntidades.*;
import GestióndeUsuariosySimulaciones.AutenticacionManager;
import AnalisisAvanzado.Simulador;
import AnalisisAvanzado.ModeloPersonalizado;
import AnalisisAvanzado.Visualizador;
import SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.Especies;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
        public static void main(String[] args) {
            // Initialize user authentication
            AutenticacionManager authManager = new AutenticacionManager();
            authManager.addUsuario(new Usuario("user", "pass"));

            // Initialize entities
            Entorno entorno = new Entorno("calido", "llano", 100);
            Animal leon = new Animal(1, 1, 100, 5, true);
            Animal gacela = new Animal(5, 5, 50, 3, true);
            Planta pasto = new Planta(3, 3, 200, 7, false);

            // Add entities to the environment
            // ...

            // Initialize advanced analysis
            ModeloPersonalizado modelo = new ModeloPersonalizado();
            Simulador simulador = new Simulador(modelo);
            List<Especies> especies = new ArrayList<>();
            especies.add(new Especies("Leon", leon.getPoblacion(), 0));
            especies.add(new Especies("Gacela", gacela.getPoblacion(), 0));
            especies.add(new Especies("Pasto", pasto.getPoblacion(), 0));

            // Run simulation
            simulador.simular(0, 10, leon.getPoblacion());

            // Visualize results
            Visualizador visualizador = new Visualizador(especies);
            JFrame frame = new JFrame();
            frame.add(visualizador.crearGraficoPoblaciones());
            frame.pack();
            frame.setVisible(true);
        }
    }
}
