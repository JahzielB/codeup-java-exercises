import java.util.Scanner;
import static java.lang.Math.pow;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);

//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while (i >= -10);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (long i = 2; i < 1000000;) {
//            System.out.println(i);
//            i *= i;
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz " + i);
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz " + i);
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz " + i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);

//        String userInput;
//        do {
//            System.out.print("Enter an integer: ");
//            long userInt = scanner.nextInt();
//            System.out.printf("Here is your table!\n");
//            System.out.printf("number | squared | cubed\n");
//            System.out.printf("------ | ------- | -----\n");
//            for (int i = 1; i <= userInt; i++) {
//                System.out.printf("%-6d | %-7.0f | %-6.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
//            }
//            System.out.print("Would you like to continue?: ");
//            userInput = scanner.next().toLowerCase();
//        }while (userInput.equals("yes"));

        String userInput;
        do{
            System.out.print("Enter a numerical grade from 0 to 100: ");
            int gradeInput = scanner.nextInt();
            if (gradeInput <= 100 && gradeInput >= 88) {
                System.out.print("A : 100 - 88\n");
            }
            if (gradeInput <= 87 && gradeInput >= 80) {
                System.out.print("B : 87 - 80\n");
            }
            if (gradeInput <= 79 && gradeInput >= 67) {
                System.out.print("C : 79 - 67\n");
            }
            if (gradeInput <= 66 && gradeInput >= 60) {
                System.out.print("D : 66 - 60\n");
            }
            if (gradeInput <= 59 && gradeInput >= 0) {
                System.out.print("F : 59 - 0\n");
            }
            System.out.print("Would you like to continue?: ");
            userInput = scanner.next().toLowerCase();
        }while (userInput.equals("yes"));

    }
}
