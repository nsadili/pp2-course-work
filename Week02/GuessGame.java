//  Write a program to simulate the “Guess Game”. Your program takes a positive random integer number not greater than A (to be entered by the user). It then lets user to guess the number. If the number is guessed correctly, user wins. Otherwise, the program helps user by indicating whether the number entered is LOWER or HIGHER.
// a. Program should terminate:
// i. If user guesses the correct number
// ii. If user enters end of file flag. (Ctrl+Z for Win, CTRL+D for Unix & Linux, Command+Z for Mac)
// b. Can you modify the program so that user can be scored by the number of attempts s/he does before guessing the number correctly?

// Path: GuessGame.java

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int guess = 0;
        while (guess != num) {
            System.out.println("Enter a guess: ");
            guess = input.nextInt();
            if (guess == num) {
                System.out.println("You win!");
            } else if (guess > num) {
                System.out.println("Lower");
            } else {
                System.out.println("Higher");
            }
        }
    }
}

