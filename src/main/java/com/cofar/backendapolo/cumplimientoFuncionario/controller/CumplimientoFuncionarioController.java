package com.cofar.backendapolo.cumplimientoFuncionario.controller;

import com.cofar.backendapolo.cumplimientoFuncionario.payload.*;
import com.cofar.backendapolo.cumplimientoFuncionario.service.CumplimientoFucionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cumplimientoFuncionario")
public class CumplimientoFuncionarioController {

    @Autowired
    @Qualifier("cumplimmientoFucionarioService")
    private CumplimientoFucionarioService cumplimientoFucionarioService;

    @GetMapping("/presupuesto/general/{codPersonal}")
    public CumplimientoFucionarioGeneral getCumplimientoFucionarioGeneral(@PathVariable("codPersonal") int codPersonal){
        return cumplimientoFucionarioService.getCumplimientoFucionarioGeneral(codPersonal, 64);
    }

    @GetMapping("/presupuesto/lineaVenta/{codPersonal}")
    public CumplimientoFucionarioLineaVenta getCumplimientoFucionarioLineaVenta(@PathVariable("codPersonal") int codPersonal){
          return cumplimientoFucionarioService.getCumplimientoFucionarioLineaVenta(codPersonal, 64);
    }

    //Anterior para pruebas se esta reemplazando con getCumplimientoLineasDeFuncionario
    @GetMapping("/presupuesto/lineaMkt/{codPersonal}")
    public List<CumplimientoFucionarioLineaMkt> getCumplimientoFucionarioLineaMkt(@PathVariable("codPersonal") int codPersonal ){
        return cumplimientoFucionarioService.getCumplimientoFucionarioLineaMkt( codPersonal, 64 );
    }

    @GetMapping("/presupuestoVentas/{codPresupuesto}/funcionario/{codPersonal}")
    public List<CumplimientoFucionarioLineaMkt> getCumplimientoLineasDeFuncionario(@PathVariable("codPresupuesto") int codPresupuesto, @PathVariable("codPersonal") int codPersonal ){
        return cumplimientoFucionarioService.getCumplimientoFucionarioLineaMkt( codPersonal, codPresupuesto );
    }

    //Se esta reemplazonado con getCumplimientoPresentacionesFuncionario
    @GetMapping("/presupuesto/presentacion/{codPersonal}")
    public List<CumplimientoFucionarioPresentacion> getCumplimientoFucionarioPresentacion(@PathVariable("codPersonal") int codPersonal ){
        return cumplimientoFucionarioService.getCumplimientoFucionarioLineaPresentacion( codPersonal, 64 );
    }

    @GetMapping("/presupuestoVentasPresentacion/{codPresupuesto}/funcionario/{codPersonal}")
    public List<CumplimientoFucionarioPresentacion> getCumplimientoPresentacionesFuncionario(@PathVariable("codPresupuesto") int codPresupuesto, @PathVariable("codPersonal") int codPersonal){
        return cumplimientoFucionarioService.getCumplimientoFucionarioLineaPresentacion( codPersonal, codPresupuesto );
    }

    //
    @GetMapping("/presupuestoSeguimientoResumenLineas/{codPresupuesto}/personal/{codPersonal}")
    public ResumenCumplimientoFuncionarioAnalisis getSeguimientoMesPersonalResumenAnalisis(@PathVariable("codPresupuesto") int codPresupuesto, @PathVariable("codPersonal") int codPersonal ){
        return cumplimientoFucionarioService.obtenerSeguimientoMesPersonalPorLineaFuncionario( codPersonal, codPresupuesto );
    }

    @GetMapping("/fechaActualizacionVentas/{codAreaEmpresa}")
    public FechaActualizacionVentas obtenerFechaDeActualizaciondeVentas(@PathVariable("codAreaEmpresa") int codAreaEmpresa ) {
        return cumplimientoFucionarioService.getFechaActualizacionVentas( codAreaEmpresa );
    }

    @GetMapping("/presupuestoClientesFuncionario/{codPresupuesto}/funcionario/{codPersonal}")
    public List<SeguimientoClienteFuncionario> obtenerSegumientoClientesDeFuncionario(@PathVariable("codPresupuesto") int codPresupuesto, @PathVariable("codPersonal") int codPersonal){
       // return cumplimientoFucionarioService.getSeguimientoClienteFuncionario( codPresupuesto, codPersonal, codPresupuesto - 1 );
        return cumplimientoFucionarioService.getSeguimientoVentasClienteFuncionario( codPresupuesto, codPersonal );
    }

}
