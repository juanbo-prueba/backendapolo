package com.cofar.backendapolo.cumplimientoFuncionario.repository;

import com.cofar.backendapolo.cumplimientoFuncionario.mapper.SeguimientoFuncionarDashboardMapper;
import com.cofar.backendapolo.cumplimientoFuncionario.model.MaestroPresupuestoVentas;
import com.cofar.backendapolo.cumplimientoFuncionario.model.PorcentajeCumplimiento;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosGraficoBarras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("seguimientoFuncionarDashboardRepository")
public class SeguimientoFuncionarDashboardRepository {

    @Autowired
    private SeguimientoFuncionarDashboardMapper seguimientoFuncionarDashboardMapper;

    public Integer obtenerPresupuestoFuncionarioActivo(int codEstadoPresupuesto) {
        return seguimientoFuncionarDashboardMapper.obtenerPresupuestoFuncionarioActivo(codEstadoPresupuesto);
    }

    public PorcentajeCumplimiento obtenerPorcentajeCumplimiento(int codPersonal, Integer codPresupuestoActivo, int tipoSegumiento) {
        return seguimientoFuncionarDashboardMapper.obtenerPorcentajeCumplimiento( codPersonal, codPresupuestoActivo, tipoSegumiento );
    }

    public ArrayList<MaestroPresupuestoVentas> obtenerPresupuestoYVentaDeFuncionarioParaGraficoDeBarras(int codPersonal, int codPresupuesto) {
        return seguimientoFuncionarDashboardMapper.obtenerPresupuestoYVentaDeFuncionarioParaGraficoDeBarras(codPersonal, codPresupuesto);
    }
}
