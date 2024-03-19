package EventosAleatorios;

import ModeladodeEntidades.Ambiente.Entorno;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class Ambiente {
    private list<Entorno> entornosList;
    private random r;

    public Ambiente(){
        entornosList = new ArrayList<Entorno>();
        r = new Random();
    }

    public void addEntorno(Entorno entorno){
        entornosList.add(entorno);
    }

    public void simularDesastreNatural(double desastreRate){
       if (random.nextDouble() < desastreRate){
           for (Entorno entorno : entornosList){
               entorno.setRecursosDisponibles(int) (entorno.getRecursosDisponibles() * (1- disasterRate);
           }
       }
    }
}
