package main;

import observer.ObservableSubasta;
import observer.ObserverOferente;

public class MainObserver {

    public static void main(String[] args) {
        ObserverOferente p1 = new ObserverOferente("Juan", "Perez", "12345678", 100);
        ObserverOferente p2 = new ObserverOferente("Maria", "Gomez", "87654321", 200);
        ObserverOferente p3 = new ObserverOferente("Pedro", "Garcia", "45678912", 150);

        ObservableSubasta observableSubasta = new ObservableSubasta(50, "Producto 1");
        observableSubasta.addObserver(p1);
        observableSubasta.addObserver(p2);
        observableSubasta.addObserver(p3);
        observableSubasta.setPrecioActual(50);
        System.out.println();
        observableSubasta.setPrecioActual(99.6);
        System.out.println();
        observableSubasta.setPrecioActual(149.6);
    }
}
