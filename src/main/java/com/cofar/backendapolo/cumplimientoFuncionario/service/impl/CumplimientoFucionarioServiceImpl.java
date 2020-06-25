package com.cofar.backendapolo.cumplimientoFuncionario.service.impl;

import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoClienteFuncionarioResumen;
import com.cofar.backendapolo.cumplimientoFuncionario.model.CumplimientoFuncionarioResumenLinea;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.*;
import com.cofar.backendapolo.cumplimientoFuncionario.repository.CumplimientoFuncionarioRepository;
import com.cofar.backendapolo.cumplimientoFuncionario.service.CumplimientoFucionarioService;

import com.cofar.backendapolo.cumplimientoFuncionario.util.FormatearFecha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cumplimmientoFucionarioService")
public class CumplimientoFucionarioServiceImpl implements CumplimientoFucionarioService {

    @Autowired
    @Qualifier("cumplimientoFuncionarioRepository")
    private CumplimientoFuncionarioRepository cumplimientoFuncionarioRepository;

    @Override
    public CumplimientoFucionarioGeneral getCumplimientoFucionarioGeneral(int codPersonal, int codPresupuesto) {
        return cumplimientoFuncionarioRepository.obtenerCumplimientoFucionarioGeneral( codPersonal, codPresupuesto );
    }

    @Override
    public CumplimientoFucionarioLineaVenta getCumplimientoFucionarioLineaVenta(int codPersonal, int codPresupuesto) {
        return cumplimientoFuncionarioRepository.obtenerCumplimientoFucionarioLineaVenta( codPersonal, codPresupuesto );
    }

    @Override
    public List<CumplimientoFucionarioLineaMkt> getCumplimientoFucionarioLineaMkt(int codPersonal, int codPresupuesto) {
        return cumplimientoFuncionarioRepository.obtenerCumplimientoFucionarioLineaMkt( codPersonal, codPresupuesto );
    }

    @Override
    public List<CumplimientoFucionarioPresentacion> getCumplimientoFucionarioLineaPresentacion(int codPersonal, int codPresupuesto) {
        return cumplimientoFuncionarioRepository.obtenerCumplimientoFucionarioPresentacion( codPersonal, codPresupuesto );
    }

    @Override
    public ResumenCumplimientoFuncionarioAnalisis obtenerSeguimientoMesPersonalPorLineaFuncionario(int codPersonal, int codPresupuestoPersonal) {

        CumplimientoFuncionarioResumenLinea cumplimientoTotal = cumplimientoFuncionarioRepository.getCumplimientoFuncionarioResumenLinea(codPersonal, codPresupuestoPersonal, 0);
        CumplimientoFuncionarioResumenLinea cumplimientoBph = cumplimientoFuncionarioRepository.getCumplimientoFuncionarioResumenLinea(codPersonal, codPresupuestoPersonal, 1);
        CumplimientoFuncionarioResumenLinea  cumplimientoCofar = cumplimientoFuncionarioRepository.getCumplimientoFuncionarioResumenLinea(codPersonal, codPresupuestoPersonal, 2);
        CumplimientoClienteFuncionarioResumen cumplimientoCliente = getCumplimientoClienteFuncionarioResumen(codPersonal, codPresupuestoPersonal);

        ResumenCumplimientoFuncionarioAnalisis c = new ResumenCumplimientoFuncionarioAnalisis();

        if ( cumplimientoTotal != null ) {
            c.setPorcentajeCumplimientoTotal( cumplimientoTotal.getPorcentajeCumplimiento() );
            c.setMontoPresupuestoTotal( cumplimientoTotal.getMontoPresupuesto() );
            c.setMontoVentasTotal( cumplimientoTotal.getMontoVentas() );
        }

        if( cumplimientoBph != null ) {
            c.setPorcentajeCumplimientoBph( cumplimientoBph.getPorcentajeCumplimiento() );
            c.setMontoPresupuestoBph( cumplimientoBph.getMontoPresupuesto() );
            c.setMontoVentasBph( cumplimientoBph.getMontoVentas() );
        }

        if ( cumplimientoCofar != null ) {
            c.setPorcentajeCumplimientoCofar( cumplimientoCofar.getPorcentajeCumplimiento() );
            c.setMontoPresupuestoCofar( cumplimientoCofar.getMontoPresupuesto() );
            c.setMontoVentasCofar( cumplimientoCofar.getMontoVentas() );
        }

        if ( cumplimientoCliente != null ) {
            c.setPorcentajeCumplimientoClientes( cumplimientoCliente.getPorcentajeCumplimiento() );
            c.setTotalClienteFacturados( cumplimientoCliente.getTotalClienteFacturadoFuncionario() );
            c.setTotalClientesFuncionario( cumplimientoCliente.getTotalClientesFuncionario() );
        }


        return c;
    }

    @Override
    public CumplimientoClienteFuncionarioResumen getCumplimientoClienteFuncionarioResumen(int codPersonal, int codPresupuesto) {
        return cumplimientoFuncionarioRepository.getCumplimientoClienteFuncionarioResumen( codPersonal, codPresupuesto);
    }

    @Override
    public FechaActualizacionVentas getFechaActualizacionVentas(int codAreaEmpresa) {
        return cumplimientoFuncionarioRepository.getFechaActualizacionVentas( codAreaEmpresa );
    }

    @Override
    public List<SeguimientoClienteFuncionario> getSeguimientoClienteFuncionario(int codPresupuestoActual,  int codPersonal, int codPresupuestoAnterior) {
        return cumplimientoFuncionarioRepository.getSeguimientoClienteFuncionario( codPresupuestoActual, codPersonal, codPresupuestoAnterior );
    }

    @Override
    public List<SeguimientoClienteFuncionario> getSeguimientoVentasClienteFuncionario(int codPresupuesto, int codPersonal) {

        FormatearFecha formato = new FormatearFecha();
        FechaIntervalo fechaActual = cumplimientoFuncionarioRepository.obtenerFechaInicioFechaFinDePresupuesto( 1 );
        FechaIntervalo fechaComparacion = cumplimientoFuncionarioRepository.obtenerFechaInicioFechaFinDePresupuesto( 2 );

        String fechaInicioActual = formato.formato_yyyy_MM_dd( fechaActual.getFechaInicio() );
        String fechaFinActual = formato.formato_yyyy_MM_dd( fechaActual.getFechaFin() );
        String fechaInicioComparacion = formato.formato_yyyy_MM_dd( fechaComparacion.getFechaInicio() );
        String fechaFinComparacion = formato.formato_yyyy_MM_dd( fechaComparacion.getFechaFin() );

        return cumplimientoFuncionarioRepository.getSeguimientoVentasClienteFuncionario(codPresupuesto, codPersonal, fechaInicioActual, fechaFinActual, fechaInicioComparacion, fechaFinComparacion);
    }

    //Jefe regional
    @Override
    public void obtenerResumenCumplimientoVentasRegional(int codGestion, int codLineaVenta, int codPeiodoVentas, int codMes, int codAreaEmpresa) {

    }


}
