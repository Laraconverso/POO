package com.company;
import java.util.Set;

public class Shopping extends UnidadFuncional {
    private Set<Local> local;

    public Shopping(String direccion, String nombreDuenio, double mtsTotales,  Set<Local> local){
        super(direccion, nombreDuenio, mtsTotales);
        local = this.local;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
