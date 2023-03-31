//TASK_2 NUMBER GUESSING GAME - by Anushka

import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String play = "yes";

        // while loop to determine if we are going to play the game again
        while (play.equals("yes")) {
            Random random = new Random();
            int ranNum = random.nextInt(100);

            int guess = -1;
            int tries = 0;

            // while loop to check if the game is over
            while (guess != ranNum) {
                System.out.println("Guess a number between 1 to 100: ");
                guess = sc.nextInt();
                tries++;

                if (guess == ranNum) {
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you " + tries + " guesses!");
                    System.out.println("Would you like to play again? Yes or No: ");
                    play = sc.next().toLowerCase();
                } else if (guess > ranNum) {
                    System.out.println("Lower");
                } else {
                    System.out.println("Higher");
                }
            }
        }
        sc.close();
    }
}