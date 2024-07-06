import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    //       Objective
    //        Write a guessing game which prompts a user to guess a mystery number within some range.
    //        After every guess the program should display some variation of
    //        "too large", "too small", "correct guess", respectively.
    //
    //        Upon termination, the program should display
    //        the number of guesses before successfully guessing correctly.
    //        A number that is input consecutively, should register as a single guess.

    public static void main(String[] args){

        //Need range of numbers --> Define range of numbers
        int lowRange = 1;
        int highRange = 12;
        int mysteryNumber = generateRandomNumber (lowRange, highRange);

        //Initialize the variables for user input
        int guess;
        int numberOfGuesses = 0;
        boolean correctGuess = false;

        //Create a scanner so the user can input number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, and welcome to the Number Guessing Game!");
        System.out.println("Guess the mystery number between " + lowRange + " and " + highRange);

        //Loop for the game!!!
        while (!correctGuess) {
             System.out.print("Enter your guess: ");
             guess = scanner.nextInt();
             numberOfGuesses++;

             if (guess == mysteryNumber) {
                 correctGuess = true;
                 System.out.println("Correct!");
             } else if (guess < mysteryNumber) {
                 System.out.println("Wrong, too low!");
             } else {
                 System.out.println("Wrong, too high!");
             }
         }

        //Display number of guesses user has made
        System.out.println("Congratulations! you guess the number in " + numberOfGuesses + " guesses.");

        //Close Scanner!! (i always forget)
        scanner.close();
    }

    public static int generateRandomNumber(int lowRange, int highRange) {
    return (int) (Math.random() * (highRange - lowRange + 1) + lowRange);
    }
}
