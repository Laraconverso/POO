package com.company;

public abstract class Carga {
    private String nombre;
    private double peso;

    public Carga(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public abstract double calcularPesoCarga();

    public String getNombre() {
        return this.nombre;
    }

    public double getPeso() {
        return this.peso;
    }
}
