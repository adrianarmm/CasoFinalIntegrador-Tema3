package AnalisisAvanzado;

import SimuladordeDinámicasPoblacionales.ResultadosdelaSimulación.Especies;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Visualizador {
    private List<Especies> especies;
    private XYSeriesCollection dataset;

    public Visualizador(List<Especies> especies) {
        this.especies = especies;
        this.dataset = new XYSeriesCollection();
    }

    public JPanel crearGraficoPoblaciones() {
        XYSeries series = new XYSeries("Poblaciones");
        for (Especie especie : especies) {
            series.add(especie.getTiempo(), especie.getPoblacion());
        }
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Poblaciones de Especies", "Tiempo", "Población", dataset);
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(600, 400));
        return panel;
    }
}