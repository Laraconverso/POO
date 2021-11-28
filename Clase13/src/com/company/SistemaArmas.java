package com.company;

public abstract class SistemaArmas {
    private Integer energia;

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

    public abstract void Mostrar();

}
