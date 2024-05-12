package state;

public class Detenido implements State {
    private ContextMP3 context;

    @Override
    public void btnPlayPause() {
        System.out.println("Reproduciendo...");
        context.changeState(new Reproduciendo());
    }

    @Override
    public void btnStop() {
        System.out.println("Ya estoy detenido");
    }

    @Override
    public void setContext(ContextMP3 context) {
        this.context = context;
    }
}
