package Week8;

import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the queue: ");
        int numberOfPeople = scanner.nextInt();

        System.out.print("Enter the amount of bread in the store: ");
        int totalBread = scanner.nextInt();

        int totalPeople = 0;

        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.print("Enter the number of pieces of bread per person " + i + ": ");
            int breadRequired = scanner.nextInt();

            if (breadRequired <= totalBread) {
                totalBread -= breadRequired;
                totalPeople++;
            } else {
                break;
            }
        }

        System.out.println("Number of people who will be able to buy bread: " + totalPeople);

        scanner.close();
    }
}
