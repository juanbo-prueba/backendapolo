package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import java.util.ArrayList;
import java.util.Date;

public class DatosGraficoLineal {

    private ArrayList<Date> categories = new ArrayList<>();
    private ArrayList<DatosTipos2> datos = new ArrayList<>();

    public DatosGraficoLineal() {
    }

    public ArrayList<Date> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Date> categories) {
        this.categories = categories;
    }

    public ArrayList<DatosTipos2> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<DatosTipos2> datos) {
        this.datos = datos;
    }
}
