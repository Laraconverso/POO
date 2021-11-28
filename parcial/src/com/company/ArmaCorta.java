package com.company;

public class ArmaCorta extends Arma {
    private boolean automatica;

    public ArmaCorta(int cantMunicion, int alcanceMts, String marca, int calibre, String estado, Policia policiaDuenio, boolean automatica) {
        super(cantMunicion, alcanceMts, marca, calibre, estado, policiaDuenio);
        this.automatica = automatica;
    }

    public boolean tieneAlcanceMedio(){
        if(this.getAlcance() > 200){
            System.out.println("Si! tiene alcance medio.;D");
            return true;
        }else{
            System.out.println("No!, no tiene alcance medio. D;");
            return false;
        }
    }
}
