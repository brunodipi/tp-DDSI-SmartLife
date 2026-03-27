package org.example;

public class Cliente{
    Plan plan;
    double tarifa;
    double cantDispositivos;

    public Plan plan() {
        return plan;
    }

    public double getTarifa(){
        return tarifa;
    }

    public double getDispositivos(){
        return cantDispositivos;
    }


    public void setPlan(Plan nuevoPlan) {
        this.plan = nuevoPlan;
    }

    public void setTarifa(double nuevaTarifa) {
        this.tarifa = nuevaTarifa;
    }

    public void setCantDispositivos(double cant) {
        this.cantDispositivos = cant;
    }

}

