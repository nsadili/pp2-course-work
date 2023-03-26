import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split("");
        int sum = 0;
        for (String number : numbers) {
            try {
                sum += Integer.parseInt(number.trim());
            } catch (NumberFormatException e) {
                
            }
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
