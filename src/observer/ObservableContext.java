package observer;

import java.util.ArrayList;

public class ObservableContext implements Observable {
    private final ArrayList<Observer> listObserver = new ArrayList<>();
    private String event;

    public ObservableContext() {
    }

    public void setEvent(String event) {
        this.event = event;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        listObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {

        if (listObserver.isEmpty()) {
            System.out.println("No followers to notify");
            return;
        }

        for (Observer observer : listObserver) {
            observer.notification();
        }
    }
}
