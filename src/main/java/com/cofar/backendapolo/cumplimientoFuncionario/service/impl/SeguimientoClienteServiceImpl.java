package com.cofar.backendapolo.cumplimientoFuncionario.service.impl;

import com.cofar.backendapolo.cumplimientoFuncionario.payload.ComportamientoVentasCliente;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatoTipos;
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
        List<Date> fechas = seguimientoClienteRepository.obtieneListadoMesesComportamiento(codCliente);
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
}
