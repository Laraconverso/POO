package com.company;

import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        Casa uno = PropiedadFactory.crearCasa("Av. San Martín", 130, 500);
        Casa dos = PropiedadFactory.crearCasa("Mitre", 233, 700);
        Set<Casa> barrioCerrado = new HashSet<>();
        barrioCerrado.add(uno);
        barrioCerrado.add(dos);
        BarrioCerrado barrio = PropiedadFactory.crearBarrioCerrado("Gutierres", 330, 2);
        Municipalidad laMuni = new Municipalidad();
        laMuni.agregarPropiedad(uno);
        laMuni.agregarPropiedad(dos);
        laMuni.agregarPropiedad(barrio);
        laMuni.mostrarPropiedades();
    }
}
