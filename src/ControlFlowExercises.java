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

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            }
        }
    }
}
