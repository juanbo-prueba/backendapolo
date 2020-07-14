package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import java.util.ArrayList;

public class DatosTipos2 {

    private String name;
    private ArrayList<Double> data = new ArrayList<>();

    public DatosTipos2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }
}
