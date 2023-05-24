import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> breadQueue = new LinkedList<>();//Number of breads each customer needs
        breadQueue.add(2); 
        breadQueue.add(3); 
        breadQueue.add(1);
        breadQueue.add(1);
        breadQueue.add(5);
        breadQueue.add(2);
        breadQueue.add(3);
        breadQueue.add(1); 
        breadQueue.add(2); 
    
        int breadInStore=20; 
    
        int servedCustomer = 0;
        while (!breadQueue.isEmpty()) {
            int numPiecesWanted = breadQueue.poll();
            if (numPiecesWanted <= breadInStore) { 
                breadInStore -= numPiecesWanted; 
                servedCustomer++; 
            }
        }
    
        System.out.println("Number of customers served: " + servedCustomer); 
    }
}
