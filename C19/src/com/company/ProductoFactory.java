package com.company;

public class ProductoFactory {
    public static Producto create(double peso, String tipo) throws Exception {
        return switch (tipo) {
            case "CAJA10X10"-> new Caja(10, 10, 10, peso);
            case "PELOTAFUTBOL" -> new Pelota(11, peso);
            case "PELOTATENIS"-> new Pelota(0.32, peso);
            default -> throw new Exception("No hay producto");
        };
    }
}
