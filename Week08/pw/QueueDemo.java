import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numOfPeople = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numOfPeople; i++) {
            System.out.print("Enter the number of bread for person: ");
            int numOfBread = scanner.nextInt();
            queue.add(numOfBread);
        }

        System.out.print("Enter the amount of bread: ");
        int amountOfBread = scanner.nextInt();

        int numOfPeopleWithBread = 0;
        int breadLeft = amountOfBread;
        while (!queue.isEmpty() && breadLeft > 0) {
            int numOfBread = queue.poll();
            if (numOfBread <= breadLeft) {
                numOfPeopleWithBread++;
                breadLeft -= numOfBread;
            }
        }

        System.out.println(numOfPeopleWithBread);
    }
}