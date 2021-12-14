package com.company;

public class CargaSimple extends Carga {
    private String codigo;
    private double pesoCarga;

    public CargaSimple(String nombre, double peso, String codigo) {

        super(nombre, peso);
        this.codigo = codigo;
        this.pesoCarga = peso;
    }

    @Override
    public double calcularPesoCarga(){
        double diezPorciento = (10 * this.pesoCarga) /100;
        double pesoDeCargaFinal = 0;
        if(this.codigo.equals("SLW-123")){
            pesoDeCargaFinal = this.pesoCarga + diezPorciento;
        } else if(this.codigo.equals("FST-456")){
            pesoDeCargaFinal =  this.pesoCarga - diezPorciento;
        } else{
            //se puede implementar una exception
            System.out.println("No se pude calcular el peso dado a un error en el codigo ingresado.");
        }
        return pesoDeCargaFinal;
    }

    @Override
    public String toString() {
        return "CargaSimple{ Nombre: " + super.getNombre() + " peso = " + pesoCarga + " peso segun codigo = "+ calcularPesoCarga()+
                '}';
    }
}
