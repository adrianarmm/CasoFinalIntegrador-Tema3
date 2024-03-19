package RegistrodeActividades;
import SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.CrecimientoyReproducción.Especies;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Simulacion {
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private List<Especies> especies;
    private List<EventosAleatorio> eventosAleatorios;
    private List<ResultadoSimulacion> resultadosSimulacion;

    public Simulacion(LocalDateTime fechaHoraInicio, List<Especies> especiesList, List<EventosAleatorio> eventosAleatorios){
        this.fechaHoraInicio = fechaHoraInicio;
        this.especies = especiesList;
        this.eventosAleatorios = eventosAleatorios;
        this.resultadosSimulacion = new ArrayList<>();

    }

    public LocalDateTime getFechaHoraInicio(){
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio){
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin(){
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin){
        this.fechaHoraFin = fechaHoraFin;
    }
}

public List this.resultados = new ArrayList<>();

