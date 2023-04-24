package Week08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        int[] breadPerPerson = {2, 1, 3, 2, 1}; 
        int totalBreadInStore = 8; 
        
        Queue<Integer> queue = new LinkedList<>(); 
        
        for (int i = 0; i < breadPerPerson.length; i++) {
            queue.offer(breadPerPerson[i]); 
        }
        
        int totalBreadSold = 0; 
        
        while (!queue.isEmpty() && totalBreadInStore > 0) {
            int breadPerPersonLeft = queue.poll(); 
            if (breadPerPersonLeft <= totalBreadInStore) {
                totalBreadSold += breadPerPersonLeft; 
                totalBreadInStore -= breadPerPersonLeft; 
            } else {
                totalBreadSold += totalBreadInStore; 
                totalBreadInStore = 0; 
            }
        }
        
        int numOfPeopleBoughtBread = (totalBreadSold / 2);
        System.out.println(numOfPeopleBoughtBread + " persons were able to buy bread."); 
    }
}

