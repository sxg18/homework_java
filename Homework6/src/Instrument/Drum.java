package Instrument;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public String play() {
        return String.format("Playing \"%s\" on a drum. This one's size is %d cm", KEY, this.size);
    }
}
