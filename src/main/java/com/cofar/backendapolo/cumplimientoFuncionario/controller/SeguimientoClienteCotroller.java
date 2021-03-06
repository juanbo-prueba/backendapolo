package com.cofar.backendapolo.cumplimientoFuncionario.controller;

import com.cofar.backendapolo.cumplimientoFuncionario.payload.ComportamientoVentasCliente;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosGraficoLineal;
import com.cofar.backendapolo.cumplimientoFuncionario.service.SeguimientoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seguimientoCliente")
public class SeguimientoClienteCotroller {

    @Autowired
    @Qualifier("seguimientoClienteService")
    private SeguimientoClienteService seguimientoClienteService;

    @GetMapping("/comportamientoVentasCliente/{codCliente}")
    public ComportamientoVentasCliente getComportamientoDeVentasDeCliente(@PathVariable("codCliente") int codCliente){
        return seguimientoClienteService.obtieneComportamientoDeVentasPorCliente( codCliente );
    }

    @GetMapping("/ventasPorLineaDeVentaDeCliente/{codCliente}")
    public DatosGraficoLineal getComportamientoDeVentasDeClientePorLineaDeventa(@PathVariable("codCliente") int codCliente){
        return seguimientoClienteService.obtieneComportamientoDeVentasPorClientePorLineaDeVenta( codCliente );
    }

    @GetMapping("/ventasPorLineaMktCliente/{codCliente}/lineaVenta/{codLineaVenta}")
    public DatosGraficoLineal getVentasPorMesDeLineaMKtPorLineaDeVentaDeCliente(@PathVariable("codCliente") int codCliente,@PathVariable("codLineaVenta") int codLineaVenta){
        return seguimientoClienteService.obtieneVentasPorMesDeLineasDeMarketingPorLineaDeVentaDeCliente( codCliente, codLineaVenta );
    }


}
