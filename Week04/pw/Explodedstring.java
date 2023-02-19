import java.util.Scanner;

public class Explodedstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = explodeString(input);
        System.out.println("Exploded string: " + result);
        
        sc.close();
    }
    
    public static String explodeString(String input) {
        StringBuilder result = new StringBuilder();

        
        for (int i = 0; i < input.length(); i++) {
        
            char currentChar = input.charAt(i);
        
            for (int j = 0; j <= i; j++) {
        
                result.append(currentChar);
        
            }
        }
        return result.toString();
    }
}
