package com.cofar.backendapolo.cumplimientoFuncionario.payload;

public class CumplimientoFucionarioGeneral {

    private int codPersonal;
    private double montoPresupuesto;
    private double montoVenta;
    private double cantidadPresupuesto;
    private double cantidadVenta;
    private double cumplimientoMonto;
    private double cumplimientoCantidad;

    public CumplimientoFucionarioGeneral() {
    }

    public int getCodPersonal() {
        return codPersonal;
    }

    public void setCodPersonal(int codPersonal) {
        this.codPersonal = codPersonal;
    }

    public double getMontoPresupuesto() {
        return montoPresupuesto;
    }

    public void setMontoPresupuesto(double montoPresupuesto) {
        this.montoPresupuesto = montoPresupuesto;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }

    public double getCantidadPresupuesto() {
        return cantidadPresupuesto;
    }

    public void setCantidadPresupuesto(double cantidadPresupuesto) {
        this.cantidadPresupuesto = cantidadPresupuesto;
    }

    public double getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(double cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public double getCumplimientoMonto() {
        return cumplimientoMonto;
    }

    public void setCumplimientoMonto(double cumplimientoMonto) {
        this.cumplimientoMonto = cumplimientoMonto;
    }

    public double getCumplimientoCantidad() {
        return cumplimientoCantidad;
    }

    public void setCumplimientoCantidad(double cumplimientoCantidad) {
        this.cumplimientoCantidad = cumplimientoCantidad;
    }
}
