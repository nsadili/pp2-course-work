import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Make an ArrayList to store the number of pieces of bread each person wants to buy
            List<Integer> breadPerPersonList = new ArrayList<>();

            // Prompt the user to enter the number of people and the number of pieces of bread each person wants to buy
            System.out.print("Enter the number of people in the queue: ");
            int numPeople = sc.nextInt();

            int totalBreadNeeded = 0; 

            for (int i = 0; i < numPeople; i++) {
                System.out.print("Enter the number of pieces of bread " + (i + 1) + " wants to buy: ");
                int breadPerPerson = sc.nextInt();
                breadPerPersonList.add(breadPerPerson); 
                totalBreadNeeded += breadPerPerson; 
            }

            //  the amount of bread in the store
            System.out.print("Enter the amount of bread in the store: ");
            int breadInStore = sc.nextInt();

            // Calculate the maximum number of people who can buy bread
            int maxPeople = Math.min(numPeople, breadInStore / totalBreadNeeded);

            // Show the result
            System.out.println("The number of people who will be able to buy bread is : " + maxPeople);
        }
    }
}