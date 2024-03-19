package CrecimientoyReproducción;

public class Especies {
    private String nombre;
    private double crecimientoRate;
    private double reproduccionRate;
    private int population;

    public Especies(String nombre, String tipo, String habitat, String alimentacion, String reproduccion) {
        this.nombre = nombre;
        this.crecimientoRate = crecimientoRate();
        this.reproduccionRate = reproduccionRate();
    }

    public void crecimiento() {
      population+= (int) (population * reproduccionRate);
    }
}
