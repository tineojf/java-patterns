package state;

import state.stateclass.*;
import state.context.*;

public class Main {
    public static void main(String[] args) {
        State estado = new Detenido();
        MP3 mp3 = new MP3(estado);
        mp3.btnStop();

        mp3.btnPlayPause();
        mp3.btnPlayPause();
//        mp3.btnPlayPause();
        mp3.btnStop();
    }
}