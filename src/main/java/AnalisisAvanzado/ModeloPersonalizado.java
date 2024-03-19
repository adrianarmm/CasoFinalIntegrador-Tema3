package AnalisisAvanzado;

public class ModeloPersonalizado implements Modelo {
    @Override
    public double calcularCrecimiento(double tiempo, double poblacion) {
        // Implementa tu propio algoritmo de crecimiento aquí
        return poblacion * (1 + 0.05 * tiempo);
    }
}




