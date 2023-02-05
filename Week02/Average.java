import java.util.Scanner;

class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (sc.hasNextDouble()) {
            double number = sc.nextDouble();
            count++;
            sum += number;
        }
        if (count == 0) {
            System.out.println("Error: No numbers provided.");
        } else {
            double average = sum / count;
            System.out.println("Average of " + count + " numbers is " + average);
        }
    }
}
