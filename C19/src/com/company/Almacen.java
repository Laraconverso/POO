package com.company;

import java.util.HashSet;
import java.util.Set;

public class Almacen {
    private Set<Producto> productos;
    private String nombre;

    public Almacen(String nombre) {
        this.productos = new HashSet<>();
        this.nombre = nombre;
    }

    public void agregarProducto(double peso, String tipo) throws Exception{
        Producto nuevoP = ProductoFactory.create(peso, tipo);
        this.productos.add(nuevoP);
    }

    public double calcularEspacioNecesario(){
        double total = 0;
        for (Producto producto: this.productos) {
            total += producto.calcularEspacio();
        }
        return total;
    }
}
