package responsability;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected Handler getNextHandler() {
        return nextHandler;
    }

    protected void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void processRequest(double mount);
}
