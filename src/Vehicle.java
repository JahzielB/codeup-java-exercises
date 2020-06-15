public class Vehicle {

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public boolean isOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "isOperable=" + isOperable +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource + '\'' +
                '}';
    }

    public Vehicle (boolean isOperable, int passengerCapacity, String powerSource) {
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public void turnOn() {
        System.out.println("Vehicle is turning on...");
    }

}

