package com.cofar.backendapolo.cumplimientoFuncionario.payload;

public class CumplimientoFucionarioLineaMkt {
    private int codPersonal;
    private int codLineaMkt;
    private String nombreLineaMkt;
    private double montoPresupuesto;
    private double montoVenta;
    private int cantidadPresupuesto;
    private int cantidadVenta;
    private double cumplimientoMonto;
    private double cumplimientoCantidad;

    public CumplimientoFucionarioLineaMkt() {
    }

    public int getCodPersonal() {
        return codPersonal;
    }

    public void setCodPersonal(int codPersonal) {
        this.codPersonal = codPersonal;
    }

    public int getCodLineaMkt() {
        return codLineaMkt;
    }

    public void setCodLineaMkt(int codLineaMkt) {
        this.codLineaMkt = codLineaMkt;
    }

    public String getNombreLineaMkt() {
        return nombreLineaMkt;
    }

    public void setNombreLineaMkt(String nombreLineaMkt) {
        this.nombreLineaMkt = nombreLineaMkt;
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
