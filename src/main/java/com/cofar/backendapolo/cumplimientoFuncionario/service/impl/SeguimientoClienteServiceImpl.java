package com.cofar.backendapolo.cumplimientoFuncionario.service.impl;

import com.cofar.backendapolo.cumplimientoFuncionario.model.LineaMarketing;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.*;
import com.cofar.backendapolo.cumplimientoFuncionario.repository.SeguimientoClienteRepository;
import com.cofar.backendapolo.cumplimientoFuncionario.service.SeguimientoClienteService;
import com.cofar.backendapolo.cumplimientoFuncionario.util.FormatearFecha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("seguimientoClienteService")
public class SeguimientoClienteServiceImpl implements SeguimientoClienteService {

    @Autowired
    @Qualifier("seguimientoClienteRepository")
    private SeguimientoClienteRepository seguimientoClienteRepository;

    @Override
    public ComportamientoVentasCliente obtieneComportamientoDeVentasPorCliente(int codCliente) {
        FormatearFecha formatear = new FormatearFecha();

        // int codCliente = 1622419;
        List<Date> fechas = seguimientoClienteRepository.obtieneListadoMesesComportamiento(codCliente, "2018-12-31 23:59:59");
        ComportamientoVentasCliente lista = new ComportamientoVentasCliente();

        ArrayList<Date> categories = new ArrayList<>();

        DatoTipos ventas = new DatoTipos();
        ventas.setName("Ventas");

        DatoTipos cobranzas = new DatoTipos();
        cobranzas.setName("Cobranzas");

        DatoTipos fidelidades = new DatoTipos();
        fidelidades.setName("Descuento fidelidad");

        for (Date fecha: fechas ) {
            String fechaMes = formatear.formato_yyyy_MM_dd( fecha );

            Integer montoVenta = seguimientoClienteRepository.obtieneVentasClienteDelMes(codCliente, fechaMes);
            Integer montoCobranza = seguimientoClienteRepository.obtieneCobranzasClienteDelMes(codCliente, fechaMes);
            Integer montoFidelidad = seguimientoClienteRepository.obtieneDescuentoFidelidadClienteDelMes(codCliente, fechaMes);

            Integer datoVenta = null;
            Integer datoCobranza = null;
            Integer datoFidelidad = null;

            if ( montoVenta != null ) datoVenta = montoVenta;
            if ( montoCobranza != null ) datoCobranza = montoCobranza;
            if ( montoFidelidad != null ) datoFidelidad = montoFidelidad;

            categories.add(fecha);
            ventas.getData().add(datoVenta);
            cobranzas.getData().add(datoCobranza);
            fidelidades.getData().add(datoFidelidad);
        }

        lista.setCategories(categories);
        lista.getDatos().add(ventas);
        lista.getDatos().add(cobranzas);
        lista.getDatos().add(fidelidades);

        return lista;
    }

    @Override
    public DatosGraficoLineal obtieneComportamientoDeVentasPorClientePorLineaDeVenta(int codCliente) {
        FormatearFecha formatear = new FormatearFecha();

        String fechaDesde = "2018-12-31 23:59:59";
        DatosGraficoLineal lista = new DatosGraficoLineal();

        int codLineaVenta = 1;

        List<Date> fechas = seguimientoClienteRepository.obtieneListadoMesesVentasCliente(codCliente, fechaDesde);
        ArrayList<MesValor> listaVentasBph = seguimientoClienteRepository.obtieneListadoVentasDeClientePorLineaDeVenta(codCliente, 1, fechaDesde);
        ArrayList<MesValor> listaVentasCofar = seguimientoClienteRepository.obtieneListadoVentasDeClientePorLineaDeVenta(codCliente, 2, fechaDesde);

        DatosTipos2 ventasBph = new DatosTipos2();
        ventasBph.setName("BRESKOT PHARMA");

        DatosTipos2 ventasCofar = new DatosTipos2();
        ventasCofar.setName("COFAR");

        for (MesValor dato: listaVentasBph) {
            ventasBph.getData().add(dato.getValor());
        }

        for (MesValor dato: listaVentasCofar) {
            ventasCofar.getData().add(dato.getValor());
        }

        lista.setCategories(new ArrayList<>(fechas));
        lista.getDatos().add(ventasBph);
        lista.getDatos().add(ventasCofar);

        return lista;
    }

    @Override
    public DatosGraficoLineal obtieneVentasPorMesDeLineasDeMarketingPorLineaDeVentaDeCliente(int codCliente, int codLineaVenta) {
        String fechaDesde = "2018-12-31 23:59:59";
        DatosGraficoLineal lista = new DatosGraficoLineal();

        List<Date> fechas = seguimientoClienteRepository.obtieneListadoMesesVentasCliente(codCliente, fechaDesde);

        ArrayList<LineaMarketing> listaLineasDeMarketing = seguimientoClienteRepository.getLineasDeMarketingPorLineaDeVenta(codLineaVenta);

        for (LineaMarketing linea: listaLineasDeMarketing) {
            DatosTipos2 ventasLineaMkt = new DatosTipos2();

            ventasLineaMkt.setName(linea.getNombreLineaMarketing());
            ArrayList<MesValor> venta = seguimientoClienteRepository.obtieneListadoVentasDeClientePorLineaDeMarketing(codCliente, linea.getCodLineaMarketing(), fechaDesde);
            for (MesValor monto: venta  ) {
                ventasLineaMkt.getData().add(monto.getValor());
            }
            lista.getDatos().add(ventasLineaMkt);
        }

        lista.setCategories(new ArrayList<>(fechas));
        return lista;
    }
}
