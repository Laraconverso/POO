import java.util.Objects;

public class Asteroide extends Objeto {
    int lesion;

    public Asteroide(int x, int y, char direccion, int lesion) {
        super(x, y,direccion);
        this.lesion = lesion;
    }
    @Override
    public void irA(int x, int y, char direccion){
        System.out.println(y);
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "lesion=" + lesion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asteroide asteroide = (Asteroide) o;
        return lesion == asteroide.lesion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lesion);
    }
}
