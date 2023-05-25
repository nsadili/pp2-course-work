package Week08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
       
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(4);
        queue.add(2);
        
      
        int breadInStore = 7;
        
      
        int numPeopleServed = 0;
        while (!queue.isEmpty() && breadInStore > 0) {
     
            int breadDemand = queue.remove();
            
        
            if (breadDemand <= breadInStore) {
                breadInStore -= breadDemand;
                numPeopleServed++;
            } else {
          
                break;
            }
        }
        
     
        System.out.println(numPeopleServed + " people were able to buy bread.");
    }
}