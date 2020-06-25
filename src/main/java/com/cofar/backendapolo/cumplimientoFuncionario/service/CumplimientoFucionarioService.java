package com.cofar.backendapolo.cumplimientoFuncionario.service;

import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoClienteFuncionarioResumen;
import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoFuncionarioResumenLinea;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.*;

import java.util.List;

public interface CumplimientoFucionarioService {
    public abstract CumplimientoFucionarioGeneral getCumplimientoFucionarioGeneral(int codPersonal, int codPresupuesto );
    public abstract CumplimientoFucionarioLineaVenta getCumplimientoFucionarioLineaVenta( int codPersonal, int codPresupuesto );
    public abstract List<CumplimientoFucionarioLineaMkt> getCumplimientoFucionarioLineaMkt(int codPersonal, int codPresupuesto );
    public abstract List<CumplimientoFucionarioPresentacion> getCumplimientoFucionarioLineaPresentacion(int codPersonal, int codPresupuesto );
    //
    public abstract ResumenCumplimientoFuncionarioAnalisis obtenerSeguimientoMesPersonalPorLineaFuncionario(int codPersonal, int codPresupuestoPersonal);
    public abstract CumplimientoClienteFuncionarioResumen getCumplimientoClienteFuncionarioResumen(int codPersonal, int codPresupuesto);
    public abstract FechaActualizacionVentas getFechaActualizacionVentas( int codAreaEmpresa );
    public abstract List<SeguimientoClienteFuncionario> getSeguimientoClienteFuncionario( int codPresupuestoActual, int codPersonal, int codPresupuestoAnterior);
    public abstract List<SeguimientoClienteFuncionario> getSeguimientoVentasClienteFuncionario( int codPresupuesto, int codPersonal );
    // jefe regional
    public abstract void obtenerResumenCumplimientoVentasRegional(int codGestion,int codLineaVenta,int codPeiodoVentas,int codMes,int codAreaEmpresa);
}
