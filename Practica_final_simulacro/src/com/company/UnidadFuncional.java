package com.company;

public abstract class UnidadFuncional {
    private String direccion;
    private String nombreDuenio;
    private double mtsTotales;
    private double impuesto;

    public UnidadFuncional(String direccion, String nombreDuenio, double mtsTotales, double impuesto) {
        direccion = this.direccion;
        nombreDuenio = this.direccion;
        mtsTotales = this.mtsTotales;
        impuesto = this.impuesto;

    }

    public abstract double calcularPrecio();

    protected double getMtsTotales(){
        return mtsTotales;
    }

    protected double getImpuesto(){
        return this.impuesto;
    }

    @Override
    public String toString() {
        return "UnidadFuncional{Duenio:" + this.nombreDuenio + "; Tipo: "+this.getClass().getSimpleName() + "; Precio: "+ this.calcularPrecio() + " }";
    }
}
