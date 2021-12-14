package com.company;

import java.util.List;

public class Contenedor extends Carga{
    //use list pq pueden haber dos cargas iguales
    private List<CargaSimple> cargasSimples;

    public Contenedor(String nombre,double peso,  List<CargaSimple> cargasSimples) {
        super(nombre, peso);
        this.cargasSimples = cargasSimples;
    }

    @Override
    public double calcularPesoCarga() {
        double pesoFinal = super.getPeso();
        for(CargaSimple cargaSimple: this.cargasSimples){
            pesoFinal += cargaSimple.calcularPesoCarga();
        }
        return pesoFinal;
    }

    @Override
    public String toString() {
        return "Contenedor{ Nombre: " + super.getNombre()+
                " peso = " + this.calcularPesoCarga() +
                '}';
    }
}
