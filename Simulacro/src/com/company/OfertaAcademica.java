package com.company;

public abstract class OfertaAcademica {
    private String nombre;
    private String descripcion;

    public OfertaAcademica(String nombre, String precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();

    protected  String getNombre(){
        return this.nombre;
    }
}
