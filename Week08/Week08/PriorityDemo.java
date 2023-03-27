import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number of pieces of bread per person: ");
    int breadPerPerson = scan.nextInt();

    System.out.print("Enter the total amount of bread in the store: ");
    int amountInStore = scan.nextInt();

    Queue<Integer> breadQueue = new PriorityQueue<>();

    for (int i = 0; i < amountInStore / breadPerPerson; i++) {
      breadQueue.offer(breadPerPerson);
    }

    System.out.println("The number of people who can buy bread is: " + breadQueue.size());
  }
}
