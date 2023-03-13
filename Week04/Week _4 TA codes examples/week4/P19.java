package week04;

import java.util.Scanner;

/*
1. set a String object to let player guess ("WORD")

2. set a String to show which characters were found ("____");

3. set some iterations (change = 5)

- input a character

- check if it contains that char or not

- if yes, update current String

- OPTIONAL: otherwise, do nothing or alert player with message "character is not found"

4. after iterations,
check if current string contains any underscore symbols -> if yes, then GAME OVER.
Otherwise YOU WIN
 */
public class P19 {
    public static void main(String[] args) {
        String text = "WORD";
        StringBuilder curr = new StringBuilder("____");
        Scanner scan = new Scanner(System.in);
        int chance = 12;
        while(chance-- > 0) {
            System.out.println("Current String: " + curr);
            char x = scan.next().charAt(0);
            for(int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == x) {
                    curr.setCharAt(i, x);
                }
            }
        }
        for(int i=0;i<curr.length();i++) {
            if(curr.charAt(i) == '_') {
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
        System.out.println("YOU WIN");
        scan.close();
    }
}
