package ModeladodeEntidades;


public class Animal extends Organismo {

    public Animal(int posicionX, int posicionY, double salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    public double getPoblacion() {
        return 0;
    }
}
