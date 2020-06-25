package com.cofar.backendapolo.presupuestoFuncionario.repository;

import com.cofar.backendapolo.presupuestoFuncionario.mapper.PresupuestoFuncionarioMapper;
import com.cofar.backendapolo.presupuestoFuncionario.model.PresupuestoMes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("presupuestoFuncionarioRepository")
public class PresupuestoFuncionarioRepository {

    @Autowired
    private PresupuestoFuncionarioMapper presupuestoFuncionarioMapper;

    public PresupuestoMes obtenerPresupuestoMes( int codEstadoRegistro ) {
        return presupuestoFuncionarioMapper.obtenerMesPresupuesto( codEstadoRegistro );
    }
}
