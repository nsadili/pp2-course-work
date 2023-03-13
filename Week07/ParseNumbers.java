package Week07;
import java.util.Scanner;
public class ParseNumbers {
    {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string containing numbers: ");
        String str = input.nextLine();

        int h = 0;
        String[] numbers = str.split("\\D+"); // split the string at non-digit characters

        for (String number : numbers) {
            if (!number.isEmpty()) {
                h += Integer.parseInt(number);
            }
        }

        System.out.println("The sum of the numbers in the string is: " + h);
    }
}

}
