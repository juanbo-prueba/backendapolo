package com.cofar.backendapolo.tareasProgramadas.service.impl;

import com.cofar.backendapolo.tareasProgramadas.service.CalculoPresupuestoVentasFuncionario;

import java.util.HashMap;

public class CalculoPresupuestoVentasFuncionarioImpl implements CalculoPresupuestoVentasFuncionario {
    @Override
    public void calculoCumplimientoMes() {

        String fechaInicio = "2018-09-01";
        String fechaFin = "2019-09-30 23:59:59";
        int codPresupuesto = 56;
        HashMap<Integer, String> listaMapRegionales = new HashMap<Integer, String>();
        listaMapRegionales.put(46, "Regional de La Paz");



    }
}
