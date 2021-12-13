package com.company;

public class Departamento extends UnidadFuncional{

    public Departamento(String direccion, String nombreDuenio, double mtsTotales, double impuesto) {
        super(direccion, nombreDuenio, mtsTotales, impuesto);
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
