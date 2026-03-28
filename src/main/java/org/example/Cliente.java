package org.example;

public class Cliente{
    Plan plan;
    double cantDispositivos;

    public Plan getPlan() {
        return plan;
    }

    public double getDispositivos(){
        return cantDispositivos;
    }

    public void setPlan(Plan nuevoPlan) {
        this.plan = nuevoPlan;
    }

    public void setCantDispositivos(double cant) {
        this.cantDispositivos = cant;
    }

}

