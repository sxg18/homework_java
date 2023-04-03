package Instrument;

public class Guitar implements Instrument{
    private int stringNum;

    public Guitar(int stringNum) {
        this.stringNum = stringNum;
    }

    @Override
    public String play() {
        return String.format("Playing \"%s\" on a guitar. This one hase %d strings.", KEY, this.stringNum);
    }
}
