package ModeladodeEntidades;

public class Predacion {
    private Animal depredador;
    private Animal presa;

    public Predacion(Animal depredador, Animal presa) {
        this.depredador = depredador;
        this.presa = presa;

    }

    public Animal getDepredador() {
        return depredador;
    }

    public Animal getPresa() {
        return presa;
    }

    public void setDepredador(Animal depredador) {
        this.depredador = depredador;
    }

    public void setPresa(Animal presa) {
        this.presa = presa;
    }

    public void realizarPredacion() {
        depredador.comer(presa);
    }

}
