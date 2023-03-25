import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {5, 2, 4, 7, 3, 2};
        
        int breadInStore = 10;
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.offer(breadPerPerson[i]);
        }
        
        int served = 0;
        while (!queue.isEmpty() && breadInStore > 0) {
            int breadPerCurrentPerson = queue.poll();
            if (breadPerCurrentPerson <= breadInStore) {
                breadInStore -= breadPerCurrentPerson;
                served++;
            }
        }
        
        System.out.println("Number of people that can buy bread: " + served);
    }
}
