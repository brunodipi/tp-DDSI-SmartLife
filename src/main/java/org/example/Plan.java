package org.example;

public abstract class Plan{
    public double tarifaBase;

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularMonto(Cliente cliente);
}

