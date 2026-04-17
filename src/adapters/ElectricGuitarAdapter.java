package adapters;

import adaptees.ElectricGuitar;
import Playable;

public class ElectricGuitarAdapter implements Playable {
    private ElectricGuitar guitar;
    public ElectricGuitarAdapter(ElectricGuitar guitar) {
        this.guitar = guitar;
    }
    @Override
    public void play() {
        guitar.startElectric();
        guitar.playSound();
    }
}