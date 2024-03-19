package EventosAleatorios;

import ModeladodeEntidades.Ambiente.Entorno;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class Ambiente {
    private final List<Entorno> entornosList;
    private final Random r;

    public Ambiente(){
        entornosList = new ArrayList<Entorno>();
        r = new Random();
    }

    public void addEntorno(Entorno entorno){
        entornosList.add(entorno);
    }

    public void simularDesastreNatural(double desastreRate){

        if (r.nextDouble() < desastreRate){
           for (Entorno entorno : entornosList){
               entorno.setRecursosDisponibles((int)) (entorno.getRecursosDisponibles() * (1- disasterRate)));
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
}