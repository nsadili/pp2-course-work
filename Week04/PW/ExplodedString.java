import java.util.Scanner;

public class ExplodedString {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String string = scanner.nextLine();
String output = getExplodedString(string);
System.out.println(output);
scanner.close();
}
public static String getExplodedString(String input) {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
        String subString = input.substring(0, i + 1);
        output.append(subString);
    }
    return output.toString();
}
}