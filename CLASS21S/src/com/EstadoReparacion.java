package com;

public abstract class EstadoReparacion {

    public abstract void valorPresupuesto(double presupuesto);
    public abstract void cambiarDireccion(String direccion);
    public abstract void agregarRepuesto(double costo);

    public EstadoReparacion pasarAlSiguientePaso() {
        return null;
    }
}
