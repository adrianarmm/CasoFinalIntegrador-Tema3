package SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación;

import java.util.ArrayList;
import java.util.List;

public class Poblacion {
    private Especies especie;
    private int cantidad;

    public Poblacion(Especies especie, int cantidad) {
        this.especie = especie;
        this.cantidad = cantidad;
    }

    public Especies getEspecie() {
        return especie;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void crecer() {
        // Simulamos el crecimiento de la población según la tasa de crecimiento de la especie
        cantidad += cantidad * especie.getCrecimientoRate() / 100;
    }

    public void reproducirse() {
        // Simulamos la reproducción de la población según la tasa de reproducción de la especie
        cantidad += cantidad * especie.getReproduccionRate() / 100;
    }
}
