package state;

public interface State {
    void btnPlayPause();

    void btnStop();

    void setContext(ContextMP3 context);
}
