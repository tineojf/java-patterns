package responsability;

public class Handler3 extends Handler {
    public Handler3() {
        super(null);
    }

    @Override
    public void processRequest(double mount) {
        if (mount > 200000) {
            System.out.println("Director: yo me hare cargo");
        } else {
            System.out.println("Para operaciones mas pequeñas puede hacerlo el ejecutivo");
        }
    }
}
