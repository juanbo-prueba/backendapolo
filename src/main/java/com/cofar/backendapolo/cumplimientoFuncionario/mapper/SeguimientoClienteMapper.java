package com.cofar.backendapolo.cumplimientoFuncionario.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface SeguimientoClienteMapper {

    // comportamiento de ventas
    public List<Date> obtieneListadoMesesComportamiento(@Param("codCliente") int codCliente);

    public Integer obtieneVentasClienteDelMes(@Param("codCliente") int codCliente, @Param("fechaMes") String fechaMes);

    public Integer obtieneCobranzasClienteDelMes(@Param("codCliente") int codCliente, @Param("fechaMes") String fechaMes);

    public Integer obtieneDescuentoFidelidadClienteDelMes(@Param("codCliente") int codCliente, @Param("fechaMes") String fechaMes);

}
