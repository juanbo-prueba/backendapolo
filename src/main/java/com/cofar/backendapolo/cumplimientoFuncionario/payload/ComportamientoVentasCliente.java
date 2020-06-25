package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import java.util.ArrayList;
import java.util.Date;

public class ComportamientoVentasCliente {

    private ArrayList<Date> categories = new ArrayList<>();
    private ArrayList<DatoTipos> datos = new ArrayList<>();

    public ComportamientoVentasCliente() {
    }

    public ArrayList<DatoTipos> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<DatoTipos> datos) {
        this.datos = datos;
    }

    public ArrayList<Date> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Date> categories) {
        this.categories = categories;
    }
}
