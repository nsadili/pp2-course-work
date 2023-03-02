package Week04.Hangman;

import java.util.Scanner;
import java.lang.Math;

public class Hangman {

    public static void HangmanLogic() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome Dear Friend! \n This is Hangman game.");
        int length1 = 0;
        String randomString = "";
        while (true) {

            System.out.println("Choose a number for assigned section to play: " +
                    "\n" + "1. Animals" + "\n" + "2. Home" + "\n" + "3. Clothes" + "\n" + "4. Body\n" + "0. EXIT");

            int sec = scan.nextInt();

            if (sec == 0) {
                break;
            }

            else if (sec == 1) {
                int randomIndex = (int) (Math.random() * words.animals.length);
                randomString = words.animals[randomIndex];
                length1 = randomString.length();
            }

            else if (sec == 2) {
                int randomIndex = (int) (Math.random() * words.home.length);
                randomString = words.home[randomIndex];
                length1 = randomString.length();
            }

            else if (sec == 3) {
                int randomIndex = (int) (Math.random() * words.clothes.length);
                randomString = words.clothes[randomIndex];
                length1 = randomString.length();
            }

            else if (sec == 4) {
                int randomIndex = (int) (Math.random() * words.body.length);
                randomString = words.body[randomIndex];
                length1 = randomString.length();

            } else {
                System.out.printf("There is not such section of words! Please try again.");
            }

            System.out.printf("Your word is: '");
            for (int i = 0; i < length1; i++) {
                System.out.printf("_");
            }
            System.out.printf("'.");
            break;
        }

        char mainword[] = randomString.toCharArray();
        char encryptedword[] = new char[length1];

        for (int k = 0; k < length1; k++) {
            encryptedword[k] = '_';
        }
        int heart = 9;
        while (true) {
            for (int i = 0; i < length1; i++) {
                if (mainword[i] == encryptedword[i]) {
                    System.out.println("halaldi brat duz tapdin");
                    break;
                } else {
                    continue;
                }
            }

            System.out.println("Type a letter: ");
            char letter = scan.next().charAt(0);
            int count2 = 0;

            for (int i = 0; i < mainword.length; i++) {
                if (mainword[i] == letter) {
                    encryptedword[i] = letter;
                }
            }
            for (int i = 0; i < length1; i++) {
                if (mainword[i] == letter) {
                    count2++;
                }
            }

            if (count2 == 0)
                heart--;
            System.out.println(heart);

            HangmanImage.HangmanImageCnt(heart, mainword);
            System.out.println(encryptedword);

        }
        // scan.close();
    }
}
