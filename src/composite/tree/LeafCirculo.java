package composite.tree;

public class LeafCirculo implements Component {
    private final double radio;

    public LeafCirculo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
