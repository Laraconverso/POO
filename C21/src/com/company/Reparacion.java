package com.company;

public class Reparacion {
    private String nombreArticulo;
    private double presupuesto;
    - direccionDeEntrega: String

    + Reparacion(nombreArticulo: String): Reparacion
    + cambiarDireccion(direccion: String): void
    + agregarValorPresupuesto(presupuesto: double): void
    + agregarRepuesto(costo: double): void
    + pasarAlSiguientePaso(): void
    + toString(): String
}
