import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (input.hasNextInt()) {
            int num = input.nextInt();
            sum = sum + num;
            count++;
        }
        if (count == 0) {
            System.out.println("No input");
        } else {
            System.out.println("Average is: " + (double) sum / count);
        }
    }
}



