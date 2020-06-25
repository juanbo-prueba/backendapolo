package com.cofar.backendapolo.pruebas.repository;

import com.cofar.backendapolo.pruebas.mapper.ClienteMapper;
import com.cofar.backendapolo.pruebas.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("clienteRepository")
public class ClienteRepository {

    @Autowired
    private ClienteMapper clienteMapper;

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteMapper.listarClientes();
        System.out.println("**Clientes: " + clientes );

        return clientes;
    }
}
