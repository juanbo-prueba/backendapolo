package com.cofar.backendapolo.menuUsuario.service.impl;

import com.cofar.backendapolo.menuUsuario.model.*;
import com.cofar.backendapolo.menuUsuario.repository.MenuUsuarioRepository;
import com.cofar.backendapolo.menuUsuario.service.MenuUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("menuUsuarioService")
public class MenuUsuarioServiceImpl implements MenuUsuarioService {

    @Autowired
    @Qualifier("menuUsuarioRepository")
    private MenuUsuarioRepository menuUsuarioRepository;

    @Override
    public List<MenuLista> crearMenuUsuario(int codPersonal) {
        List<VentanasZeus> menuLista = menuUsuarioRepository.listaVentanaZeus(codPersonal);
        List<MenuLista> menuListas = generarMenuUsuario(menuLista);
        return menuListas;
    }

     public List<MenuLista> generarMenuUsuario(List<VentanasZeus> secObjetos){
        List<MenuLista> menuList = new ArrayList<MenuLista>();
        for (VentanasZeus sObj: secObjetos)
        {
            //0 indica que se trata de un nodo padre
            if (sObj.getCodPadre() == 0)
            {
                menuList.add(new MenuLista(sObj.getPath(), sObj.getIcon(), sObj.getTitle(), generarSubMenu(secObjetos, sObj)));
            }
        }
        return menuList;
    }

    public List<MenuLista> generarSubMenu(List<VentanasZeus> secObjetos, VentanasZeus sObj)
    {
        List<MenuLista> menuList = new ArrayList<MenuLista>();
        for (VentanasZeus objeto : secObjetos)
        {
            //la igualdad indica que objeto es hijo de sObj
            if (objeto.getCodPadre() == sObj.getCodVentana())
            {
               menuList.add(new MenuLista(objeto.getPath(), objeto.getIcon(), objeto.getTitle(), generarSubMenu(secObjetos, objeto)));
            }
        }
        return menuList;
    }

    /*public List<MenuList> GenerarSubMenu(List<SecObjeto> secObjetos, SecObjeto sObj)
    {
        List<MenuList> menuList = new ArrayList<MenuList>();
        for (SecObjeto objeto : secObjetos)
        {
            //la igualdad indica que objeto es hijo de sObj
            if (objeto.getIdPadre() == sObj.getIdObjeto())
            {
                String urlAction = objeto.getController() + "/" + objeto.getAction();
                menuList.add(new MenuList(urlAction, objeto.getNombreModulo(), GenerarSubMenu(secObjetos, objeto)));
            }
        }
        return menuList;
    }*/


}
