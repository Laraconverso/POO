package com.company;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String posicion;
    private String apellifo ;
    private String numCamiseta;
    private String convocatoria;
    private List<String> convocatoriasPosibles;


    public Jugador(String posicion, String apellifo, String numCamiseta) {
        this.posicion = posicion;
        this.apellifo = apellifo;
        this.numCamiseta = numCamiseta;
        setConvocatoriasPosibles();
    }

    private void setConvocatoriasPosibles(){
        this.convocatoriasPosibles = new ArrayList<>();
        this.convocatoriasPosibles.add("titular");
        this.convocatoriasPosibles.add("suplente");
        this.convocatoriasPosibles.add("reserva");
    }

    public void setConvocatoria(String convocatoria) throws ConvocatoriaInvalidaError {
        if(this.convocatoriasPosibles.contains(convocatoria)){
            this.convocatoria = convocatoria;
        } else{
            throw new ConvocatoriaInvalidaError();
        }
    }

}


// if(convocatoria.equals("titular") || convocatoria.equals("suplente")|| convocatoria.equals("reservas")) {
//         this.convocatoria = convocatoria;
//         }