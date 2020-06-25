package com.cofar.backendapolo.presupuestoFuncionario.mapper;

import com.cofar.backendapolo.presupuestoFuncionario.model.PresupuestoMes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PresupuestoFuncionarioMapper {
    public PresupuestoMes obtenerMesPresupuesto( @Param("codEstadoregistro") int codEstadoregistro );
}
