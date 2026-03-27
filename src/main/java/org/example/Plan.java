package org.example;

public abstract class Plan{

    public double adicionalDispotivosConectados = 500;
    public double descuentoPorcentual = 0.85;
    public double tarifaBase;

    public abstract double calcularMonto(Cliente cliente);

    public void setAdicionalDispotivosConectados(double nueva) {
        this.adicionalDispotivosConectados = nueva;
    }

    public void setDescuentoPorcentual(double nueva) {
        this.descuentoPorcentual = nueva;
    }
}