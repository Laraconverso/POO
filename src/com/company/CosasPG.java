package com.company;

import java.util.Locale;

public class CosasPG {
    public static void main(String[] args) {
        String name = "Jhon";
        int quantity;
        char inicial;

        quantity = name.length();

        name.toUpperCase();
        if(name.equals("JHON")){
            System.out.println("Se paso a mayuscula");
        } else { System.out.println("No se paso a mayuscula");}
        inicial = name.charAt(0);
        System.out.println(quantity + " " + inicial);
    }
}
