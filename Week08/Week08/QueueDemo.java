import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int breadPerEachPerson;
    do {
      System.out.print("Enter the number of pieces of bread per each person (must be positive): ");
      breadPerEachPerson = scan.nextInt();
    } while (breadPerEachPerson <= 0);

    int amountInTheStore;
    do {
      System.out.print("Enter the amount of bread in the store (must be positive): ");
      amountInTheStore = scan.nextInt();
    } while (amountInTheStore <= 0);

    Queue<Integer> breadQueue = new LinkedList<>();

    for (int i = 0; i < amountInTheStore / breadPerEachPerson; i++) {
      breadQueue.offer(breadPerEachPerson);
    }

    breadQueue.offer(amountInTheStore % breadPerEachPerson);

    System.out.println("The number of people who will be able to buy bread is: " + breadQueue.size());
  }
}
