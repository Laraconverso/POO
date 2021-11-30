package com.company;

public abstract class Producto {
    private double peso;

    public abstract double calcularEspacio();

    public Producto(double peso) {
        this.peso = peso;
    }
}
