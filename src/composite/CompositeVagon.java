package composite;

import java.util.ArrayList;

public class CompositeVagon implements Component {
    private final ArrayList<Component> components;

    public CompositeVagon(ArrayList<Component> components) {
        this.components = components;
    }

    @Override
    public double calcularArea() {
        double area = 0;
        for (Component component : components) {
            area += component.calcularArea();
        }
        return area;
    }
}
