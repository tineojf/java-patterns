package responsability;

public class Handler1 extends Handler {
    public Handler1(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processRequest(double mount) {
        if (mount <= 60000) {
            System.out.println("Ejecutivo: yo lo manejare");
        } else {
            nextHandler.processRequest(mount);
        }
    }
}
