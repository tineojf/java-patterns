package state.stateclass;

import state.context.MP3;

public class Detenido implements State {
    private MP3 context;

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
    public void setContext(MP3 context) {
        this.context = context;
    }
}
