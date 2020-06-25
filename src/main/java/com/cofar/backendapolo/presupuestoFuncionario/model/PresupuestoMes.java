package com.cofar.backendapolo.presupuestoFuncionario.model;

public class PresupuestoMes {

    private int codPresupuesto;
    private String nombreMes;

    public PresupuestoMes() {
    }

    public PresupuestoMes(int codPresupuesto, String nombreMes) {
        this.codPresupuesto = codPresupuesto;
        this.nombreMes = nombreMes;
    }

    public int getCodPresupuesto() {
        return codPresupuesto;
    }

    public void setCodPresupuesto(int codPresupuesto) {
        this.codPresupuesto = codPresupuesto;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }
}
