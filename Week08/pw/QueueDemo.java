package pw;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = {2, 3, 1, 4, 2};
        int breadInStore = 10; 

        Queue<Integer> queue = new LinkedList<>(); 
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.offer(breadPerPerson[i]);
        }

        int count = 0; 
        while (!queue.isEmpty() && breadInStore > 0) { 
            int breadPerPersonNeeded = queue.poll(); 
            if (breadInStore >= breadPerPersonNeeded) { 
                count++; 
                breadInStore -= breadPerPersonNeeded; 
            }
        }

        System.out.println(count + " persons will be able to buy bread.");
    }
}
