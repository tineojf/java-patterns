package observer;

import java.util.HashSet;
import java.util.Set;

public class ObservableSubasta implements Observable {
    private final Set<Observer> observers = new HashSet<>();
    private double precioActual;
    private final String detalle;

    public ObservableSubasta(double precioActual, String detalle) {
        this.detalle = detalle;
        this.setPrecioActual(precioActual);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Set<Observer> deleted = new HashSet<>();
        for (Observer observer : observers) {
            String mensaje = observer.update(precioActual, detalle);
            if (mensaje.equals("Retirado")) {
                deleted.add(observer);
            }
        }
        for (Observer observer : deleted) {
            observers.remove(observer);
        }
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
        notifyObservers();
    }

    public void getObservers() {
        for (Observer observer : observers) {
            System.out.println(observer);
        }
    }
}
