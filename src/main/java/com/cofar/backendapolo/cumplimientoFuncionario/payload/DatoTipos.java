package com.cofar.backendapolo.cumplimientoFuncionario.payload;

import java.util.ArrayList;

public class DatoTipos {

    private String name = "";
    private ArrayList<Integer> data = new ArrayList<>();

    public DatoTipos() {
    }

    public DatoTipos(ArrayList<Integer> data) {
        this.data = data;
    }

    public DatoTipos(String name, ArrayList<Integer> data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }
}
