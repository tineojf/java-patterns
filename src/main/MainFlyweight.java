package main;

import flyweight.FlyweightArbol;
import flyweight.FlyweightFactory;

import java.util.ArrayList;

public class MainFlyweight {
    public static void main(String[] args) {
        FlyweightFactory empresaArboles = new FlyweightFactory();

        ArrayList<FlyweightArbol> bosque = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bosque.add(empresaArboles.getArbol("rojo"));
        }
    }
}
