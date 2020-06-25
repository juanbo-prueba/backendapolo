package com.cofar.backendapolo.menuUsuario.model;

public class VentanasZeus {

    private int codVentana;
    private String path;
    private String icon;
    private String title;
    private int codPadre;

    public VentanasZeus() {
    }

    public VentanasZeus(int codVentana, String path, String icon, String title, int codPadre) {
        this.codVentana = codVentana;
        this.path = path;
        this.icon = icon;
        this.title = title;
        this.codPadre = codPadre;
    }

    public int getCodVentana() {
        return codVentana;
    }

    public void setCodVentana(int codVentana) {
        this.codVentana = codVentana;
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

    public int getCodPadre() {
        return codPadre;
    }

    public void setCodPadre(int codPadre) {
        this.codPadre = codPadre;
    }
}
