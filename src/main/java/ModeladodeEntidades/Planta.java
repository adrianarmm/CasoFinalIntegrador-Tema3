package ModeladodeEntidades;

import ModeladodeEntidades.Organismo;

public class Planta extends Organismo {

    public Planta(int posicionX, int posicionY, double salud, int edad, boolean estadoReproductivo) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
    }

    public Object getPoblacion() {
        return null;
    }
}

