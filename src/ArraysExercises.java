import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Bob");
        people[1] = new Person("Joe");
        people[2] = new Person("Tim");

//        for (Person person : people) {
//            System.out.println(person.getName());
//        }

        Person john = new Person("John");
//        System.out.println(Arrays.toString(addPerson(people, john)));

        Person[] people1 = addPerson(people, john);
        for (Person person : people1) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] x, Person person) {
        Person[] newPerson = Arrays.copyOf(x, x.length + 1);
        newPerson[newPerson.length - 1] = person;
        return newPerson;
    }
}
