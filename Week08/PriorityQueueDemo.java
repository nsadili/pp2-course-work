package Week08;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueDemo {
    static int avaliableAmount = 12;
    static int servedPeople = 0;
    static int numSlicesWanted[];
    static int i = 0;

    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

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
            numSlicesWanted[i] = Integer.parseInt(person.replaceAll("\\D+", ""));
            i++;
        }
        
        // sorting
        sort(numSlicesWanted);

        for (i = 0; i < numSlicesWanted.length; i++) {
            if (avaliableAmount < numSlicesWanted[i])
                break;
            else {
                avaliableAmount = avaliableAmount - numSlicesWanted[i];
                servedPeople++;
            }
        }

        System.out.println("Served People Number: " + servedPeople);
    }
}
