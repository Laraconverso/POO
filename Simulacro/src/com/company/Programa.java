package com.company;
import java.util.Set;

public class Programa extends OfertaAcademica {
    private double bonificacion;
    private Set<Curso> cursos; //no se pueden repetir por eso set

    public Programa(String nombre, String precio, double bonificacion, Set<Curso> cursos) {
        super(nombre, precio);
        this.bonificacion = bonificacion;
        this.cursos = cursos;
    }

    @Override
    public double calcularPrecio() {
        double totalPrecio = 0;
        double descuento;
        for(Curso curso: this.cursos){
            totalPrecio += curso.calcularPrecio();
        }
        descuento = (this.bonificacion/100) * totalPrecio;
        return totalPrecio - descuento;
    }
}
