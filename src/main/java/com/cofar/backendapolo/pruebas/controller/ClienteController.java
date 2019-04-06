package com.cofar.backendapolo.pruebas.controller;

import com.cofar.backendapolo.pruebas.model.Cliente;
import com.cofar.backendapolo.pruebas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    @Qualifier("clienteService")
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> clientes() {
        return clienteService.getClientes();
    }

}
