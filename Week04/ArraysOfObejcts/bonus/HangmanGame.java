import java.util.Scanner;

public class HangmanGame {
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
