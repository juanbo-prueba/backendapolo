package com.cofar.backendapolo.cumplimientoFuncionario.model;

public class CumplimientoFuncionarioResumenLinea {

    private double porcentajeCumplimiento;
    private double montoPresupuesto;
    private double montoVentas;

    public CumplimientoFuncionarioResumenLinea() {
    }

    public CumplimientoFuncionarioResumenLinea(double porcentajeCumplimiento, double montoPresupuesto, double montoVentas) {
        this.porcentajeCumplimiento = porcentajeCumplimiento;
        this.montoPresupuesto = montoPresupuesto;
        this.montoVentas = montoVentas;
    }

    public double getPorcentajeCumplimiento() {
        return porcentajeCumplimiento;
    }

    public void setPorcentajeCumplimiento(double porcentajeCumplimiento) {
        this.porcentajeCumplimiento = porcentajeCumplimiento;
    }

    public double getMontoPresupuesto() {
        return montoPresupuesto;
    }

    public void setMontoPresupuesto(double montoPresupuesto) {
        this.montoPresupuesto = montoPresupuesto;
    }

    public double getMontoVentas() {
        return montoVentas;
    }

    public void setMontoVentas(double montoVentas) {
        this.montoVentas = montoVentas;
    }
}
