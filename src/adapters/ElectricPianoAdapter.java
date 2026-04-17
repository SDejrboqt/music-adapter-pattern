package adapters;

import adaptees.ElectricPiano;
import Playable;

public class ElectricPianoAdapter implements Playable {
    private ElectricPiano piano;
    public ElectricPianoAdapter(ElectricPiano piano) {
        this.piano = piano;
    }
    @Override
    public void play() {
        piano.startElectric();
        piano.playSound();
    }
}