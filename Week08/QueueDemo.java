package Week08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    static int avaliableAmount = 12;
    static int servedPeople = 0;

    public static void main(String[] args) {
        // Create a new queue
        Queue<String> queue = new LinkedList<>();

        // Add some names to the queue
        queue.add("Qerib - 1");
        queue.add("Rahida - 2");
        queue.add("Nureddin - 2");
        queue.add("Sabir - 3");
        queue.add("Cavidan - 8");

        // Process the queue, keeping track of the total number of slices of bread
        // available
        while (!queue.isEmpty()) {
            String person = queue.poll();
            int numSlicesWanted = Integer.parseInt(person.replaceAll("\\D+", ""));
            String personsplit[] = person.split("-");
            if (numSlicesWanted <= avaliableAmount) {
                avaliableAmount = avaliableAmount - numSlicesWanted;
                servedPeople++;
                System.out.println(personsplit[0] + "wanted " + numSlicesWanted+ " bread and was able to buy bread");
            } else {
                System.out.println(personsplit[0] + "wanted " + numSlicesWanted+ " bread and was not able to buy bread");
            }
        }

    }
}
