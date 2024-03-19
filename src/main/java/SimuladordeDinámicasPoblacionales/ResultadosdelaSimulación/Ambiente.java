package SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación;

import ModeladodeEntidades.Entorno;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class Ambiente {
    private final List<Entorno> entornosList;
    private final Random r;

    public Ambiente(String tropical, String selva, int i, int i1, int i2){
        entornosList = new ArrayList<Entorno>();
        r = new Random();
    }

    public void addEntorno(Entorno entorno){
        entornosList.add(entorno);
    }

    public void simularDesastreNatural(double desastreRate){

        if (r.nextDouble() < desastreRate){
           for (Entorno entorno : entornosList){
            int recursosDisponibles = (int)  entorno.getRecursosDisponibles();
               entorno.setRecursosDisponibles(recursosDisponibles/2);
           }
       }
    }

    public void simularCambioClimatico(double cambioClimaticoRate){
        if (r.nextDouble() < cambioClimaticoRate){
            for (Entorno entorno : entornosList){
                entorno.setTemperatura("Calido");
            }
        }
    }

    public int getPoblacion() {
        return 0;
    }

    public void setPoblacion(int nuevaPoblacion) {

    }
}
