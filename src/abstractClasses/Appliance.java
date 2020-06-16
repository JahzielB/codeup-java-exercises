package abstractClasses;

abstract class Appliance {

    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Appliance() {

    }

    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract String makeSound();
    public abstract String doWork();
}
