package pw;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        System.out.print("Enter a list of integers (separated by spaces): ");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                scanner.next(); 
            }
        }
        
        if (count > 0) {
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + ((double) sum / count));
        } else {
            System.out.println("No valid input provided.");
        }
        
        scanner.close();
    }
}
