package Instrument;

import java.util.Arrays;
import java.util.List;

public class Orchestra {
    public static void main(String[] args) {
        List<Instrument> orchestra = Arrays.asList(new Guitar(6), new Drum(14), new Tuba(4));
        for (Instrument musicInstruments : orchestra) {
            System.out.println(musicInstruments.play());
        }
    }
}
