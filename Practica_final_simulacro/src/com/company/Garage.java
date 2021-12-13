package com.company;

public class Garage extends UnidadFuncional{
    public Garage(String direccion, String nombreDuenio, double mtsTotales, double impuesto) {
        super(direccion, nombreDuenio, mtsTotales, impuesto);
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
