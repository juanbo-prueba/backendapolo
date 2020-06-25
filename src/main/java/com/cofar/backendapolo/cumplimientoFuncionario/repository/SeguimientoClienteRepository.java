package com.cofar.backendapolo.cumplimientoFuncionario.repository;

import com.cofar.backendapolo.cumplimientoFuncionario.mapper.SeguimientoClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("seguimientoClienteRepository")
public class SeguimientoClienteRepository {

    @Autowired
    private SeguimientoClienteMapper seguimientoClienteMapper;

    public List<Date> obtieneListadoMesesComportamiento(int codCliente) {
        return seguimientoClienteMapper.obtieneListadoMesesComportamiento(codCliente);
    }

    public Integer obtieneVentasClienteDelMes(int codCliente, String fechaMes) {
        return seguimientoClienteMapper.obtieneVentasClienteDelMes( codCliente, fechaMes );
    }

    public Integer obtieneCobranzasClienteDelMes(int codCliente, String fechaMes) {
        return seguimientoClienteMapper.obtieneCobranzasClienteDelMes( codCliente, fechaMes );
    }

    public Integer obtieneDescuentoFidelidadClienteDelMes(int codCliente, String fechaMes) {
        return seguimientoClienteMapper.obtieneDescuentoFidelidadClienteDelMes( codCliente, fechaMes );
    }
}
