import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of pieces of bread per person: ");
        int breadPerPerson = scanner.nextInt();

        System.out.print("Enter the total amount of bread in the store: ");
        int breadInStore = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        
        int remainingBread = breadInStore % breadPerPerson;
        int peopleCount = breadInStore / breadPerPerson;
        
        for (int i = 0; i < peopleCount; i++) {
            queue.offer(breadPerPerson);
        }

        if (remainingBread > 0) {
            queue.offer(remainingBread);
            peopleCount++;
        }

        System.out.println("The number of people who can buy bread: " + peopleCount);
    }
}
