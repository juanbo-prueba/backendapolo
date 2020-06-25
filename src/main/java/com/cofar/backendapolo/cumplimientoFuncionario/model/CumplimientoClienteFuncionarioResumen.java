package com.cofar.backendapolo.cumplimientoFuncionario.model;

public class CumplimientoClienteFuncionarioResumen {
    private double totalClientesFuncionario;
    private double totalClienteFacturadoFuncionario;
    private double porcentajeCumplimiento;

    public double getTotalClientesFuncionario() {
        return totalClientesFuncionario;
    }

    public void setTotalClientesFuncionario(double totalClientesFuncionario) {
        this.totalClientesFuncionario = totalClientesFuncionario;
    }

    public double getTotalClienteFacturadoFuncionario() {
        return totalClienteFacturadoFuncionario;
    }

    public void setTotalClienteFacturadoFuncionario(double totalClienteFacturadoFuncionario) {
        this.totalClienteFacturadoFuncionario = totalClienteFacturadoFuncionario;
    }

    public double getPorcentajeCumplimiento() {
        return porcentajeCumplimiento;
    }

    public void setPorcentajeCumplimiento(double porcentajeCumplimiento) {
        this.porcentajeCumplimiento = porcentajeCumplimiento;
    }
}
