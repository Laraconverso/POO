package com.company;

//Equipo 7
// Paula Betania Luna
//Sofia Fraga
//Andres David Suarez Gomez
//Felipe Mendoza Pelaez
//Lara Daniela Converso

import java.util.Scanner;

public class Clase2 {
    public static <string> void main(String[] args) {
    //Ej. 1
        Scanner input = new Scanner(System.in);
        System.out.println("EJ 1: ");
        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();
        esPrimo(numero);

     //EJ 2
        System.out.println("EJ 2: ");
        System.out.println("Ingrese primer numero: ");
        Integer unNumeroA = input.nextInt();
        System.out.println("Ingrese segundo  numero: ");
        Integer unNumeroB = input.nextInt();
        System.out.println("Ingrese tercer numero: ");
        Integer unNumeroC = input.nextInt();
        maximoEntreTresNumeros(unNumeroA, unNumeroB, unNumeroC);

    //EJ3
        System.out.println("EJ 3: ");
        System.out.println("Ingrese una palabra: ");
        String unString = input.nextLine();
        String unString2 = input.nextLine();
        System.out.println("Ingrese segunda palabra: ");
        String dosString = input.nextLine();
        cadenasDeTextoDistintas(unString2, dosString);
    }

    //nos olvidamos el metodo es divisible
    private static boolean esPrimo(int numero){
            // El 0, 1 y 4 no son primos
            if (numero == 0 || numero == 1 || numero == 4) {
                System.out.println("FALSO, no es primo.");
                return false;
            }
            for (int x = 2; x < numero / 2; x++) {
                // Si es divisible por cualquiera de estos números, no
                // es primo
                if (numero % x == 0)
                    System.out.println("FALSO, no es primo.");
                    return false;
            }
            // Si no se pudo dividir por ninguno de los de arriba, sí es primo
            System.out.println("VERDADERO, es primo.");
            return true;
    }

    private static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        if(unNumeroA.compareTo(unNumeroB) == 1){
            if(unNumeroA.compareTo(unNumeroC) == 1){
                System.out.printf("El mayor es %i", unNumeroA);
            } else if(unNumeroA.compareTo(unNumeroC) == -1){
                System.out.println("El mayor es " + unNumeroC);
            }
        } else {
            if(unNumeroB.compareTo(unNumeroC) == 1){
                System.out.println("El mayor es " + unNumeroB);
            } else {
                System.out.println("El mayor es " + unNumeroC);
            }
        }
        return 0;
    }

    private static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        if(unTextoA.equals(unTextoB)){
            System.out.println("TRUE, son iguales");
            return true;
        } else{
            System.out.println("FALSO, no son iguales");
            return false;
        }
    }
}
