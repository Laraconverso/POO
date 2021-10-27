package com.company;

import java.util.Scanner;

public class Desafio1 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String playerUno = "" ;
        String playerDos = "";
        int opcionJ1 = 0;
        int opcionJ2 = 0;
        int ptosJ1 = 0;
        int ptosJ2 = 0;
        obtenerNombre(playerUno, playerDos, scan);
        obtenerJugada(scan, opcionJ1, opcionJ2);
        compararJugadas(opcionJ1, opcionJ2, ptosJ1, ptosJ2);

    }
    private static String obtenerNombre(String playerUno, String playerDos, Scanner scanner){
        System.out.println("Cual es el nombre");
        playerUno = scanner.nextLine();
        System.out.println("Cual es el nombre");
        playerUno = scanner.nextLine();
        return "";
    }
    private static int obtenerJugada(Scanner scanner, int jugada1, int  jugada2){
        System.out.println("Jugador 1, seleccione jugada : \n 1- piedra \n 2- papel \n 3- tijera\n");
        jugada1 = scanner.nextInt();
        System.out.println("Jugador 2, seleccione jugada : \n 1- piedra \n 2- papel \n 3- tijera\n");
        jugada2 = scanner.nextInt();
        return 0;
    }

    private static int compararJugadas(int jugador1, int jugador2, int ptosJ1, int ptosJ2){
        int piedra = 1;
        int papel = 2;
        int tijera = 3;

        if(jugador1 == piedra){
            if(jugador2 == papel){
                ptosJ2++;
            } else if(jugador2 == tijera){
                ptosJ1++;
            }
        }
        return 0;
    }
}
