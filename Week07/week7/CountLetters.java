package pp2.week7;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            try {
                char c = Character.toLowerCase(text.charAt(i));
                if (c >= 'a' && c <= 'z') {
                    counter++;
                }
            } catch (Exception e) {
                System.out.println(e);   
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
