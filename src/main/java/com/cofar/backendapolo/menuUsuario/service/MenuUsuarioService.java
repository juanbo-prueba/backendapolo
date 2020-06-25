package com.cofar.backendapolo.menuUsuario.service;

import com.cofar.backendapolo.menuUsuario.model.MenuLista;

import java.util.List;

public interface MenuUsuarioService {
    public abstract List<MenuLista> crearMenuUsuario( int codPersonal );
}
