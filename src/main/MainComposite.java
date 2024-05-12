package main;

import composite.*;

import java.util.ArrayList;

public class MainComposite {
    public static void main(String[] args) {
        // Figuras
        LeafCirculo circulo = new LeafCirculo(1);
        LeafRectangulo rectanguloVagon = new LeafRectangulo(5, 4);
        LeafTriangulo triangulo = new LeafTriangulo(2, 2);
        LeafRectangulo rectanguloTren1 = new LeafRectangulo(6, 4);
        LeafRectangulo rectanguloTren2 = new LeafRectangulo(3, 3);
        LeafRectangulo rectanguloTren3 = new LeafRectangulo(1, 2);

        // ArrayList de figuras
        ArrayList<Component> listaTren = new ArrayList<>();
        listaTren.add(triangulo);
        listaTren.add(rectanguloTren1);
        listaTren.add(rectanguloTren2);
        listaTren.add(rectanguloTren3);
        listaTren.add(circulo);
        listaTren.add(circulo);

        ArrayList<Component> listaVagon = new ArrayList<>();
        listaVagon.add(rectanguloVagon);
        listaVagon.add(circulo);
        listaVagon.add(circulo);
        listaVagon.add(circulo);

        // Composite
        CompositeTren tren = new CompositeTren(listaTren);
        CompositeVagon vagon1 = new CompositeVagon(listaVagon);
        CompositeVagon vagon2 = new CompositeVagon(listaVagon);

        // Print
        System.out.println("Area del tren: " + tren.calcularArea());
        System.out.println("Area del vagon 1: " + vagon1.calcularArea());
        System.out.println("Area del vagon 2: " + vagon2.calcularArea());
    }
}
