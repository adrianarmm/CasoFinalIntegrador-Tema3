package ResultadosdelaSimulación;

import CrecimientoyReproducción.Especies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Environment {

    public void EstadisiticasEspecies() {
        for (Especies especie : especiesList) {
            System.out.println("Especie: " + especie.getNombre());
            System.out.println("Población: " + especie.getPopulation());
            System.out.println("Tasa de crecimiento: " + especie.getCrecimientoRate());
            System.out.println("Tasa de reproducción: " + especie.getReproduccionRate());
            System.out.println("---------------------------------");
        }
    }