import adaptees.*;
import adapters.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        ElectricPiano piano = new ElectricPiano();
        Flute flute = new Flute();
        Drum drum = new Drum();

        Playable guitarPlayer = new ElectricGuitarAdapter(guitar);
        Playable pianoPlayer = new ElectricPianoAdapter(piano);
        Playable flutePlayer = new FluteAdapter(flute);
        Playable drumPlayer = new DrumAdapter(drum);

        List<Playable> band = List.of(guitarPlayer, pianoPlayer, flutePlayer, drumPlayer);

        System.out.println("=== Music Band using Adapter Pattern ===\n");
        for (Playable instrument : band) {
            instrument.play();
            System.out.println("---");
        }
    }
}