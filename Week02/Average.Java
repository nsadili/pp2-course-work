import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                count++;
                sum += number;
            } else {
                String input = scanner.next();
                if (input.equals("EOF")) {
                    break;
                } else {
                    System.out.println("Error: non-numeric input detected.");
                    return;
                }
            }
        }
        if (count == 0) {
            System.out.println("Error: no input entered.");
            return;
        }
        double average = sum / count;
        System.out.println("The average of the " + count + " numbers entered is " + average);
    }
}
