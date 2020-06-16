package abstractClasses;

public class Blender extends Appliance {
    @Override
    public String makeSound() {
        return "blender noises";
    }

    @Override
    public String doWork() {
        return "blending";
    }
}
