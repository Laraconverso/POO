import java.util.Objects;

public class Naves extends Objeto{
    private double velocidad;
    private int vida;

    public Naves(int x, int y, char direccion, double velocidad, int vida) {
        super(x, y,direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }
    @Override
    public void irA(int x, int y, char direccion){
        System.out.println(x);
    }

    public void girar(char direccion){
        System.out.println(direccion);
    }

    public int restaVida(int vida){
        return this.vida-=1;
    }

    @Override
    public String toString() {
        return "Naves{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Naves naves = (Naves) o;
        return Double.compare(naves.velocidad, velocidad) == 0 && vida == naves.vida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(velocidad, vida);
    }
}
