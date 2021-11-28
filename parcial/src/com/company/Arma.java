package com.company;

public abstract class Arma {
    private int cantMunicion;
    private int alcanceMts;
    private String marca;
    private int calibre;
    private String estado;
    private Policia policiaDuenio;

    public Arma(int cantMunicion, int alcanceMts, String marca, int calibre, String estado, Policia policiaDuenio) {
        this.cantMunicion = cantMunicion;
        this.alcanceMts = alcanceMts;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policiaDuenio = policiaDuenio;
    }

    public int getAlcance() {
        return this.alcanceMts;
    }

    public boolean estaEnCondiciones(){
        return (this.estado.equals("EN USO") && this.calibre >= 9);
    }


}
