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

    public void reproduccion() {
      population+= (int) (population * reproduccionRate);
    }
    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCrecimientoRate() {
        return crecimientoRate;
    }

    public void setCrecimientoRate(double crecimientoRate) {
        this.crecimientoRate = crecimientoRate;
    }

    public double getReproduccionRate() {
        return reproduccionRate;
    }

}
