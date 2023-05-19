import java.util.PriorityQueue;

public class PriorityQueueDemo {
    


    public static int countPeopleCanBuyBread(int[] breadPerPerson, int breadInStore) {
        int totalPeople = breadPerPerson.length;
        int peopleCanBuy = 0;

        // Create a priority queue to store the number of bread each person wants
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add the number of bread each person wants to the priority queue
        for (int i = 0; i < totalPeople; i++) {
            queue.offer(breadPerPerson[i]);
        }

        // Sell bread to as many people as possible
        while (!queue.isEmpty() && breadInStore >= queue.peek()) {
            breadInStore -= queue.poll();
            peopleCanBuy++;
        }

        return peopleCanBuy;
    }

    public static void main(String[] args) {
        // Example usage
        int[] breadPerPerson = {2, 1, 3, 2, 1};
        int breadInStore = 7;

        int peopleCanBuy = countPeopleCanBuyBread(breadPerPerson, breadInStore);
        System.out.println("Maximum number of people who can be sold required amount of bread: " + peopleCanBuy);
    }
}


