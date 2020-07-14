package com.cofar.backendapolo.cumplimientoFuncionario.mapper;

import com.cofar.backendapolo.cumplimientoFuncionario.model.LineaMarketing;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatoTipos;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosTipos2;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.MesValor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Mapper
public interface SeguimientoClienteMapper {

    // comportamiento de ventas
    public List<Date> obtieneListadoMesesComportamiento(@Param("codCliente") int codCliente, @Param("fechaDesde") String fechaDesde);

    public Integer obtieneVentasClienteDelMes(@Param("codCliente") int codCliente, @Param("fechaMes") String fechaMes);

    public Integer obtieneCobranzasClienteDelMes(@Param("codCliente") int codCliente, @Param("fechaMes") String fechaMes);

    public Integer obtieneDescuentoFidelidadClienteDelMes(@Param("codCliente") int codCliente, @Param("fechaMes") String fechaMes);

    public ArrayList<MesValor> obtieneListadoVentasDeClientePorLineaDeVenta(@Param("codCliente") int codCliente, @Param("codLineaVenta") int codLineaVenta, @Param("fechaDesde") String fechaDesde);

    public List<Date> obtieneListadoMesesVentasCliente(@Param("codCliente") int codCliente, @Param("fechaDesde") String fechaDesde);

    public ArrayList<MesValor> obtieneListadoVentasDeClientePorLineaDeMarketing(@Param("codCliente") int codCliente, @Param("codLineaMkt") int codLineaMkt, @Param("fechaDesde") String fechaDesde);

    public ArrayList<LineaMarketing> getLineasDeMarketingPorLineaDeVenta(@Param("codLineaVenta") int codLineaVenta);
}
