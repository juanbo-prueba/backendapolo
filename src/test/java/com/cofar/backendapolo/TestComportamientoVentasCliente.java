package com.cofar.backendapolo;

import com.cofar.backendapolo.cumplimientoFuncionario.service.SeguimientoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class TestComportamientoVentasCliente {

    @Autowired
    private SeguimientoClienteService seguimientoClienteService;

    @Test
    public void testCommportamientoClientes(){
        // 140093
        //seguimientoClienteService.obtieneComportamientoDeVentasPorClientePorLineaDeVenta(1622419);
        seguimientoClienteService.obtieneVentasPorMesDeLineasDeMarketingPorLineaDeVentaDeCliente(1622419, 2);
    }


}

