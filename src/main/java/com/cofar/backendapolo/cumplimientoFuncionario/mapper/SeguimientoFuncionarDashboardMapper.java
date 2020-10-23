package com.cofar.backendapolo.cumplimientoFuncionario.mapper;

import com.cofar.backendapolo.cumplimientoFuncionario.model.MaestroPresupuestoVentas;
import com.cofar.backendapolo.cumplimientoFuncionario.model.PorcentajeCumplimiento;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosGraficoBarras;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.ResumenCumplimientoFuncionarioAnalisis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

@Mapper
public interface SeguimientoFuncionarDashboardMapper {

    public Integer obtenerPresupuestoFuncionarioActivo(@Param("codEstadoPresupuesto") int codEstadoPresupuesto);
    public PorcentajeCumplimiento obtenerPorcentajeCumplimiento(@Param("codPersonal") int codPersonal, @Param("codPresupuestoActivo") Integer codPresupuestoActivo, @Param("tipoSegumiento") int tipoSegumiento);

    // Metodos para Dashboard funcionario
    public ArrayList<MaestroPresupuestoVentas> obtenerPresupuestoYVentaDeFuncionarioParaGraficoDeBarras(@Param("codPersonal") int codPersonal, @Param("codPresupuesto") int codPresupuesto);
}
