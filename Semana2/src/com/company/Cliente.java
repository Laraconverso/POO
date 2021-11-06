package com.company;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //es un constructor pq tiene el mismo nombre que la clase

    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = 0.0;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    public void incrementarDeuda(Double valor){
        this.setDeuda(this.deuda + valor);
    }
    public void pagarDeuda(){
        System.out.println("\tEl cliente número " + this.numeroCliente + ": " + this.nombre + " está pagando su deuda...");
        this.setDeuda(0.0);
    }
}
