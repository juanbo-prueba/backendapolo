package com.cofar.backendapolo.cumplimientoFuncionario.payload;

public class FechaActualizacionVentas {

    private int nroFactura;
    private String fechaActualizacion;
    private String hora;
    private String fechaActualizacionModificada;

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFechaActualizacionModificada() {
        return fechaActualizacionModificada;
    }

    public void setFechaActualizacionModificada(String fechaActualizacionModificada) {
        this.fechaActualizacionModificada = fechaActualizacionModificada;
    }
}
