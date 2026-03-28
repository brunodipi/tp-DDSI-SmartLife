package org.example;

public class FacturaMensual{
    Cliente cliente;

    public double calcularMonto(){
        return cliente.getPlan().calcularMonto(cliente);
    }

    public void setCliente(Cliente nuevoCliente) {
        this.cliente = nuevoCliente;
    }
}

