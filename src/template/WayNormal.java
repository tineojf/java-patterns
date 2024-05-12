package template;

import java.util.ArrayList;

public class WayNormal extends GuideCocinero {
    public WayNormal(ArrayList<String> lista) {
        super(lista);
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando ingredientes");
    }
}
