package Instrument;

public class Tuba implements Instrument{
    private int diameter;

    public Tuba(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String play() {
        return String.format("Playing \"%s\" on a tuba. This one is %d cm in diameter.", KEY, this.diameter);
    }
}
