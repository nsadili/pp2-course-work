import java.util.Arrays;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Characters and their indexes in alphabetically non-descending order:");
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (char c : charArray) {
            int index = str.indexOf(c);
            System.out.println(c + " : " + index);
        }
        
        System.out.println("\nCharacters and their indexes in alphabetically non-ascending order:");
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            int index = str.indexOf(c);
            System.out.println(c + " : " + index);
        }
        
        scanner.close();
    }
}
