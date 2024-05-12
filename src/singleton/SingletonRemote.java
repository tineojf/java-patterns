package singleton;

public class SingletonRemote {
    public static SingletonRemote instance = null;
    private int canal;

    private SingletonRemote() {
        canal = 1;
    }

    public static SingletonRemote getInstance() {
        if (instance == null) {
            instance = new SingletonRemote();
        }
        return instance;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "SingletonRemote canal: " + canal;
    }
}
