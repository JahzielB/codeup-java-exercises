import java.util.Scanner;

public class HighLow {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        guess();
    }

    public static int randomNumber () {
        return (int)(Math.random() * ((100 - 1) + 1) + 1);
    }

    public static int getInteger(int min, int max) {
        System.out.print("Guess a number between " + min + " and " + max  + ": ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max)
            return userInput;
        System.out.println("Wrong!");
        return getInteger(min, max);
    }

    public static String guess () {
        String correct = "no";
        int random = randomNumber();
        System.out.print(random + "\n");
        do {
            int userInput = getInteger(1, 100);
            if (userInput == random) {
                System.out.print("GOOD GUESS!\n");
                correct = "yes";
            } else if (userInput < random) {
                System.out.print("HIGHER\n");
            } else {
                System.out.print("LOWER\n");
            }
        } while (correct.equals("no"));
        return correct;
    }
}