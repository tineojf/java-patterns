package state.stateclass;

import state.context.MP3;

public class Reproduciendo implements State {
    private MP3 context;

    @Override
    public void btnPlayPause() {
        System.out.println("Pausando...");
        context.changeState(new Pausa());
    }

    @Override
    public void btnStop() {
        System.out.println("Deteniendo...");
        context.changeState(new Detenido());
    }

    @Override
    public void setContext(MP3 context) {
        this.context = context;
    }
}
