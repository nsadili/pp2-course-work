package Week08.pw6;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2, 4, 1, 2, 3};
        int[] breadPerPersonPriority = {4, 1, 2};
        int totalBread = 24;

        //the line of people
        Queue<Integer> line = new LinkedList<>();
        for (int bread : breadPerPerson) {
            line.add(bread);
        }

        //add proiority line of people
        int start = 0;
        int stop = line.size();
        for (int i = breadPerPersonPriority.length - 1; i >= 0; i--) {
            for (int j = start; j < stop; j++) {
                if (line.peek() == breadPerPersonPriority[i]) {
                    break;
                } else {
                    line.add(line.poll());
                }
            }
            start++;
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
