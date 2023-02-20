package week4;
import java.util.Scanner;
public class Exploded {
    public static void main (String [] args ){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        String output = explodeString(string);
        System.out.println(output);
    }

    public static String explodeString(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(input.substring(0, i+1 )); // because it extends to the charater at index endindex -1 so we add +1
        }
        return output.toString();
    }
}
