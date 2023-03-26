package ex;

import java.util.HashMap;
import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isLetter(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Letter frequencies:");
        for (char ch : map.keySet()) {
            System.out.println(ch + ": " + map.get(ch));
        }
    }
}
