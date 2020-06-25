package com.cofar.backendapolo.cumplimientoFuncionario.payload;

public class CumplimientoFucionarioLineaVenta {

    private int codPersonal;
    private String nombreLineaVenta;
    private double montoPresupuesto;
    private double montoVenta;
    private int cantidadPresupuesto;
    private int cantidadVenta;
    private double cumplimientoMonto;
    private double cumplimientoCantidad;

    public CumplimientoFucionarioLineaVenta() {
    }

    public int getCodPersonal() {
        return codPersonal;
    }

    public void setCodPersonal(int codPersonal) {
        this.codPersonal = codPersonal;
    }

    public String getNombreLineaVenta() {
        return nombreLineaVenta;
    }

    public void setNombreLineaVenta(String nombreLineaVenta) {
        this.nombreLineaVenta = nombreLineaVenta;
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
