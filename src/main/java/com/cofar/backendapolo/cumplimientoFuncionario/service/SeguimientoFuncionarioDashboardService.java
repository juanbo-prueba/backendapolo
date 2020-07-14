package com.cofar.backendapolo.cumplimientoFuncionario.service;

import com.cofar.backendapolo.cumplimientoFuncionario.payload.ResumenCumplimientoFuncionarioAnalisis;

public interface SeguimientoFuncionarioDashboardService {
    public abstract ResumenCumplimientoFuncionarioAnalisis obtenerKPIPresupuestoFuncionario(int codPersonal);
}
