package composite.tree;

public class LeafTriangulo implements Component {
    private final double base;
    private final double altura;

    public LeafTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
