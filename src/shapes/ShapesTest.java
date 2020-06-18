package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(2, 3);
        Measurable myShape1 = new Square(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println("=========");
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
    }
}
