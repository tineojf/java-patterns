package composite;

public class LeafRectangulo implements Component {
    private final double base;
    private final double altura;

    public LeafRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
