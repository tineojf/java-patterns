package template;

import java.util.ArrayList;

public class WayVeggie extends GuideCocinero {
    public WayVeggie(ArrayList<String> lista) {
        super(lista);
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando ingredientes veggie");
    }

    @Override
    protected void cocinarPizza() {
        System.out.println("Cocinando vegetales en la pizza");
    }
}
