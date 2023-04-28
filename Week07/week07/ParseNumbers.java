package pp2.week07;
import java.util.*;
public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scn.nextLine();
        scn.close();

        if (inputString.trim().isEmpty()) {
            System.out.println("No input");
            return;
        }
        StringBuilder str = new StringBuilder();
        for (char character : inputString.toCharArray()) {
            if (Character.isDigit(character)) {
                str.append(character);
            }
        }

        System.out.println("Input: " + str.toString());
    }
}

