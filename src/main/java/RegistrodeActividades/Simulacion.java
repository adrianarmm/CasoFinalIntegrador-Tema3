package RegistrodeActividades;
import SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.CrecimientoyReproducción.Especies;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Simulacion {
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private List<Especies> especiesList;
    private List<EventosAleatorio> eventosAleatoriosList;
    private List<ResultadoSimulacion> resultadosSimulacionList;
}
