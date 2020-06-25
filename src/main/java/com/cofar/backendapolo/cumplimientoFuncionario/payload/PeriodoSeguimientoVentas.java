package com.cofar.backendapolo.cumplimientoFuncionario.payload;

public class PeriodoSeguimientoVentas {
    private int codGestion;
    private int codMes;
    private int codPeriodo;

    public int getCodGestion() {
        return codGestion;
    }

    public void setCodGestion(int codGestion) {
        this.codGestion = codGestion;
    }

    public int getCodMes() {
        return codMes;
    }

    public void setCodMes(int codMes) {
        this.codMes = codMes;
    }

    public int getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(int codPeriodo) {
        this.codPeriodo = codPeriodo;
    }
}
