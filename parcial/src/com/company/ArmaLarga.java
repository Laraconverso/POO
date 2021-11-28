package com.company;

public class ArmaLarga extends Arma implements Comparable{
    private boolean SelloRenar;
    private String descripcionJustificacion;
    private int nivel;

    public ArmaLarga(int cantMunicion, int alcanceMts, String marca, int calibre, String estado, Policia policiaDuenio, boolean selloRenar, String descripcionJustificacion, int nivel) {
        super(cantMunicion, alcanceMts, marca, calibre, estado, policiaDuenio);
        this.SelloRenar = selloRenar;
        this.descripcionJustificacion = descripcionJustificacion;
        this.nivel = nivel;
    }

    @Override
    public int compareTo(Object o) {
        ArmaLarga armaLarga = (ArmaLarga)o;
        if(this.nivel > armaLarga.nivel){
            System.out.println("Es de mayor nivel");
            return 1;
        }else if(this.nivel < armaLarga.nivel){
            System.out.println("Es de menor nivel");
            return -1;
        }else{
            System.out.println("Tienen el mismo nivel");
            return 0;
        }
    }
}
