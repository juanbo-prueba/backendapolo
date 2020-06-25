package com.cofar.backendapolo.presupuestoFuncionario.service.impl;

import com.cofar.backendapolo.presupuestoFuncionario.model.PresupuestoMes;
import com.cofar.backendapolo.presupuestoFuncionario.repository.PresupuestoFuncionarioRepository;
import com.cofar.backendapolo.presupuestoFuncionario.service.PresupuestoFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("presupuestoFuncionarioService")
public class PresupuestoFuncionarioServiceImpl implements PresupuestoFuncionarioService {

    @Autowired
    @Qualifier("presupuestoFuncionarioRepository")
    private PresupuestoFuncionarioRepository presupuestoFuncionarioRepository;

    @Override
    public PresupuestoMes obtenerPresupuestoMes(int estadoRegistro) {
        return presupuestoFuncionarioRepository.obtenerPresupuestoMes( estadoRegistro );
    }
}
