package template;

import java.util.ArrayList;

public abstract class GuideCocinero {
    private ArrayList<String> lista;

    public GuideCocinero(ArrayList<String> lista) {
        this.lista = lista;
    }

    public void hacerPizza() {
        prepararMasa();
        agregarIngredientes();
        cocinarPizza();
    }

    protected void prepararMasa() {
        System.out.println("Preparando masa");
    }

    protected abstract void agregarIngredientes();

    protected void cocinarPizza() {
        System.out.println("Cocinando pizza");
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
}
