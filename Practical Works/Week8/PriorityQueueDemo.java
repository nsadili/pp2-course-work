package Week8;

import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the queue: ");
        int numberOfPeople = scanner.nextInt();

        System.out.print("Enter the amount of bread in the store: ");
        int totalBread = scanner.nextInt();

        int maxPeople = 0;
        int currentPeople = 0;

        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.print("Enter the number of pieces of bread per person " + i + ": ");
            int breadRequired = scanner.nextInt();

            if (breadRequired <= totalBread) {
                totalBread -= breadRequired;
                currentPeople++;
            } else {
                totalBread += breadRequired;
                if (currentPeople > maxPeople) {
                    maxPeople = currentPeople;
                }
                currentPeople = 0;
            }
        }

        if (currentPeople > maxPeople) {
            maxPeople = currentPeople;
        }

        System.out.println("Maximum number of people who can be sold the required amount of bread: " + maxPeople);

        scanner.close();
    }
}
