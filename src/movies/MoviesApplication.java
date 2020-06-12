package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        doMovies();
    }

    public static int selectOption() {
        Input input = new Input();
        System.out.println("What would you like to do?");
        System.out.println("\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category\n");
        System.out.print("Enter your choice: ");
        return input.getInt();
    }

    public static boolean yesNo() {
        Input input = new Input();
        System.out.println("\nWould you like to make another selection?");
        return input.yesNo();
    }

    public static void viewAll() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void viewAnimated() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase("animated")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void viewDrama() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase("drama")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void viewHorror() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase("horror")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void viewScifi() {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase("scifi")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void doMovies() {
        int userInput;
        do {
            userInput = selectOption();
            if (userInput == 0) {
                System.out.println("Thanks for using the app!");
                break;
            } else if (userInput == 1) {
                viewAll();
            } else if (userInput == 2) {
                viewAnimated();
            } else if (userInput == 3) {
                viewDrama();
            } else if (userInput == 4) {
                viewHorror();
            } else if (userInput == 5) {
                viewScifi();
            }
        } while (yesNo());
    }
}