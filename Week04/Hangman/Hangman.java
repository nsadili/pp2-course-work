package Week04.Hangman;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Hangman {

    public static void HangmanLogic() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome Dear Friend! \n This is Hangman game.");
        int length = 0;
        String randomString = "";
        int section = 0;
        while (true) {

            System.out.println("Choose a number for assigned section to play: " +
                    "\n" + "1. Animals" + "\n" + "2. Home" + "\n" + "3. Clothes" + "\n" + "4. Body\n" + "0. EXIT");

            int sec = scan.nextInt();
            section = sec;
            if (sec == 0) {
                break;
            } else {
                if (sec == 1) {
                    int randomIndex = (int) (Math.random() * words.animals.length);
                    randomString = words.animals[randomIndex];
                    length = randomString.length();
                }

                else if (sec == 2) {
                    int randomIndex = (int) (Math.random() * words.home.length);
                    randomString = words.home[randomIndex];
                    length = randomString.length();
                }

                else if (sec == 3) {
                    int randomIndex = (int) (Math.random() * words.clothes.length);
                    randomString = words.clothes[randomIndex];
                    length = randomString.length();
                }

                else if (sec == 4) {
                    int randomIndex = (int) (Math.random() * words.body.length);
                    randomString = words.body[randomIndex];
                    length = randomString.length();

                } else {
                    System.out.printf("There is not such section of words! Please try again.");
                }
            }

            System.out.printf("Your word is: '");
            for (int i = 0; i < length; i++) {
                System.out.printf("_");
            }
            System.out.printf("'.");
            break;
        }

        char mainword[] = randomString.toCharArray();
        char encryptedword[] = new char[length];

        for (int k = 0; k < length; k++) {
            encryptedword[k] = '_';
        }
        int heart = 8;
        while (heart > 0) {
            
            if(section == 0 || heart == 0){
                break;
            }

            System.out.println("Type a letter: ");
            char letter = scan.next().charAt(0);
            int count2 = 0;
            

            for (int i = 0; i < mainword.length; i++) {
                if (mainword[i] == letter) {
                    encryptedword[i] = letter;
                }
            }
            for (int i = 0; i < mainword.length; i++) {
                if (mainword[i] == letter) {
                    count2++;
                }
            }
            if (Arrays.equals(mainword, encryptedword)) {
                System.out.println("halaldi brat duz tapdin");
                break;
            }

            if (count2 == 0)
                heart--;
            System.out.println(heart);

            String WordString = Arrays.toString(mainword);
            HangmanImage.HangmanImageCnt(heart, WordString);
            System.out.println(encryptedword);

        }
        scan.close();
        
    }
}
