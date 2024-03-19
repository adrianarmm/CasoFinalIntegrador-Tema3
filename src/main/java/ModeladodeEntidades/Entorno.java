package ModeladodeEntidades;
import java.util.List;


public class Entorno {
    private String clima;
    private String tipoTerreno;
    private int recursosDisponibles;
    private int maxPosX;
    private int maxPosY;

    public Entorno(String temperatura, String terreno, int recursosDisponibles) {
        this.temperatura = temperatura;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }

    // Cambiado el tipo de retorno de Object a int, para reflejar correctamente el tipo de los recursos disponibles
    public int getRecursosDisponibles() {
        return this.recursosDisponibles;
    }

    // Implementar correctamente el método setRecursosDisponibles para actualizar el valor de recursosDisponibles
    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    // Implementar correctamente el método setTemperatura para actualizar el valor de temperatura
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public List<Animal> animales;
    private List<Planta> plantas;



    public void addAnimal(Animal animal) {

    }

    public void addPlanta(Planta planta) {

    }

    // Métodos get para temperatura y terreno, si son necesarios
    public String getTemperatura() {
        return temperatura;
    }

    public String getTerreno() {
        return terreno;
    }
}
