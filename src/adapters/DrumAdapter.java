package adapters;

import adaptees.Drum;
import Playable;

public class DrumAdapter implements Playable {
    private Drum drum;
    public DrumAdapter(Drum drum) {
        this.drum = drum;
    }
    @Override
    public void play() {
        drum.hit();
    }
}