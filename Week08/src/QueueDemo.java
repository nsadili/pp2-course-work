import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPeople = sc.nextInt();
        int[] breadPerPerson = new int[numPeople];
        for (int i = 0; i < numPeople; i++) {
            breadPerPerson[i] = sc.nextInt();
        }
        int numBreads = sc.nextInt();

        int numPeopleServed = 0;
        int breadsSold = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numPeople; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            int person = queue.poll();
            if (breadPerPerson[person] <= numBreads) {
                numBreads -= breadPerPerson[person];
                numPeopleServed++;
                breadsSold += breadPerPerson[person];
            }
        }

        System.out.println("Number of people served: " + numPeopleServed);
        System.out.println("Number of breads sold: " + breadsSold);

    }

}
