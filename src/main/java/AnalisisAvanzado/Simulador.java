package AnalisisAvanzado;

public class Simulador {
        private Modelo modelo;

        public Simulador(Modelo modelo) {
            this.modelo = modelo;
        }

        public void simular(double tiempoInicial, double tiempoFinal, double poblacionInicial) {
            double tiempoActual = tiempoInicial;
            double poblacionActual = poblacionInicial;
            while (tiempoActual < tiempoFinal) {
                poblacionActual = modelo.calcularCrecimiento(tiempoActual, poblacionActual);
                tiempoActual += 1;
            }
            System.out.println("Población final: " + poblacionActual);
        }
    }

