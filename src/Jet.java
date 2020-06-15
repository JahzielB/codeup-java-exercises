public class Jet extends Vehicle {

    private int maximumAltitude;

    public void takeOff() {
        System.out.println("Taking off...");
    }

    public int getMaximumAltitude() {
        return this.maximumAltitude;
    }

    public void setMaximumAltitude(int altitude) {
        this.maximumAltitude = altitude;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "maximumAltitude=" + maximumAltitude +
                "} " + super.toString();
    }

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int altitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = altitude;
    }

    public void turnOn() {
        System.out.println("Igniting jet engines...");
    }

    public void genericTurnOn() {
        super.turnOn();
    }
}