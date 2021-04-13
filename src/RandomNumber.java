import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int n = 1 + (int) (100 * Math.random());
        int j = 5; // j trials
        int g, guess;
        Scanner sc = new Scanner(System.in); //Creating the object for scanner class and passing the input stream from the key board
        System.out.println(
                "Guess the number between 1 and 100. You have 5 attempts.");

        for (g = 0; g < j; g++) {

            System.out.println(
                    "Your guess:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (n == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            } else if (n > guess
                    && g != j - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            } else if (n < guess
                    && g != j - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (g == j) {
            System.out.println(
                    "You have no more guesses left");

            System.out.println(
                    "The number was " + n);
        }
    }


    }



