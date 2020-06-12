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
        int userInput = scanner.nextInt();
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
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Please enter an integer.");
            scanner.next();
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println("Thanks");
            return userInput;
        } else {
            System.out.println("Try again");
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}