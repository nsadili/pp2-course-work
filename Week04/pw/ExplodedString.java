import java.util.Scanner;
public class ExplodedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   
        System.out.print("Enter a string: ");
        String input = scan.nextLine();     
        String result = explodeString(input);
        System.out.println("Exploded string: " + result); 
        scan.close();
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
