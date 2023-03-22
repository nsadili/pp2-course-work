package Week08;

import java.util.*;

public class QueueDemo{

    public static int findNumPeopleInQueue(List<Integer> breadQueue, int breadInStore) {
        int numPeopleCanBuy = 0;
        
        for (int i = 0; i < breadQueue.size(); i++) {
            int breadPerPerson = breadQueue.get(i);
            
            if (breadInStore >= breadPerPerson) {
                breadInStore -= breadPerPerson; 
                numPeopleCanBuy++; 
            } else {
                break; 
            }
        }
        
        return numPeopleCanBuy;
    }
    
    public static void main(String[] args) {

        List<Integer> breadQueue = new ArrayList<>(Arrays.asList(2, 3, 1, 4, 2));

        int breadInStore = 8;
        
        int numPeopleCanBuy = findNumPeopleInQueue(breadQueue, breadInStore);
        
        System.out.println(numPeopleCanBuy + " people can buy bread.");
    }
}