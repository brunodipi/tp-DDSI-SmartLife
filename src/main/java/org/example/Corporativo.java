package org.example;

public class Corporativo extends Plan{

    double descuentoPorcentual;

    public void setDescuentoPorcentual(double descuentoPorcentual) {
        this.descuentoPorcentual = descuentoPorcentual;
    }

    public double calcularMonto(Cliente cliente) {
        return tarifaBase * descuentoPorcentual / 100;
    }
}
