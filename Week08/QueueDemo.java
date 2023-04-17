package Week08;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Show number of breads for each person ");
        int breadsForEachPerson = scan.nextInt();

        System.out.print("The amount of bread in the store: ");
        int amount = scan.nextInt();

        Queue<Integer> breadQueue = new LinkedList<>();

        for (int i = 0; i < amount / breadsForEachPerson; i++) {
            breadQueue.offer(breadsForEachPerson);
        }

        breadQueue.offer(amount % breadsForEachPerson);

        System.out.println("The number of people who will be able to buy bread is: " + breadQueue.size());
    }
}
