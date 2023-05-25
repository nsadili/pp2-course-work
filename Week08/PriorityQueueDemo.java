package Week08;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
       
        Queue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(2);
        
    
        int breadInStore = 7;
        
        
        int numPeopleServed = 0;
        while (!priorityQueue.isEmpty() && breadInStore > 0) {
          
            int breadDemand = priorityQueue.remove();
            
         
            if (breadDemand <= breadInStore) {
                breadInStore -= breadDemand;
                numPeopleServed++;
                
             
                int remainingDemand = breadDemand - 1;
                if (remainingDemand > 0) {
                    priorityQueue.add(remainingDemand);
                }
            } else {
               
                break;
            }
        }
        
 
        System.out.println(numPeopleServed + " people were able to buy bread.");
    }
}