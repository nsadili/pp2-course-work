package Week07;

import java.util.Scanner;

public class Ex6 {

    class ParseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        
        if (inputString.trim().isEmpty()) {
            System.out.println("No input provided!");
            return;
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            }
        }
        
        System.out.println("Result: " + result.toString());
    }
}

}
