package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import java.util.Date;

public class FechaIntervalo {

    private Date fechaInicio;
    private Date fechaFin;

    public FechaIntervalo() {
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
