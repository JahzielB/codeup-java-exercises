package shapes;
import util.Input;

public class CircleApp {
    public static void main (String[] args) {
        doCircles();
    }

    public static double makeRadius () {
        Input input = new Input();
        System.out.println("Enter the radius of the circle:");
        return input.getDouble();
    }

    public static void circleInfo () {
        double radius = makeRadius();
        Circle circle = new Circle(radius);
        System.out.println("Here is the area of the circle:");
        System.out.println(circle.getArea());
        System.out.println("Here is the circumference of the circle:");
        System.out.println(circle.getCircumference());
    }

    public static boolean moreCircles () {
        System.out.println("Would you like to continue?:");
        Input input = new Input();
        return input.yesNo();
    }

    private static int totalCircles;

    public static void doCircles() {
        do {
            circleInfo();
            totalCircles += 1;
            System.out.println("You've made " + totalCircles + " circles.");
        } while (moreCircles());
    }
}
