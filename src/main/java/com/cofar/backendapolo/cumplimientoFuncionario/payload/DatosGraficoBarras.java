package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import java.util.ArrayList;

public class DatosGraficoBarras {

    private ArrayList<String> categories = new ArrayList<>();
    private ArrayList<DatosTipos2> datos = new ArrayList<>();

    public DatosGraficoBarras() {
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public ArrayList<DatosTipos2> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<DatosTipos2> datos) {
        this.datos = datos;
    }
}
