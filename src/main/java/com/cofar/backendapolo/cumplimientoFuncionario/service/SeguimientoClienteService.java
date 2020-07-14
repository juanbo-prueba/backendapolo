package com.cofar.backendapolo.cumplimientoFuncionario.service;


import com.cofar.backendapolo.cumplimientoFuncionario.payload.ComportamientoVentasCliente;
import com.cofar.backendapolo.cumplimientoFuncionario.payload.DatosGraficoLineal;

public interface SeguimientoClienteService {

    public abstract ComportamientoVentasCliente obtieneComportamientoDeVentasPorCliente(int codCliente);

    public abstract DatosGraficoLineal obtieneComportamientoDeVentasPorClientePorLineaDeVenta(int codCliente);

    public abstract DatosGraficoLineal obtieneVentasPorMesDeLineasDeMarketingPorLineaDeVentaDeCliente(int codCliente, int codLineaVenta);
}
