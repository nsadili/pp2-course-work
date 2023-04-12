import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {

    public static int calculatePeopleServed(Queue<Integer> people, int breadInStore) {
        int peopleServed = 0;

        while (!people.isEmpty()) {
            int breadNeeded = people.peek();

            if (breadInStore >= breadNeeded) {
                breadInStore -= breadNeeded;
                peopleServed++;
            } else {
                break;
            }

            people.poll();
        }

        return peopleServed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the queue: ");
        int numberOfPeople = scanner.nextInt();

        Queue<Integer> people = new LinkedList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter the number of pieces of bread needed by person " + (i + 1) + ": ");
            int breadNeeded = scanner.nextInt();
            people.add(breadNeeded);
        }

        System.out.print("Enter the total amount of bread in the store: ");
        int breadInStore = scanner.nextInt();

        int peopleServed = calculatePeopleServed(people, breadInStore);

        System.out.println("The number of people who can buy bread: " + peopleServed);
    }
}
