package com.company;
import java.util.HashSet;
import java.util.Set;
public class Municipalidad {
    private Set<Propiedad> propiedades;

    public Municipalidad(){
        this.propiedades = new HashSet<>();
    }

    public void mostrarPropiedades(){
        for(Propiedad propiedad: this.propiedades ){
            System.out.println(propiedad.toString());
        }
    }
}
