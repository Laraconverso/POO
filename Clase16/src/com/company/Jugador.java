package com.company;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{

    private int numeroDeCamiseta;
    private String nombre;
    private boolean lesiones;
    private boolean titular;

    public Jugador(int numeroDeCamiseta, String nombre, boolean lesiones, boolean titular) {
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.nombre = nombre;
        this.lesiones = lesiones;
        this.titular = titular;
    }

    public int getNumeroCamiseta(){
        return numeroDeCamiseta;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return nombre.equals(jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.numeroDeCamiseta - jugador.getNumeroCamiseta;
    }

}
