package org.example;

public class Cliente{
    Plan plan;
    double tarifaPersonalizada;
    double cantDispositivos;

    public Plan plan() {
        return plan;
    }

    public double getTarifa(){
        return tarifaPersonalizada;
    }

    public double getDispositivos(){
        return cantDispositivos;
    }


    public void setPlan(Plan nuevoPlan) {
        this.plan = nuevoPlan;
    }

    public void setTarifa(double nuevaTarifa) {
        this.tarifaPersonalizada = nuevaTarifa;
    }

    public void setCantDispositivos(double cant) {
        this.cantDispositivos = cant;
    }

}

