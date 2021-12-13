package com.company;

import java.util.HashSet;
import java.util.Set;

public class Instituto {
    private Set<OfertaAcademica> ofertasAcademicas;

    public Instituto(Set<OfertaAcademica> ofertasAcademicas) {
        this.ofertasAcademicas = new HashSet<>();
    }

    public void generarInforme(){
        for(OfertaAcademica oferta: this.ofertasAcademicas){
            System.out.println(oferta.toString());
        }
    }
}
