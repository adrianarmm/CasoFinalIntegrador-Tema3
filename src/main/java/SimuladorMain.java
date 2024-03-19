

import ModeladodeEntidades.*;
import SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.Ambiente;
import GestióndeUsuariosySimulaciones.*;

public class SimuladorMain {

    public static void main(String[] args) {
        // Configuración inicial del entorno
        Entorno entorno = new Entorno("Templado", "Bosque", 1000);

        // Añadir algunos animales y plantas al entorno
        Animal leon = new Animal(0, 0, 100.0, 5, true);
        Planta pasto = new Planta(10, 10, 50.0, 1, false);

        // Simulación de eventos
        Ambiente ambiente = new Ambiente();
        ambiente.addEntorno(entorno);
        ambiente.simularDesastreNatural(0.5); // 50% de reducción de recursos
        ambiente.simularCambioClimatico(0.1); // 10% de posibilidades de cambio climático a "Calido"

        // Registro de la simulación
        String configuracion = "Templado,Bosque,1000";
        String resultado = "Recursos:" + entorno.getRecursosDisponibles() + ",Temperatura:" + entorno.getTemperatura();
        RegistroSimulaciones.registrarSimulacion(configuracion, resultado);

        // Autenticación de usuario (ejemplo)
        AutenticacionManager manager = new AutenticacionManager();
        manager.addUsuario(new Usuario("usuarioTest", "password123"));
        Usuario usuarioAutenticado = manager.autenticar("usuarioTest", "password123");
        if(usuarioAutenticado != null) {
            System.out.println("Usuario autenticado con éxito.");
        } else {
            System.out.println("Fallo en la autenticación.");
        }

        // Mostrar información de la simulación
        System.out.println("Simulación completada. Resultados registrados.");
    }
}
