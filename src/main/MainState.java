package main;

import state.ContextMP3;
import state.Detenido;
import state.State;

public class MainState {
    public static void main(String[] args) {
        State estado = new Detenido();
        ContextMP3 contextMp3 = new ContextMP3(estado);
        contextMp3.btnStop();

        contextMp3.btnPlayPause();
        contextMp3.btnPlayPause();
//        mp3.btnPlayPause();
        contextMp3.btnStop();
    }
}