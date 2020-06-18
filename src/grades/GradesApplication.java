package grades;
import util.Input;

import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student joe = new Student("Joe");
        joe.addGrade(54);
        joe.addGrade(77);
        joe.addGrade(22);

        Student bob = new Student("Bob");
        bob.addGrade(99);
        bob.addGrade(81);
        bob.addGrade(100);

        Student jim = new Student("Jim");
        jim.addGrade(35);
        jim.addGrade(72);
        jim.addGrade(19);

        students.put("bobbob", bob);
        students.put("joebob", joe);
        students.put("jimbob", jim);

        String[] studentNames = students.keySet().toArray(new String[0]);
//        System.out.println(Arrays.toString(studentNames));

        doUsername(students);
    }

    public static String getUsername(HashMap<String, Student> hashMap) {
        Input input = new Input();
        System.out.println("Here are the GitHub usernames of our students:\n");
        String[] studentNames = hashMap.keySet().toArray(new String[0]);
        for (String students : studentNames) {
            System.out.print("|" + students + "| ");
        }
        System.out.println("\n");
        System.out.println("What student would you like to see more information on?\n");
        return input.getString();
    }

    public static Boolean askQuestion() {
        Input input = new Input();
        System.out.println("\nWould you like to see another student?\n");
        return input.yesNo();
    }

    public static String checkUsername(HashMap<String, Student> hashMap) {
        String userInput = getUsername(hashMap);
        String[] studentNames = hashMap.keySet().toArray(new String[0]);
        for (String students : studentNames) {
            if (userInput.equals(students)) {
                System.out.println("\nName: " + hashMap.get(students).getName() + " - " + " Github Username: " + students);
                System.out.println("Current Average: " + hashMap.get(students).getGradeAverage());
            }
        }
        return userInput;
    }

    public static void doUsername(HashMap<String, Student> hashMap) {
        do {
            String userInput = checkUsername(hashMap);
            if (!hashMap.containsKey(userInput)) {
                System.out.println("\nSorry, no student found with the GitHub username of " + "\"" + userInput + "\".");
            }
        } while (askQuestion());
        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}
