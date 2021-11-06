package com.company;

public class Auto {
    private Patente patente;
    private String marca;
    private String modelo;
    private int puertas;
    private final int RUEDAS = 4;
    private Motor motor;
    private boolean encendido;

    public Auto(String marca, String modelo, Patente patente, int puertas, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = setPuertas(puertas);
        this.motor = motor;
        this.patente = patente;
    }

    private int setPuertas(int puertas) {
        if(puertas > 0 && puertas <= 5) {
            return puertas;
        }
        return 2;
    }

    public void encender() {
        encendido = !encendido;
    }

    public void acelerar() {
        if(encendido) {
            //TODO: metodo para hacerlear
        }
    }

    @Override
    public String toString() {
        String estadoAuto = (encendido) ? "Encendido" : "Apagado";
        return "Auto{" +
                "patente: " + patente +
                ", puertas: " + puertas +
                ", Ruedas: " + RUEDAS +
                ", motor: " + motor +
                ", estado: " + estadoAuto +
                '}';
    }
}
