package state;

public class ContextMP3 {
    private State estado;

    public ContextMP3(State estado) {
        changeState(estado);
    }

    public void changeState(State estado) {
        this.estado = estado;
        this.estado.setContext(this);
    }

    public void btnPlayPause() {
        estado.btnPlayPause();
    }

    public void btnStop() {
        estado.btnStop();
    }
}
