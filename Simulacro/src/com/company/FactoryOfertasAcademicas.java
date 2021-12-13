package com.company;

public class FactoryOfertasAcademicas {
    public static Curso crearCurso(String nombre, String descripcion, int cargaHorariaMenusal, int mesesDuracion, double valorHora){
        return new Curso(nombre, descripcion, cargaHorariaMenusal,mesesDuracion, valorHora );
    }
    public static Programa crarPrograma(String nombre, String descripcion, int cargaHorariaMenusal, int mesesDuracion, double valorHora){
        return  new Programa(nombre, descripcion, cargaHorariaMenusal, mesesDuracion, valorHora);
    }
}
