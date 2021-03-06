package com.company;

public abstract class Propiedad {
    private String calle;
    private int numero;

    public Propiedad(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public abstract double calcularPrecio();

    protected String getCalle(){
        return this.calle;
    }

}
