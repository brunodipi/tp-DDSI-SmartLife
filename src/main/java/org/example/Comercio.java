package org.example;

public class Comercio extends Plan{
    double adicionalDispotivosConectados;

    public void setAdicionalDispotivosConectados(double adicionalDispotivosConectados) {
        this.adicionalDispotivosConectados = adicionalDispotivosConectados;
    }

    public double calcularMonto(Cliente cliente) {
        return tarifaBase+cliente.getDispositivos()*adicionalDispotivosConectados;
    }
}
