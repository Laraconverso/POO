package com;

public class Reparacion {
    private String nombreArticulo;
    private double presupuesto;
   private String direccionDeEntrega;

    public Reparacion(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }


    public void cambiarDireccion(String direccion){

    }
    public void agregarValorPresupuesto(double presupuesto){

    }
    public void agregarRepuesto(double costo){

    }
    public void pasarAlSiguientePaso(){

    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "nombreArticulo='" + nombreArticulo + '\'' +
                ", presupuesto=" + presupuesto +
                ", direccionDeEntrega='" + direccionDeEntrega + '\'' +
                '}';
    }
}
