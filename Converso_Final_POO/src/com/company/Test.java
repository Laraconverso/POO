package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CargaSimple tv = FactoryCarga.crearCargaSimple("TV 32’ LCD ", 3, "SLW-123");
        CargaSimple medicamentos = FactoryCarga.crearCargaSimple("caja de medicamentos ", 2, "FST-456");
        List<CargaSimple> cargasEnContenedor = new ArrayList<>();
        cargasEnContenedor.add(tv);
        cargasEnContenedor.add(medicamentos);
        Contenedor contenedor = FactoryCarga.crearContenedor("Contenedor", 100, cargasEnContenedor);
        Barco dh = new Barco();
        dh.agregarCargas(tv);
        dh.agregarCargas(medicamentos);
        dh.agregarCargas(contenedor);
        dh.mostrarCargas();
    }
}