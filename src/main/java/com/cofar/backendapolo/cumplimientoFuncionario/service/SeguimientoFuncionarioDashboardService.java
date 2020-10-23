package com.cofar.backendapolo.cumplimientoFuncionario.service;

import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosGraficoBarras;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.ResumenCumplimientoFuncionarioAnalisis;

public interface SeguimientoFuncionarioDashboardService {
    public abstract ResumenCumplimientoFuncionarioAnalisis obtenerKPIPresupuestoFuncionario(int codPersonal);

    // metodos para el dashboard por funcionario
    public abstract DatosGraficoBarras obtenerPresupuestoYVentaDeFuncionarioParaGraficoDeBarras(int codPersonal );
}
