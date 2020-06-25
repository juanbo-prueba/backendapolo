package com.cofar.backendapolo.cumplimientoFuncionario.payload;

public class SeguimientoClienteFuncionario {

    private int codPresupuesto;
    private int codCliente;
    private String nombreCliente;
    private double totalVentaActual;
    private double totalVentaActualBph;
    private double totalVentaActualCofar;
    private double totalVentaAnterior;
    private double totalVentaAnteriorBph;
    private double totalVentaAnteriorCofar;
    private double totalVentaDescuentoFidelidadCalculado;
    private double totalVentaDescuentoFidelidadAplicado;

    public SeguimientoClienteFuncionario() {
    }

    public int getCodPresupuesto() {
        return codPresupuesto;
    }

    public void setCodPresupuesto(int codPresupuesto) {
        this.codPresupuesto = codPresupuesto;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getTotalVentaActual() {
        return totalVentaActual;
    }

    public void setTotalVentaActual(double totalVentaActual) {
        this.totalVentaActual = totalVentaActual;
    }

    public double getTotalVentaActualBph() {
        return totalVentaActualBph;
    }

    public void setTotalVentaActualBph(double totalVentaActualBph) {
        this.totalVentaActualBph = totalVentaActualBph;
    }

    public double getTotalVentaActualCofar() {
        return totalVentaActualCofar;
    }

    public void setTotalVentaActualCofar(double totalVentaActualCofar) {
        this.totalVentaActualCofar = totalVentaActualCofar;
    }

    public double getTotalVentaAnterior() {
        return totalVentaAnterior;
    }

    public void setTotalVentaAnterior(double totalVentaAnterior) {
        this.totalVentaAnterior = totalVentaAnterior;
    }

    public double getTotalVentaAnteriorBph() {
        return totalVentaAnteriorBph;
    }

    public void setTotalVentaAnteriorBph(double totalVentaAnteriorBph) {
        this.totalVentaAnteriorBph = totalVentaAnteriorBph;
    }

    public double getTotalVentaAnteriorCofar() {
        return totalVentaAnteriorCofar;
    }

    public void setTotalVentaAnteriorCofar(double totalVentaAnteriorCofar) {
        this.totalVentaAnteriorCofar = totalVentaAnteriorCofar;
    }

    public double getTotalVentaDescuentoFidelidadCalculado() {
        return totalVentaDescuentoFidelidadCalculado;
    }

    public void setTotalVentaDescuentoFidelidadCalculado(double totalVentaDescuentoFidelidadCalculado) {
        this.totalVentaDescuentoFidelidadCalculado = totalVentaDescuentoFidelidadCalculado;
    }

    public double getTotalVentaDescuentoFidelidadAplicado() {
        return totalVentaDescuentoFidelidadAplicado;
    }

    public void setTotalVentaDescuentoFidelidadAplicado(double totalVentaDescuentoFidelidadAplicado) {
        this.totalVentaDescuentoFidelidadAplicado = totalVentaDescuentoFidelidadAplicado;
    }
}
