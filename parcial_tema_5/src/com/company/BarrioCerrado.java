package com.company;

public class BarrioCerrado extends Propiedad{
    private int factorMultiplicador;
    private double impuestoToTal;

    public BarrioCerrado(String calle, int numero, int factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        this.impuestoToTal = impuestoToTal;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }

    @Override
    public String toString() {
        return "BarrioCerrado{Calle: " + this.getCalle() +
                "factorMultiplicador=" + factorMultiplicador +
                "impuestos= " + this.impuestoToTal +
                '}';
    }
}
