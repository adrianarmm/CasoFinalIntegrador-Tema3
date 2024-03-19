package EventosAleatorios;

import ModeladodeEntidades.Ambiente.Entorno;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class Ambiente {
    private final list<Entorno> entornosList;
    private final random r;

    public Ambiente(){
        entornosList = new list<Entorno>();
        r = new Random();
    }

    public void addEntorno(Entorno entorno){
        entornosList.add(entorno);
    }

    public void simularDesastreNatural(double desastreRate){
        Random random = new Random()    ;
        if (random.nextDouble() < desastreRate){
           for (Entorno entorno : entornosList){
               entorno.setRecursosDisponibles(int) (entorno.getRecursosDisponibles() * (1- disasterRate);
           }
       }
    }

    public void simularCambioClimatico(double cambioClimaticoRate){
        if (Random.nextDouble() < cambioClimaticoRate){
            for (Entorno entorno : entornosList){
                entorno.setTemperatura("Calido");
            }
        }
    }
}
