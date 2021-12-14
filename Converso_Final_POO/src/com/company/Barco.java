package com.company;
import java.util.*;

public class Barco {
    private List<Carga> cargas;

    public Barco() {
        this.cargas = new ArrayList<>();
    }

    public void mostrarCargas(){
        for (Carga carga: this.cargas){
            System.out.println(carga);
        }
    }

    public void agregarCargas(Carga carga){
        this.cargas.add(carga);
    }

}
