package abstractClassesBonus;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private String saxType;

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    public Sax(String classification, String saxType) {
        super(classification);
        this.saxType = saxType;
    }

    @Override
    public void startMusic() {
        System.out.println("sax starts making noise");
    }

    @Override
    public void stopMusic() {
        System.out.println("sax stops making noise");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("tuning sax");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("detuning sax");
    }

    @Override
    public void volumeUp() {
        System.out.println("raising sax volume");
    }

    @Override
    public void volumeDown() {
        System.out.println("lowering sax volume");
    }
}
