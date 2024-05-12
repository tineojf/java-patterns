package main;

import template.GuideCocinero;
import template.WayNormal;
import template.WayVeggie;

import java.util.ArrayList;

public class MainTemplate {
    public static void main(String[] args) {
        ArrayList<String> vegetales = new ArrayList<>();
        vegetales.add("Queso");
        vegetales.add("Tomate");

        ArrayList<String> carnes = new ArrayList<>();
        carnes.add("carne");
        carnes.add("Tomate");

        GuideCocinero obj = new WayNormal(carnes);
        obj.hacerPizza();

        System.out.println();
        GuideCocinero obj2 = new WayVeggie(vegetales);
        obj2.hacerPizza();
    }
}
