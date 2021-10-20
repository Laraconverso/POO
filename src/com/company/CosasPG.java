package com.company;

import java.util.Locale;
import java.util.Scanner;

public class CosasPG {
    public static <string> void main(String[] args) {
        /*
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

         */
        Scanner lector;
        lector = new Scanner(System.in);
        int num1;
        int num2;
        float coef;
        String nombre;
        char inicial;
        System.out.println("Ingrese 1 valor");
        num1 = lector.nextInt();
        System.out.println("Ingrese segundo valor");
        num2 = lector.nextInt();
        System.out.println("Ingrese coef");
        coef = lector.nextFloat();
        System.out.println("Ingrese nombre");
        nombre = lector.next();
        inicial= nombre.charAt(0);
        System.out.println("Tu inicial es " + inicial + ".");
    }
}
