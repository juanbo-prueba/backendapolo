package com.cofar.backendapolo;

import com.cofar.backendapolo.cumplimientoFuncionario.service.SeguimientoFuncionarioDashboardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDashboardFuncionario {

    @Autowired
    private SeguimientoFuncionarioDashboardService seguimientoFuncionarioDashboardService;

    @Test
    public void testSegumientoDashboard(){
        seguimientoFuncionarioDashboardService.obtenerKPIPresupuestoFuncionario(1817);
    }
}
