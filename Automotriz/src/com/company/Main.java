package com.company;

public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor(1600);
        Patente patente = new Patente();
        Auto autoUno = new Auto("Peugeot", "205",patente,3,motor);
        System.out.println(autoUno);
        autoUno.encender();
        System.out.println(autoUno);
    }
}
