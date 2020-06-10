package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();

        System.out.println("Enter String:");
        System.out.println(input.getString());

        System.out.println("Enter yes/no or a boolean:");
        System.out.println(input.yesNo());

        System.out.println("Enter an integer between 1 and 10:");
        System.out.println(input.getInt(1, 10));

        System.out.println("Enter any integer:");
        System.out.println(input.getInt());

        System.out.println("Enter a double between 1 and 10:");
        System.out.println(input.getDouble(1, 10));

        System.out.println("Enter any double:");
        System.out.println(input.getDouble());

    }
}
