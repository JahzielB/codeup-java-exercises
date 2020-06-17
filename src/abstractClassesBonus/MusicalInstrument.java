package abstractClassesBonus;

abstract class MusicalInstrument implements Playable {
    private String instrumentClassification;

    public String getInstrumentClassification() {
        return this.instrumentClassification;
    }

    public void setInstrumentClassification(String classification) {
        this.instrumentClassification = classification;
    }

    public MusicalInstrument(String classification) {
        this.instrumentClassification = classification;
    }

    public MusicalInstrument(){}

}
