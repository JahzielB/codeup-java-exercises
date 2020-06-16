package abstractClasses;

public class Refrigerator extends Appliance {
    @Override
    public String makeSound() {
        return "fridge noises";
    }

    @Override
    public String doWork() {
        return "keep things cold";
    }
}
