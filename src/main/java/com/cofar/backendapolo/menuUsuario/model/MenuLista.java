package com.cofar.backendapolo.menuUsuario.model;

import java.util.List;

public class MenuLista {
    private String path;
    private String icon;
    private String title;
    private List<MenuLista> children;

    public MenuLista() {
    }

    public MenuLista(String path, String icon, String title, List<MenuLista> children) {
        this.path = path;
        this.icon = icon;
        this.title = title;
        this.children = children;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MenuLista> getChildren() {
        return children;
    }

    public void setChildren(List<MenuLista> children) {
        this.children = children;
    }
}
