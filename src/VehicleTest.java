public class VehicleTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Jet jet = new Jet();
        Car car = new Car();

        vehicle.setOperable(true);
        vehicle.setPassengerCapacity(3);
        vehicle.setPowerSource("gas");
        System.out.println(vehicle.toString());

        System.out.println("==========");

        jet.setOperable(false);
        jet.setPassengerCapacity(80);
        jet.setPowerSource("jet fuel");
        System.out.println(jet.toString());

        System.out.println("==========");

        car.setOperable(true);
        car.setPassengerCapacity(6);
        car.setPowerSource("electric");
        System.out.println(car.toString());
    }
}
