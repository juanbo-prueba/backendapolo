package com.cofar.backendapolo.cumplimientoFuncionario.controller;

import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosGraficoBarras;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.ResumenCumplimientoFuncionarioAnalisis;
import com.cofar.backendapolo.cumplimientoFuncionario.service.SeguimientoFuncionarioDashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboardFuncionario")
public class SegumientoFuncionarioDashboardController {

    @Autowired
    @Qualifier("SeguimientoFuncionarDashboardService")
    private SeguimientoFuncionarioDashboardService seguimientoFuncionarioDashboardService;

    @GetMapping("/kpiFuncionarioCumplimiento/{codPersonal}")
    public ResumenCumplimientoFuncionarioAnalisis obtenerKPIPresupuestoFuncionario(@PathVariable("codPersonal") int codPersonal) {
        return seguimientoFuncionarioDashboardService.obtenerKPIPresupuestoFuncionario( codPersonal );
    }

    @GetMapping("/graficoBarrasLineaDeVentaFuncionario/{codPersonal}")
    public DatosGraficoBarras obtenerDatoGraficoDeBarrasLineasDeVentasFuncionario(@PathVariable("codPersonal") int codPersonal) {
        return seguimientoFuncionarioDashboardService.obtenerPresupuestoYVentaDeFuncionarioParaGraficoDeBarras( codPersonal );
    }


}
