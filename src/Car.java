public class Car extends Vehicle {

    private int milesPerGallon;

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int miles) {
        this.milesPerGallon = miles;
    }

    public void deployAirBag() {
        System.out.println("Deploying airbag...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                "} " + super.toString();
    }

    public Car (boolean isOperable, int passengerCapacity, String powerSource, int miles) {
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = miles;
    }
}
