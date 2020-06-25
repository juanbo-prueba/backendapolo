package com.cofar.backendapolo.cumplimientoFuncionario.repository;

import com.cofar.backendapolo.cumplimientoFuncionario.mapper.CumplimientoFuncionarioMapper;
import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoClienteFuncionarioResumen;
import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoFuncionarioResumenLinea;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cumplimientoFuncionarioRepository")
public class CumplimientoFuncionarioRepository {

    @Autowired
    private CumplimientoFuncionarioMapper cumplimientoFuncionarioMapper;

    public CumplimientoFucionarioGeneral obtenerCumplimientoFucionarioGeneral( int codPersonal, int codPresupuesto ) {
        CumplimientoFucionarioGeneral cumplimientoFucionarioGeneral = cumplimientoFuncionarioMapper.obtenerCumplimientoFucionarioGeneral(codPersonal, codPresupuesto);
        return cumplimientoFucionarioGeneral;
    }

    public CumplimientoFucionarioLineaVenta obtenerCumplimientoFucionarioLineaVenta( int codPersonal, int codPresupuesto ) {
        return cumplimientoFuncionarioMapper.obtenerCumplimientoFucionarioLineaventa( codPersonal, codPresupuesto );
    }

    public List<CumplimientoFucionarioLineaMkt> obtenerCumplimientoFucionarioLineaMkt( int codPersonal, int codPresupuesto ) {
        return cumplimientoFuncionarioMapper.obtenerCumplimientoFucionarioLineaMkt( codPersonal, codPresupuesto );
    }

    public List<CumplimientoFucionarioPresentacion> obtenerCumplimientoFucionarioPresentacion(int codPersonal, int codPresupuesto ) {
        return cumplimientoFuncionarioMapper.obtenerCumplimientoFucionarioPresentacion( codPersonal,  codPresupuesto );
    }

    //
    public CumplimientoFuncionarioResumenLinea getCumplimientoFuncionarioResumenLinea(int codPersonal, int codPresupuestoPersonal, int codLineaventa) {
        return cumplimientoFuncionarioMapper.getCumplimientoFuncionarioResumenLinea( codPersonal, codPresupuestoPersonal, codLineaventa);
    }

    public CumplimientoClienteFuncionarioResumen getCumplimientoClienteFuncionarioResumen(int codPersonal, int codPresupuesto){
        return cumplimientoFuncionarioMapper.getCumplimientoClienteFuncionarioResumen( codPersonal, codPresupuesto );
    }

    public FechaActualizacionVentas getFechaActualizacionVentas( int codAreaEmpresa ) {
        return cumplimientoFuncionarioMapper.getFechaActualizacionVentas( codAreaEmpresa );
    }

    public List<SeguimientoClienteFuncionario> getSeguimientoClienteFuncionario( int codPresupuestoActual, int codPersonal, int codPresupuestoAnterior){
        return cumplimientoFuncionarioMapper.getSeguimientoClienteFuncionario(codPresupuestoActual, codPersonal, codPresupuestoAnterior );
    }

    public List<SeguimientoClienteFuncionario> getSeguimientoVentasClienteFuncionario( int codPresupuestoActual,
                                                                                       int codPersonal,
                                                                                       String fechaInicioActual,
                                                                                       String fechaFinActual,
                                                                                       String fechaInicioComparacion,
                                                                                       String fechaFinComparacion){
        return cumplimientoFuncionarioMapper.getSeguimientoVentasClienteFuncionario(codPresupuestoActual, codPersonal, fechaInicioActual, fechaFinActual, fechaInicioComparacion, fechaFinComparacion);
    }

    //
    public double getObtenerPresupuestoVentasDeRegional(int codGestion,int codLineaVenta,int codPeiodoVentas,int codMes,int codAreaEmpresa) {
        return cumplimientoFuncionarioMapper.getObtenerPresupuestoVentasDeRegional(codGestion, codLineaVenta, codPeiodoVentas, codMes, codAreaEmpresa);
    }

    public FechaIntervalo obtenerFechaInicioFechaFinDePresupuesto(int estadoRegistro) {
       return cumplimientoFuncionarioMapper.obtenerFechaInicioFechaFinDePresupuesto(estadoRegistro);
    }
}
