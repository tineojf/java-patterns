package main;

import responsability.Articulo;
import responsability.Calidad;

public class MainResponsability {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("Macbook", 1500, 1250, "Sano");

        Calidad.analizar(articulo);
    }
}
