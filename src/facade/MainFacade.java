package facade;

public class MainFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.doOperation("12", "123", 50.0);
    }
}
