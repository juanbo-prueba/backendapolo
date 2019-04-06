package com.cofar.backendapolo.pruebas.service.impl;

import com.cofar.backendapolo.pruebas.model.Cliente;
import com.cofar.backendapolo.pruebas.repository.ClienteRepository;
import com.cofar.backendapolo.pruebas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("clienteService")
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    @Qualifier("clienteRepository")
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.listarClientes();
    }
}
