package com.company;

public class Main {

    public static void main(String[] args) {
        Policia policia = new Policia("Jake", "Peralta", "B99-92");
        Arma armaPersonal = new ArmaCorta(7, 150, "Shotz", 9, "EN USO", policia, true);
        Arma armaProfesional = new ArmaCorta(20, 250, "Supreme", 18, "EN USO", policia, false);
        Arma armaDefensa = new ArmaLarga(10, 1000, "Super", 25, "EN MANTENIMIENTO", policia, false, "Defensa personal", 5);
        Arma armaBatalla = new ArmaLarga(15, 1000, "Defense", 32,"NUEVA", policia, true, "Uso en batalla", 22);

        System.out.println("¿Esta en condiciones de uso? " + armaPersonal.estaEnCondiciones());
        System.out.println("¿Esta en condiciones de uso? " + armaProfesional.estaEnCondiciones());
        System.out.println("¿Esta en condiciones de uso? " + armaDefensa.estaEnCondiciones());
        System.out.println("¿Esta en condiciones de uso? " + armaBatalla.estaEnCondiciones());
        ArmaLarga armaDefensa1 = (ArmaLarga)armaDefensa;
        System.out.println(armaDefensa1.compareTo(armaBatalla));
        ArmaCorta armaPersonal1 = (ArmaCorta)armaPersonal;
        armaPersonal1.tieneAlcanceMedio();
        ArmaCorta armaPro = (ArmaCorta)armaProfesional;
        armaPro.tieneAlcanceMedio();


    }
}
