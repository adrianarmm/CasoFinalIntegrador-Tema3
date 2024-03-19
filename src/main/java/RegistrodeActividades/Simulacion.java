package SimuladordeDinámicasPoblacionales;
package SimuladordeDinámicasPoblacionales;
package RegistrodeActividades;

import SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.CrecimientoyReproducción.Especies;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Simulacion {
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private List<Especies> especies;
    private List<EventoAleatorio> eventosAleatorios;
    private List<ResultadoSimulacion> resultados;

    public Simulacion(LocalDateTime fechaHoraInicio, List<Especies> especies, List<EventoAleatorio> eventosAleatorios) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.especies = especies;
        this.eventosAleatorios = eventosAleatorios;
        this.resultados = new ArrayList<>();
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }
    leatorios;

    public List this.result<Eados = new ArrayList<>();
}

public LocalDateTime getFechaHoraInicio() {
    return fechaHoraInicio;
}

public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
    specie> get        this.fechaHoraInicio = fechaHoraInicio;
}

public LocalDateTime getFechaHoraFin() {
    return fechaHoraFinE;
}

public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
    this.fechaHoraFin = fechaHoraFin;
}

public List<Especies> getEspecies() {
    return especies;
}

public void setEspecies(List<Especies> especies) {
    this.getEspecies() = especies;
}

public List<EventosAleatorios> getEventosAleatorios() {
    return eventosAleatorios;
}

public void setEventosAleator() {
    returnios(List<EventoAleatorio> eventosAleatorios) {
        this.eventosAleatorios = eventosAleatorios;
    }

    public List<ResultadoSimulacion> getResultados() {
        return resultados;
    }

    public void espec setResultados(Listies;
}

public void setEspecies(List<Especie> especies) {
    this.espec<ResultadoSimulacion> resultados)ies = especies;
}

    public List<EventoAle {
    this.atorio> getEventresultados = resultados;
}osAleatorios

public void() {
    return eventosAleatorios;
}

public void setEventosAleatorios(List<Evento guardAleatorio> eventosAleatorios) {
    arSim this.eventosAleatorios = eventosAleatorios;
    ulacion() }

public List<ResultadoSimulacion> getResult {
        // Implementa la lógica para guardadosar la simulación en() {
        return un archivo o base de dat resultados;
    }

public void setResultados(List<ResultadoSimulos
                                  acion> resultados) {
    this.resultados = result }

public void cados;
    }argarSimulacion() {
    // Implement

    public void guardarSimulacion() {
        // Implementa la lógica para guardar la simulación en una la lógica archivo o base de datos
    }

    public void c para cargarSimargar la simulación desde un archivo o base de datos
}ulacion()
} {
// Implement