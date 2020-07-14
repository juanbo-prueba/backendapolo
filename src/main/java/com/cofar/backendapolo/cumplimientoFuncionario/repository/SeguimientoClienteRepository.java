package com.cofar.backendapolo.cumplimientoFuncionario.repository;

import com.cofar.backendapolo.cumplimientoFuncionario.mapper.SeguimientoClienteMapper;
import com.cofar.backendapolo.cumplimientoFuncionario.model.LineaMarketing;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatoTipos;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosTipos2;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.MesValor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository("seguimientoClienteRepository")
public class SeguimientoClienteRepository {

    @Autowired
    private SeguimientoClienteMapper seguimientoClienteMapper;

    public List<Date> obtieneListadoMesesComportamiento(int codCliente, String fechaDesde) {
        return seguimientoClienteMapper.obtieneListadoMesesComportamiento(codCliente, fechaDesde);
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

    public ArrayList<MesValor> obtieneListadoVentasDeClientePorLineaDeVenta(int codCliente, int codLineaVenta, String fechaDesde) {
        return seguimientoClienteMapper.obtieneListadoVentasDeClientePorLineaDeVenta(codCliente, codLineaVenta, fechaDesde );
    }

    public List<Date> obtieneListadoMesesVentasCliente(int codCliente, String fechaDesde) {
        return seguimientoClienteMapper.obtieneListadoMesesVentasCliente(codCliente, fechaDesde);
    }

    public ArrayList<MesValor> obtieneListadoVentasDeClientePorLineaDeMarketing(int codCliente, int codLineaMkt, String fechaDesde) {
        return seguimientoClienteMapper.obtieneListadoVentasDeClientePorLineaDeMarketing(codCliente, codLineaMkt, fechaDesde );
    }

    public ArrayList<LineaMarketing> getLineasDeMarketingPorLineaDeVenta(int codLineaVenta) {
        return seguimientoClienteMapper.getLineasDeMarketingPorLineaDeVenta(codLineaVenta);
    }
}
