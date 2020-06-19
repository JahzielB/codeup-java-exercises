package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Thanks");
            return userInput;
        } else {
            System.out.println("Try again");
            return getInt(min, max);
        }
    }

    public int getInt() {
//        return scanner.nextInt();
//        if (scanner.hasNextInt()) {
//            return scanner.nextInt();
//        } else {
//            System.out.println("Please enter an integer.");
//            scanner.next();
//            return getInt();
//        }
        try {
            String userInput = getString();
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer.");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println("Thanks");
            return userInput;
        } else {
            System.out.println("Try again");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
//        if (scanner.hasNextDouble()) {
//            return scanner.nextDouble();
//        } else {
//            System.out.println("Please enter a double.");
//            scanner.next();
//            return getDouble();
//        }
        try {
            String userInput = getString();
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a double.");
            return getDouble();
        }
    }
}