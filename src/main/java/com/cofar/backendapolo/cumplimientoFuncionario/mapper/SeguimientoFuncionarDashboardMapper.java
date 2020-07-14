package com.cofar.backendapolo.cumplimientoFuncionario.mapper;

import com.cofar.backendapolo.cumplimientoFuncionario.model.PorcentajeCumplimiento;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.ResumenCumplimientoFuncionarioAnalisis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeguimientoFuncionarDashboardMapper {

    public Integer obtenerPresupuestoFuncionarioActivo(@Param("codEstadoPresupuesto") int codEstadoPresupuesto);
    public PorcentajeCumplimiento obtenerPorcentajeCumplimiento(@Param("codPersonal") int codPersonal, @Param("codPresupuestoActivo") Integer codPresupuestoActivo, @Param("tipoSegumiento") int tipoSegumiento);
}
