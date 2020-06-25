package com.cofar.backendapolo.cumplimientoFuncionario.payload;

public class CumplimientoFucionarioPresentacion {

    private int codPersonal;
    private int codPresentacion;
    private int codLineaMkt;
    private String nombrePresentacion;
    private double montoPresupuesto;
    private double montoVenta;
    private int cantidadPresupuesto;
    private int cantidadVenta;
    private double cumplimientoMonto;
    private double cumplimientoCantidad;

    public CumplimientoFucionarioPresentacion() {
    }

    public int getCodPersonal() {
        return codPersonal;
    }

    public void setCodPersonal(int codPersonal) {
        this.codPersonal = codPersonal;
    }

    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public int getCodLineaMkt() {
        return codLineaMkt;
    }

    public void setCodLineaMkt(int codLineaMkt) {
        this.codLineaMkt = codLineaMkt;
    }

    public String getNombrePresentacion() {
        return nombrePresentacion;
    }

    public void setNombrePresentacion(String nombrePresentacion) {
        this.nombrePresentacion = nombrePresentacion;
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

    public int getCantidadPresupuesto() {
        return cantidadPresupuesto;
    }

    public void setCantidadPresupuesto(int cantidadPresupuesto) {
        this.cantidadPresupuesto = cantidadPresupuesto;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
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
