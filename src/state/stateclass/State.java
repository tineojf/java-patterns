package state.stateclass;

import state.context.MP3;

public interface State {
    void btnPlayPause();

    void btnStop();

    void setContext(MP3 context);
}
