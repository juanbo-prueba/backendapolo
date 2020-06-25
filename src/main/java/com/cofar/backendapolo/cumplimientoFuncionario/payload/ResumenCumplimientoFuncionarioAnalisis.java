package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoClienteFuncionarioResumen;
import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoFuncionarioResumenLinea;

public class ResumenCumplimientoFuncionarioAnalisis {

    private double porcentajeCumplimientoTotal;
    private double montoPresupuestoTotal;
    private double montoVentasTotal;
    private double porcentajeCumplimientoBph;
    private double montoPresupuestoBph;
    private double montoVentasBph;
    private double porcentajeCumplimientoCofar;
    private double montoPresupuestoCofar;
    private double montoVentasCofar;
    private double porcentajeCumplimientoClientes;
    private double totalClienteFacturados;
    private double totalClientesFuncionario;

    public double getPorcentajeCumplimientoTotal() {
        return porcentajeCumplimientoTotal;
    }

    public void setPorcentajeCumplimientoTotal(double porcentajeCumplimientoTotal) {
        this.porcentajeCumplimientoTotal = porcentajeCumplimientoTotal;
    }

    public double getMontoPresupuestoTotal() {
        return montoPresupuestoTotal;
    }

    public void setMontoPresupuestoTotal(double montoPresupuestoTotal) {
        this.montoPresupuestoTotal = montoPresupuestoTotal;
    }

    public double getMontoVentasTotal() {
        return montoVentasTotal;
    }

    public void setMontoVentasTotal(double montoVentasTotal) {
        this.montoVentasTotal = montoVentasTotal;
    }

    public double getPorcentajeCumplimientoBph() {
        return porcentajeCumplimientoBph;
    }

    public void setPorcentajeCumplimientoBph(double porcentajeCumplimientoBph) {
        this.porcentajeCumplimientoBph = porcentajeCumplimientoBph;
    }

    public double getMontoPresupuestoBph() {
        return montoPresupuestoBph;
    }

    public void setMontoPresupuestoBph(double montoPresupuestoBph) {
        this.montoPresupuestoBph = montoPresupuestoBph;
    }

    public double getMontoVentasBph() {
        return montoVentasBph;
    }

    public void setMontoVentasBph(double montoVentasBph) {
        this.montoVentasBph = montoVentasBph;
    }

    public double getPorcentajeCumplimientoCofar() {
        return porcentajeCumplimientoCofar;
    }

    public void setPorcentajeCumplimientoCofar(double porcentajeCumplimientoCofar) {
        this.porcentajeCumplimientoCofar = porcentajeCumplimientoCofar;
    }

    public double getMontoPresupuestoCofar() {
        return montoPresupuestoCofar;
    }

    public void setMontoPresupuestoCofar(double montoPresupuestoCofar) {
        this.montoPresupuestoCofar = montoPresupuestoCofar;
    }

    public double getMontoVentasCofar() {
        return montoVentasCofar;
    }

    public void setMontoVentasCofar(double montoVentasCofar) {
        this.montoVentasCofar = montoVentasCofar;
    }

    public double getPorcentajeCumplimientoClientes() {
        return porcentajeCumplimientoClientes;
    }

    public void setPorcentajeCumplimientoClientes(double porcentajeCumplimientoClientes) {
        this.porcentajeCumplimientoClientes = porcentajeCumplimientoClientes;
    }

    public double getTotalClienteFacturados() {
        return totalClienteFacturados;
    }

    public void setTotalClienteFacturados(double totalClienteFacturados) {
        this.totalClienteFacturados = totalClienteFacturados;
    }

    public double getTotalClientesFuncionario() {
        return totalClientesFuncionario;
    }

    public void setTotalClientesFuncionario(double totalClientesFuncionario) {
        this.totalClientesFuncionario = totalClientesFuncionario;
    }
}
