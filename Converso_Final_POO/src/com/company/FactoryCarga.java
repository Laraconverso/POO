package com.company;
import java.util.List;

public class FactoryCarga {
    public static CargaSimple crearCargaSimple(String nombre, double peso, String codigo){
            CargaSimple nuevaCarga = null;
            if(codigo.equals("SLW-123") || codigo.equals("FST-456")) {
                nuevaCarga = new CargaSimple(nombre, peso, codigo);
            } else{
                //se puede hacer con exception
                System.out.println("No se puede crear una carga con un codigo incalido.");
            }
            return nuevaCarga;
    }
    public static Contenedor crearContenedor(String nombre, double peso , List<CargaSimple> cargasSimples){
         return new Contenedor(nombre, peso ,cargasSimples);
    }
}
