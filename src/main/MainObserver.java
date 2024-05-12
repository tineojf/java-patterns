package main;

import observer.ObservableContext;
import observer.ObserverFollower;

public class MainObserver {
    public static void main(String[] args) {
        ObserverFollower follower1 = new ObserverFollower("John");
        ObserverFollower follower2 = new ObserverFollower("Doe");
        ObserverFollower follower3 = new ObserverFollower("Jane");

        ObservableContext observable = new ObservableContext();
        observable.setEvent("New event");

        observable.addObserver(follower1);
        observable.addObserver(follower2);
        observable.addObserver(follower3);

        observable.setEvent("New event 2");


    }
}
