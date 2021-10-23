package com.company;

public class C1S {

    static boolean esDivisible(int n, int divisor){
        if ((n % divisor) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // ej de structures//
        int number1 = 1;
        int number2 = 2;
        if(number1 % number2 == 0){
            System.out.println("El number es divisible");
        } else {
            System.out.println("El number no es divisible");
        }
        //ej de functions//
        esDivisible(number1, number2);
    }
}
