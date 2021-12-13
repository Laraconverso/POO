package com.company;

public class Local extends UnidadFuncional{

    public Local(String direccion, String nombreDuenio, double mtsTotales, double impuesto) {
        super(direccion, nombreDuenio, mtsTotales, impuesto);
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
