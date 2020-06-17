package abstractClassesBonus;

public class MusicTest {
    public static void main(String[] args) {
        Piano piano1 = new Piano("big piano", 50);
        Sax sax1 = new Sax("big sax", "sax type");

        detuneRetune(piano1);
        makeTwoStaccatoSounds(piano1);
        System.out.println("========");
        detuneRetune(sax1);
        makeTwoStaccatoSounds(sax1);
    }

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }
}
