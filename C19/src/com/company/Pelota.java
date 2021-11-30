package com.company;

public class Pelota extends Producto{
    private double radio;

    public Pelota(double radio, double peso) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        double resultado = Math.pow(this.radio, 3);
        return (4/3)*Math.PI*resultado;
    }
}
