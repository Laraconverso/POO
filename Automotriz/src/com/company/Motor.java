package com.company;

public class Motor {
    private final int CILINDRADA;


    private int getCilindrada(int cilindrada){
        if(cilindrada > 0 && cilindrada <= 2000) {
            return cilindrada;
        }
        return 1300;
    }

    public Motor(int cilindrada) {
        this.CILINDRADA = getCilindrada(cilindrada);
    }

    @Override
    public String toString() {
        return CILINDRADA + "";
    }
}
