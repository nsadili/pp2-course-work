package Week08.pw5;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2, 4, 1, 2, 3};
        int totalBread = 12;

        //the line of people
        Queue<Integer> line = new LinkedList<>();
        for (int bread : breadPerPerson) {
            line.add(bread);
        }

        // Serve customers until we run out of bread or the line is empty
        int servedCustomers = 0;
        while (!line.isEmpty() && totalBread >= line.peek()) {
            totalBread -= line.poll();
            servedCustomers++;
        }

        System.out.println(servedCustomers + " persons were able to buy bread.");
    }
}
