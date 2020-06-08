import java.util.Scanner;

public class MethodsExercises {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
//        System.out.print(addition(6, 6) + "\n");
//        System.out.print(subtraction(6, 6) + "\n");
//        System.out.print(multiplication(6, 6) + "\n");
//        System.out.print(division(6, 6) + "\n");
//        System.out.print(modulus(6, 6) + "\n");
//        getInteger(1, 10);
        factorial();
//        dice();
    }

    public static double addition (double x, double y) {
        return x + y;
    }

    public static double subtraction (double x, double y) {
        return x - y;
    }

    public static double multiplication (double x, double y) {
        return x * y;
    }

    public static double division (double x, double y) {
        return x / y;
    }

    public static double modulus (double x, double y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max  + ": ");
        int userInput = scanner.nextInt();
        if (userInput > min && userInput < max)
            return userInput;
        System.out.println("Wrong!");
        return getInteger(min, max);
    }

    public static long factorial () {
        int userInput = getInteger(1, 10);
        long factorial = 1;
        StringBuilder numbers = new StringBuilder(userInput + "! = ");
        for (int i = 1; i <= userInput; i++) {
                numbers.append(i).append(" x ");
                factorial *= i;
            }
        numbers = new StringBuilder(numbers.substring(0, numbers.length() - 2));
        System.out.print(numbers + "= " + factorial + "\n");
        System.out.print("Would you like to continue?\n");
        String response = scanner.next().toLowerCase();
        if (response.equals("yes")) {
            return factorial();
        }
        return factorial;
    }

    public static int dice () {
        System.out.print("How many sides do the dice have?\n");
        int sides = scanner.nextInt();
        System.out.print("Would you like to roll the dice\n");
        String userInput = scanner.next();
        if (userInput.equals("yes")) {
            int firstDie = (int) (Math.random() * ((sides - 1) + 1) + 1);
            int secondDie = (int) (Math.random() * ((sides - 1) + 1) + 1);
            String diceRoll = "Your dice landed on " + firstDie + " and " + secondDie + ".";
            System.out.printf("Your dice landed on %d and %d\n", firstDie, secondDie);
            System.out.print("Would you like to continue?\n");
            String response = scanner.next().toLowerCase();
            if (response.equals("yes")) {
                return dice();
            }
        }
        return sides;
    }
}