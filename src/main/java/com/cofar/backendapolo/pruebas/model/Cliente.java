package com.cofar.backendapolo.pruebas.model;

public class Cliente {

    private int codCliente;
    private String nombreCliente;

    public Cliente() {
    }

    public Cliente(int codCliente, String nombreCliente) {
        this.codCliente = codCliente;
        this.nombreCliente = nombreCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}
