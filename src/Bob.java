import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ask Bob a question: ");
        String userQuestion = scanner.nextLine();

        if (userQuestion.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else if (userQuestion.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userQuestion.endsWith("?")) {
            System.out.println("Sure.");
        } else {
            System.out.println("Whatever");
        }
    }
}
