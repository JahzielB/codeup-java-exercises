package abstractClassesBonus;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private int numberOfKeys;

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public Piano(String classification, int numberOfKeys) {
        super(classification);
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void startMusic() {
        System.out.println("piano starts making noise");
    }

    @Override
    public void stopMusic() {
        System.out.println("piano stops making noise");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("tuning piano");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("detuning piano");
    }

    @Override
    public void volumeUp() {
        System.out.println("raising piano volume");
    }

    @Override
    public void volumeDown() {
        System.out.println("lowering piano volume");
    }
}
