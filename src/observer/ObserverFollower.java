package observer;

public class ObserverFollower implements Observer {
    private final String name;

    public ObserverFollower(String name) {
        this.name = name;
    }

    @Override
    public void notification() {
        System.out.println("Follower " + name + " has been notified");
    }
}
