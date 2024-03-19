package SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.ResultadosdelaSimulación;

import SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.CrecimientoyReproducción.Especies;

public class Environment {

    public void EstadisiticasEspecies() {
        Especies[] especiesList = new Especies[0];
        for (Especies especie : especiesList) {
            System.out.println("Especie: " + especie.getNombre());
            System.out.println("Población: " + especie.getPopulation());
            System.out.println("Tasa de crecimiento: " + especie.getCrecimientoRate());
            System.out.println("Tasa de reproducción: " + especie.getReproduccionRate());
            System.out.println("---------------------------------");
        }
    }

    public double calcularTasaDeCrecimiento() {
    double tasaCrecimiento = 0;
        Especies[] especiesList = new Especies[0];
        for (Especies especie : especiesList) {
        tasaCrecimiento += especie.getCrecimientoRate();
    }
    return tasaCrecimiento / especiesList.length;
    }

    public double calcularTasaDeReproduccion() {
    double tasaReproduccion = 0;
        Especies[] especiesList = new Especies[0];
        for (Especies especie : especiesList) {
        tasaReproduccion += especie.getReproduccionRate();
        }
    return tasaReproduccion / especiesList.length;
}
}

