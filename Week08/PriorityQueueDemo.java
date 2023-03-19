import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static int getMaxNumberOfPersons(int[] breadPerPerson, int amountInStore) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int bread : breadPerPerson) {
            pq.offer(bread);
        }
        int maxNumberOfPersons = 0;
        while (!pq.isEmpty() && amountInStore > 0) {
            amountInStore -= pq.poll();
            if (amountInStore >= 0) {
                maxNumberOfPersons++;
            }
        }
        return maxNumberOfPersons;
    }
    
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 5, 2};
        int amountInStore = 10;
        int maxNumberOfPersons = getMaxNumberOfPersons(breadPerPerson, amountInStore);
        System.out.println("Maximum number of persons that can be sold required amount of bread: " + maxNumberOfPersons);
    }
}

