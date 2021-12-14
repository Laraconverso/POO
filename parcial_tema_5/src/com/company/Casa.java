package com.company;

public class Casa extends Propiedad{
    private double montoBaseImpuesto;

    public Casa(String calle, int numero,  double montoBaseImpuesto) {
        super(calle, numero);
        this.montoBaseImpuesto = montoBaseImpuesto;
    }

    @Override
    public double calcularPrecio() {
        if(this.getCalle().equals("Av. San Martín")) {
            double diezPorciento = (this.montoBaseImpuesto * 10) / 100;
            return this.montoBaseImpuesto + diezPorciento;
        } else{
            return this.montoBaseImpuesto;
        }
    }

    @Override
    public String toString() {
        return "Casa: { Calle: " + this.getCalle() +
                "montoImpuesto=" + montoBaseImpuesto +
                '}';
    }

}
