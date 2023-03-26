import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numPeople = sc.nextInt();

        int[] breadPerPerson = new int[numPeople];

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter the number of pieces of bread person " + (i + 1) + " wants to buy: ");
            breadPerPerson[i] = sc.nextInt();
        }

        int breadInStore = sc.nextInt();

        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.add(breadPerPerson[i]);
        }

        int numPeopleWhoCanBuyBread = 0;
        int numBreadSold = 0;

        // Process each person in the queue
        while (!queue.isEmpty()) {
            int breadWanted = queue.peek();

            if (breadInStore >= breadWanted) {
                numPeopleWhoCanBuyBread++;
                numBreadSold += breadWanted;
                breadInStore -= breadWanted;
                queue.remove();
            } else {
                break;
            }
        }

        System.out.println(numPeopleWhoCanBuyBread + " people were able to buy bread.");

    }
}