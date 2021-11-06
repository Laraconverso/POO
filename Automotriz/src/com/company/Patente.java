package com.company;

public class Patente {
    String letras;
    int numeros;

    public Patente() {
        letras = generarLetras();
        numeros = generarNuemeros();
    }

    private String generarLetras() {
        //TODO: impementar un metodo de generacion automatica
        return "ABC";
    }

    private int generarNuemeros() {
        return 123;
    }

    @Override
    public String toString() {
        //TODO: impementar un metodo de generacion automatica
        return letras + numeros;
    }
}
