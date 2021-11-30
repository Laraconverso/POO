package com.company;

public class Main {

    public static void main(String[] args) {
        Almacen almcen = new Almacen("Exito");
        try{
            almcen.agregarProducto(30, "CAJA10X10");
            almcen.agregarProducto(2, "PELOTAFUTBOL");
            almcen.agregarProducto(0.2, "PELOTATENIS");
        }
        catch (Exception e){
            e.printStackTrace();
        };

        System.out.println(almcen.calcularEspacioNecesario());
    }
}
