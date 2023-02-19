import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next().toLowerCase();
        //sc.close();

        String secretword="";
        for (int i=0; i<str.length(); i++){
            secretword+="_";
        }

        char[] charstr = str.toCharArray();
        char[] charsw = secretword.toCharArray();

        int cntman=0,cnttrue=0;
        String falseguess = "";

        ArrayList<Character> guessed = new ArrayList<Character>();

        while(true){
            int cnt=0;
            char letter = sc.next().toLowerCase().charAt(0);
            if (guessed.contains(letter)){
                System.out.println("Guessed letter! Try another letter, please");
                continue;
            }
            guessed.add(letter);
            for (int i=0; i<str.length();i++){
                if (charsw[i] == letter) {
                    cnttrue--;
                }
                if (charstr[i]==letter){
                    charsw[i]=letter;
                    cnt++;
                    cnttrue++;
                }
            }
            if (cnt>=1) {
                System.out.println("True Guess!!!");
            }
            else {
                falseguess+=letter+" ";
                cntman++;
                System.out.println("False Guess!!!");
                System.out.println("False guessed letters: " + falseguess);
            }
            System.out.println("Left guesses: "+ (6-cntman));
            //System.out.println("The word: "+ Arrays.toString(charsw));
            for (int i=0; i<charsw.length; i++){
                System.out.print(charsw[i]+" ");
            }
            if(cnttrue==charstr.length) {
                System.out.println("\nYou Won! Congratulations!");
                break;
            }
            if(cntman==6) {
                System.out.println("You Lost! Game Over!");
                break;
            }
            System.out.println("\n");
            
        }
        sc.close();
    }
}
