import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();

        scan = new Scanner(line);
        int count = 0;
        double sum = 0.0;
        while (scan.hasNext()) {
            String word = scan.next();
            if (word.matches("[\\d\\.]+")) {
                double number = Double.parseDouble(word);
                sum += number;
                count++;
            }
        }
        scan.close();

        if (count == 0) {
            System.out.println("There are no valid input provided!");
            sum = 0.0;
            count = 0;
            double average = 0.0;
            System.out.printf("Sum = %.3f\nCount = %d\nAverage = %.3f\n", sum, count, average);
        } else {
            double average = sum / count;
            System.out.printf("Sum = %.3f\nCount = %d\nAverage = %.3f\n", sum, count, average);
        }
    }
}