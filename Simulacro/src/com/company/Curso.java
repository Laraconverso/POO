package com.company;

public class Curso extends OfertaAcademica{
    private int cargaHorariaMensual;
    private int mesesDuracion;
    private double valorHora;

    public Curso(String nombre, String precio, int cargaHorariaMensual, int mesesDuracion, double valorHora) {
        super(nombre, precio);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.mesesDuracion = mesesDuracion;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio(){
        return this.mesesDuracion *this.valorHora *this.cargaHorariaMensual;
    }

    @Override
    public String toString() {
        return "Curso{nombre: }" + super.getNombre() + "$" + super.calcularPrecio();
    }
}
