package ModeladodeEntidades.Interacciones;

import ModeladodeEntidades.Organismos.Animal;

public class Predacion {
    private Animal depredador;
    private Animal presa;

    public Predacion(Animal depredador, Animal presa) {
        this.depredador = depredador;
        this.presa = presa;
    }

}
