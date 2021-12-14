package com.company;

public class PropiedadFactory {
    public static Casa crearCasa(String calle, int numero, double impuestoBase){
        return new Casa(calle, numero, impuestoBase);
    }

    public static BarrioCerrado crearBarrioCerrado(String calle, int numero, int factorMultimplicador){
        return new BarrioCerrado(calle, numero, factorMultimplicador);
    }

}
