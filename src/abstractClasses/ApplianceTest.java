package abstractClasses;

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance blender = new Blender();
        Appliance fridge = new Refrigerator();

        System.out.println(blender.doWork());
        System.out.println(blender.makeSound());
        System.out.println("");
        System.out.println(fridge.doWork());
        System.out.println(fridge.makeSound());
    }
}
