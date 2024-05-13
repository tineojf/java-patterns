package responsability;

public class Handler2 extends Handler {
    public Handler2(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processRequest(double mount) {
        if (mount <= 200000 && mount > 60000) {
            System.out.println("Gerente: yo lo manejare");
        } else {
            nextHandler.processRequest(mount);
        }
    }
}
