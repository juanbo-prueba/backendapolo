package com.cofar.backendapolo.menuUsuario.repository;

import com.cofar.backendapolo.menuUsuario.mapper.MenuUsuarioMapper;
import com.cofar.backendapolo.menuUsuario.model.VentanasZeus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("menuUsuarioRepository")
public class MenuUsuarioRepository {

    @Autowired
    private MenuUsuarioMapper menuUsuarioMapper;

    public List<VentanasZeus> listaVentanaZeus(int codPersonal ) {
        return menuUsuarioMapper.obtieneListaMenu( codPersonal );
    }
}
