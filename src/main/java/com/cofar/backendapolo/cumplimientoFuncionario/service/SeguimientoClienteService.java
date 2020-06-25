package com.cofar.backendapolo.cumplimientoFuncionario.service;


import com.cofar.backendapolo.cumplimientoFuncionario.payload.ComportamientoVentasCliente;

public interface SeguimientoClienteService {

    public abstract ComportamientoVentasCliente obtieneComportamientoDeVentasPorCliente(int codCliente);
}
