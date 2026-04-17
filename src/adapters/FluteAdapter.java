package adapters;

import adaptees.Flute;
import Playable;

public class FluteAdapter implements Playable {
    private Flute flute;
    public FluteAdapter(Flute flute) {
        this.flute = flute;
    }
    @Override
    public void play() {
        flute.blow();
    }
}