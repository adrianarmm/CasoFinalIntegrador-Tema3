package ModeladodeEntidades.Ambiente;

public class Entorno {
    private String temperatura;
    private String terreno;
    private int recursosDisponibles;

    public Entorno(String temperatura, String terreno, int recursosDisponibles) {
        this.temperatura = temperatura;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }
}