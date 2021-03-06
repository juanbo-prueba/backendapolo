package com.cofar.backendapolo.cumplimientoFuncionario.service.impl;

import com.cofar.backendapolo.cumplimientoFuncionario.mapper.SeguimientoFuncionarDashboardMapper;
import com.cofar.backendapolo.cumplimientoFuncionario.model.MaestroPresupuestoVentas;
import com.cofar.backendapolo.cumplimientoFuncionario.model.PorcentajeCumplimiento;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosGraficoBarras;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosTipos2;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.ResumenCumplimientoFuncionarioAnalisis;
import com.cofar.backendapolo.cumplimientoFuncionario.repository.SeguimientoFuncionarDashboardRepository;
import com.cofar.backendapolo.cumplimientoFuncionario.service.SeguimientoFuncionarioDashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("SeguimientoFuncionarDashboardService")
public class SeguimientoFuncionarDashboardImpl implements SeguimientoFuncionarioDashboardService {

    @Autowired
    @Qualifier("seguimientoFuncionarDashboardRepository")
    private SeguimientoFuncionarDashboardRepository seguimientoFuncionarDashboardRepository;

    @Override
    public ResumenCumplimientoFuncionarioAnalisis obtenerKPIPresupuestoFuncionario( int codPersonal ) {

        int codEstadoPresupuesto = 1;
        int tipoSegumiento = 0;

        Integer codPresupuestoActivo = seguimientoFuncionarDashboardRepository.obtenerPresupuestoFuncionarioActivo(codEstadoPresupuesto);

        PorcentajeCumplimiento cumplimientoTotal = seguimientoFuncionarDashboardRepository.obtenerPorcentajeCumplimiento( codPersonal, codPresupuestoActivo, 0);
        PorcentajeCumplimiento cumplimientoBPH = seguimientoFuncionarDashboardRepository.obtenerPorcentajeCumplimiento( codPersonal, codPresupuestoActivo, 1);
        PorcentajeCumplimiento cumplimientoCofar = seguimientoFuncionarDashboardRepository.obtenerPorcentajeCumplimiento( codPersonal, codPresupuestoActivo, 2);

        ResumenCumplimientoFuncionarioAnalisis cumplimiento = new ResumenCumplimientoFuncionarioAnalisis();

        if ( cumplimientoTotal != null ) {
            cumplimiento.setPorcentajeCumplimientoTotal( cumplimientoTotal.getPorcentajeCumplimiento() );
            cumplimiento.setMontoPresupuestoTotal( cumplimientoTotal.getMontoPresupuesto() );
            cumplimiento.setMontoVentasTotal( cumplimientoTotal.getMontoVentas() );
        }

        if( cumplimientoBPH != null ) {
            cumplimiento.setPorcentajeCumplimientoBph( cumplimientoBPH.getPorcentajeCumplimiento() );
            cumplimiento.setMontoPresupuestoBph( cumplimientoBPH.getMontoPresupuesto() );
            cumplimiento.setMontoVentasBph( cumplimientoBPH.getMontoVentas() );
        }

        if ( cumplimientoCofar != null ) {
            cumplimiento.setPorcentajeCumplimientoCofar( cumplimientoCofar.getPorcentajeCumplimiento() );
            cumplimiento.setMontoPresupuestoCofar( cumplimientoCofar.getMontoPresupuesto() );
            cumplimiento.setMontoVentasCofar( cumplimientoCofar.getMontoVentas() );
        }

        return cumplimiento;
    }

    @Override
    public DatosGraficoBarras obtenerPresupuestoYVentaDeFuncionarioParaGraficoDeBarras(int codPersonal) {

        int codEstadoPresupuesto = 1;

        DatosGraficoBarras lista = new DatosGraficoBarras();
        DatosTipos2 presupuesto = new DatosTipos2();
        DatosTipos2 ventas = new DatosTipos2();

        Integer codPresupuestoActivo = seguimientoFuncionarDashboardRepository.obtenerPresupuestoFuncionarioActivo(codEstadoPresupuesto);
        ArrayList<MaestroPresupuestoVentas> cumplimientoLineaventa = seguimientoFuncionarDashboardRepository.obtenerPresupuestoYVentaDeFuncionarioParaGraficoDeBarras(codPersonal, codPresupuestoActivo);

        for (MaestroPresupuestoVentas dato: cumplimientoLineaventa) {
            lista.getCategories().add( dato.getNombre() );
        }

        presupuesto.setName("Prespuesto");
        for (MaestroPresupuestoVentas dato: cumplimientoLineaventa) {
            presupuesto.getData().add(dato.getMontoPresupuesto());
        }

        ventas.setName("Ventas");
        for (MaestroPresupuestoVentas dato: cumplimientoLineaventa) {
            ventas.getData().add(dato.getMontoVentas());
        }

        lista.getDatos().add(presupuesto);
        lista.getDatos().add(ventas);

        return lista;
    }
}
