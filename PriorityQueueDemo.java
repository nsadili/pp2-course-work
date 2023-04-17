import java.util.PriorityQueue;

public class PriorityQueueDemo {
    
    public static int sellBread(int[] breadPerPerson, int breadInStore) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int bread : breadPerPerson) {
            queue.offer(bread);
        }
        
        int numPeople = 0;
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            breadInStore -= queue.poll();
            numPeople++;
        }
        
        return numPeople;
    }
    
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 4, 2};
        int breadInStore = 10;
        int numPeople = sellBread(breadPerPerson, breadInStore);
        System.out.println(numPeople + " people were able to buy bread.");
    }
}
