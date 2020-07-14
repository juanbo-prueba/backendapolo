package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import java.util.Date;

public class MesValor {

    private Date mes;
    private Double valor;

    public MesValor() {
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
