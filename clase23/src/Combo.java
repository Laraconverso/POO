import java.util.List;

public class Combo implements Presupuestable {
    private double precioTotal;
    private List<Producto> productos;
    private double descuento;

    public Combo(List<Producto> productos, double descuento) {
        this.productos = productos;
        this.descuento = descuento;
        this.setPrecioTotal();
    }

    private void setPrecioTotal() {
        this.precioTotal = 0;
        for (Producto producto : this.productos) {
            this.precioTotal += producto.calcularPrecioFinal();
        }
    }

    @Override
    public double calcularPrecioFinal() {
        return this.precioTotal - this.descuento;
    }
}
