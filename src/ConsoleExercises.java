import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: %d", userInput);

//        System.out.print("Enter three words: ");
//        String firstWord = scanner.next();
//        scanner.nextLine();
//        String secondWord = scanner.next();
//        scanner.nextLine();
//        String thirdWord = scanner.next();
//        System.out.printf("Your three words were: %s, %s, %s.", firstWord, secondWord, thirdWord);

//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.printf("Your sentence is: %s", sentence);

        System.out.print("Enter the length and width of your room: ");
        String length = scanner.next();
        scanner.nextLine();
        String width = scanner.next();
        int lengthInt = parseInt(length);
        int widthInt = parseInt(width);
        int perimeter = (2 * lengthInt) + (2 * widthInt);
        int area =  lengthInt * widthInt;
        System.out.printf("The perimeter of your room is: %d.\nThe area of your room is %d", perimeter, area);
    }
}