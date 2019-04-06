package com.cofar.backendapolo.pruebas.mapper;

import com.cofar.backendapolo.pruebas.model.Cliente;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClienteMapper {

    public List<Cliente> listarClientes();
}
