package ModeladodeEntidades.Organismos;
abstract class Organismo {
    protected int posicionX;
    protected int posicionY;
    protected double salud;
    protected int edad;
    protected boolean estadoReproductivo;

    public Organismo(int posicionX, int posicionY, double salud, int edad, boolean estadoReproductivo) {
        this.posicionX = posicionX;
        this.posicionY =  posicionY;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

}
